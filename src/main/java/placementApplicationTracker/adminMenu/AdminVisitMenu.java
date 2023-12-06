package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.VisitService;

public class AdminVisitMenu {

    private final Logger LOGGER = Logger.getLogger(AdminVisitMenu.class.getName());
//    private VisitRepo visitRepo;
    private VisitService visitService;
    
    public AdminVisitMenu(VisitRepo visitRepo) {
//    	this.visitRepo = visitRepo;
    	this.visitService = new VisitService(visitRepo);
    }
    
    public void displayMenu(Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n\n\n\n");

            try {
                System.out.println("\nAll Available visits are shown below\n");

//                VisitService visitService = new VisitService(visitRepo);
                List<Visit> visits = visitService.getVisits();

                if (!visits.isEmpty()) {
                    visits.forEach(visit -> displayVisitDetails(visit));
                } else {
                    System.out.println("\nNo Visits available\n");
                }

                System.out.println("\n********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Add new visit");
                System.out.println("2. Edit visit");
                System.out.println("3. Delete visit");
                System.out.println("4. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        addVisit(scanner);
                        break;

                    case 2:
                        editVisit(scanner);
                        break;

                    case 3:
                        deleteVisit(scanner);
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

    public void displayVisitDetails(Visit visit) {
        System.out.println("------------------------------------");
        System.out.println("Visit ID: " + visit.getVisitId());
        System.out.println("Application ID: " + visit.getApplicationId());
        System.out.println("Date and Time: " + visit.getDateTime());
        System.out.println("Status: " + visit.getStatus());
        System.out.println("Details: " + visit.getDetails());
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

    public void addVisit(Scanner scanner) {
        try {
        	
        	System.out.print("Enter the Application ID related to the Visit: ");
            int applicationId = scanner.nextInt();
            scanner.nextLine();           

            LocalDateTime visitDateTime = validateTimestampInput(scanner, "Enter visit date and time (YYYY-MM-DD HH:mm:ss): ");
            Timestamp visitTimestamp = Timestamp.valueOf(visitDateTime);
           
            System.out.print("Enter visit status: ");
            String visitStatus = scanner.nextLine();
            System.out.print("Enter visit details: ");
            String visitDetails = scanner.nextLine();

            Visit visit = new Visit(0, applicationId, visitTimestamp, visitStatus, visitDetails);
//            VisitService visitService = new VisitService(visitRepo);
            boolean isVisitAdded = visitService.addVisit(visit);

            if (isVisitAdded) {
                System.out.println("Visit added successfully.");
            } else {
                System.out.println("Failed to add visit.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error adding new visit", e);
            System.out.println("An error occurred while adding a new visit. Please try again.");
        }
    }

    public void editVisit(Scanner scanner) {
        try {
            System.out.print("Enter Visit ID to edit: ");
            int visitId = scanner.nextInt();
            scanner.nextLine();

//            VisitService visitService = new VisitService(visitRepo);
            Visit existingVisit = visitService.getVisitById(visitId);

            if (existingVisit != null) {
                System.out.println("Existing Visit Details:");
                displayVisitDetails(existingVisit);

                LocalDateTime updatedVisitDateTime = validateTimestampInput(scanner, "Enter updated visit date and time (YYYY-MM-DD HH:mm:ss): ");
                Timestamp updatedVisitTimestamp = Timestamp.valueOf(updatedVisitDateTime);
                scanner.nextLine();
                
                System.out.print("Enter updated visit status: ");
                String updatedVisitStatus = scanner.nextLine();
                System.out.print("Enter updated visit details: ");
                String updatedVisitDetails = scanner.nextLine();

                // Use the existing application ID
                int applicationId = existingVisit.getApplicationId();

                Visit updatedVisit = new Visit(visitId, applicationId, updatedVisitTimestamp, updatedVisitStatus, updatedVisitDetails);

//                VisitService visitService1 = new VisitService(visitRepo);
                boolean isVisitUpdated = visitService.updateVisit(visitId, updatedVisit);

                if (isVisitUpdated) {
                    System.out.println("Visit updated successfully.");
                } else {
                    System.out.println("Failed to update visit.");
                }
            } else {
                System.out.println("Visit not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error editing visit", e);
            System.out.println("An error occurred while editing the visit. Please try again.");
        }
    }

    public void deleteVisit(Scanner scanner) {
        try {
            System.out.print("Enter Visit ID to delete: ");
            int visitId = scanner.nextInt();
            scanner.nextLine();

            Visit existingVisit = visitService.getVisitById(visitId);

            if (existingVisit != null) {
                System.out.println("Existing Visit Details:");
                displayVisitDetails(existingVisit);

                System.out.print("Are you sure you want to delete this visit (Y/N): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("Y")) {
                    boolean isVisitDeleted = visitService.deleteVisit(visitId);

                    if (isVisitDeleted) {
                        System.out.println("Visit deleted successfully.");
                    } else {
                        System.out.println("Failed to delete visit.");
                    }
                } else {
                    System.out.println("Deletion canceled.");
                }
            } else {
                System.out.println("Visit not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error deleting visit", e);
            System.out.println("An error occurred while deleting the visit. Please try again.");
        }
    }
}
