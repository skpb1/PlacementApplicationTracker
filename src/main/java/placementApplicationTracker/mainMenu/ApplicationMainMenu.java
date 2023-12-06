package main.java.placementApplicationTracker.mainMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.adminMenu.AdminAuthMenu;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.studentMenu.StudentAuthMenu;

public class ApplicationMainMenu {
	private final Logger LOGGER = Logger.getLogger(ApplicationMainMenu.class.getName());
	private AdminAuthMenu adminAuthMenu;
	private StudentAuthMenu studentAuthMenu;

	public ApplicationMainMenu(VisitRepo visitRepo, AdminRepo adminRepo, AssessmentRepo assessmentRepo, ApplicationRepo applicationRepo, AuthenticationRepo authenticationRepo, FeedbackRepo feedbackRepo, InterviewRepo interviewRepo, PlacementRepo placementRepo, StudentRepo studentRepo) {
		adminAuthMenu = new AdminAuthMenu(visitRepo, authenticationRepo, applicationRepo, placementRepo, assessmentRepo, interviewRepo,adminRepo, feedbackRepo);
		studentAuthMenu = new StudentAuthMenu(visitRepo, assessmentRepo, applicationRepo, authenticationRepo, feedbackRepo,interviewRepo, placementRepo,studentRepo);
		
	}

	public void displayMainMenu(Scanner scanner) {

		try {
			boolean isRunning = true;
			while (isRunning) {
				System.out.println();
				System.out.println("********************************************");
				System.out.println("Welcome to Placement Application Tracker !");
				System.out.println();
				System.out.println("Please Choose an option:");
				System.out.println("1. Student Login");
				System.out.println("2. Student Signup");
				System.out.println("3. Admin Login");
				System.out.println("4. Admin Signup");
				System.out.println("5. Exit");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");
				int option = scanner.nextInt();
				System.out.println();
				System.out.println();
				switch (option) {
				case 1:
					studentAuthMenu.studentLogin(scanner);
					break;

				case 2:
					studentAuthMenu.studentSignup(scanner);
					break;

				case 3:
					adminAuthMenu.adminLogin(scanner);
					break;

				case 4:
					adminAuthMenu.adminSignup(scanner);
					break;

				case 5:
					System.out.println("Selected: Exit");
					System.out.println("============================================");
					isRunning = false;
					break;

				default:
					System.out.println("Invalid option. Please choose a valid option.");
					System.out.println("============================================");
					System.out.println();
					break;
				}
			}

			System.out.println("Application stopped.");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error connecting to the database", e);
			System.out.println("An error occurred while connecting to the database. Please check the logs.");
		}
	}

}
