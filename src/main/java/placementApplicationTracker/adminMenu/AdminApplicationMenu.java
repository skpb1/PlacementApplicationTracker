package main.java.placementApplicationTracker.adminMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.ApplicationService;

public class AdminApplicationMenu {
    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(AdminApplicationMenu.class.getName());
    
    // List to store filtered applications
    private List<Application> filteredApplications;
    
    // Repositories and services needed for Admin application operations
    private VisitRepo visitRepo;
    private ApplicationRepo applicationRepo;
    private FeedbackRepo feedbackRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private ApplicationService applicationService;

    // Constructor to initialize the AdminApplicationMenu with necessary repositories and services
    public AdminApplicationMenu(VisitRepo repo, ApplicationRepo applicationRepo, FeedbackRepo feedbackRepo,
                                AssessmentRepo assessmentRepo, InterviewRepo interviewRepo) {
        this.visitRepo = repo;
        this.applicationRepo = applicationRepo;
        this.assessmentRepo = assessmentRepo;
        this.feedbackRepo = feedbackRepo;
        this.interviewRepo = interviewRepo;
        applicationService = new ApplicationService(applicationRepo);
    }

    // Method to display the Admin Application menu and handle user input
    public void displayMenu(int adminId, Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            try {
            	
            	// If filtered applications are not set, fetch all applications
                if (filteredApplications == null) {
                    filteredApplications = applicationService.getAllApplications();
                }

                // Display the list of applications and menu options
                displayApplications(filteredApplications, scanner);

                System.out.println("********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Filter Applications");
                System.out.println("2. Process an Application");
                System.out.println("3. Go back");
                System.out.println("********************************************");
                System.out.println();
                System.out.print("Enter your choice: ");
                int option = scanner.nextInt();

                // Switch statement to handle user's choice
                switch (option) {
                    case 1:
                        // Handle filtering options
                        System.out.println();
                        System.out.println("Selected: Filter Applications");
                        System.out.println("============================================");
                        System.out.println();
                        System.out.println("Options to filter the Applications");
                        System.out.println("1. Filter by Opportunity ID");
                        System.out.println("2. Filter by Student ID");
                        System.out.println("3. Go back");
                        System.out.print("Enter your choice: ");

                        int filterOption = scanner.nextInt();
                        handleFilterOption(filterOption, scanner);
                        break;

                    case 2:
                        // Process an application
                        System.out.println();
                        System.out.println("Selected: Process an Application");
                        System.out.println("============================================");
                        System.out.println();
                        System.out.println("Please Enter the Application ID:");
                        int appId = scanner.nextInt();
                        AdminApplicationProcessMenu adminApplicationMenu = new AdminApplicationProcessMenu(visitRepo,
                                applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
                        adminApplicationMenu.displayMenu(appId, scanner); // Open the admin application process menu
                        // Reset filtered opportunities after deletion
                        filteredApplications = null;
                        break;

                    case 3:
                        // Go back to the previous menu
                        System.out.println("Selected: Go back");
                        System.out.println();
                        isRunning = false;
                        break;

                    default:
                        System.out.println("Invalid option. Please choose a valid option.");
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

    // Method to handle filtering options
    private void handleFilterOption(int filterOption, Scanner scanner) {
        switch (filterOption) {
            case 1:
                // Filter by Opportunity ID
                System.out.println("Selected: Filter by Opportunity ID");
                System.out.print("Enter Opportunity ID: ");
                int opportunityId = scanner.nextInt();
                filteredApplications = applicationService.getApplicationsByOpportunity(opportunityId);
                break;

            case 2:
                // Filter by Student ID
                System.out.println("Selected: Filter by Student ID");
                System.out.print("Enter Student ID: ");
                int studentId = scanner.nextInt();
                filteredApplications = applicationService.getApplicationsByStudent(studentId);
                break;

            case 3:
                // Go back
                System.out.println();
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
                System.out.println();
                break;
        }
    }

    // Method to display the list of applications
    public void displayApplications(List<Application> applications, Scanner scanner) {
        scanner.nextLine();

        if (applications.size() == 0) {
            // Display message if no applications are available
            System.out.println();
            System.out.println("No applications to display!!! Cannot find any Placement applications.");
            System.out.println();
            System.out.println("------------------------------------");

            System.out.println("Please press enter to continue");
            scanner.nextLine();
            System.out.println();
        } else {
            // Display the list of applications
            System.out.println();
            System.out.println("Applications List is shown below");
            System.out.println();
            applications.forEach(item -> {
                System.out.println("-----------------------------------------");
                System.out.println("Application ID: " + item.getApplicationId());
                System.out.println("Opportunity ID: " + item.getOpportunityId());
                System.out.println("Submitted By (Student ID): " + item.getStudentId());
                System.out.println("SubmissionDate: " + item.getSubmissionDate());
                System.out.println("Withdrawn: " + (item.getWithdrawn() == 1 ? "True" : "False"));
                System.out.println("-----------------------------------------");
            });
        }
    }
}
