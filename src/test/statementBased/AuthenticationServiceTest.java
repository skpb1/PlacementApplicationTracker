package test.statementBased;

import static org.junit.jupiter.api.Assertions.*;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAuthenticationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.service.AuthenticationService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AuthenticationServiceTest {

    private AuthenticationService authenticationService;

    @BeforeEach
    void setUp() {
        MockStudentRepoImpl mockStudentRepo = new MockStudentRepoImpl();
        MockAdminRepoImpl mockAdminRepo = new MockAdminRepoImpl();
        MockAuthenticationRepoImpl mockAuthenticationRepo = new MockAuthenticationRepoImpl(mockStudentRepo, mockAdminRepo);
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

        Student registeredStudent = new MockStudentRepoImpl().getStudentDetails(studentId);
        //assertNotNull(registeredStudent);
        assertEquals(fullName, registeredStudent.getFullName());
        assertEquals(email, registeredStudent.getEmail());
        assertEquals(course, registeredStudent.getCourse());
        assertEquals(passOutYear, registeredStudent.getPassOutYear());
    }

    @Test
    void testAdminSignup() {
        int adminId = 1;
        String password = "adminPassword";
        String fullName = "Admin Name";
        String email = "admin@email.com";
        String designation = "HR";

        assertTrue(authenticationService.adminSignup(adminId, password, fullName, email, designation));

        Admin registeredAdmin = new MockAdminRepoImpl().getAdminDetails(adminId);
        //assertNotNull(registeredAdmin);
        assertEquals(fullName, registeredAdmin.getFullName());
        assertEquals(email, registeredAdmin.getEmail());
        assertEquals(designation, registeredAdmin.getDesignation());
    }
}
