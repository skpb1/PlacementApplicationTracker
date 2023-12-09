package main.java.placementApplicationTracker.studentMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.service.StudentService;

public class StudentDetailsMenu {

	private final Logger LOGGER = Logger.getLogger(StudentDetailsMenu.class.getName());
	private StudentService studentService;

	public StudentDetailsMenu(StudentRepo studentRepo) {
		studentService = new StudentService(studentRepo);
	}

	public void displayEditDetailsMenu(Student student, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			try {
				// Fetch and display student details
				student = studentService.getStudentDetails(student.getStudentId());
				displayStudentDetails(student);
				System.out.println();
				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Edit Details");
				System.out.println("2. Update Password");
				System.out.println("3. Go back");
				System.out.println("********************************************");
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();
				System.out.println();
				scanner.nextLine();

				switch (option) {
				case 1:
					// Get updated details from the user
					System.out.println("Please enter updated details below:");
					System.out.println("============================================");
					System.out.println();
					System.out.print("Enter updated Full Name: ");
					String updatedFullName = scanner.nextLine();
					scanner.nextLine();
					System.out.print("Enter updated Email: ");
					String updatedEmail = scanner.nextLine();
					System.out.print("Enter updated Course: ");
					String updatedCourse = scanner.nextLine();
					System.out.print("Enter updated Pass Out Year: ");
					int updatedPassOutYear = scanner.nextInt();

					// Update student details
					boolean isUpdated = studentService.updateStudentDetails(student.getStudentId(), updatedFullName,
							updatedEmail, updatedCourse, updatedPassOutYear);

					if (isUpdated) {
						System.out.println("Student details updated successfully.");
						System.out.println();
					}
					break;

				case 2:
					System.out.println("Selected: Update Password");
					System.out.println("============================================");
					System.out.println();
					EditPasswordMenu(student, scanner);
					break;

				case 3:
					System.out.println("Selected: Go back");
					System.out.println("============================================");
					System.out.println();
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

	// Display student details
	private void displayStudentDetails(Student student) {
		System.out.println("Current Student Details:");
		System.out.println("------------------------------------");
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Full Name: " + student.getFullName());
		System.out.println("Email: " + student.getEmail());
		System.out.println("Course: " + student.getCourse());
		System.out.println("Pass Out Year: " + student.getPassOutYear());
		System.out.println("------------------------------------");
	}

	public void EditPasswordMenu(Student student, Scanner scanner) {
		// Retrieve and update student password
		String enteredCurrentPassword;

		do {
			System.out.print("Enter current password: ");
			enteredCurrentPassword = scanner.nextLine();

			// Compare entered current password with the actual current password
			if (!enteredCurrentPassword.equals(student.getPassword())) {
				System.out.println("Entered current password is not correct. Please try again.");
			}
		} while (!enteredCurrentPassword.equals(student.getPassword()));

		// Prompt for the new password
		String newPassword;
		String confirmNewPassword;

		do {
			System.out.print("Enter new password: ");
			newPassword = scanner.nextLine();

			// Prompt for confirmation of the new password
			System.out.print("Confirm new password: ");
			confirmNewPassword = scanner.nextLine();

			// Compare new password and confirmation
			if (!newPassword.equals(confirmNewPassword)) {
				System.out.println("New password and confirmation do not match. Please try again.");
			}
		} while (!newPassword.equals(confirmNewPassword));

		// Update student password
		boolean isPasswordUpdated = studentService.updateStudentPassword(student.getStudentId(), enteredCurrentPassword,
				newPassword);

		if (isPasswordUpdated) {
			System.out.println("Password updated successfully.");
			System.out.println();
		}
	}
}
