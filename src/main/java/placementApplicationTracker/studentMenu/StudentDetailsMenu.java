package main.java.placementApplicationTracker.studentMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.service.StudentService;

public class StudentDetailsMenu {

    private static final Logger LOGGER = Logger.getLogger(StudentDetailsMenu.class.getName());

    public static void displayEditDetailsMenu(Student student, Scanner scanner) {
    	
    	boolean isRunning = true;
    	
		while (isRunning) {
			System.out.println();
			System.out.println();
			try {
		        // Retrieve and display student details
		        System.out.println("Current Student Details:");
		        System.out.println();
		        System.out.println("------------------------------------");
		        System.out.println("Student ID: " + student.getStudentId());
		        System.out.println("Full Name: " + student.getFullName());
		        System.out.println("Email: " + student.getEmail());
		        System.out.println("Course: " + student.getCourse());
		        System.out.println("Pass Out Year: " + student.getPassOutYear());
		        System.out.println("------------------------------------");
			
		        System.out.println();
				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Edit Details");
				System.out.println("2. Update Password");
				System.out.println("3. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();
				System.out.println();
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
			        try {
			            boolean isUpdated = StudentService.updateStudentDetails(
			                    student.getStudentId(), updatedFullName, updatedEmail, updatedCourse, updatedPassOutYear);
			
			            if (isUpdated) {
			                System.out.println("Student details updated successfully.");
			                System.out.println();
			            } else {
			                System.out.println("Failed to update student details.");
			                System.out.println();
			            }
			        } catch (Exception e) {
			            LOGGER.log(Level.SEVERE, "Error updating student details", e);
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


    public static void EditPasswordMenu(Student student, Scanner scanner) {
        // Retrieve and update student password	
    	String enteredCurrentPassword;
    	
    	do {
    		 System.out.print("Enter current password: ");
             enteredCurrentPassword = scanner.nextLine();
             scanner.nextLine();

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
        try {
            boolean isPasswordUpdated = StudentService.updateStudentPassword(
                    student.getStudentId(), enteredCurrentPassword, newPassword);

            if (isPasswordUpdated) {
                System.out.println("Password updated successfully.");
                System.out.println();
            } else {
                System.out.println("Failed to update password. Please check your current password.");
                System.out.println();
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error updating student password", e);
        }
    }
}
