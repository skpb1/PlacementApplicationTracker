package test.whitebox.statementBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu;
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

public class AdminApplicationMenuTest {

	private VisitRepo visitRepo;
	private FeedbackRepo feedbackRepo;
	private ApplicationRepo applicationRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private AdminApplicationMenu menu;

	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
		this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		menu = new AdminApplicationMenu(visitRepo, applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
	}

	@Test
	void testGoBack() {
		Scanner scanner = new Scanner("\n3");
		menu.displayMenu(1, scanner);
	}

    @Test
    void testInvalidOption() {
        Scanner scanner = new Scanner("\n4\n3");
        menu.displayMenu(1, scanner);
    }
    
    @Test
    void testDisplayMenuOp2() {
        Scanner scanner = new Scanner("\n\n2\n1\n");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testFilterByOpportunity() {
        Scanner scanner = new Scanner("\n\n1\n1\n3");
        menu.displayMenu(1, scanner);
    }
    
    @Test
    void testFilterByStudent() {
        Scanner scanner = new Scanner("\n\n1\n2\n3");
        menu.displayMenu(1, scanner);
    }
    
    @Test
    void testFilterInvalidOption() {
        Scanner scanner = new Scanner("\n\n1\n69\n3");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testProcessApplication() {
        Scanner scanner = new Scanner("2\n1\n3");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        applicationRepo.withdrawApplicationByAppId(2);
        menu.displayMenu(1, scanner);
    }

	@Test
	void testProcessApplicationInvalidId() {
		Scanner scanner = new Scanner("2\n0\n3");
		applicationRepo.createApplication(1, 1, "abc", "abc");
		menu.displayMenu(1, scanner);
	}

	@Test
	void testException() {
		Scanner scanner = new Scanner("\n");
		menu.displayMenu(0, scanner);
	}
}
