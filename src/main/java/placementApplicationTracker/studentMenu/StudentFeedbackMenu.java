package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Feedback;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.service.FeedbackService;

public class StudentFeedbackMenu {
	private final Logger LOGGER = Logger.getLogger(StudentFeedbackMenu.class.getName());
	private FeedbackService feedbackService;
	
	public StudentFeedbackMenu(FeedbackRepo feedbackRepo) {
		feedbackService = new FeedbackService(feedbackRepo);
	}

	public void displayFeedbackMenu(int applicationId, Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				List<Feedback> feedbacks = null;

				try {
					feedbacks = feedbackService.getFeedbacksByApplicationId(applicationId);
				} catch (Exception e) {
					LOGGER.log(Level.SEVERE, "Error retrieving feedback details", e);
				}

				if (feedbacks.size() != 0) {
					System.out.println();
					System.out.println("Feedback List is shown below");
					System.out.println();

					feedbacks.forEach(feedback -> {
						System.out.println("------------------------------------------");
						System.out.println("Feedback Id: " + feedback.getFeedbackId());
						System.out.println("DateTime: " + feedback.getDateTime());
						System.out.println("------------------------------------------");
					});
				} else {
					System.out.println();
					System.out.println("No Feedbacks found");
					System.out.println();
				}

				System.out.println();
				System.out.println("********************************************");
				System.out.println("1. Show Details of a Feedback");
				System.out.println("2. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option;
				option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					System.out.println("Selected: Show Details of a Feedback");
					System.out.println("============================================");
					System.out.println();
					if (feedbacks.size() != 0) {
						System.out.println();
						System.out.println("Enter the Feedback Id:");
						int feedbackId = scanner.nextInt();
						Feedback feedback = feedbackService.getFeedbackByFeedbackId(feedbackId);
						System.out.println();
						System.out.println("Feedback Details are shown below");
						System.out.println();
						System.out.println("------------------------------------------");
						System.out.println("Feedback Id: " + feedback.getFeedbackId());
						System.out.println("DateTime: " + feedback.getDateTime());
						System.out.println("Comments: " + feedback.getComments());
						System.out.println("------------------------------------------");
						System.out.println();
						System.out.println();

						scanner.nextLine();

						System.out.println("Press Enter to continue");
						scanner.nextLine();
						System.out.println();
					} else {
						System.out.println();
						System.out.println("No Feedbacks found");
						System.out.println();
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
