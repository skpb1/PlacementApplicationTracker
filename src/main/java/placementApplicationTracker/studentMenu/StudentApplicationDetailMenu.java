package main.java.placementApplicationTracker.studentMenu;

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

public class StudentApplicationDetailMenu {
	private final Logger LOGGER = Logger.getLogger(StudentApplicationDetailMenu.class.getName());
	private VisitRepo visitRepo;
	private FeedbackRepo feedbackRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private ApplicationService applicationService;

	public StudentApplicationDetailMenu(VisitRepo visitRepo, ApplicationRepo applicationRepo, FeedbackRepo feedbackRepo,
			AssessmentRepo assessmentRepo, InterviewRepo interviewRepo) {
		this.visitRepo = visitRepo;
		this.assessmentRepo = assessmentRepo;
		this.feedbackRepo = feedbackRepo;
		this.interviewRepo = interviewRepo;
		applicationService = new ApplicationService(applicationRepo);

	}

	public void displayMenu(int applicationId, Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {

				Application application = applicationService.getApplicationByAppId(applicationId);

				if (application != null) {
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
				} else {
					System.out.println();
					System.out.println("Application details not found.");
					System.out.println();
				}

				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Edit Application");
				System.out.println("2. Withdraw Application");
				System.out.println("3. Show Assessments for the application");
				System.out.println("4. Show Visits for the application");
				System.out.println("5. Show Interviews for the application");
				System.out.println("6. Show Feedback for the application");
				System.out.println("7. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: Edit Application");
					System.out.println("============================================");
					System.out.println();
					if (application != null) {
						scanner.nextLine();

						System.out.print("Enter the new Resume Content: ");
						String updatedResume = scanner.nextLine();
						System.out.print("Enter the new Cover Letter Content: ");
						String updatedCoverLetter = scanner.nextLine();

						boolean isUpdated = applicationService.updateApplication(applicationId, updatedResume,
								updatedCoverLetter);
						System.out.println();
						if (isUpdated) {
							System.out.println("Application has been updated successfully.");
							System.out.println();
						}

					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;
				case 2:
					System.out.println("Selected: Withdraw Application");
					System.out.println("============================================");
					System.out.println();

					if (application != null) {
						System.out.print("Are you sure you want to withdraw this application (Y/N): ");

						scanner.nextLine();
						String choice = scanner.nextLine();

						if (choice.equals("Y") || choice.equals("y")) {
							boolean isUpdated = applicationService.withdrawApplicationByAppId(applicationId);

							System.out.println();
							if (isUpdated) {
								System.out.println("Application has been withdrawn successfully.");
								System.out.println();
							}
						}
					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;
				case 3:
					System.out.println("Selected: Show Assessments List");
					System.out.println("============================================");
					System.out.println();
					// Display Assessments
					if (application != null) {
						StudentAssessmentMenu assessmentMenu = new StudentAssessmentMenu(assessmentRepo);
						assessmentMenu.displayAssessmentMenu(applicationId, scanner);
					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;
				case 4:
					System.out.println("Selected: Show Visits List");
					System.out.println("============================================");
					System.out.println();
					// Display Visits
					if (application != null) {
						StudentVisitMenu studentVisitMenu = new StudentVisitMenu(visitRepo);
						studentVisitMenu.displayVisitMenu(applicationId, scanner);
					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;
				case 5:
					System.out.println("Selected: Show Interviews List");
					System.out.println("============================================");
					System.out.println();
					// Display Interviews
					if (application != null) {
						StudentInterviewMenu interviewMenu = new StudentInterviewMenu(interviewRepo);
						interviewMenu.displayInterviewMenu(applicationId, scanner);
					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;
				case 6:
					System.out.println("Selected: Show Feedback List");
					System.out.println("============================================");
					System.out.println();
					// Display Feedbacks
					if (application != null) {
						StudentFeedbackMenu feedbackMenu = new StudentFeedbackMenu(feedbackRepo);
						feedbackMenu.displayFeedbackMenu(applicationId, scanner);
					} else {
						System.out.println();
						System.out.println("Application details not found.");
						System.out.println();
					}
					break;
				case 7:
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
