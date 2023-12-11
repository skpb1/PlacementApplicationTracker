package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAuthenticationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.studentMenu.StudentAuthMenu;

public class StudentAuthMenuTest {
	private VisitRepo visitRepo;
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private StudentRepo studentRepo;
	private FeedbackRepo feedbackRepo;
	private AuthenticationRepo authenticationRepo;
	private StudentAuthMenu menu;
	
	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
    	this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		studentRepo = new MockStudentRepoImpl();
		authenticationRepo = new MockAuthenticationRepoImpl();
		menu = new StudentAuthMenu(visitRepo, assessmentRepo, applicationRepo, authenticationRepo, feedbackRepo, interviewRepo, placementRepo, studentRepo);
	}
	
	@Test
	void testStudentLoginFail() {
		Scanner scanner = new Scanner("1\npass\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Login" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: Enter Password: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Invalid student credentials." + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		menu.studentLogin(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testStudentLoginException() {
		Scanner scanner = new Scanner("a");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Login" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		assertDoesNotThrow(() -> menu.studentLogin(scanner));
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testStudentLoginPass() {
		Scanner scanner = new Scanner("1\npass\n");
		authenticationRepo.studentSignup(1, "pass", "name", "email", "course", 0);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Login" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: Enter Password: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Student login successful!" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Welcome, Unknown!" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. View Placement Opportunities" + System.lineSeparator()
				+ "2. Manage Applications" + System.lineSeparator()
				+ "3. Manage Personal Details" + System.lineSeparator()
				+ "4. Logout" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		menu.studentLogin(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testStudentSignupPass() {
		Scanner scanner = new Scanner("1\npass\nname\nemail\ncourse\n0");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: Enter Password: Enter FullName: Enter Email: Enter Course: Enter PassOutYear: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Student sign up successful!" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		menu.studentSignup(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testStudentSignupFail() {
		Scanner scanner = new Scanner("1\n");
		authenticationRepo.studentSignup(1, "pass", "name", "email", "course", 0);
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: The student ID already exists. Please go to the login tab" + System.lineSeparator()
				+ "";
		menu.studentSignup(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testStudentSignupFail2() {
		Scanner scanner = new Scanner("1\n\n\n\n\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: Enter Password: Enter FullName: Enter Email: Enter Course: Enter PassOutYear: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		menu.studentSignup(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testStudentSignupException() {
		Scanner scanner = new Scanner("a");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Selected: Student Signup" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter StudentId: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		assertDoesNotThrow(() -> menu.studentSignup(scanner));
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

}
