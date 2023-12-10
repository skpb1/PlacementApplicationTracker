package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.VisitService;

public class StudentVisitMenu {
    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(StudentVisitMenu.class.getName());

    // Service for handling visit-related operations
    private VisitService visitService;

    // Constructor to initialize StudentVisitMenu with the necessary repository and service
    public StudentVisitMenu(VisitRepo visitRepo) {
        this.visitService = new VisitService(visitRepo);
    }

    // Method to display the visit menu options and handle user input
    public void displayVisitMenu(int applicationId, Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            try {
                // Retrieve visits associated with the application
                List<Visit> visits = visitService.getVisitsByApplicationId(applicationId);

                // Display visits if available
                if (visits.size() != 0) {
                    System.out.println();
                    System.out.println("Visits List is shown below");
                    System.out.println();

                    visits.forEach(visit -> {
                        System.out.println("------------------------------------------");
                        System.out.println("Visit Id: " + visit.getVisitId());
                        System.out.println("DateTime: " + visit.getDateTime());
                        System.out.println("------------------------------------------");
                    });
                } else {
                	// No visits found
                    System.out.println();
                    System.out.println("No Visits found");
                    System.out.println();
                }

                // Display menu options
                System.out.println();
                System.out.println("********************************************");
                System.out.println("1. Show Details of a Visit");
                System.out.println("2. Go back");
                System.out.println("********************************************");
                System.out.println();
                System.out.print("Enter your choice: ");

                int option;
                option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        // Show details of a specific visit
                        showVisitDetails(visits, scanner);
                        break;
                        
                    case 2:
                        // Go back
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
            }
        }
    }

    // Method to show details of a specific visit
    private void showVisitDetails(List<Visit> visits, Scanner scanner) {
        System.out.println("Selected: Show Details of a Visit");
        System.out.println("============================================");
        System.out.println();

        if (visits.size() != 0) {
            System.out.println();
            System.out.println("Enter the Visit Id:");
            int visitId = scanner.nextInt();
            Visit visit = visitService.getVisitById(visitId);

            // Display the details of the selected visit
            if (visit != null) {
                System.out.println();
                System.out.println("Visit Details are shown below");
                System.out.println();
                System.out.println("------------------------------------------");
                System.out.println("Visit Id: " + visit.getVisitId());
                System.out.println("DateTime: " + visit.getDateTime());
                System.out.println("Status: " + visit.getStatus());
                System.out.println("Details: " + visit.getDetails());
                System.out.println("------------------------------------------");
                System.out.println();
                System.out.println();

                scanner.nextLine();

                System.out.println("Press Enter to continue");
                scanner.nextLine();
                System.out.println();
            } else {
                System.out.println("No Visit found with the provided Visit Id");
            }
        } else {
            System.out.println();
            System.out.println("No Visits found");
            System.out.println();
        }
    }
}

