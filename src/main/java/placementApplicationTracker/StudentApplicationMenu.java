package main.java.placementApplicationTracker;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.service.ApplicationService;

public class StudentApplicationMenu {

	private static final Logger LOGGER = Logger.getLogger(StudentApplicationMenu.class.getName());

	public static void displayApplicationMenu(int studentId, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			try {

				List<Application> applications;
				applications = ApplicationService.getApplicationsByStudent(studentId);
				if (applications.size() == 0) {
					System.out.println();
					System.out.println("No applications to display. You have not applied to any opportunities");
					System.out.println();

				} else {
					applications.forEach(item -> {
						System.out.println("------------------------------------");
						System.out.println("Application ID: " + item.getApplicationId());
						System.out.println("Withdrawn: " + (item.getWithdrawn() == 1 ? "True" : "False"));
						System.out.println("SubmissionDate: " + item.getSubmissionDate());
						System.out.println("-----------------------------------------");
					});
				}

				System.out.println();
				System.out.println("Submitted applications are shown above");
				System.out.println();

				System.out.println("Please Choose an option:");
				System.out.println("1. View Application");
				System.out.println("2. Withdraw an Application");
				System.out.println("3. Go back");
				System.out.println();

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: View Application");
					System.out.println();
					
					System.out.println("Enter the Application ID:");
					int appId = scanner.nextInt();
					// Show app details
					StudentApplicationDetailMenu.displayMenu(appId, scanner);
					break;
				case 2:
					System.out.println("Selected: Withdraw an Application");
					System.out.println();
					
					System.out.println("Enter the Application ID:");
					int id = scanner.nextInt();
					System.out.println();
					System.out.println("Are you sure you want to withdraw this application (Y/N)");
					
					scanner.nextLine();
					String choice = scanner.nextLine();
					
					if (choice.equals("Y") || choice.equals("y")) {
						try {
							boolean isUpdated = ApplicationService.withdrawApplicationByAppId(id);

                            if (isUpdated) {
                                System.out.println("Application has been withdrawn successfully.");
                                System.out.println();
                            } else {
                                System.out.println("Failed to withdraw the application.");
                                System.out.println();
                            }
						} catch (Exception e) {
                            LOGGER.log(Level.SEVERE, "Error updating application details", e);
                        }
					}
					break;
				case 3:
					System.out.println("Selected: Go back");
					System.out.println();
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
	}
}
