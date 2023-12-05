package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.service.InterviewService;

public class AdminInterviewMenu {

    private static final Logger LOGGER = Logger.getLogger(AdminInterviewMenu.class.getName());

    public static void displayMenu(Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n\n\n\n");

            try {
                System.out.println("\nAll Available interviews are shown below\n");

                List<Interview> interviews = InterviewService.getInterviews();

                if (!interviews.isEmpty()) {
                    interviews.forEach(AdminInterviewMenu::displayInterviewDetails);
                } else {
                    System.out.println("\nNo Interviews available\n");
                }

                System.out.println("\n********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Add new interview");
                System.out.println("2. Edit interview");
                System.out.println("3. Delete interview");
                System.out.println("4. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        addInterview(scanner);
                        break;

                    case 2:
                        editInterview(scanner);
                        break;

                    case 3:
                        deleteInterview(scanner);
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

    private static void displayInterviewDetails(Interview interview) {
        System.out.println("------------------------------------");
        System.out.println("Interview ID: " + interview.getInterviewId());
        System.out.println("Application ID: " + interview.getApplicationId());
        System.out.println("Status: " + interview.getStatus());
        System.out.println("Type: " + interview.getType());
        System.out.println("Date and Time: " + interview.getDateTime());
        System.out.println("-----------------------------------------");
    }

    private static LocalDateTime validateTimestampInput(Scanner scanner, String prompt) {
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

    private static void addInterview(Scanner scanner) {
        try {

            System.out.print("Enter the Application ID related to the Interview: ");
            int applicationId = scanner.nextInt();

            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter interview status: ");
            String interviewStatus = scanner.nextLine();
            System.out.print("Enter interview type: ");
            String interviewType = scanner.nextLine();

            LocalDateTime interviewDateTime = validateTimestampInput(scanner, "Enter interview date and time (YYYY-MM-DD HH:mm:ss): ");
            Timestamp interviewTimestamp = Timestamp.valueOf(interviewDateTime);

            Interview interview = new Interview(0, applicationId, interviewTimestamp, interviewStatus, interviewType);
            boolean isInterviewAdded = InterviewService.addInterview(interview);

            if (isInterviewAdded) {
                System.out.println("Interview added successfully.");
            } else {
                System.out.println("Failed to add interview.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error adding new interview", e);
            System.out.println("An error occurred while adding a new interview. Please try again.");
        }
    }

    private static void editInterview(Scanner scanner) {
        try {
            System.out.print("Enter Interview ID to edit: ");
            int interviewId = scanner.nextInt();

            Interview existingInterview = InterviewService.getInterviewById(interviewId);

            if (existingInterview != null) {
                System.out.println("Existing Interview Details:");
                displayInterviewDetails(existingInterview);

                scanner.nextLine(); // Consume the newline character

                System.out.print("Enter updated interview status: ");
                String updatedInterviewStatus = scanner.nextLine();
                System.out.print("Enter updated interview type: ");
                String updatedInterviewType = scanner.nextLine();

                LocalDateTime updatedInterviewDateTime = validateTimestampInput(scanner, "Enter updated interview date and time (YYYY-MM-DD HH:mm:ss): ");
                Timestamp updatedInterviewTimestamp = Timestamp.valueOf(updatedInterviewDateTime);

                // Use the existing application ID
                int applicationId = existingInterview.getApplicationId();

                Interview updatedInterview = new Interview(interviewId, applicationId, updatedInterviewTimestamp, updatedInterviewStatus, updatedInterviewType);

                boolean isInterviewUpdated = InterviewService.updateInterview(interviewId, updatedInterview);

                if (isInterviewUpdated) {
                    System.out.println("Interview updated successfully.");
                } else {
                    System.out.println("Failed to update interview.");
                }
            } else {
                System.out.println("Interview not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error editing interview", e);
            System.out.println("An error occurred while editing the interview. Please try again.");
        }
    }

    private static void deleteInterview(Scanner scanner) {
        try {
            System.out.print("Enter Interview ID to delete: ");
            int interviewId = scanner.nextInt();

            Interview existingInterview = InterviewService.getInterviewById(interviewId);

            if (existingInterview != null) {
                System.out.println("Existing Interview Details:");
                displayInterviewDetails(existingInterview);

                System.out.print("Are you sure you want to delete this interview (Y/N): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("Y")) {
                    boolean isInterviewDeleted = InterviewService.deleteInterview(interviewId);

                    if (isInterviewDeleted) {
                        System.out.println("Interview deleted successfully.");
                    } else {
                        System.out.println("Failed to delete interview.");
                    }
                } else {
                    System.out.println("Deletion canceled.");
                }
            } else {
                System.out.println("Interview not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error deleting interview", e);
            System.out.println("An error occurred while deleting the interview. Please try again.");
        }
    }
}
