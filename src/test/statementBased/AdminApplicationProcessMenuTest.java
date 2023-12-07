package test.statementBased;

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
import main.java.placementApplicationTracker.adminMenu.AdminApplicationProcessMenu;

public class AdminApplicationProcessMenuTest {

    private VisitRepo visitRepo;
    private FeedbackRepo feedbackRepo;
    private ApplicationRepo applicationRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private AdminApplicationProcessMenu menu;

    @BeforeEach
    void setup() {
        visitRepo = new MockVisitRepoImpl();
        this.assessmentRepo = new MockAssessmentRepoImpl();
        this.feedbackRepo = new MockFeedbackRepoImpl();
        this.interviewRepo = new MockInterviewRepoImpl();
        this.applicationRepo = new MockApplicationRepoImpl();
        menu = new AdminApplicationProcessMenu(visitRepo, applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
    }

    @Test
    void testGoBack() {
        Scanner scanner = new Scanner("\n6");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testInvalidOption() {
        Scanner scanner = new Scanner("\n7\n6");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testApproveApplication() {
        Scanner scanner = new Scanner("1\na\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testRejectApplication() {
        Scanner scanner = new Scanner("1\nr\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testInvalidAction() {
        Scanner scanner = new Scanner("1\ninvalid\na\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testProvideFeedback() {
        Scanner scanner = new Scanner("2\nFeedback\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testManageVisit() {
        Scanner scanner = new Scanner("3\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testManageAssessment() {
        Scanner scanner = new Scanner("4\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testManageInterview() {
        Scanner scanner = new Scanner("5\n6");
        applicationRepo.createApplication(1, 1, "abc", "abc");
        menu.displayMenu(1, scanner);
    }

    @Test
    void testException() {
        Scanner scanner = new Scanner("\n");
        menu.displayMenu(0, scanner);
    }
}
