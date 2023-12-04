package main.java.placementApplicationTracker;

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

                System.out.println("Please Choose an option:");
                System.out.println("1. Edit Personal Details");
                System.out.println("2. View Placement Opportunities");
                System.out.println("3. Manage Applications");
                System.out.println("4. Update Password");
                System.out.println("5. Logout");

                int option = scanner.nextInt();

                switch (option) {
                    case 1:
                        System.out.println("Selected: Edit Personal Details");
                        System.out.println();
                        // Retrieve and display student details
                        if (student != null) {
                            System.out.println("Current Student Details:");
                            System.out.println();
                            System.out.println("Student ID: " + student.getStudentId());
                            System.out.println("Full Name: " + student.getFullName());
                            System.out.println("Email: " + student.getEmail());
                            System.out.println("Course: " + student.getCourse());
                            System.out.println("Pass Out Year: " + student.getPassOutYear());
                            System.out.println();

                            // Get updated details from the user
                            System.out.println("Please enter updated details below:");
                            System.out.println();
                            scanner.nextLine();
                            System.out.print("Enter updated Full Name: ");
                            String updatedFullName = scanner.nextLine();
                            System.out.print("Enter updated Email: ");
                            String updatedEmail = scanner.nextLine();
                            System.out.print("Enter updated Course: ");
                            String updatedCourse = scanner.nextLine();
                            System.out.print("Enter updated Pass Out Year: ");
                            int updatedPassOutYear = scanner.nextInt();

                            // Update student details
                            try {
                                boolean isUpdated = StudentService.updateStudentDetails(
                                        studentId, updatedFullName, updatedEmail, updatedCourse, updatedPassOutYear);

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
                        } else {
                            System.out.println("Student details not found.");
                            System.out.println();
                        }
                        break;

                    case 2:
                        System.out.println("Selected: View Placement Opportunities");
                        System.out.println();
                        // Implement view placement opportunities logic
                        break;

                    case 3:
                        System.out.println("Selected: Manage Applications");
                        System.out.println();
                        // Implement manage applications logic
                        break;

                    case 4:
                        System.out.println("Selected: Update Password");
                        System.out.println();
                        // Retrieve and update student password
                        if (student != null) {
                            System.out.print("Enter current password: ");
                            String currentPassword = scanner.nextLine();
                            scanner.nextLine();

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
                                boolean isPasswordUpdated = StudentService.updateStudentPassword(studentId,
                                        currentPassword, newPassword);

                                if (isPasswordUpdated) {
                                    System.out.println("Password updated successfully.");
                                    System.out.println();
                                } else {
                                    System.out
                                            .println("Failed to update password. Please check your current password.");
                                    System.out.println();
                                }
                            } catch (Exception e) {
                                LOGGER.log(Level.SEVERE, "Error updating student password", e);
                            }
                        } else {
                            System.out.println("Student details not found.");
                            System.out.println();
                        }
                        break;

                    case 5:
                        System.out.println("Selected: Logout");
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
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
        System.out.println("Loged out from Student Menu.");
    }
}
