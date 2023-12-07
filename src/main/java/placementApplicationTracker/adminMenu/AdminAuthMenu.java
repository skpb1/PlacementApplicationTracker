package main.java.placementApplicationTracker.adminMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.AuthenticationService;

public class AdminAuthMenu {
	private final Logger LOGGER = Logger.getLogger(AdminAuthMenu.class.getName());
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private AdminRepo adminRepo;
	private VisitRepo visitRepo;
	private AuthenticationService authenticationService;
	private FeedbackRepo feedbackRepo;

	public AdminAuthMenu(VisitRepo repo, AuthenticationRepo authenticationRepo, ApplicationRepo applicationRepo,
			PlacementRepo placementRepo, AssessmentRepo assessmentRepo, InterviewRepo interviewRepo,
			AdminRepo adminRepo, FeedbackRepo feedbackRepo) {
		this.visitRepo = repo;
		this.authenticationService = new AuthenticationService(authenticationRepo);
		this.applicationRepo = applicationRepo;
		this.placementRepo = placementRepo;
		this.assessmentRepo = assessmentRepo;
		this.interviewRepo = interviewRepo;
		this.adminRepo = adminRepo;
		this.feedbackRepo = feedbackRepo;
	}

	public void adminLogin(Scanner scanner) {
		try {
			System.out.println("Selected: Admin Login");
			System.out.println("============================================");

			System.out.print("Enter AdminId: ");
			int aId = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter Password: ");
			String aPass = scanner.nextLine();

			System.out.println();
			System.out.println();
			boolean adminLoginSuccess = authenticationService.adminLogin(aId, aPass);

			if (adminLoginSuccess) {
				System.out.println("Admin login successful!");
				System.out.println();
				AdminMenu adminMenu = new AdminMenu(visitRepo, applicationRepo, placementRepo, assessmentRepo,
						interviewRepo, adminRepo, feedbackRepo);
				adminMenu.displayAdminMenu(aId, scanner); // open admin menu
			} else {
				System.out.println("Invalid Admin credentials.");
				System.out.println();
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "An Error occured", e);
			System.out.println("An unexpected error occurred. Please try again.");
		}
	}

	public void adminSignup(Scanner scanner) {
		try {
			System.out.println("Selected: Admin Signup");
			System.out.println("=============================================");

			// Get admin ID from the user
			System.out.print("Enter AdminId: ");
			int adminId = scanner.nextInt();
			scanner.nextLine();

			// Check if the admin ID already exists
			if (authenticationService.doesAdminIdExist(adminId)) {
				System.out.println("Admin ID already exists. Please go to the login tab");
				return;
			}

			// Get other details from the user
			System.out.print("Enter Password: ");
			String aPassword = scanner.nextLine();

			System.out.print("Enter FullName: ");
			String aFullName = scanner.nextLine();

			System.out.print("Enter Email: ");
			String aEmail = scanner.nextLine();

			System.out.print("Enter Designation: ");
			String designation = scanner.nextLine();
			System.out.println();
			System.out.println();

			// Attempt to sign up the admin
			boolean adminSignUpSuccess = authenticationService.adminSignup(adminId, aPassword, aFullName, aEmail,
					designation);

			if (adminSignUpSuccess) {
				System.out.println("Admin sign up successful!");
				System.out.println();
			} else {
				System.out.println("Error occurred while signing up as Admin");
				System.out.println();
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "An Error occured", e);
			System.out.println("An unexpected error occurred. Please try again.");
		}
	}

}
