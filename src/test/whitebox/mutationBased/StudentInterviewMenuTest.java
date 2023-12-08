package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu;

public class StudentInterviewMenuTest {
	private InterviewRepo interviewRepo;
	private StudentInterviewMenu studentInterviewMenu;
	private Timestamp timestamp;
	
	@BeforeEach
	void setup() {
		interviewRepo = new MockInterviewRepoImpl();
		studentInterviewMenu = new StudentInterviewMenu(interviewRepo);
		timestamp = new Timestamp(System.currentTimeMillis());
	}
	
	@Test
	void testGoBack() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Interviews List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testDefault() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Interviews List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
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
				+ "Interviews List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("3\n2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testNoInterviews() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Interviews found" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of an Interview" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Interviews found" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Interviews found" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("1\n2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testInterviewsException() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Interviews List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of an Interview" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Interview Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Interview Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("1\n2\n");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testInterviews() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Interviews List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of an Interview" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Interview Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Interview Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "Status: status" + System.lineSeparator()
				+ "Type: details" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Press Enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Interviews List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Interview Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Interview" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("1\n1\n2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}
