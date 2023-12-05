package main.java.placementApplicationTracker.studentMenu;

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
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {

				List<Application> applications;
				applications = ApplicationService.getApplicationsByStudent(studentId);
				if (applications.size() == 0) {
					System.out.println();
					System.out.println("No applications to display. You have not applied to any opportunities");
					System.out.println();

					System.out.println("Please press enter to continue");
					scanner.nextLine();
					System.out.println();

				} else {
					System.out.println();
					System.out.println("Applications List is shown below");
					System.out.println();
					applications.forEach(item -> {
						System.out.println("------------------------------------");
						System.out.println("Application ID: " + item.getApplicationId());
						System.out.println("Withdrawn: " + (item.getWithdrawn() == 1 ? "True" : "False"));
						System.out.println("SubmissionDate: " + item.getSubmissionDate());
						System.out.println("-----------------------------------------");
					});
				}

				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Manage an Application");
				System.out.println("2. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					System.out.println("Selected: Manage an Application");
					System.out.println("============================================");
					if (applications.size() == 0) {
						System.out.println();
						System.out.println("No applications available");
						System.out.println();

						System.out.println("Please press enter to continue");
						scanner.nextLine();
						System.out.println();

					} else {
						
						System.out.println();

						System.out.println("Enter the Application ID:");
						int appId = scanner.nextInt();
						// Show app details
						StudentApplicationDetailMenu.displayMenu(appId, scanner);
					}
					break;
				case 2:
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
}
