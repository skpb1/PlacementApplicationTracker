package test.statementBased;

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
import main.java.placementApplicationTracker.adminMenu.AdminAuthMenu;

public class AdminAuthMenuTest {

    private AdminAuthMenu authMenu;

    @BeforeEach
    void setup() {
        authMenu = new AdminAuthMenu(
                new MockVisitRepoImpl(),
                new MockAuthenticationRepoImpl(),
                new MockApplicationRepoImpl(),
                new MockPlacementRepoImpl(),
                new MockAssessmentRepoImpl(),
                new MockInterviewRepoImpl(),
                new MockAdminRepoImpl(),
                new MockFeedbackRepoImpl()
        );
    }

    @Test
    void testAdminLoginSuccess() {
        Scanner scanner = new Scanner("1\nadminpass\n");
        authMenu.adminLogin(scanner);
    }

    @Test
    void testAdminLoginFailure() {
        Scanner scanner = new Scanner("1\nwrongpass\n");
        authMenu.adminLogin(scanner);
    }

    @Test
    void testAdminSignupSuccess() {
        Scanner scanner = new Scanner("100\nadminpass\nJohn Doe\njohn.doe@example.com\nManager\n");
        authMenu.adminSignup(scanner);
    }

    @Test
    void testAdminSignupExistingId() {
        Scanner scanner = new Scanner("1\nadminpass\nJohn Doe\njohn.doe@example.com\nManager\n");
        authMenu.adminSignup(scanner);
    }
}
