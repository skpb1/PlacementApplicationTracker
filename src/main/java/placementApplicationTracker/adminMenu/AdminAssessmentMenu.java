package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;

public class AdminAssessmentMenu {

	private final Logger LOGGER = Logger.getLogger(AdminAssessmentMenu.class.getName());
	private AssessmentService assessmentService;

	public AdminAssessmentMenu(AssessmentRepo assessmentRepo) {
		assessmentService = new AssessmentService(assessmentRepo);
	}

	public void displayMenu(Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			System.out.println("\n\n\n\n");

			try {
				System.out.println("\nAll Available assessments are shown below\n");

				List<Assessment> assessments = assessmentService.getAssessments();

				if (!assessments.isEmpty()) {
					assessments.forEach(ass -> displayAssessmentDetails(ass));
				} else {
					System.out.println("\nNo Assessments available\n");
				}

				System.out.println("\n********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Add new assessment");
				System.out.println("2. Edit assessment");
				System.out.println("3. Delete assessment");
				System.out.println("4. Go back");
				System.out.println("********************************************");
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					addAssessment(scanner);
					break;

				case 2:
					editAssessment(scanner);
					break;

				case 3:
					deleteAssessment(scanner);
					break;

				case 4:
					System.out.println("Selected: Go back");
					isRunning = false;
					break;

				default:
					System.out.println("Invalid option. Please choose a valid option.");
					break;
				}
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, "Error in menu option processing", e);
				System.out.println("An unexpected error occurred. Please try again.");
				isRunning = false;
			}
		}
	}

	private void displayAssessmentDetails(Assessment assessment) {
		System.out.println("------------------------------------");
		System.out.println("Assessment ID: " + assessment.getAssessmentId());
		System.out.println("Application ID: " + assessment.getApplicationId());
		System.out.println("Date and Time: " + assessment.getDateTime());
		System.out.println("Status: " + assessment.getStatus());
		System.out.println("Details: " + assessment.getDetails());
		System.out.println("-----------------------------------------");
	}

	private LocalDateTime validateTimestampInput(Scanner scanner, String prompt) {
		LocalDateTime dateTime = null;
		boolean isValidInput = false;

		do {
			try {
				System.out.print(prompt);
				String dateTimeStr = scanner.nextLine();
				dateTime = LocalDateTime.parse(dateTimeStr, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
				isValidInput = true;
			} catch (Exception e) {
				System.out.println("Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss");
			}
		} while (!isValidInput);

		return dateTime;
	}

	private void addAssessment(Scanner scanner) {
		try {

			System.out.print("Enter the Application ID related to the Assessment: ");
			int applicationId = scanner.nextInt();
			scanner.nextLine();

			LocalDateTime assessmentDateTime = validateTimestampInput(scanner,
					"Enter assessment date and time (YYYY-MM-DD HH:mm:ss): ");
			Timestamp assessmentTimestamp = Timestamp.valueOf(assessmentDateTime);

			System.out.print("Enter assessment status: ");
			String assessmentStatus = scanner.nextLine();
			System.out.print("Enter assessment details: ");
			String assessmentDetails = scanner.nextLine();

			Assessment assessment = new Assessment(0, applicationId, assessmentTimestamp, assessmentStatus,
					assessmentDetails);
			boolean isAssessmentAdded = assessmentService.addAssessment(assessment);

			if (isAssessmentAdded) {
				System.out.println("Assessment added successfully.");
			} else {
				System.out.println("Failed to add assessment.");
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error adding new assessment", e);
			System.out.println("An error occurred while adding a new assessment. Please try again.");
		}
	}

	private void editAssessment(Scanner scanner) {
		try {
			System.out.print("Enter Assessment ID to edit: ");
			int assessmentId = scanner.nextInt();
			scanner.nextLine();

			Assessment existingAssessment = assessmentService.getAssessmentById(assessmentId);

			if (existingAssessment != null) {
				System.out.println("Existing Assessment Details:");
				displayAssessmentDetails(existingAssessment);

				LocalDateTime updatedAssessmentDateTime = validateTimestampInput(scanner,
						"Enter updated assessment date and time (YYYY-MM-DD HH:mm:ss): ");
				Timestamp updatedAssessmentTimestamp = Timestamp.valueOf(updatedAssessmentDateTime);
				scanner.nextLine();

				System.out.print("Enter updated assessment status: ");
				String updatedAssessmentStatus = scanner.nextLine();
				System.out.print("Enter updated assessment details: ");
				String updatedAssessmentDetails = scanner.nextLine();

				// Use the existing application ID
				int applicationId = existingAssessment.getApplicationId();

				Assessment updatedAssessment = new Assessment(assessmentId, applicationId, updatedAssessmentTimestamp,
						updatedAssessmentStatus, updatedAssessmentDetails);

				boolean isAssessmentUpdated = assessmentService.updateAssessment(assessmentId, updatedAssessment);

				if (isAssessmentUpdated) {
					System.out.println("Assessment updated successfully.");
				} else {
					System.out.println("Failed to update assessment.");
				}
			} else {
				System.out.println("Assessment not found.");
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error editing assessment", e);
			System.out.println("An error occurred while editing the assessment. Please try again.");
		}
	}

	private void deleteAssessment(Scanner scanner) {
		try {
			System.out.print("Enter Assessment ID to delete: ");
			int assessmentId = scanner.nextInt();
			scanner.nextLine();

			Assessment existingAssessment = assessmentService.getAssessmentById(assessmentId);

			if (existingAssessment != null) {
				System.out.println("Existing Assessment Details:");
				displayAssessmentDetails(existingAssessment);

				System.out.print("Are you sure you want to delete this assessment (Y/N): ");
				String choice = scanner.next();

				if (choice.equalsIgnoreCase("Y")) {
					boolean isAssessmentDeleted = assessmentService.deleteAssessment(assessmentId);

					if (isAssessmentDeleted) {
						System.out.println("Assessment deleted successfully.");
					} else {
						System.out.println("Failed to delete assessment.");
					}
				} else {
					System.out.println("Deletion canceled.");
				}
			} else {
				System.out.println("Assessment not found.");
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error deleting assessment", e);
			System.out.println("An error occurred while deleting the assessment. Please try again.");
		}
	}
}
