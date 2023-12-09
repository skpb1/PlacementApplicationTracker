package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu;

public class StudentAssessmentMenuTest {
	private AssessmentRepo assessmentRepo;
	private StudentAssessmentMenu studentAssessmentMenu;
	
	@BeforeEach
	void setup() {
		assessmentRepo = new MockAssessmentRepoImpl();
		studentAssessmentMenu = new StudentAssessmentMenu(assessmentRepo);
	}
	
	@Test
	void testGoBack() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Assessment assessment = new Assessment(1, 1, timestamp, "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("2");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Assessments List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testDefault() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Assessment assessment = new Assessment(1, 1, timestamp, "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("3\n2");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Assessments List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
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
				+ "Assessments List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testNoAssessments() {
		Scanner scanner = new Scanner("1\n2");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Assessments found" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of an Assessment" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Assessments found" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Assessments found" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ "";
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testAssessmentsException() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Assessment assessment = new Assessment(1, 1, timestamp, "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("1\n2\n");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Assessments List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of an Assessment" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Assessment Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Assessment Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testAssessments() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		Assessment assessment = new Assessment(1, 1, timestamp, "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("1\n1\n2");
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Assessments List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Show Details of an Assessment" + System.lineSeparator()
				+ "============================================" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter the Assessment Id:" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Assessment Details are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "Status: status" + System.lineSeparator()
				+ "Details: details" + System.lineSeparator()
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
				+ "Assessments List is shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ "Assessment Id: 1" + System.lineSeparator()
				+ "DateTime: "+timestamp+System.lineSeparator()
				+ "------------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "1. Show Details of an Assessment" + System.lineSeparator()
				+ "2. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}
