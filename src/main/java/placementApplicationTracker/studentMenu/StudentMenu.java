package main.java.placementApplicationTracker.studentMenu;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.StudentService;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentMenu {

	private final Logger LOGGER = Logger.getLogger(StudentMenu.class.getName());
	private VisitRepo visitRepo;
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private StudentService studentService;
	private StudentRepo studentRepo;
	private FeedbackRepo feedbackRepo;

	public StudentMenu(VisitRepo visitRepo, ApplicationRepo applicationRepo, PlacementRepo placementRepo, AssessmentRepo assessmentRepo, InterviewRepo interviewRepo, StudentRepo studentRepo, FeedbackRepo feedbackRepo) {
		this.visitRepo = visitRepo;
		this.applicationRepo = applicationRepo;
		this.placementRepo = placementRepo;
		this.assessmentRepo = assessmentRepo;
		this.interviewRepo = interviewRepo;
		this.studentService = new StudentService(studentRepo);
		this.feedbackRepo = feedbackRepo;
		this.studentRepo = studentRepo;
	}

	public void displayStudentMenu(int studentId, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				// Retrieve student details for the welcome message
				Student student = null;
				student = studentService.getStudentDetails(studentId);

				String studentName = (student != null) ? student.getFullName() : "Unknown";

				System.out.println("Welcome, " + studentName + "!");
				System.out.println();

				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. View Placement Opportunities");
				System.out.println("2. Manage Applications");
				System.out.println("3. Manage Personal Details");
				System.out.println("4. Logout");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: View Placement Opportunities");
					System.out.println("===========================================");
					System.out.println();
					if (student != null) {
						StudentPlacementMenu menu = new StudentPlacementMenu(placementRepo, applicationRepo);
						menu.displayPlacementOpportunities(studentId, scanner);
					} else {
						System.out.println("Student details not found.");
						System.out.println();
					}
					break;

				case 2:
					System.out.println("Selected: Manage Applications");
					System.out.println("===========================================");
					System.out.println();
					if (student != null) {
						StudentApplicationMenu studentApplicationMenu = new StudentApplicationMenu(visitRepo, applicationRepo, feedbackRepo,assessmentRepo, interviewRepo);
						studentApplicationMenu.displayApplicationMenu(studentId, scanner);
					} else {
						System.out.println("Student details not found.");
						System.out.println();
					}
					break;

				case 3:
					System.out.println("Selected: Manage Personal Details");
					System.out.println("===========================================");
					System.out.println();
					if (student != null) {
						StudentDetailsMenu detailsMenu = new StudentDetailsMenu(studentRepo);
						detailsMenu.displayEditDetailsMenu(student, scanner);
					} else {
						System.out.println("Student details not found.");
						System.out.println();
					}
					break;

				case 4:
					System.out.println("Selected: Logout");
					System.out.println("=========================================");
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
