package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;

public class StudentAssessmentMenu {

    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(StudentAssessmentMenu.class.getName());

    // Service for handling assessment-related operations
    private AssessmentService assessmentService;

    // Constructor to initialize StudentAssessmentMenu with necessary repositories and services
    public StudentAssessmentMenu(AssessmentRepo assessmentRepo) {
        assessmentService = new AssessmentService(assessmentRepo);
    }

    // Method to display the assessment menu and handle user input
    public void displayAssessmentMenu(int applicationId, Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            try {
                // Retrieve assessments by application ID
                List<Assessment> assessments = assessmentService.getAssessmentsByApplicationId(applicationId);

                if (assessments.size() != 0) {
                    // Display assessments list
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
                    // No assessments found
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
                        // Show Details of an Assessment
                        System.out.println("Selected: Show Details of an Assessment");
                        System.out.println("============================================");
                        System.out.println();

                        if (assessments.size() != 0) {
                            System.out.println();

                            // Enter the Assessment Id
                            System.out.println("Enter the Assessment Id:");
                            int assessmentId = scanner.nextInt();

                            // Retrieve assessment details
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
                        // Go back to the previous menu
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
                // Handle exceptions in menu option processing
                LOGGER.log(Level.SEVERE, "Error in menu option processing", e);
                System.out.println("An unexpected error occurred. Please try again.");
                isRunning = false;
                break;
            }
        }
    }
}

