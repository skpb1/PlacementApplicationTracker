package test.whitebox.statementBased;

import main.java.placementApplicationTracker.repo.impl.mock.MockAuthenticationRepoImpl;
import main.java.placementApplicationTracker.service.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AuthenticationServiceTest {

    private AuthenticationService authenticationService;

    @BeforeEach
    void setUp() {
        MockAuthenticationRepoImpl mockAuthenticationRepo = new MockAuthenticationRepoImpl();
        authenticationService = new AuthenticationService(mockAuthenticationRepo);
    }

    @Test
    void testStudentLogin() {
        int studentId = 1;
        String password = "studentPassword";
        authenticationService.studentSignup(studentId, password, "Student Name", "student@email.com", "Computer Science", 2023);

        assertTrue(authenticationService.studentLogin(studentId, password));
    }

    @Test
    void testAdminLogin() {
        int adminId = 1;
        String password = "adminPassword";
        authenticationService.adminSignup(adminId, password, "Admin Name", "admin@email.com", "HR");

        assertTrue(authenticationService.adminLogin(adminId, password));
    }

    @Test
    void testDoesAdminIdExist() {
        int adminId = 1;
        authenticationService.adminSignup(adminId, "adminPassword", "Admin Name", "admin@email.com", "HR");

        assertTrue(authenticationService.doesAdminIdExist(adminId));
    }

    @Test
    void testDoesStudentIdExist() {
        int studentId = 1;
        authenticationService.studentSignup(studentId, "studentPassword", "Student Name", "student@email.com", "Computer Science", 2023);

        assertTrue(authenticationService.doesStudentIdExist(studentId));
    }

    @Test
    void testStudentSignup() {
        int studentId = 1;
        String password = "studentPassword";
        String fullName = "Student Name";
        String email = "student@email.com";
        String course = "Computer Science";
        int passOutYear = 2023;

        assertTrue(authenticationService.studentSignup(studentId, password, fullName, email, course, passOutYear));
    }

    @Test
    void testAdminSignup() {
        int adminId = 1;
        String password = "adminPassword";
        String fullName = "Admin Name";
        String email = "admin@email.com";
        String designation = "HR";

        assertTrue(authenticationService.adminSignup(adminId, password, fullName, email, designation));
    }
}
