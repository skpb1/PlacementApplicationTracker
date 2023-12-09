package test.whitebox.statementBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.studentMenu.StudentApplicationMenu;

public class StudentApplicationMenuTest {
	private VisitRepo visitRepo;
	private FeedbackRepo feedbackRepo;
	private ApplicationRepo applicationRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private StudentApplicationMenu menu;

    @BeforeEach
    void setup() {
    	visitRepo = new MockVisitRepoImpl();
    	this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		menu = new StudentApplicationMenu(visitRepo, applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
    }
    
    @Test
    void testGoBack() {
    	Scanner scanner = new Scanner("\n2");
    	menu.displayApplicationMenu(1, scanner);
    }
    
    @Test
    void testInvalidOption() {
    	Scanner scanner = new Scanner("\n4\n2");
    	menu.displayApplicationMenu(1, scanner);
    }
    
    @Test
    void testValidApp() {
    	Scanner scanner = new Scanner("2");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayApplicationMenu(1, scanner);
    }
    
    @Test
    void testValidAppWithdrawn() {
    	Scanner scanner = new Scanner("2");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	applicationRepo.withdrawApplicationByAppId(2);
    	menu.displayApplicationMenu(1, scanner);
    }
    
    @Test
    void testException() {
    	Scanner scanner = new Scanner("\n");
    	menu.displayApplicationMenu(0, scanner);
    }
    
    @Test
    void testOption1() {
    	Scanner scanner = new Scanner("1\n0\n7\n2");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayApplicationMenu(1, scanner);
    }
    
    @Test
    void testOption1If() {
    	Scanner scanner = new Scanner("\n1\n2");
    	menu.displayApplicationMenu(1, scanner);
    }
}
