package main.java.placementApplicationTracker.adminMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.AdminService;

public class AdminMenu {

	private final Logger LOGGER = Logger.getLogger(AdminMenu.class.getName());

	private VisitRepo visitRepo;
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private AdminRepo adminRepo;
	private AdminService adminService;
	private FeedbackRepo feedbackRepo;

	public AdminMenu(VisitRepo visitRepo, ApplicationRepo applicationRepo, PlacementRepo placementRepo,
			AssessmentRepo assessmentRepo, InterviewRepo interviewRepo, AdminRepo adminRepo,
			FeedbackRepo feedbackRepo) {
		this.visitRepo = visitRepo;
		this.applicationRepo = applicationRepo;
		this.placementRepo = placementRepo;
		this.assessmentRepo = assessmentRepo;
		this.interviewRepo = interviewRepo;
		this.adminRepo = adminRepo;
		this.feedbackRepo = feedbackRepo;
		adminService = new AdminService(adminRepo);
	}

	public void displayAdminMenu(int adminId, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			try {
				// Retrieve student details for the welcome message
				Admin admin = null;
				admin = adminService.getAdminDetails(adminId);

				String adminName = (admin != null) ? admin.getFullName() : "Unknown";
				
				System.out.println();
				System.out.println("Welcome, " + adminName + "!");
				System.out.println();

				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Manage Placement Opportunities");
				System.out.println("2. Manage Placement Applications");
				System.out.println("3. Manage Visits");
				System.out.println("4. Manage Assessments");
				System.out.println("5. Manage Interviews");
				System.out.println("6. Manage Personal Details");
				System.out.println("7. Logout");
				System.out.println("********************************************");
				System.out.println();

				System.out.print("Enter your choice: ");
				int option = scanner.nextInt();

				switch (option) {

				case 1:
					System.out.println("Selected: Manage Placement Opportunities");
					System.out.println("===========================================");
					System.out.println();
					AdminPlacementMenu adminPlacementMenu = new AdminPlacementMenu(placementRepo);
					adminPlacementMenu.displayMenu(adminId, scanner);
					break;

				case 2:
					System.out.println("Selected: Manage Placement Applications");
					System.out.println("===========================================");
					System.out.println();
					AdminApplicationMenu adminApplicationMenu = new AdminApplicationMenu(visitRepo, applicationRepo,
							feedbackRepo, assessmentRepo, interviewRepo);
					adminApplicationMenu.displayMenu(adminId, scanner);
					break;

				case 3:
					System.out.println("Selected: Manage Visits");
					System.out.println("===========================================");
					System.out.println();
					AdminVisitMenu adminVisitMenu = new AdminVisitMenu(visitRepo);
					adminVisitMenu.displayMenu(scanner);
					break;

				case 4:
					System.out.println("Selected: Manage Assessments");
					System.out.println("===========================================");
					System.out.println();
					AdminAssessmentMenu adminAssessmentMenu = new AdminAssessmentMenu(assessmentRepo);
					adminAssessmentMenu.displayMenu(scanner);
					break;

				case 5:
					System.out.println("Selected: Manage Interviews");
					System.out.println("===========================================");
					System.out.println();
					AdminInterviewMenu adminInterviewMenu = new AdminInterviewMenu(interviewRepo);
					adminInterviewMenu.displayMenu(scanner);
					break;

				case 6:
					System.out.println("Selected: Manage Personal Details");
					System.out.println("===========================================");
					System.out.println();
					if (admin != null) {
						AdminDetailsMenu adminDetailsMenu = new AdminDetailsMenu(adminRepo);
						adminDetailsMenu.displayEditDetailsMenu(admin, scanner);
					} else {
						System.out.println("Admin details not found.");
						System.out.println();
					}
					break;

				case 7:
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
	}
}
