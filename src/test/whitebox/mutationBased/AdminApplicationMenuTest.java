package test.whitebox.mutationBased;

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
		String expectedOutput = System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+ System.lineSeparator()
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
		String expectedOutput = System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator()
				 + System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+System.lineSeparator()
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
		String expectedOutput = System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter Applications" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Options to filter the Applications" + System.lineSeparator()
				+ "1. Filter by Opportunity ID" + System.lineSeparator()
				+ "2. Filter by Student ID" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "Enter your choice: Selected: Filter by Opportunity ID" + System.lineSeparator()
				+ "Enter Opportunity ID: " + System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
    void testFilterByStudent() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter Applications" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Options to filter the Applications" + System.lineSeparator()
				+ "1. Filter by Opportunity ID" + System.lineSeparator()
				+ "2. Filter by Student ID" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "Enter your choice: Selected: Filter by Student ID" + System.lineSeparator()
				+ "Enter Student ID: " + System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		applicationRepo.createApplication(1, 1, "abc", "abc");
        Scanner scanner = new Scanner("\n\n1\n2\n1\n3\n");
        menu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }
	
	@Test
	void testFilterGoBack() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		applicationRepo.createApplication(1, 1, "abc", "abc");
		Scanner scanner = new Scanner("\n\n1\n3\n3");
        String expectedOutput = System.lineSeparator()
        		+ "Applications List is shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: False" + System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Filter Applications" + System.lineSeparator()
        		+ "2. Process an Application" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: " + System.lineSeparator()
        		+ "Selected: Filter Applications" + System.lineSeparator()
        		+ "============================================" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Options to filter the Applications" + System.lineSeparator()
        		+ "1. Filter by Opportunity ID" + System.lineSeparator()
        		+ "2. Filter by Student ID" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "Enter your choice: " + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Applications List is shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: False" + System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Filter Applications" + System.lineSeparator()
        		+ "2. Process an Application" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: Selected: Go back" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "";
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
        String expectedOutput = System.lineSeparator()
        		+ "Applications List is shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: False" + System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Filter Applications" + System.lineSeparator()
        		+ "2. Process an Application" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: " + System.lineSeparator()
        		+ "Selected: Filter Applications" + System.lineSeparator()
        		+ "============================================" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Options to filter the Applications" + System.lineSeparator()
        		+ "1. Filter by Opportunity ID" + System.lineSeparator()
        		+ "2. Filter by Student ID" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
        		+ System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Applications List is shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: False" + System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Filter Applications" + System.lineSeparator()
        		+ "2. Process an Application" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: Selected: Go back" + System.lineSeparator()
        		+ System.lineSeparator()
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
        String expectedOutput = System.lineSeparator()
        		+ "Applications List is shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: True" + System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Filter Applications" + System.lineSeparator()
        		+ "2. Process an Application" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: " + System.lineSeparator()
        		+ "Selected: Process an Application" + System.lineSeparator()
        		+ "============================================" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Please Enter the Application ID:" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Application Details are shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ System.lineSeparator()
        		+ "--------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Resume: abc" + System.lineSeparator()
        		+ "Cover Letter: abc" + System.lineSeparator()
        		+ "Status: Submitted" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: True" + System.lineSeparator()
        		+ "--------------------------------------" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Approve/ Reject Application" + System.lineSeparator()
        		+ "2. Provide Feedback" + System.lineSeparator()
        		+ "3. Manage Visit" + System.lineSeparator()
        		+ "4. Manage Assessment" + System.lineSeparator()
        		+ "5. Manage Interview" + System.lineSeparator()
        		+ "6. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: Selected: Go back" + System.lineSeparator()
        		+ "============================================" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Applications List is shown below" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "Application ID: 2" + System.lineSeparator()
        		+ "Opportunity ID: 1" + System.lineSeparator()
        		+ "Submitted By (Student ID): 1" + System.lineSeparator()
        		+ "SubmissionDate: null" + System.lineSeparator()
        		+ "Withdrawn: True" + System.lineSeparator()
        		+ "-----------------------------------------" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ "Please Choose an option:" + System.lineSeparator()
        		+ "1. Filter Applications" + System.lineSeparator()
        		+ "2. Process an Application" + System.lineSeparator()
        		+ "3. Go back" + System.lineSeparator()
        		+ "********************************************" + System.lineSeparator()
        		+ System.lineSeparator()
        		+ "Enter your choice: Selected: Go back" + System.lineSeparator()
        		+ System.lineSeparator()
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
		String expectedOutput = System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Process an Application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please Enter the Application ID:" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Application details not found." + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Approve/ Reject Application" + System.lineSeparator()
				+ "2. Provide Feedback" + System.lineSeparator()
				+ "3. Manage Visit" + System.lineSeparator()
				+ "4. Manage Assessment" + System.lineSeparator()
				+ "5. Manage Interview" + System.lineSeparator()
				+ "6. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Applications List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Application ID: 2" + System.lineSeparator()
				+ "Opportunity ID: 1" + System.lineSeparator()
				+ "Submitted By (Student ID): 1" + System.lineSeparator()
				+ "SubmissionDate: null" + System.lineSeparator()
				+ "Withdrawn: False" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: Selected: Go back" + System.lineSeparator()
				+ System.lineSeparator()
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
		String expectedOutput = System.lineSeparator()
				+ "No applications to display!!! Cannot find any Placement applications." + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Filter Applications" + System.lineSeparator()
				+ "2. Process an Application" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("\n\n");
		menu.displayMenu(0, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}
