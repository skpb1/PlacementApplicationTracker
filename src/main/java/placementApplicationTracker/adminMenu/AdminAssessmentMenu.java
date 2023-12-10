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
            System.out.println();
            System.out.println();

            try {
                System.out.println("All Available assessments are shown below");
                System.out.println();

                List<Assessment> assessments = assessmentService.getAssessments();
                displayAllAssessments(assessments);

                System.out.println();
                System.out.println("********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Manage assessment for an application");
                System.out.println("2. Edit assessment");
                System.out.println("3. Delete assessment");
                System.out.println("4. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        System.out.println("Selected: Manage assessment for an application");
                        System.out.println("============================================");
                        System.out.println();
                        manageAssessmentForApplication(scanner, null);
                        break;

                    case 2:
                        System.out.println("Selected: Edit Assessment");
                        System.out.println("============================================");
                        System.out.println();
                        editAssessmentOption(scanner);
                        break;

                    case 3:
                        System.out.println("Selected: Delete Assessment");
                        System.out.println("============================================");
                        System.out.println();
                        deleteAssessmentOption(scanner);
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
                handleException("Error in menu option processing", e);
                isRunning = false;
            }
        }
    }
    
    private void handleException(String message, Exception e) {
        LOGGER.log(Level.SEVERE, message, e);
        System.out.println("An unexpected error occurred. Please try again.");
    }
    
    private void displayAllAssessments(List<Assessment> assessments) {
    	if (!assessments.isEmpty()) {
            assessments.forEach(this::displayAssessmentDetails);
        } else {
            System.out.println();
            System.out.println("No Assessments available");
            System.out.println();
        }
    }

    private void displayAssessmentDetails(Assessment assessment) {
        System.out.println("-----------------------------------------");
        System.out.println("Assessment ID: " + assessment.getAssessmentId());
        System.out.println("Application ID: " + assessment.getApplicationId());
        System.out.println("Date and Time: " + assessment.getDateTime());
        System.out.println("Status: " + assessment.getStatus());
        System.out.println("Details: " + assessment.getDetails());
        System.out.println("-----------------------------------------");
    }

    public LocalDateTime validateTimestampInput(Scanner scanner, String prompt) {
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

    public void manageAssessmentForApplication(Scanner scanner, Integer applicationId) {
        try {
            if (applicationId == null) {
                System.out.print("Enter the Application ID: ");
                applicationId = scanner.nextInt();
                scanner.nextLine();
            }

            List<Assessment> existingAssessmentList = assessmentService.getAssessmentsByApplicationId(applicationId);

            if (!existingAssessmentList.isEmpty()) {
                handleExistingAssessment(existingAssessmentList, applicationId, scanner);
            } else {
                handleNoAssessment(applicationId, scanner);
            }
        } catch (Exception e) {
            handleException("Error managing assessment for application", e);
        }
    }

    public void handleExistingAssessment(List<Assessment> assessmentList, int applicationId, Scanner scanner) {
        System.out.println();
        System.out.println("Found Assessment details for the application");
        System.out.println();
        displayAllAssessments(assessmentList);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Please Choose an option:");
        System.out.println("1. Edit Assessment");
        System.out.println("2. Delete Assessment");
        System.out.println("3. Add New Assessment");
        System.out.println("4. Go back");
        System.out.println("********************************************");
        System.out.print("Enter your choice: ");

        int assessmentOption = scanner.nextInt();
        scanner.nextLine();

        switch (assessmentOption) {
            case 1:
                System.out.println();
                System.out.println("Selected: Edit Assessment");
                System.out.println("============================================");
                editAssessmentOption(scanner);
                break;

            case 2:
                System.out.println();
                System.out.println("Selected: Delete Assessment");
                System.out.println("============================================");
                deleteAssessmentOption(scanner);
                break;
                
            case 3:
                System.out.println();
                System.out.println("Selected: Add New Assessment");
                System.out.println("============================================");
                addAssessmentForApplication(applicationId, scanner);
                break;

            case 4:
                System.out.println("Selected: Go back");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public void handleNoAssessment(int applicationId, Scanner scanner) {
        System.out.println();
        System.out.println("No Assessment found for this application");
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("Please choose an option:");
        System.out.println("1. Schedule Assessment");
        System.out.println("2. Go back");
        System.out.print("Enter your choice: ");

        int assessmentOption = scanner.nextInt();
        scanner.nextLine();

        switch (assessmentOption) {
            case 1:
                System.out.println();
                System.out.println("Selected: Schedule Assessment");
                System.out.println("============================================");
                addAssessmentForApplication(applicationId, scanner);
                break;

            case 2:
                System.out.println("Selected: Go back");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    public void addAssessmentForApplication(int applicationId, Scanner scanner) {
        try {
            LocalDateTime assessmentDateTime = validateTimestampInput(scanner,
                    "Enter assessment date and time (YYYY-MM-DD HH:mm:ss): ");
            Timestamp assessmentTimestamp = Timestamp.valueOf(assessmentDateTime);

            System.out.print("Enter assessment details: ");
            String assessmentDetails = scanner.nextLine();

            Assessment assessment = new Assessment(0, applicationId, assessmentTimestamp, "Scheduled",
                    assessmentDetails);
            boolean isAssessmentAdded = assessmentService.addAssessment(assessment);

            if (isAssessmentAdded) {
                System.out.println("Assessment added successfully.");
            }
        } catch (Exception e) {
            handleException("Error adding new assessment for application", e);
        }
    }

    public void editAssessment(Assessment existingAssessment, Scanner scanner) {
        LocalDateTime updatedAssessmentDateTime = validateTimestampInput(scanner,
                "Enter updated assessment date and time (YYYY-MM-DD HH:mm:ss): ");
        Timestamp updatedAssessmentTimestamp = Timestamp.valueOf(updatedAssessmentDateTime);

        System.out.print("Enter updated assessment status: ");
        String updatedAssessmentStatus = scanner.nextLine();
        System.out.print("Enter updated assessment details: ");
        String updatedAssessmentDetails = scanner.nextLine();

        int applicationId = existingAssessment.getApplicationId();
        Assessment updatedAssessment = new Assessment(existingAssessment.getAssessmentId(), applicationId,
                updatedAssessmentTimestamp, updatedAssessmentStatus, updatedAssessmentDetails);

        boolean isAssessmentUpdated = assessmentService.updateAssessment(existingAssessment.getAssessmentId(),
                updatedAssessment);

        if (isAssessmentUpdated) {
            System.out.println("Assessment updated successfully.");
        }
    }

    public void deleteAssessment(Assessment existingAssessment, Scanner scanner) {
        System.out.print("Are you sure you want to delete this assessment (Y/N): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            boolean isAssessmentDeleted = assessmentService.deleteAssessment(existingAssessment.getAssessmentId());
            if (isAssessmentDeleted) {
                System.out.println("Assessment deleted successfully.");
            }
        } else {
            System.out.println("Deletion canceled.");
        }
    }
    
    public void editAssessmentOption(Scanner scanner) {
        try {
            System.out.print("Enter Assessment ID to edit: ");
            int assessmentId = scanner.nextInt();
            scanner.nextLine();

            Assessment existingAssessment = assessmentService.getAssessmentById(assessmentId);

            if (existingAssessment != null) {
                System.out.println();
                System.out.println("Existing Assessment Details:");
                displayAssessmentDetails(existingAssessment);

                editAssessment(existingAssessment, scanner);
            } else {
                System.out.println("Assessment not found.");
            }
        } catch (Exception e) {
            handleException("Error editing assessment", e);
        }
    }

    public void deleteAssessmentOption(Scanner scanner) {
        try {
            System.out.print("Enter Assessment ID to delete: ");
            int assessmentId = scanner.nextInt();
            scanner.nextLine();

            Assessment existingAssessment = assessmentService.getAssessmentById(assessmentId);

            if (existingAssessment != null) {
                System.out.println();
                System.out.println("Existing Assessment Details:");
                displayAssessmentDetails(existingAssessment);

                deleteAssessment(existingAssessment, scanner);
            } else {
                System.out.println("Assessment not found.");
            }
        } catch (Exception e) {
            handleException("Error deleting assessment", e);
        }
    }

}
