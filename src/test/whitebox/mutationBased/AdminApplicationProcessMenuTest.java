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
	void testGoBackMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application details not found." + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Go back"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + "";
		Scanner scanner = new Scanner("\n6");
		menu.displayMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testInvalidOptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application details not found." + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Invalid option. Please choose a valid option."
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application details not found." + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Go back"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + "";
		Scanner scanner = new Scanner("\n99\n6");
		menu.displayMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application details not found." + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("\n\n");
		menu.displayMenu(0, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testApproveApplicationExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Approve/ Reject Application"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("\n1");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testApproveApplicationandExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Approve/ Reject Application"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Select an Action Approve(a)/ Reject(r): Application status updated successfully." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Approved" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		Scanner scanner = new Scanner("\n1\na");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testRejectApplicationandExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Approve/ Reject Application"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Select an Action Approve(a)/ Reject(r): Application status updated successfully." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Rejected" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		Scanner scanner = new Scanner("\n1\nr");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testProvideFeedbackandExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Provide Feedback"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your feedback: Feedback added successfully." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		Scanner scanner = new Scanner("\n2\nVeryGood");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testManageVisitExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Manage Visit"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Visit found for this application" + System.lineSeparator() + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Visit" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		
				Scanner scanner = new Scanner("\n3");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testManageAssessmentExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Manage Assessment"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessment found for this application" + System.lineSeparator() + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		
				Scanner scanner = new Scanner("\n4");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testManageInteviewExceptionMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: Selected: Manage Interview"
				+ System.lineSeparator() + "============================================" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Interview found for this application" + System.lineSeparator() + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Application Details are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "--------------------------------------" + System.lineSeparator() 
				+ "Application ID: 2" + System.lineSeparator() + "Opportunity ID: 1" + System.lineSeparator()
				+ "Resume: abc" + System.lineSeparator() + "Cover Letter: abc" + System.lineSeparator()
				+ "Status: Submitted" + System.lineSeparator() + "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator() + "Withdrawn: False" + System.lineSeparator()
				+ "--------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator() + "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator() + "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		
				Scanner scanner = new Scanner("\n5");
		menu.displayMenu(2, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}	
}
