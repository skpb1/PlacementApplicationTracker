package test.blackbox.specificationBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAuthenticationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.adminMenu.AdminAuthMenu;

public class AdminAuthMenuTest {

    private AdminAuthMenu authMenu;
    private AuthenticationRepo authenticationRepo;

    @BeforeEach
    void setup() {
    	authenticationRepo = new MockAuthenticationRepoImpl();
        authMenu = new AdminAuthMenu(
                new MockVisitRepoImpl(),
                authenticationRepo,
                new MockApplicationRepoImpl(),
                new MockPlacementRepoImpl(),
                new MockAssessmentRepoImpl(),
                new MockInterviewRepoImpl(),
                new MockAdminRepoImpl(),
                new MockFeedbackRepoImpl()
        );
    }

    @Test
    void testLoginPass() {
        Scanner scanner = new Scanner("1\nadminpass\n");
        authenticationRepo.adminSignup(1, "adminpass", "", "", "");
        authMenu.adminLogin(scanner);
    }
    
    @Test
    void testSignupPass() {
        Scanner scanner = new Scanner("100\nadminpass\nJohn Doe\njohn.doe@example.com\nManager\n");
        authMenu.adminSignup(scanner);
    }

    @Test
    void testLoginFail() {
        Scanner scanner = new Scanner("1\nwrongpass\n");
        authMenu.adminLogin(scanner);
    }
    
    @Test
    void testLoginException() {
        Scanner scanner = new Scanner("a");
        authMenu.adminLogin(scanner);
    }
    
    @Test
    void testSignupException() {
        Scanner scanner = new Scanner("a");
        authMenu.adminSignup(scanner);
    }


    @Test
    void testSignupExistingId() {
        Scanner scanner = new Scanner("1\nadminpass\nJohn Doe\njohn.doe@example.com\nManager\n");
        authenticationRepo.adminSignup(1, "adminpass", "", "", "");
        authMenu.adminSignup(scanner);
    }
}
