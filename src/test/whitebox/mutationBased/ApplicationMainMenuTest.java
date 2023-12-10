package test.whitebox.mutationBased;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.mainMenu.ApplicationMainMenu;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ApplicationMainMenuTest {

	@Test
	void testStudentLogin() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
				+ "Selected: Student Login" + System.lineSeparator() + "============================================"
				+ System.lineSeparator()
				+ "Enter StudentId: Enter Password: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An error occurred while connecting to the database. Please check the logs."
				+ System.lineSeparator() + "";
		String input = "1\n5\n";
		simulateUserInputAndRunTest(input);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testStudentSignup() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
				+ "Selected: Student Signup" + System.lineSeparator() + "============================================"
				+ System.lineSeparator() + "Enter StudentId: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An error occurred while connecting to the database. Please check the logs."
				+ System.lineSeparator() + "";
		String input = "2\n5\n";
		simulateUserInputAndRunTest(input);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testAdminLogin() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
				+ "Selected: Admin Login" + System.lineSeparator() + "============================================"
				+ System.lineSeparator()
				+ "Enter AdminId: Enter Password: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An error occurred while connecting to the database. Please check the logs."
				+ System.lineSeparator() + "";
		String input = "3\n5\n";
		simulateUserInputAndRunTest(input);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testAdminSignup() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
				+ "Selected: Admin Signup" + System.lineSeparator() + "============================================"
				+ System.lineSeparator() + "Enter AdminId: An unexpected error occurred. Please try again."
				+ System.lineSeparator() + System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator()
				+ "Enter your choice: An error occurred while connecting to the database. Please check the logs."
				+ System.lineSeparator() + "";
		String input = "4\n5\n";
		simulateUserInputAndRunTest(input);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testExit() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
				+ "Selected: Exit" + System.lineSeparator() + "============================================"
				+ System.lineSeparator() + "Application stopped." + System.lineSeparator() + "";
		String input = "5\n";
		simulateUserInputAndRunTest(input);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	@Test
	void testInvalidOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator() + "********************************************"
				+ System.lineSeparator() + "Welcome to Placement Application Tracker !" + System.lineSeparator()
				+ System.lineSeparator() + "Please Choose an option:" + System.lineSeparator() + "1. Student Login"
				+ System.lineSeparator() + "2. Student Signup" + System.lineSeparator() + "3. Admin Login"
				+ System.lineSeparator() + "4. Admin Signup" + System.lineSeparator() + "5. Exit"
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
				+ "Invalid option. Please choose a valid option." + System.lineSeparator()
				+ "============================================" + System.lineSeparator() + System.lineSeparator()
				+ System.lineSeparator() + "********************************************" + System.lineSeparator()
				+ "Welcome to Placement Application Tracker !" + System.lineSeparator() + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator() + "1. Student Login" + System.lineSeparator()
				+ "2. Student Signup" + System.lineSeparator() + "3. Admin Login" + System.lineSeparator()
				+ "4. Admin Signup" + System.lineSeparator() + "5. Exit" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator() + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator() + System.lineSeparator() + "Selected: Exit"
				+ System.lineSeparator() + "============================================" + System.lineSeparator()
				+ "Application stopped." + System.lineSeparator() + "";
		String input = "6\n5\n";
		simulateUserInputAndRunTest(input);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}

	private void simulateUserInputAndRunTest(String input) {
		InputStream originalInput = System.in;
		System.setIn(new InputStream() {
			private int index = 0;

			@Override
			public int read() {
				if (index == input.length()) {
					return -1;
				}
				return input.charAt(index++);
			}
		});

		try {
			ApplicationMainMenu applicationMainMenu = new ApplicationMainMenu(null, null, null, null, null, null, null,
					null, null);

			assertDoesNotThrow(() -> applicationMainMenu.displayMainMenu(new Scanner(System.in)));
		} finally {
			System.setIn(originalInput);
		}
	}
}
