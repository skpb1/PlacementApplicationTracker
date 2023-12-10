package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.service.InterviewService;

public class AdminInterviewMenu {

    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(AdminInterviewMenu.class.getName());
    
    // Service for handling interview operations
    private InterviewService interviewService;

    // Constructor to initialize AdminInterviewMenu with necessary service
    public AdminInterviewMenu(InterviewRepo interviewRepo) {
        interviewService = new InterviewService(interviewRepo);
    }

    // Method to display the Admin Interview menu and handle user input
    public void displayMenu(Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println();

            try {
                // Display all available interviews
                System.out.println("All Available interviews are shown below");
                System.out.println();

                List<Interview> interviews = interviewService.getInterviews();
                displayAllInterviews(interviews);

                // Display menu options
                System.out.println();
                System.out.println("********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Manage interview for an application");
                System.out.println("2. Edit interview");
                System.out.println("3. Delete interview");
                System.out.println("4. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                
                // Switch statement to handle user's choice
                switch (option) {
                    case 1:
                        // Manage interview for an application
                        System.out.println("Selected: Manage interview for an application");
                        System.out.println("============================================");
                        System.out.println();
                        manageInterviewForApplication(scanner, null);
                        break;

                    case 2:
                        // Edit Interview
                        System.out.println("Selected: Edit Interview");
                        System.out.println("============================================");
                        System.out.println();
                        editInterviewOption(scanner);
                        break;

                    case 3:
                        // Delete Interview
                        System.out.println("Selected: Delete Interview");
                        System.out.println("============================================");
                        System.out.println();
                        deleteInterviewOption(scanner);
                        break;

                    case 4:
                        // Go back to the previous menu
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

    // Method to log and display error messages
    private void handleException(String message, Exception e) {
        LOGGER.log(Level.SEVERE, message, e);
        System.out.println("An unexpected error occurred. Please try again.");
    }

    // Method to display details of all interviews
    private void displayAllInterviews(List<Interview> interviews) {
        if (!interviews.isEmpty()) {
            interviews.forEach(this::displayInterviewDetails);
        } else {
            System.out.println();
            System.out.println("No Interviews available");
            System.out.println();
        }
    }

    // Method to display details of an interview
    private void displayInterviewDetails(Interview interview) {
        System.out.println("-----------------------------------------");
        System.out.println("Interview ID: " + interview.getInterviewId());
        System.out.println("Application ID: " + interview.getApplicationId());
        System.out.println("Date and Time: " + interview.getDateTime());
        System.out.println("Status: " + interview.getStatus());
        System.out.println("Type: " + interview.getType());
        System.out.println("-----------------------------------------");
    }

    // Method to validate timestamp input
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

    // Method to manage interviews for an application
    public void manageInterviewForApplication(Scanner scanner, Integer applicationId) {
        try {
            if (applicationId == null) {
                System.out.print("Enter the Application ID: ");
                applicationId = scanner.nextInt();
                scanner.nextLine();
            }

            List<Interview> existingInterviewList = interviewService.getInterviewsByApplicationId(applicationId);

            if (!existingInterviewList.isEmpty()) {
                handleExistingInterview(existingInterviewList, applicationId, scanner);
            } else {
                handleNoInterview(applicationId, scanner);
            }
        } catch (Exception e) {
            handleException("Error managing interview for application", e);
        }
    }

    // Method to handle options when existing interviews are found for an application
    public void handleExistingInterview(List<Interview> interviewList, int applicationId, Scanner scanner) {
        System.out.println();
        System.out.println("Found Interview details for the application");
        System.out.println();
        displayAllInterviews(interviewList);

        System.out.println();
        System.out.println("********************************************");
        System.out.println("Please Choose an option:");
        System.out.println("1. Edit Interview");
        System.out.println("2. Delete Interview");
        System.out.println("3. Add New Interview");
        System.out.println("4. Go back");
        System.out.println("********************************************");
        System.out.print("Enter your choice: ");

        int interviewOption = scanner.nextInt();
        scanner.nextLine();

        switch (interviewOption) {
            case 1:
            	// Edit interview
                System.out.println();
                System.out.println("Selected: Edit Interview");
                System.out.println("============================================");
                editInterviewOption(scanner);
                break;

            case 2:
            	// Delete interview
                System.out.println();
                System.out.println("Selected: Delete Interview");
                System.out.println("============================================");
                deleteInterviewOption(scanner);
                break;

            case 3:
            	// Add new interview
                System.out.println();
                System.out.println("Selected: Add New Interview");
                System.out.println("============================================");
                addInterviewForApplication(applicationId, scanner);
                break;

            case 4:
            	// Go back
                System.out.println("Selected: Go back");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    // Method to handle options when no existing interviews are found for an application
    public void handleNoInterview(int applicationId, Scanner scanner) {
        System.out.println();
        System.out.println("No Interview found for this application");
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("Please choose an option:");
        System.out.println("1. Schedule Interview");
        System.out.println("2. Go back");
        System.out.print("Enter your choice: ");

        int interviewOption = scanner.nextInt();
        scanner.nextLine();

        switch (interviewOption) {
            case 1:
                System.out.println();
                System.out.println("Selected: Schedule Interview");
                System.out.println("============================================");
                addInterviewForApplication(applicationId, scanner);
                break;

            case 2:
                System.out.println("Selected: Go back");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }

    // Method to add a new interview for an application
    public void addInterviewForApplication(int applicationId, Scanner scanner) {
        try {
            LocalDateTime interviewDateTime = validateTimestampInput(scanner,
                    "Enter interview date and time (YYYY-MM-DD HH:mm:ss): ");
            Timestamp interviewTimestamp = Timestamp.valueOf(interviewDateTime);

            System.out.print("Enter interview type: ");
            String interviewType = scanner.nextLine();

            Interview interview = new Interview(0, applicationId, interviewTimestamp, "Scheduled", interviewType);
            boolean isInterviewAdded = interviewService.addInterview(interview);

            if (isInterviewAdded) {
                System.out.println("Interview added successfully.");
            }
        } catch (Exception e) {
            handleException("Error adding new interview for application", e);
        }
    }

    // Method to edit an existing interview
    public void editInterview(Interview existingInterview, Scanner scanner) {
        LocalDateTime updatedInterviewDateTime = validateTimestampInput(scanner,
                "Enter updated interview date and time (YYYY-MM-DD HH:mm:ss): ");
        Timestamp updatedInterviewTimestamp = Timestamp.valueOf(updatedInterviewDateTime);

        System.out.print("Enter updated interview status: ");
        String updatedInterviewStatus = scanner.nextLine();
        System.out.print("Enter updated interview type: ");
        String updatedInterviewType = scanner.nextLine();

        // Use the existing application ID
        int applicationId = existingInterview.getApplicationId();

        Interview updatedInterview = new Interview(existingInterview.getInterviewId(), applicationId,
                updatedInterviewTimestamp, updatedInterviewStatus, updatedInterviewType);

        boolean isInterviewUpdated = interviewService.updateInterview(existingInterview.getInterviewId(),
                updatedInterview);

        if (isInterviewUpdated) {
            System.out.println("Interview updated successfully.");
        }
    }

    // Method to delete an existing interview
    public void deleteInterview(Interview existingInterview, Scanner scanner) {
        System.out.print("Are you sure you want to delete this interview (Y/N): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            boolean isInterviewDeleted = interviewService.deleteInterview(existingInterview.getInterviewId());

            if (isInterviewDeleted) {
                System.out.println("Interview deleted successfully.");
            }
        } else {
            System.out.println("Deletion canceled.");
        }
    }

    // Method to handle the option to edit an interview
    public void editInterviewOption(Scanner scanner) {
        try {
            System.out.print("Enter Interview ID to edit: ");
            int interviewId = scanner.nextInt();

            Interview existingInterview = interviewService.getInterviewById(interviewId);

            if (existingInterview != null) {
                System.out.println();
                System.out.println("Existing Interview Details:");
                displayInterviewDetails(existingInterview);

                editInterview(existingInterview, scanner);
            } else {
                System.out.println("Interview not found.");
            }
        } catch (Exception e) {
            handleException("Error editing interview", e);
        }
    }

    // Method to handle the option to delete an interview
    public void deleteInterviewOption(Scanner scanner) {
        try {
            System.out.print("Enter Interview ID to delete: ");
            int interviewId = scanner.nextInt();

            Interview existingInterview = interviewService.getInterviewById(interviewId);

            if (existingInterview != null) {
                System.out.println();
                System.out.println("Existing Interview Details:");
                displayInterviewDetails(existingInterview);

                deleteInterview(existingInterview, scanner);
            } else {
                System.out.println("Interview not found.");
            }
        } catch (Exception e) {
            handleException("Error deleting interview", e);
        }
    }
}

