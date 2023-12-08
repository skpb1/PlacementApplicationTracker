package test.branchBased;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.adminMenu.AdminMenu;
import main.java.placementApplicationTracker.model.Admin;

import java.util.Scanner;

public class AdminMenuTest {
    private AdminRepo adminRepo;
    private VisitRepo visitRepo;
    private ApplicationRepo applicationRepo;
    private PlacementRepo placementRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private FeedbackRepo feedbackRepo;
    private AdminMenu adminMenu;

    @BeforeEach
    void setup() {
        adminRepo = new MockAdminRepoImpl();
        visitRepo = new MockVisitRepoImpl();
        applicationRepo = new MockApplicationRepoImpl();
        placementRepo = new MockPlacementRepoImpl();
        assessmentRepo = new MockAssessmentRepoImpl();
        interviewRepo = new MockInterviewRepoImpl();
        feedbackRepo = new MockFeedbackRepoImpl();

        adminMenu = new AdminMenu(visitRepo, applicationRepo, placementRepo, assessmentRepo, interviewRepo, adminRepo, feedbackRepo);
    }

    @Test
    void testDisplayAdminMenuManagePlacementOpportunities() {
        Scanner scanner = new Scanner("1\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuManagePlacementApplications() {
        Scanner scanner = new Scanner("2\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuManageVisits() {
        Scanner scanner = new Scanner("3\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuManageAssessments() {
        Scanner scanner = new Scanner("4\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuManageInterviews() {
        Scanner scanner = new Scanner("5\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuManagePersonalDetails() {
        Scanner scanner = new Scanner("6\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuLogout() {
        Scanner scanner = new Scanner("7\n");
        adminMenu.displayAdminMenu(1, scanner);
    }

    @Test
    void testDisplayAdminMenuInvalidOption() {
        Scanner scanner = new Scanner("10\n5\n");
        adminMenu.displayAdminMenu(1, scanner);
    }
    
    @Test
    void testNonEmptyAdmin() {
    	Scanner scanner = new Scanner("6\n3\n7");
    	Admin admin = new Admin();
    	admin.setAdminId(1);
    	admin.setFullName("name");
    	adminRepo.addAdmin(admin);
    	adminMenu.displayAdminMenu(1, scanner);
    }
}
