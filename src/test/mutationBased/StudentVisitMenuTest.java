package test.mutationBased;

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
		String expectedOutput = "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Visits List is shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: " + timestamp + "\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Go back\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "";
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
		String expectedOutput = "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Visits List is shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: " + timestamp + "\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Invalid option. Please choose a valid option.\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Visits List is shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: " + timestamp + "\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Go back\r\n"
				+ "============================================\r\n"
				+ "\r\n" + "";
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
		String expectedOutput = "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "No Visits found\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Show Details of a Visit\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "No Visits found\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "No Visits found\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Go back\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "";
		Scanner scanner = new Scanner("1\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testVisitsException() {
		String expectedOutput = "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Visits List is shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: "+ timestamp +"\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Show Details of a Visit\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Enter the Visit Id:\r\n"
				+ "\r\n"
				+ "Visit Details are shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "An unexpected error occurred. Please try again.\r\n"
				+ "";
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
		String expectedOutput = "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Visits List is shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: " + timestamp + "\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: \r\n"
				+ "Selected: Show Details of a Visit\r\n"
				+ "============================================\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Enter the Visit Id:\r\n"
				+ "\r\n"
				+ "Visit Details are shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: " + timestamp + "\r\n"
				+ "Status: status\r\n"
				+ "Details: details\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Press Enter to continue\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "Visits List is shown below\r\n"
				+ "\r\n"
				+ "------------------------------------------\r\n"
				+ "Visit Id: 1\r\n"
				+ "DateTime: " + timestamp + "\r\n"
				+ "------------------------------------------\r\n"
				+ "\r\n"
				+ "********************************************\r\n"
				+ "1. Show Details of a Visit\r\n"
				+ "2. Go back\r\n"
				+ "********************************************\r\n"
				+ "\r\n"
				+ "Enter your choice: An unexpected error occurred. Please try again.\r\n"
				+ "";
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
