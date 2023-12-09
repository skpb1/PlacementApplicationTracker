package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.studentMenu.StudentFeedbackMenu;

public class StudentFeedbackMenuTest {
	private FeedbackRepo feedbackRepo;
	private StudentFeedbackMenu studentFeedbackMenu;
	
	@BeforeEach
	void setup() {
		feedbackRepo = new MockFeedbackRepoImpl();
		studentFeedbackMenu = new StudentFeedbackMenu(feedbackRepo);
	}
	
	@Test
	void testGoBack() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		feedbackRepo.addFeedback(1, "comments");
		Timestamp timestamp = feedbackRepo.getFeedbackByFeedbackId(1).getDateTime();
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testDefault() {
		feedbackRepo.addFeedback(1, "comments");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		feedbackRepo.addFeedback(1, "comments");
		Timestamp timestamp = feedbackRepo.getFeedbackByFeedbackId(1).getDateTime();
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 2" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
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
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 2" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("3\n2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testNoFeedbacks() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		feedbackRepo.addFeedback(1, "comments");
		Timestamp timestamp = feedbackRepo.getFeedbackByFeedbackId(1).getDateTime();
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of a Feedback" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Feedback Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("1\n2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testFeedbacksException() {
		feedbackRepo.addFeedback(1, "comments");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		feedbackRepo.addFeedback(1, "comments");
		Timestamp timestamp1 = feedbackRepo.getFeedbackByFeedbackId(1).getDateTime();
		Timestamp timestamp2 = feedbackRepo.getFeedbackByFeedbackId(2).getDateTime();
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp1+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 2" + System.lineSeparator()
				+ "DateTime: "+timestamp2+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of a Feedback" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Feedback Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 2" + System.lineSeparator()
				+ "DateTime: "+timestamp2+System.lineSeparator()
				+ "Comments: comments" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Press Enter to continue" + System.lineSeparator()
				+ "An unexpected error occurred. Please try again." + System.lineSeparator();
		Scanner scanner = new Scanner("1\n2\n");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testFeedbacks() {
		feedbackRepo.addFeedback(1, "comments");
		Scanner scanner = new Scanner("1\n1\n2");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		feedbackRepo.addFeedback(1, "comments");
		Timestamp timestamp1 = feedbackRepo.getFeedbackByFeedbackId(1).getDateTime();
		Timestamp timestamp2 = feedbackRepo.getFeedbackByFeedbackId(2).getDateTime();
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp1+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 2" + System.lineSeparator()
				+ "DateTime: "+timestamp2+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of a Feedback" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Feedback Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Feedback Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp1+System.lineSeparator()
				+ "Comments: comments" + System.lineSeparator()
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
				+ "Feedback List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp1+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Feedback Id: 2" + System.lineSeparator()
				+ "DateTime: "+timestamp2+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of a Feedback" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}
