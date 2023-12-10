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

import main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu;
import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.service.InterviewService;

public class AdminInterviewMenuTest {
	private InterviewRepo interviewRepo;
	private AdminInterviewMenu interviewMenu;

	@BeforeEach
	void setup() {
		interviewRepo = new MockInterviewRepoImpl();
		new InterviewService(interviewRepo);
		interviewMenu = new AdminInterviewMenu(interviewRepo);
	}

	@Test
	void testDisplayMenu() {
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Interviews available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Manage interview for an application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter the Application ID: " + System.lineSeparator() + "No Interview found for this application"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Interview" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "All Available interviews are shown below"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Interviews available"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Manage interview for an application" + System.lineSeparator()
				+ "2. Edit interview" + System.lineSeparator() + "3. Delete interview" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + "Selected: Go back"
				+ System.lineSeparator() + "";
		interviewMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp1() {
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		Scanner scanner = new Scanner("1\n\n1\n\n");
		interviewRepo.addInterview(new Interview(1, 1, timestamp, "Scheduled", "Tech"));
		interviewRepo.addInterview(new Interview(2, 1, timestamp, "Scheduled", "HR"));
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator()
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Interview ID: 1"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Type: Tech"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Interview ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Type: HR"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Manage interview for an application" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter the Application ID: " + System.lineSeparator() + "Found Interview details for the application"
				+ System.lineSeparator() + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "Interview ID: 1" + System.lineSeparator() + "Application ID: 1"
				+ System.lineSeparator() + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled"
				+ System.lineSeparator() + "Type: Tech" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Interview ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Type: HR"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Edit Interview" + System.lineSeparator()
				+ "2. Delete Interview" + System.lineSeparator() + "3. Add New Interview" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Interview ID: 1"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Type: Tech"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Interview ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Type: HR"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		interviewMenu.displayMenu(scanner);
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
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Interviews available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Edit interview" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter Interview ID to edit: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "All Available interviews are shown below"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Interviews available"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Manage interview for an application" + System.lineSeparator()
				+ "2. Edit interview" + System.lineSeparator() + "3. Delete interview" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		interviewMenu.displayMenu(scanner);
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
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Interviews available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Delete interview" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter Interview ID to delete: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Interviews available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		interviewMenu.displayMenu(scanner);
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
				+ "All Available interviews are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Interviews available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage interview for an application"
				+ System.lineSeparator() + "2. Edit interview" + System.lineSeparator() + "3. Delete interview"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "All Available interviews are shown below"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + "No Interviews available"
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Manage interview for an application" + System.lineSeparator()
				+ "2. Edit interview" + System.lineSeparator() + "3. Delete interview" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		interviewMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testManageInterviewForApplication() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "No Interview found for this application"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Interview" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Schedule Interview"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ "Enter interview date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter interview date and time (YYYY-MM-DD HH:mm:ss): Enter interview type: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
		interviewMenu.manageInterviewForApplication(scanner, 1);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testHandleNoInterview() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "No Interview found for this application"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "Please choose an option:" + System.lineSeparator()
				+ "1. Schedule Interview" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Schedule Interview"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ "Enter interview date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter interview date and time (YYYY-MM-DD HH:mm:ss): Enter interview type: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
		interviewMenu.handleNoInterview(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testHandleExistingInterview() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "Found Interview details for the application"
				+ System.lineSeparator() + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "Interview ID: 1" + System.lineSeparator() + "Application ID: 1"
				+ System.lineSeparator() + "Date and Time: 2023-12-10 01:19:22.0" + System.lineSeparator()
				+ "Status: Scheduled" + System.lineSeparator() + "Type: Technical" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Interview ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
				+ "Date and Time: 2023-12-10 01:19:22.0" + System.lineSeparator() + "Status: Scheduled"
				+ System.lineSeparator() + "Type: HR" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Edit Interview" + System.lineSeparator() + "2. Delete Interview"
				+ System.lineSeparator() + "3. Add New Interview" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Edit Interview" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter Interview ID to edit: Interview not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		List<Interview> interviewList = List.of(
				new Interview(1, 1, Timestamp.valueOf("2023-12-10 01:19:22"), "Scheduled", "Technical"),
				new Interview(2, 1, Timestamp.valueOf("2023-12-10 01:19:22"), "Scheduled", "HR"));
		interviewMenu.handleExistingInterview(interviewList, 1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testAddInterviewForApplication() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter interview date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter interview date and time (YYYY-MM-DD HH:mm:ss): Enter interview type: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("Technical\n2023-12-31 12:00:00\n");
		interviewMenu.addInterviewForApplication(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testEditInterview() throws ParseException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter updated interview date and time (YYYY-MM-DD HH:mm:ss): Enter updated interview status: Enter updated interview type: ";
		Scanner scanner = new Scanner("2023-12-31 12:00:00\nUpdated\nTechnical\n");
		Interview existingInterview = new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled",
				"Technical");
		interviewMenu.editInterview(existingInterview, scanner);
		System.setOut(originalOut);
		System.out.print(outContent.toString());
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDeleteInterview() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Are you sure you want to delete this interview (Y/N): ";
		Scanner scanner = new Scanner("Y\n");
		Interview existingInterview = new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled",
				"Technical");
		interviewMenu.deleteInterview(existingInterview, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testEditInterviewOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter Interview ID to edit: Interview not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n");
		interviewMenu.editInterviewOption(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDeleteInterviewOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter Interview ID to delete: Interview not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n");
		interviewMenu.deleteInterviewOption(scanner);
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
		LocalDateTime dateTime = interviewMenu.validateTimestampInput(scanner, "Enter timestamp: ");
		System.out.println(dateTime);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}