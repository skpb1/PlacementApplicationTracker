package main.java.placementApplicationTracker.studentMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.AuthenticationService;

public class StudentAuthMenu {
	// Logger for logging exceptions
	private final Logger LOGGER = Logger.getLogger(StudentAuthMenu.class.getName());
	
    // Repositories and services needed for Student authentication
	private VisitRepo visitRepo;
	private AuthenticationService authenticationService;
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private StudentRepo studentRepo;
	private FeedbackRepo feedbackRepo;

	// Constructor to initialize the StudentAuthMenu with necessary repositories and services
	public StudentAuthMenu(VisitRepo visitRepo, AssessmentRepo assessmentRepo, ApplicationRepo applicationRepo,
			AuthenticationRepo authenticationRepo, FeedbackRepo feedbackRepo, InterviewRepo interviewRepo,
			PlacementRepo placementRepo, StudentRepo studentRepo) {
		this.visitRepo = visitRepo;
		this.applicationRepo = applicationRepo;
		this.placementRepo = placementRepo;
		this.assessmentRepo = assessmentRepo;
		this.interviewRepo = interviewRepo;
		this.studentRepo = studentRepo;
		this.feedbackRepo = feedbackRepo;
		this.authenticationService = new AuthenticationService(authenticationRepo);
	}

	// Method to handle Student login
	public void studentLogin(Scanner scanner) {
		try {
			System.out.println("Selected: Student Login");
			System.out.println("============================================");
			
			// Get Student ID and Password from the user
			System.out.print("Enter StudentId: ");
			int sId = scanner.nextInt();
			scanner.nextLine();

			System.out.print("Enter Password: ");
			String sPass = scanner.nextLine();

			System.out.println();
			System.out.println();
			// Call the Student login service
			boolean studentLoginSuccess = authenticationService.studentLogin(sId, sPass);

			if (studentLoginSuccess) {
				System.out.println("Student login successful!");
				System.out.println();
				StudentMenu studentMenu = new StudentMenu(visitRepo, applicationRepo, placementRepo, assessmentRepo,
						interviewRepo, studentRepo, feedbackRepo);
				studentMenu.displayStudentMenu(sId, scanner); // open student menu
			} else {
				System.out.println("Invalid student credentials.");
				System.out.println();
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "An Error occured", e);
			System.out.println("An unexpected error occurred. Please try again.");
		}
	}

	// Method to handle Student signup
	public void studentSignup(Scanner scanner) {
		try {
			System.out.println("Selected: Student Signup");
			System.out.println("============================================");
			
			// Get the Student ID from user
			System.out.print("Enter StudentId: ");
			int studentId = scanner.nextInt();
			scanner.nextLine();

			// Check if the Student ID already exists
			if (authenticationService.doesStudentIdExist(studentId)) {
				System.out.println("The student ID already exists. Please go to the login tab");
				return;
			}

			// Get details from the user
			System.out.print("Enter Password: ");
			String sPassword = scanner.nextLine();

			System.out.print("Enter FullName: ");
			String sFullName = scanner.nextLine();

			System.out.print("Enter Email: ");
			String sEmail = scanner.nextLine();

			System.out.print("Enter Course: ");
			String course = scanner.nextLine();

			System.out.print("Enter PassOutYear: ");
			int passOutYear = scanner.nextInt();

			System.out.println();
			System.out.println();

            // Call the Student signup service
			boolean studentSignUpSuccess = authenticationService.studentSignup(studentId, sPassword, sFullName, sEmail,
					course, passOutYear);

			if (studentSignUpSuccess) {
				System.out.println("Student sign up successful!");
				System.out.println();
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "An Error occured", e);
			System.out.println("An unexpected error occurred. Please try again.");
		}
	}

}