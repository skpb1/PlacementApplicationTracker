package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
import main.java.placementApplicationTracker.studentMenu.StudentApplicationMenu;

public class StudentApplicationMenuTest {
	private VisitRepo visitRepo;
	private FeedbackRepo feedbackRepo;
	private ApplicationRepo applicationRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private StudentApplicationMenu menu;

    @BeforeEach
    void setup() {
    	visitRepo = new MockVisitRepoImpl();
    	this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		menu = new StudentApplicationMenu(visitRepo, applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
    }
    
    @Test
    void testGoBack() {
    	Scanner scanner = new Scanner("\n2");
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications to display. You have not applied to any opportunities" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(1, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testInvalidOption() {
    	Scanner scanner = new Scanner("\n4\n2");
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications to display. You have not applied to any opportunities" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Invalid option. Please choose a valid option." + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications to display. You have not applied to any opportunities" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(1, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testValidApp() {
    	Scanner scanner = new Scanner("2");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(1, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testValidAppWithdrawn() {
    	Scanner scanner = new Scanner("2");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	applicationRepo.withdrawApplicationByAppId(2);
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Withdrawn: True" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(1, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testException() {
    	Scanner scanner = new Scanner("\n");
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications to display. You have not applied to any opportunities" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(0, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testOption1() {
    	Scanner scanner = new Scanner("1\n0\n7\n2");
    	applicationRepo.createApplication(1, 1, "abc", "abc");
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Manage an Application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Application ID:" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Application details not found." + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Edit Application" + System.lineSeparator()
				+ "2. Withdraw Application" + System.lineSeparator()
				+ "3. Show Assessments for the application" + System.lineSeparator()
				+ "4. Show Visits for the application" + System.lineSeparator()
				+ "5. Show Interviews for the application" + System.lineSeparator()
				+ "6. Show Feedback for the application" + System.lineSeparator()
				+ "7. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(1, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testOption1If() {
    	Scanner scanner = new Scanner("\n1\n2");
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications to display. You have not applied to any opportunities" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Manage an Application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications available" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No applications to display. You have not applied to any opportunities" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage an Application" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
    	menu.displayApplicationMenu(1, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
}
