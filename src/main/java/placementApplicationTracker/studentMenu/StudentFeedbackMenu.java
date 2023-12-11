package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Feedback;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.service.FeedbackService;

public class StudentFeedbackMenu {
    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(StudentFeedbackMenu.class.getName());

    // Service for handling feedback-related operations
    private FeedbackService feedbackService;
    
    // Constructor to initialize StudentFeedbackMenu with the necessary repository and service
    public StudentFeedbackMenu(FeedbackRepo feedbackRepo) {
        feedbackService = new FeedbackService(feedbackRepo);
    }

    // Method to display the feedback menu and handle user input
    public void displayFeedbackMenu(int applicationId, Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            try {
                // Retrieve feedbacks by application ID
                List<Feedback> feedbacks = feedbackService.getFeedbacksByApplicationId(applicationId);

                if (feedbacks.size() != 0) {
                    // Display feedbacks list
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
                    // No feedbacks found
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
                        // Show Details of a Feedback
                        System.out.println("Selected: Show Details of a Feedback");
                        System.out.println("============================================");
                        System.out.println();
                        if (feedbacks.size() != 0) {
                            System.out.println();
                            // Enter the Feedback Id
                            System.out.println("Enter the Feedback Id:");
                            int feedbackId = scanner.nextInt();

                            // Retrieve feedback details
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
                        // Go back to the previous menu
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
                // Handle exceptions in menu option processing
                LOGGER.log(Level.SEVERE, "Error in menu option processing", e);
                System.out.println("An unexpected error occurred. Please try again.");
                isRunning = false;
                break;
            }
        }
    }
}
