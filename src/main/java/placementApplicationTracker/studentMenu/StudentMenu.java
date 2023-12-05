package main.java.placementApplicationTracker.studentMenu;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.service.StudentService;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentMenu {

	private static final Logger LOGGER = Logger.getLogger(StudentMenu.class.getName());

	public static void displayStudentMenu(int studentId, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				// Retrieve student details for the welcome message
				Student student = null;
				try {
					student = StudentService.getStudentDetails(studentId);
				} catch (Exception e) {
					LOGGER.log(Level.SEVERE, "Error retrieving student details", e);
				}

				String studentName = (student != null) ? student.getFullName() : "Unknown";

				System.out.println("Welcome, " + studentName + "!");
				System.out.println();

				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. View Placement Opportunities");
				System.out.println("2. Manage Applications");
				System.out.println("3. Manage Personal Details");
				System.out.println("4. Logout");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: View Placement Opportunities");
					System.out.println("===========================================");
					System.out.println();
					if (student != null) {
						StudentPlacementMenu.displayPlacementOpportunities(studentId, scanner);
					} else {
						System.out.println("Student details not found.");
						System.out.println();
					}
					break;

				case 2:
					System.out.println("Selected: Manage Applications");
					System.out.println("===========================================");
					System.out.println();
					if (student != null) {
						StudentApplicationMenu.displayApplicationMenu(studentId, scanner);
					} else {
						System.out.println("Student details not found.");
						System.out.println();
					}
					break;

				case 3:
					System.out.println("Selected: Manage Personal Details");
					System.out.println("===========================================");
					System.out.println();
					if (student != null) {
						StudentDetailsMenu.displayEditDetailsMenu(student, scanner);
					} else {
						System.out.println("Student details not found.");
						System.out.println();
					}
					break;

				case 4:
					System.out.println("Selected: Logout");
					System.out.println("=========================================");
					isRunning = false;
					break;

				default:
					System.out.println("Invalid option. Please choose a valid option.");
					System.out.println("============================================");
					System.out.println();
					break;
				}
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, "Error in menu option processing", e);
				System.out.println("An unexpected error occurred. Please try again.");
				isRunning = false;
				break;
			}
		}
	}
}
