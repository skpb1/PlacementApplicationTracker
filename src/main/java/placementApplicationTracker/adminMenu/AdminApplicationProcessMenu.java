package main.java.placementApplicationTracker.adminMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.ApplicationService;
import main.java.placementApplicationTracker.service.FeedbackService;

public class AdminApplicationProcessMenu {
	// Logger for logging exceptions
	private final Logger LOGGER = Logger.getLogger(AdminApplicationProcessMenu.class.getName());

	private ApplicationService applicationService;
	private FeedbackService feedbackService;
	
	private AdminVisitMenu adminVisitMenu;
	private AdminAssessmentMenu adminAssessmentMenu;
	private AdminInterviewMenu adminInterviewMenu;
	
	// Construct the class with required repositories
	public AdminApplicationProcessMenu(VisitRepo repo, ApplicationRepo applicationRepo, FeedbackRepo feedbackRepo, AssessmentRepo assessmentRepo, InterviewRepo interviewRepo) {
		
		this.applicationService = new ApplicationService(applicationRepo);
		this.feedbackService = new FeedbackService(feedbackRepo);
		
		this.adminVisitMenu = new AdminVisitMenu(repo);
		this.adminAssessmentMenu = new AdminAssessmentMenu(assessmentRepo);
        this.adminInterviewMenu = new AdminInterviewMenu(interviewRepo);
	}
	
	public void displayMenu(int applicationId, Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			try {

				// Get the application details
				Application application = applicationService.getApplicationByAppId(applicationId);

				if (application != null) {
					// Display the application details
					System.out.println();
					System.out.println("Application Details are shown below");
					System.out.println();

					System.out.println();
					System.out.println("--------------------------------------");
					System.out.println("Application ID: " + application.getApplicationId());
					System.out.println("Opportunity ID: " + application.getOpportunityId());
					System.out.println("Resume: " + application.getResume());
					System.out.println("Cover Letter: " + application.getCoverLetter());
					System.out.println("Status: " + application.getStatus());
					System.out.println("Submitted By (Student ID): " + application.getStudentId());
					System.out.println("SubmissionDate: " + application.getSubmissionDate());
					System.out.println("Withdrawn: " + (application.getWithdrawn() == 1 ? "True" : "False"));
					System.out.println("--------------------------------------");
					System.out.println();
				} else {
					System.out.println();
					System.out.println("Application details not found.");
					System.out.println();
				}

				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Approve/ Reject Application");
				System.out.println("2. Provide Feedback");
				System.out.println("3. Manage Visit");
				System.out.println("4. Manage Assessment");
				System.out.println("5. Manage Interview");
				System.out.println("6. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();

				switch (option) {

				case 1:
					System.out.println("Selected: Approve/ Reject Application");
					System.out.println("============================================");
					System.out.println();
					if (application != null) {
						scanner.nextLine();

						// Loop until the user enters a valid action (approve or reject)
	                    String action;
	                    while (true) {
	                        System.out.print("Select an Action Approve(a)/ Reject(r): ");
	                        action = scanner.nextLine().toLowerCase();

	                        if (action.equals("a") || action.equals("r")) {
	                            break;
	                        } else {
	                            System.out.println("Invalid action. Please enter either 'a' for Approve or 'r' for Reject.");
	                        }
	                    }
	                    boolean isStatusUpdated = applicationService.updateApplicationStatus(applicationId, action);

	                    if (isStatusUpdated) {
	                        System.out.println("Application status updated successfully.");
	                    }
					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;

				case 2:
					System.out.println("Selected: Provide Feedback");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
				        scanner.nextLine();

				        System.out.print("Enter your feedback: ");
				        String feedbackText = scanner.nextLine();

				        boolean isFeedbackAdded = feedbackService.addFeedback(applicationId, feedbackText);

				        if (isFeedbackAdded) {
				            System.out.println("Feedback added successfully.");
				        }
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 3:
					System.out.println("Selected: Manage Visit");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
						adminVisitMenu.manageVisitForApplication(scanner, applicationId);
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 4:
					System.out.println("Selected: Manage Assessment");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
						adminAssessmentMenu.manageAssessmentForApplication(scanner, applicationId);
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 5:
					System.out.println("Selected: Manage Interview");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
						adminInterviewMenu.manageInterviewForApplication(scanner, applicationId);
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 6:
					System.out.println("Selected: Go back");
					System.out.println("============================================");
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