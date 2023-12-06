package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.ApplicationService;
import main.java.placementApplicationTracker.service.FeedbackService;
import main.java.placementApplicationTracker.service.VisitService;
import main.java.placementApplicationTracker.service.AssessmentService;
import main.java.placementApplicationTracker.service.InterviewService;

public class AdminApplicationProcessMenu {
	private final Logger LOGGER = Logger.getLogger(AdminApplicationProcessMenu.class.getName());

	private VisitService visitService;
	private ApplicationService applicationService;
	private FeedbackService feedbackService;
	private AssessmentService assessmentService;
	private InterviewService interviewService;
	
	public AdminApplicationProcessMenu(VisitRepo repo, ApplicationRepo applicationRepo, FeedbackRepo feedbackRepo, AssessmentRepo assessmentRepo, InterviewRepo interviewRepo) {
		this.visitService = new VisitService(repo);
		this.applicationService = new ApplicationService(applicationRepo);
		this.assessmentService = new AssessmentService(assessmentRepo);
		this.feedbackService = new FeedbackService(feedbackRepo);
		this.interviewService = new InterviewService(interviewRepo);
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
					System.out.println("Opportunity ID: " + application.getOpportunityId());
					System.out.println("Resume: " + application.getResume());
					System.out.println("Cover Letter: " + application.getCoverLetter());
					System.out.println("Status: " + application.getStatus());
					System.out.println("Submitted By (Student ID): " + application.getStudentId());
					System.out.println("SubmissionDate: " + application.getSubmissionDate());
					System.out.println("Withdrawn: " + (application.getWithdrawn() == 1 ? "True" : "False"));

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
				System.out.println("1. Approve/ Reject Application");
				System.out.println("2. Provide Feedback");
				System.out.println("3. Schedule Visit");
				System.out.println("4. Schedule Assessment");
				System.out.println("5. Schedule Interview");
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
	                    } else {
	                        System.out.println("Failed to update application status.");
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
				        } else {
				            System.out.println("Failed to add feedback.");
				        }
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 3:
					System.out.println("Selected: Schedule Visit");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
				        scanner.nextLine();

				        System.out.print("Enter visit status: ");
				        String visitStatus = scanner.nextLine();

				        System.out.print("Enter visit details: ");
				        String visitDetails = scanner.nextLine();

				        // Input validation for visit date and time
				        LocalDateTime visitDateTime = null;
				        boolean isValidInput = false;
				        do {
				            try {
				                System.out.print("Enter visit date and time (YYYY-MM-DD HH:mm:ss): ");
				                String visitDateTimeStr = scanner.nextLine();
				                visitDateTime = LocalDateTime.parse(visitDateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				                isValidInput = true;
				            } catch (DateTimeParseException e) {
				                System.out.println("Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss");
				            }
				        } while (!isValidInput);

				        // Convert LocalDateTime to Timestamp
				        Timestamp visitTimestamp = Timestamp.valueOf(visitDateTime);

				        Visit visit = new Visit(0, applicationId, visitTimestamp, visitStatus, visitDetails);
			            boolean isVisitAdded = visitService.addVisit(visit);
			            
				        if (isVisitAdded) {
				            System.out.println("Visit scheduled successfully.");
				        } else {
				            System.out.println("Failed to schedule visit.");
				        }
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 4:
					System.out.println("Selected: Schedule Assessment");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
				        scanner.nextLine();

				        System.out.print("Enter assessment status: ");
				        String assessmentStatus = scanner.nextLine();

				        System.out.print("Enter assessment details: ");
				        String assessmentDetails = scanner.nextLine();

				        // Input validation for assessment date and time
				        LocalDateTime assessmentDateTime = null;
				        boolean isValidInput = false;
				        do {
				            try {
				                System.out.print("Enter assessment date and time (YYYY-MM-DD HH:mm:ss): ");
				                String assessmentDateTimeStr = scanner.nextLine();
				                assessmentDateTime = LocalDateTime.parse(assessmentDateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				                isValidInput = true;
				            } catch (DateTimeParseException e) {
				                System.out.println("Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss");
				            }
				        } while (!isValidInput);

				        // Convert LocalDateTime to Timestamp
				        Timestamp assessmentTimestamp = Timestamp.valueOf(assessmentDateTime);

				        Assessment assessment = new Assessment(0, applicationId, assessmentTimestamp, assessmentStatus, assessmentDetails);
			            boolean isAssessmentAdded = assessmentService.addAssessment(assessment);
			            
				        if (isAssessmentAdded) {
				            System.out.println("Assessment scheduled successfully.");
				        } else {
				            System.out.println("Failed to schedule assessment.");
				        }
				    } else {
				        System.out.println("Application details not found.");
				    }
					break;
					
				case 5:
					System.out.println("Selected: Schedule Interview");
					System.out.println("============================================");
					System.out.println();
					
					if (application != null) {
				        scanner.nextLine();

				        System.out.print("Enter interview status: ");
				        String interviewStatus = scanner.nextLine();

				        System.out.print("Enter interview type: ");
				        String interviewType = scanner.nextLine();

				        // Input validation for interview date and time
				        LocalDateTime interviewDateTime = null;
				        boolean isValidInput = false;
				        do {
				            try {
				                System.out.print("Enter interview date and time (YYYY-MM-DD HH:mm:ss): ");
				                String interviewDateTimeStr = scanner.nextLine();
				                interviewDateTime = LocalDateTime.parse(interviewDateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				                isValidInput = true;
				            } catch (DateTimeParseException e) {
				                System.out.println("Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss");
				            }
				        } while (!isValidInput);

				        // Convert LocalDateTime to Timestamp
				        Timestamp interviewTimestamp = Timestamp.valueOf(interviewDateTime);

				        Interview interview = new Interview(0, applicationId, interviewTimestamp, interviewStatus, interviewType);
			            boolean isInterviewScheduled = interviewService.addInterview(interview);
			            
				        if (isInterviewScheduled) {
				            System.out.println("Interview scheduled successfully.");
				        } else {
				            System.out.println("Failed to schedule interview.");
				        }
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
