package main.java.placementApplicationTracker;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.service.ApplicationService;

public class StudentApplicationDetailMenu {
	private static final Logger LOGGER = Logger.getLogger(StudentApplicationDetailMenu.class.getName());

	public static void displayMenu(int applicationId, Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			try {

				Application application = ApplicationService.getApplicationByAppId(applicationId);

				System.out.println();
				System.out.println("Application Details are shown below");
				System.out.println();

				System.out.println();
				System.out.println();
				System.out.println("------------------------------------");
				System.out.println("Application ID: " + application.getApplicationId());
				System.out.println("Withdrawn: " + (application.getWithdrawn() == 1 ? "True" : "False"));
				System.out.println("SubmissionDate: " + application.getSubmissionDate());
				System.out.println("Status: " + application.getStatus());
				System.out.println("Resume: " + application.getResume());
				System.out.println("Cover Letter: " + application.getCoverLetter());
				System.out.println("--------------------------------------");
				System.out.println();
				System.out.println();

				System.out.println("Please Choose an option:");
				System.out.println("1. Edit Application");
				System.out.println("2. Show Assessments for the application");
				System.out.println("3. Show Visits for the application");
				System.out.println("4. Show Feedback for the application");
				System.out.println("5. Go back");
				System.out.println();

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: Edit Application");
					System.out.println();
					break;
				case 2:
					System.out.println("Selected: Show Assessments List");
					System.out.println();
					break;
				case 3:
					System.out.println("Selected: Show Visits List");
					System.out.println();
					break;
				case 4:
					System.out.println("Selected: Show Feedback List");
					System.out.println();
					break;
				case 5:
					System.out.println("Selected: Go back");
					isRunning = false;
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
