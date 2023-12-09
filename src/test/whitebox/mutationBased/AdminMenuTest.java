package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.adminMenu.AdminMenu;
import main.java.placementApplicationTracker.model.Admin;

public class AdminMenuTest {
    private AdminRepo adminRepo;
    private VisitRepo visitRepo;
    private ApplicationRepo applicationRepo;
    private PlacementRepo placementRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private FeedbackRepo feedbackRepo;
    private AdminMenu adminMenu;

    @BeforeEach
    void setup() {
        adminRepo = new MockAdminRepoImpl();
        visitRepo = new MockVisitRepoImpl();
        applicationRepo = new MockApplicationRepoImpl();
        placementRepo = new MockPlacementRepoImpl();
        assessmentRepo = new MockAssessmentRepoImpl();
        interviewRepo = new MockInterviewRepoImpl();
        feedbackRepo = new MockFeedbackRepoImpl();

        adminMenu = new AdminMenu(visitRepo, applicationRepo, placementRepo, assessmentRepo, interviewRepo, adminRepo, feedbackRepo);
    }
    
    @Test
	void testLogout() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		Scanner scanner = new Scanner("7");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Logout" + System.lineSeparator();
		
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testInvalidOptionAndLogout() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		Scanner scanner = new Scanner("99\n7");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Logout" + System.lineSeparator();
		
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testOp1() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		Scanner scanner = new Scanner("1");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Manage Placement Opportunities" + System.lineSeparator()
				+ "===========================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Add new opportunity" + System.lineSeparator()
				+ "2. Edit opportunity" + System.lineSeparator()
				+ "3. Delete opportunity" + System.lineSeparator()
				+ "4. Filter Opportunities" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
		
		System.setOut(originalOut);
		System.out.println(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testOp2() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		applicationRepo.createApplication(1, 1, "abc", "abc");
		Scanner scanner = new Scanner("2\n");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Manage Placement Applications" + System.lineSeparator()
				+ "===========================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
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
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
		
		System.setOut(originalOut);
		System.out.println(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testOp3() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		
		Scanner scanner = new Scanner("3\n");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Manage Visits" + System.lineSeparator()
				+ "===========================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() 
				+ System.lineSeparator() + System.lineSeparator()
				+ "All Available visits are shown below"+ System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "No Visits available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
		
		System.setOut(originalOut);
		System.out.println(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testOp4() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		Scanner scanner = new Scanner("4\n");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Manage Assessments" + System.lineSeparator()
				+ "===========================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below"+ System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "No Assessments available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "********************************************"
		        + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
		        + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
		        + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
		        + System.lineSeparator() + "********************************************" + System.lineSeparator()
		        + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
		
		System.setOut(originalOut);
		System.out.println(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testOp5() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		Scanner scanner = new Scanner("5\n");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Manage Interviews" + System.lineSeparator()
				+ "===========================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available interviews are shown below"+ System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "No Interviews available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator()
				+ "********************************************"
		        + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
		        + "1. Manage interview for an application" + System.lineSeparator() + "2. Edit interview"
		        + System.lineSeparator() + "3. Delete interview" + System.lineSeparator() + "4. Go back"
		        + System.lineSeparator() + "********************************************" + System.lineSeparator()
		        + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
		
		System.setOut(originalOut);
		System.out.println(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}
    
    @Test
	void testOp6() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		
        Admin ad = new Admin(1, "pwd", "Admin", "Gmail", "admin");
		adminRepo.addAdmin(ad);
		Scanner scanner = new Scanner("6");
		adminMenu.displayAdminMenu(1, scanner);
		
		String expectedOutput = System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
				+ "Enter your choice: Selected: Manage Personal Details" + System.lineSeparator()
				+ "===========================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "Current Admin Details:" + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Admin ID: 1" + System.lineSeparator()
				+ "Full Name: Admin" + System.lineSeparator()
				+ "Email: Gmail" + System.lineSeparator()
				+ "Designation: admin" + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************"
		        + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
		        + "1. Edit Details" + System.lineSeparator() + "2. Update Password"
		        + System.lineSeparator() + "3. Go back" + System.lineSeparator() 
		        + "********************************************" + System.lineSeparator()
		        + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + "Welcome, Admin!" + System.lineSeparator()
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
		
		System.setOut(originalOut);
		System.out.println(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}

}
