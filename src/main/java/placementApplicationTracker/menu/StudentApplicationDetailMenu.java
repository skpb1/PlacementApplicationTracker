package main.java.placementApplicationTracker.menu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.service.ApplicationService;
import main.java.placementApplicationTracker.service.AssessmentService;
import main.java.placementApplicationTracker.service.FeedbackService;
import main.java.placementApplicationTracker.service.InterviewService;
import main.java.placementApplicationTracker.service.VisitService;

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
				System.out.println("2. Withdraw Application");
				System.out.println("3. Show Assessments for the application");
				System.out.println("4. Show Visits for the application");
				System.out.println("5. Show Interviews for the application");
				System.out.println("6. Show Feedback for the application");
				System.out.println("7. Go back");
				System.out.println();

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: Edit Application");
					System.out.println();

					scanner.nextLine();

					System.out.println("Enter the new Resume Content:");
					String updatedResume = scanner.nextLine();
					String updatedCoverLetter = scanner.nextLine();

					try {
						boolean isUpdated = ApplicationService.updateApplication(applicationId, updatedResume,
								updatedCoverLetter);
						if (isUpdated) {
							System.out.println("Application has been updated successfully.");
							System.out.println();
						} else {
							System.out.println("Failed to update the application.");
							System.out.println();
						}
					} catch (Exception e) {
						LOGGER.log(Level.SEVERE, "Error updating application details", e);
					}
					break;
				case 2:
					System.out.println("Selected: Withdraw Application");
					System.out.println();

					System.out.println("Are you sure you want to withdraw this application (Y/N)");

					scanner.nextLine();
					String choice = scanner.nextLine();

					if (choice.equals("Y") || choice.equals("y")) {
						try {
							boolean isUpdated = ApplicationService.withdrawApplicationByAppId(applicationId);

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
					System.out.println("Selected: Show Assessments List");
					System.out.println();
					// Display Assessments
					AssessmentService.getAssessmentsByApplicationId(applicationId);
					break;
				case 4:
					System.out.println("Selected: Show Visits List");
					System.out.println();
					// Display Visits
					VisitService.getVisitsByApplicationId(applicationId);
					break;
				case 5:
					System.out.println("Selected: Show Interviews List");
					System.out.println();
					// Display Interviews
					InterviewService.getInterviewsByApplicationId(applicationId);
					break;
				case 6:
					System.out.println("Selected: Show Feedback List");
					System.out.println();
					// Display Feedbacks
					FeedbackService.getFeedbacksByApplicationId(applicationId);
					break;
				case 7:
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
