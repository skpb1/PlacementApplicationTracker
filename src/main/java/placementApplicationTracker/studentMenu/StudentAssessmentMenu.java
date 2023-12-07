package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;

public class StudentAssessmentMenu {
	private final Logger LOGGER = Logger.getLogger(StudentAssessmentMenu.class.getName());
	private AssessmentService assessmentService;

	public StudentAssessmentMenu(AssessmentRepo assessmentRepo) {
		assessmentService = new AssessmentService(assessmentRepo);
	}

	public void displayAssessmentMenu(int applicationId, Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				List<Assessment> assessments = null;

				try {
					assessments = assessmentService.getAssessmentsByApplicationId(applicationId);
				} catch (Exception e) {
					LOGGER.log(Level.SEVERE, "Error retrieving assessment details", e);
				}

				if (assessments.size() != 0) {
					System.out.println();
					System.out.println("Assessments List is shown below");
					System.out.println();

					assessments.forEach(assessment -> {
						System.out.println("------------------------------------------");
						System.out.println("Assessment Id: " + assessment.getAssessmentId());
						System.out.println("DateTime: " + assessment.getDateTime());
						System.out.println("------------------------------------------");
					});
				} else {
					System.out.println();
					System.out.println("No Assessments found");
					System.out.println();
				}
				System.out.println();
				System.out.println("********************************************");
				System.out.println("1. Show Details of an Assessment");
				System.out.println("2. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option;
				option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					System.out.println("Selected: Show Details of an Assessment");
					System.out.println("============================================");
					System.out.println();

					if (assessments.size() != 0) {
						System.out.println();

						System.out.println("Enter the Assessment Id:");
						int assessmentId = scanner.nextInt();
						Assessment assessment = assessmentService.getAssessmentById(assessmentId);
						System.out.println();
						System.out.println("Assessment Details are shown below");
						System.out.println();
						System.out.println("------------------------------------------");
						System.out.println("Assessment Id: " + assessment.getAssessmentId());
						System.out.println("DateTime: " + assessment.getDateTime());
						System.out.println("Status: " + assessment.getStatus());
						System.out.println("Details: " + assessment.getDetails());
						System.out.println("------------------------------------------");
						System.out.println();
						System.out.println();

						scanner.nextLine();

						System.out.println("Press Enter to continue");
						scanner.nextLine();
						System.out.println();
					} else {
						System.out.println();
						System.out.println("No Assessments found");
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
