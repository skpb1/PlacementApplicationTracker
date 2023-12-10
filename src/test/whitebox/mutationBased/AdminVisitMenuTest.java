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

import main.java.placementApplicationTracker.adminMenu.AdminVisitMenu;
import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.VisitService;

public class AdminVisitMenuTest {
	private VisitRepo visitRepo;
	private AdminVisitMenu visitMenu;

	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
		new VisitService(visitRepo);
		visitMenu = new AdminVisitMenu(visitRepo);
	}

	@Test
	void testDisplayMenu() {
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Manage visit for an application"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ System.lineSeparator() + "Enter the Application ID: " + System.lineSeparator()
				+ "No Visit found for this application" + System.lineSeparator() + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "Please choose an option:" + System.lineSeparator() + "1. Schedule Visit" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available visits are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Visits available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage visit for an application"
				+ System.lineSeparator() + "2. Edit visit" + System.lineSeparator() + "3. Delete visit"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Go back" + System.lineSeparator() + "";
		visitMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp1() {
		Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
		Scanner scanner = new Scanner("1\n\n1\n\n");
		visitRepo.addVisit(new Visit(1, 1, timestamp, "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, timestamp, "Scheduled", "visit2"));
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "Visit ID: 1" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
				+ "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
				+ "Details: visit1" + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "Visit ID: 2" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
				+ "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
				+ "Details: visit2" + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Manage visit for an application"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ System.lineSeparator() + "Enter the Application ID: " + System.lineSeparator()
				+ "Found Visit details for the application" + System.lineSeparator() + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Visit ID: 1"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: visit1"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Visit ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
				+ System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: visit2"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Edit Visit" + System.lineSeparator()
				+ "2. Delete Visit" + System.lineSeparator() + "3. Add new Visit" + System.lineSeparator()
				+ "4. Go back" + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "Visit ID: 1" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
				+ "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
				+ "Details: visit1" + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
				+ "Visit ID: 2" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
				+ "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
				+ "Details: visit2" + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		visitMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp2() {
		Scanner scanner = new Scanner("2\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Edit Visit" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter Visit ID to edit: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available visits are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Visits available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage visit for an application"
				+ System.lineSeparator() + "2. Edit visit" + System.lineSeparator() + "3. Delete visit"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		visitMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuOp3() {
		Scanner scanner = new Scanner("3\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Delete Visit" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ "Enter Visit ID to delete: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ "All Available visits are shown below" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Visits available" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Manage visit for an application"
				+ System.lineSeparator() + "2. Edit visit" + System.lineSeparator() + "3. Delete visit"
				+ System.lineSeparator() + "4. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		visitMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDisplayMenuInvalid() {
		Scanner scanner = new Scanner("69\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Invalid option. Please choose a valid option."
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
				+ "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
				+ System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		visitMenu.displayMenu(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testManageVisitForApplication() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "No Visit found for this application" + System.lineSeparator()
				+ System.lineSeparator() + "------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "Please choose an option:" + System.lineSeparator() + "1. Schedule Visit"
				+ System.lineSeparator() + "2. Go back" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Schedule Visit" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter visit date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter visit date and time (YYYY-MM-DD HH:mm:ss): Enter visit details: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\nCompany Visit\n2023-12-31 12:00:00\n");
		visitMenu.manageVisitForApplication(scanner, 1);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testHandleNoVisit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "No Visit found for this application" + System.lineSeparator()
				+ System.lineSeparator() + "------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "Please choose an option:" + System.lineSeparator() + "1. Schedule Visit"
				+ System.lineSeparator() + "2. Go back" + System.lineSeparator() + "Enter your choice: "
				+ System.lineSeparator() + "Selected: Schedule Visit" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter visit date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter visit date and time (YYYY-MM-DD HH:mm:ss): Enter visit details: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\nCompany Visit\n2023-12-31 12:00:00\n");
		visitMenu.handleNoVisit(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testHandleExistingVisit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "Found Visit details for the application"
				+ System.lineSeparator() + System.lineSeparator() + "-----------------------------------------"
				+ System.lineSeparator() + "Visit ID: 1" + System.lineSeparator() + "Application ID: 1"
				+ System.lineSeparator() + "Date and Time: 2023-01-01 01:01:01.0" + System.lineSeparator()
				+ "Status: Scheduled" + System.lineSeparator() + "Details: ABC Company Visit" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + "Visit ID: 2"
				+ System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
				+ "Date and Time: 2023-01-01 01:01:01.0" + System.lineSeparator() + "Status: Scheduled"
				+ System.lineSeparator() + "Details: XYZ Company Visit" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "Please Choose an option:"
				+ System.lineSeparator() + "1. Edit Visit" + System.lineSeparator() + "2. Delete Visit"
				+ System.lineSeparator() + "3. Add new Visit" + System.lineSeparator() + "4. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Edit Visit" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ "Enter Visit ID to edit: Visit not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		List<Visit> visitList = List.of(
				new Visit(1, 1, Timestamp.valueOf("2023-01-01 01:01:01"), "Scheduled", "ABC Company Visit"),
				new Visit(2, 1, Timestamp.valueOf("2023-01-01 01:01:01"), "Scheduled", "XYZ Company Visit"));
		visitMenu.handleExistingVisit(visitList, 1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testAddVisitForApplication() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter visit date and time (YYYY-MM-DD HH:mm:ss): Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
				+ System.lineSeparator()
				+ "Enter visit date and time (YYYY-MM-DD HH:mm:ss): Enter visit details: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + "";
		Scanner scanner = new Scanner("Visit details\n2023-12-31 12:00:00\n");
		visitMenu.addVisitForApplication(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testEditVisit() throws ParseException {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter updated visit date and time (YYYY-MM-DD HH:mm:ss): Enter updated visit status: Enter updated visit details: ";
		Scanner scanner = new Scanner("2023-12-31 12:00:00\nUpdated\nVisit Details\n");
		Visit existingVisit = new Visit(1, 1, Timestamp.valueOf("2023-01-01 01:01:01"), "Scheduled", "ABC");
		visitMenu.editVisit(existingVisit, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDeleteVisit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Are you sure you want to delete this visit (Y/N): ";
		Scanner scanner = new Scanner("Y\n");
		Visit existingVisit = new Visit(1, 1, Timestamp.valueOf("2023-01-01 01:01:01"), "Scheduled", "XYZ");
		visitMenu.deleteVisit(existingVisit, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testEditVisitOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter Visit ID to edit: Visit not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n");
		visitMenu.editVisitOption(scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDeleteVisitOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = "Enter Visit ID to delete: Visit not found." + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n");
		visitMenu.deleteVisitOption(scanner);
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
		LocalDateTime dateTime = visitMenu.validateTimestampInput(scanner, "Enter timestamp: ");
		System.out.println(dateTime);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}