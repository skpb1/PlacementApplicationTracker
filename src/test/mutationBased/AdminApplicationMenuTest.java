package test.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu;
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

public class AdminApplicationMenuTest {

	private VisitRepo visitRepo;
	private FeedbackRepo feedbackRepo;
	private ApplicationRepo applicationRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private AdminApplicationMenu menu;

	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
		this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		menu = new AdminApplicationMenu(visitRepo, applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
	}


	@Test
	void testGoBackMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		applicationRepo.createApplication(1, 1, "abc", "abc");
		menu.displayMenu(1, new Scanner("\n3\n"));
		String expectedOutput = "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Selected: Go back\r\n"
				+ "\r\n"
				+"";
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testDefaultOpMutation() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		applicationRepo.createApplication(1, 1, "abc", "abc");
		menu.displayMenu(1, new Scanner("\n4\n3\n"));
		String expectedOutput = "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Invalid option. Please choose a valid option.\r\n"
				+ "\r\n"
				 + "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Selected: Go back\r\n"
				+"\r\n"
				+"";
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testFilterByOpportunity() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));

		applicationRepo.createApplication(1, 1, "abc", "abc");
		menu.displayMenu(1, new Scanner("\n1\n1\n1\n3\n"));
		String expectedOutput = "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Filter Applications\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "Options to filter the Applications\r\n"
				+ "1. Filter by Opportunity ID\r\n"
				+ "2. Filter by Student ID\r\n"
				+ "3. Go back\r\n"
				+ "Enter your choice: Selected: Filter by Opportunity ID\r\n"
				+ "Enter Opportunity ID: \r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Selected: Go back\r\n"
				+ "\r\n"
				+ "";
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
    void testFilterByStudent() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Filter Applications\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "Options to filter the Applications\r\n"
				+ "1. Filter by Opportunity ID\r\n"
				+ "2. Filter by Student ID\r\n"
				+ "3. Go back\r\n"
				+ "Enter your choice: Selected: Filter by Student ID\r\n"
				+ "Enter Student ID: \r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Selected: Go back\r\n"
				+ "\r\n"
				+ "";
		applicationRepo.createApplication(1, 1, "abc", "abc");
        Scanner scanner = new Scanner("\n\n1\n2\n1\n3\n");
        menu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testFilterInvalidOption() {
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
        Scanner scanner = new Scanner("\n\n1\n69\n3");
        String expectedOutput = "\r\n"
        		+ "Applications List is shown below\r\n"
        		+ "\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "Application ID: 2\r\n"
        		+ "Opportunity ID: 1\r\n"
        		+ "Submitted By (Student ID): 1\r\n"
        		+ "SubmissionDate: null\r\n"
        		+ "Withdrawn: False\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "********************************************\r\n"
        		+ "Please Choose an option:\r\n"
        		+ "1. Filter Applications\r\n"
        		+ "2. Process an Application\r\n"
        		+ "3. Go back\r\n"
        		+ "********************************************\r\n"
        		+ "\r\n"
        		+ "Enter your choice: \r\n"
        		+ "Selected: Filter Applications\r\n"
        		+ "============================================\r\n"
        		+ "\r\n"
        		+ "Options to filter the Applications\r\n"
        		+ "1. Filter by Opportunity ID\r\n"
        		+ "2. Filter by Student ID\r\n"
        		+ "3. Go back\r\n"
        		+ "Enter your choice: Invalid option. Please choose a valid option.\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "Applications List is shown below\r\n"
        		+ "\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "Application ID: 2\r\n"
        		+ "Opportunity ID: 1\r\n"
        		+ "Submitted By (Student ID): 1\r\n"
        		+ "SubmissionDate: null\r\n"
        		+ "Withdrawn: False\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "********************************************\r\n"
        		+ "Please Choose an option:\r\n"
        		+ "1. Filter Applications\r\n"
        		+ "2. Process an Application\r\n"
        		+ "3. Go back\r\n"
        		+ "********************************************\r\n"
        		+ "\r\n"
        		+ "Enter your choice: Selected: Go back\r\n"
        		+ "\r\n"
        		+ "";
        menu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testProcessApplication() {
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
        Scanner scanner = new Scanner("\n\n2\n2\n6\n\n3\n");
        applicationRepo.withdrawApplicationByAppId(2);
        String expectedOutput = "\r\n"
        		+ "Applications List is shown below\r\n"
        		+ "\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "Application ID: 2\r\n"
        		+ "Opportunity ID: 1\r\n"
        		+ "Submitted By (Student ID): 1\r\n"
        		+ "SubmissionDate: null\r\n"
        		+ "Withdrawn: True\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "********************************************\r\n"
        		+ "Please Choose an option:\r\n"
        		+ "1. Filter Applications\r\n"
        		+ "2. Process an Application\r\n"
        		+ "3. Go back\r\n"
        		+ "********************************************\r\n"
        		+ "\r\n"
        		+ "Enter your choice: \r\n"
        		+ "Selected: Process an Application\r\n"
        		+ "============================================\r\n"
        		+ "\r\n"
        		+ "Please Enter the Application ID:\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "Application Details are shown below\r\n"
        		+ "\r\n"
        		+ "\r\n"
        		+ "--------------------------------------\r\n"
        		+ "Application ID: 2\r\n"
        		+ "Opportunity ID: 1\r\n"
        		+ "Resume: abc\r\n"
        		+ "Cover Letter: abc\r\n"
        		+ "Status: Submitted\r\n"
        		+ "Submitted By (Student ID): 1\r\n"
        		+ "SubmissionDate: null\r\n"
        		+ "Withdrawn: True\r\n"
        		+ "--------------------------------------\r\n"
        		+ "\r\n"
        		+ "********************************************\r\n"
        		+ "Please Choose an option:\r\n"
        		+ "1. Approve/ Reject Application\r\n"
        		+ "2. Provide Feedback\r\n"
        		+ "3. Manage Visit\r\n"
        		+ "4. Manage Assessment\r\n"
        		+ "5. Manage Interview\r\n"
        		+ "6. Go back\r\n"
        		+ "********************************************\r\n"
        		+ "\r\n"
        		+ "Enter your choice: Selected: Go back\r\n"
        		+ "============================================\r\n"
        		+ "\r\n"
        		+ "Applications List is shown below\r\n"
        		+ "\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "Application ID: 2\r\n"
        		+ "Opportunity ID: 1\r\n"
        		+ "Submitted By (Student ID): 1\r\n"
        		+ "SubmissionDate: null\r\n"
        		+ "Withdrawn: True\r\n"
        		+ "-----------------------------------------\r\n"
        		+ "********************************************\r\n"
        		+ "Please Choose an option:\r\n"
        		+ "1. Filter Applications\r\n"
        		+ "2. Process an Application\r\n"
        		+ "3. Go back\r\n"
        		+ "********************************************\r\n"
        		+ "\r\n"
        		+ "Enter your choice: Selected: Go back\r\n"
        		+ "\r\n"
        		+ "";
        menu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

	@Test
	void testProcessApplicationInvalidId() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Process an Application\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "Please Enter the Application ID:\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Application details not found.\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Approve/ Reject Application\r\n"
				+ "2. Provide Feedback\r\n"
				+ "3. Manage Visit\r\n"
				+ "4. Manage Assessment\r\n"
				+ "5. Manage Interview\r\n"
				+ "6. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Selected: Go back\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "Applications List is shown below\r\n"
				+ "\r\n"
				+ "-----------------------------------------\r\n"
				+ "Application ID: 2\r\n"
				+ "Opportunity ID: 1\r\n"
				+ "Submitted By (Student ID): 1\r\n"
				+ "SubmissionDate: null\r\n"
				+ "Withdrawn: False\r\n"
				+ "-----------------------------------------\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: Selected: Go back\r\n"
				+ "\r\n"
				+ "";
		Scanner scanner = new Scanner("\n\n2\n0\n6\n3\n");
		applicationRepo.createApplication(1, 1, "abc", "abc");
		menu.displayMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testException() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "\r\n"
				+ "No applications to display!!! Cannot find any Placement applications.\r\n"
				+ "\r\n"
				+ "------------------------------------\r\n"
				+ "Please press enter to continue\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "Please Choose an option:\r\n"
				+ "1. Filter Applications\r\n"
				+ "2. Process an Application\r\n"
				+ "3. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: An unexpected error occurred. Please try again.\r\n"
				+ "";
		Scanner scanner = new Scanner("\n\n");
		menu.displayMenu(0, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}
