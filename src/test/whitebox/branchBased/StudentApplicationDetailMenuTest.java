package test.whitebox.branchBased;

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
import main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu;

public class StudentApplicationDetailMenuTest {
	private VisitRepo visitRepo;
    private FeedbackRepo feedbackRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private ApplicationRepo applicationRepo;
    private StudentApplicationDetailMenu menu;
    
    @BeforeEach
    void setup() {
    	this.visitRepo = new MockVisitRepoImpl();
		this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		menu = new StudentApplicationDetailMenu(visitRepo, applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
    }
    
    @Test
    void testGoBack() {
    	Scanner scanner = new Scanner("7");
    	menu.displayMenu(1, scanner);
    }
    
    @Test
    void testInvalidOption() {
    	Scanner scanner = new Scanner("8\n7");
    	menu.displayMenu(1, scanner);
    }
    
    @Test
    void testValidApp() {
    	Scanner scanner = new Scanner("8\n7");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayMenu(0, scanner);
    }
    
    @Test
    void testWithdrawnApp() {
    	Scanner scanner = new Scanner("8\n7");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	applicationRepo.withdrawApplicationByAppId(2);
    	menu.displayMenu(0, scanner);
    }
    
    @Test
    void testException() {
    	Scanner scanner = new Scanner("1\n7");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayMenu(2, scanner);
    }
    
    @Test
    void testOption1() {
    	Scanner scanner = new Scanner("1\n\n7");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayMenu(2, scanner);
    }
    
    @Test
    void testOptionsEmpty() {
    	Scanner scanner = new Scanner("1\n2\n3\n4\n5\n6\n7");
    	menu.displayMenu(0, scanner);
    }
    
    @Test
    void testOption2() {
    	Scanner scanner = new Scanner("2\ny\n7");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayMenu(2, scanner);
    }
    
    @Test
    void testOption3() {
    	Scanner scanner = new Scanner("3\n2\n4\n2\n5\n2\n6\n2\n7");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	menu.displayMenu(2, scanner);
    }
}
