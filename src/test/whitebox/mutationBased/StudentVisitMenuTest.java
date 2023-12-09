package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.studentMenu.StudentVisitMenu;

class StudentVisitMenuTest {

	private VisitRepo visitRepo;
	private StudentVisitMenu studentVisitMenu;
	private Timestamp timestamp;

	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
		studentVisitMenu = new StudentVisitMenu(visitRepo);
		timestamp = new Timestamp(System.currentTimeMillis());
	}

	@Test
	void testGoBack() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Visits List is shown below"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------------"
				+ System.lineSeparator() + "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator() + "";
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("2");
		studentVisitMenu.displayVisitMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testDefault() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Visits List is shown below"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------------"
				+ System.lineSeparator() + "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Invalid option. Please choose a valid option."
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Visits List is shown below"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------------"
				+ System.lineSeparator() + "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator() + "";
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("3\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testNoVisits() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "No Visits found" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of a Visit" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Visits found" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "No Visits found" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator() + "";
		Scanner scanner = new Scanner("1\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testVisitsException() {
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Visits List is shown below"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------------"
				+ System.lineSeparator() + "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Show Details of a Visit"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Enter the Visit Id:" + System.lineSeparator()
				+ System.lineSeparator() + "Visit Details are shown below" + System.lineSeparator()
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ "An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("1\n2\n");
		studentVisitMenu.displayVisitMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testVisits() {
		String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Visits List is shown below"
				+ System.lineSeparator() + System.lineSeparator() + "------------------------------------------"
				+ System.lineSeparator() + "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Visit" + System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + "Selected: Show Details of a Visit"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + "Enter the Visit Id:" + System.lineSeparator()
				+ System.lineSeparator() + "Visit Details are shown below" + System.lineSeparator()
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp + System.lineSeparator()
				+ "Status: status" + System.lineSeparator() + "Details: details" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "Press Enter to continue" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "Visits List is shown below" + System.lineSeparator()
				+ System.lineSeparator() + "------------------------------------------" + System.lineSeparator()
				+ "Visit Id: 1" + System.lineSeparator() + "DateTime: " + timestamp + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator() + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + "1. Show Details of a Visit"
				+ System.lineSeparator() + "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("1\n1\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

}
