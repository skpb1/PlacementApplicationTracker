package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu;
import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;

public class AdminAssessmentMenuTest {
	private AssessmentRepo assessmentRepo;
	private AdminAssessmentMenu assessmentMenu;

	@BeforeEach
	void setup() {
		assessmentRepo = new MockAssessmentRepoImpl();
		new AssessmentService(assessmentRepo);
		assessmentMenu = new AdminAssessmentMenu(assessmentRepo);
	}

	@Test
	void testDisplayMenu() {
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Manage assessment for an application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter the Application ID: " + System.lineSeparator() + "No Assessment found for this application"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Assessment" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "All Available assessments are shown below"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Assessments available"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Manage assessment for an application" + System.lineSeparator()
				+ "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + "Selected: Go back"
				+ System.lineSeparator() + "";
		assessmentMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp1() {
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		Scanner scanner = new Scanner("1\n\n1\n\n");
		assessmentRepo.addAssessment(new Assessment(1, 1, timestamp, "Scheduled", "ass1"));
		assessmentRepo.addAssessment(new Assessment(2, 1, timestamp, "Scheduled", "ass2"));
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 1"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass1"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass2"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Manage assessment for an application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter the Application ID: " + System.lineSeparator() + "Found Assessment details for the application"
				+ System.lineSeparator() + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "Assessment ID: 1" + System.lineSeparator() + "Application ID: 1"
				+ System.lineSeparator() + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled"
				+ System.lineSeparator() + "Details: ass1" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass2"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Edit Assessment" + System.lineSeparator()
				+ "2. Delete Assessment" + System.lineSeparator() + "3. Add New Assessment" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 1"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass1"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass2"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		assessmentMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp2() {
		Scanner scanner = new Scanner("2\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Edit Assessment" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter Assessment ID to edit: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		assessmentMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp3() {
		Scanner scanner = new Scanner("3\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Delete Assessment" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter Assessment ID to delete: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		assessmentMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuInvalid() {
		Scanner scanner = new Scanner("69\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
				+ System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "All Available assessments are shown below"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Assessments available"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Manage assessment for an application" + System.lineSeparator()
				+ "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		assessmentMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testManageAssessmentForApplication() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "No Assessment found for this application"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Assessment" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Schedule Assessment"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): Enter assessment details: An unexpected error occurred. Please try again."
				+ System.lineSeparator();
		Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
		assessmentMenu.manageAssessmentForApplication(scanner, 1);
		System.setOut(originalOut);
		System.out.print(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testHandleNoAssessment() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "No Assessment found for this application"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Assessment" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Schedule Assessment"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): Enter assessment details: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
		assessmentMenu.handleNoAssessment(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testHandleExistingAssessment() {
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "Found Assessment details for the application"
				+ System.lineSeparator() + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "Assessment ID: 1" + System.lineSeparator() + "Application ID: 1"
				+ System.lineSeparator() + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled"
				+ System.lineSeparator() + "Details: Technical" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: HR"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Edit Assessment" + System.lineSeparator()
				+ "2. Delete Assessment" + System.lineSeparator() + "3. Add New Assessment" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + "Selected: Edit Assessment"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ "Enter Assessment ID to edit: Assessment not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		List<Assessment> assessmentList = List.of(new Assessment(1, 1, timestamp, "Scheduled", "Technical"),
				new Assessment(2, 1, timestamp, "Scheduled", "HR"));
		assessmentMenu.handleExistingAssessment(assessmentList, 1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testAddAssessmentForApplication() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): Enter assessment details: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("Technical\n2023-12-31 12:00:00\n");
		assessmentMenu.addAssessmentForApplication(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testEditAssessment() throws ParseException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter updated assessment date and time (YYYY-MM-DD HH:mm:ss): Enter updated assessment status: Enter updated assessment details: ";
		Scanner scanner = new Scanner("2023-12-31 12:00:00\nUpdated\nTechnical Details\n");
		Assessment existingAssessment = new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled",
				"Technical");
		assessmentMenu.editAssessment(existingAssessment, scanner);
		System.setOut(originalOut);
		System.out.print(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDeleteAssessment() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Are you sure you want to delete this assessment (Y/N): ";
		Scanner scanner = new Scanner("Y\n");
		Assessment existingAssessment = new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled",
				"Technical");
		assessmentMenu.deleteAssessment(existingAssessment, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testEditAssessmentOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter Assessment ID to edit: Assessment not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n");
		assessmentMenu.editAssessmentOption(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDeleteAssessmentOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter Assessment ID to delete: Assessment not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n");
		assessmentMenu.deleteAssessmentOption(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testValidateTimestampInput() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter timestamp: 2023-12-31T12:00" + System.lineSeparator() + "";
		Scanner scanner = new Scanner("2023-12-31 12:00:00\n");
		LocalDateTime dateTime = assessmentMenu.validateTimestampInput(scanner, "Enter timestamp: ");
		System.out.println(dateTime);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}