package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.adminMenu.AdminAuthMenu;
import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAuthenticationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;

public class AdminAuthMenuTest {
	private VisitRepo visitRepo;
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private AdminRepo adminRepo;
	private FeedbackRepo feedbackRepo;
	private AuthenticationRepo authenticationRepo;
	private AdminAuthMenu menu;
	
	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
    	this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		adminRepo = new MockAdminRepoImpl();
		authenticationRepo = new MockAuthenticationRepoImpl();
		menu = new AdminAuthMenu(visitRepo, authenticationRepo, applicationRepo,placementRepo, assessmentRepo,  interviewRepo, adminRepo, feedbackRepo);
	}
	
	@Test
	void testLoginFail() {
		Scanner scanner = new Scanner("1\npass\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Login" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: Enter Password: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Invalid Admin credentials." + System.lineSeparator()
				+ System.lineSeparator();
		menu.adminLogin(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testLoginException() {
		Scanner scanner = new Scanner("a");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Login" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		assertDoesNotThrow(() -> menu.adminLogin(scanner));
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testLoginPass() {
		Scanner scanner = new Scanner("1\npass\n");
		authenticationRepo.adminSignup(1, "pass", "name", "email", "admin");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Login" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: Enter Password: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Admin login successful!" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Welcome, Unknown!" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage Placement Opportunities" + System.lineSeparator()
				+ "2. Manage Placement Applications" + System.lineSeparator()
				+ "3. Manage Visits" + System.lineSeparator()
				+ "4. Manage Assessments" + System.lineSeparator()
				+ "5. Manage Interviews" + System.lineSeparator()
				+ "6. Manage Personal Details" + System.lineSeparator()
				+ "7. Logout" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()				
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator();
		menu.adminLogin(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testSignupPass() {
		Scanner scanner = new Scanner("1\npass\nname\nemail\nadmin");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: Enter Password: Enter FullName: Enter Email: Enter Designation: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Admin sign up successful!" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		menu.adminSignup(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testSignupFail() {
		Scanner scanner = new Scanner("1\n");
		authenticationRepo.adminSignup(1, "pass", "name", "email", "admin");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: Admin ID already exists. Please go to the login tab" + System.lineSeparator();
		menu.adminSignup(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testSignupFail2() {
		Scanner scanner = new Scanner("1\n\n\n\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: Enter Password: Enter FullName: Enter Email: Enter Designation: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		menu.adminSignup(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testSignupException() {
		Scanner scanner = new Scanner("a");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Admin Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter AdminId: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		assertDoesNotThrow(() -> menu.adminSignup(scanner));
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

}
