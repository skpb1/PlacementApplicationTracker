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
    private VisitService visitService;

    public AdminVisitMenu(VisitRepo visitRepo) {
        this.visitService = new VisitService(visitRepo);
    }

    public void displayMenu(Scanner scanner) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n\n");

            try {
                System.out.println("\nAll Available visits are shown below\n");

                List<Visit> visits = visitService.getVisits();
                displayAllVisits(visits);

                System.out.println("\n********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Manage visit for an application");
                System.out.println("2. Edit visit");
                System.out.println("3. Delete visit");
                System.out.println("4. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        System.out.println("Selected: Manage visit for an application");
                        System.out.println("============================================");
                        System.out.println();
                        manageVisitForApplication(scanner, null);
                        break;

                    case 2:
                        System.out.println("Selected: Edit Visit");
                        System.out.println("============================================");
                        System.out.println();
                        editVisitOption(scanner);
                        break;

                    case 3:
                        System.out.println("Selected: Delete Visit");
                        System.out.println("============================================");
                        System.out.println();
                        deleteVisitOption(scanner);
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

    private void displayAllVisits(List<Visit> visits) {
        if (!visits.isEmpty()) {
            visits.forEach(this::displayVisitDetails);
        } else {
            System.out.println("\nNo Visits available\n");
        }
    }

    private void handleException(String message, Exception e) {
        LOGGER.log(Level.SEVERE, message, e);
        System.out.println("An unexpected error occurred. Please try again.");
    }

    public void displayVisitDetails(Visit visit) {
        System.out.println("-----------------------------------------");
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

    public void manageVisitForApplication(Scanner scanner, Integer applicationId) {
        try {
            if (applicationId == null) {
                System.out.print("Enter the Application ID: ");
                applicationId = scanner.nextInt();
                scanner.nextLine();
            }

            List<Visit> existingVisitList = visitService.getVisitsByApplicationId(applicationId);

            if (!existingVisitList.isEmpty()) {
                handleExistingVisit(existingVisitList, applicationId, scanner);
            } else {
                handleNoVisit(applicationId, scanner);
            }
        } catch (Exception e) {
            handleException("Error managing visit for application", e);
        }
    }

    public void handleExistingVisit(List<Visit> visitList, int applicationId, Scanner scanner) {
        System.out.println();
        System.out.println("Found Visit details for the application");
        System.out.println();
        displayAllVisits(visitList);

        System.out.println("\n********************************************");
        System.out.println("Please Choose an option:");
        System.out.println("1. Edit Visit");
        System.out.println("2. Delete Visit");
        System.out.println("3. Add new Visit");
        System.out.println("4. Go back");
        System.out.println("********************************************");
        System.out.print("Enter your choice: ");

        int visitOption = scanner.nextInt();
        scanner.nextLine();

        switch (visitOption) {
            case 1:
                System.out.println("\nSelected: Edit Visit");
                System.out.println("============================================");
                editVisitOption(scanner);
                break;

            case 2:
                System.out.println("\nSelected: Delete Visit");
                System.out.println("============================================");
                deleteVisitOption(scanner);
                break;
                
            case 3:
                System.out.println("\nSelected: Add new Visit");
                System.out.println("============================================");
                addVisitForApplication(applicationId, scanner);
                break;

            case 4:
                System.out.println("Selected: Go back");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
    
    public void handleNoVisit(int applicationId, Scanner scanner) {
        System.out.println();
        System.out.println("No Visit found for this application");
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println();

        System.out.println("Please choose an option:");
        System.out.println("1. Schedule Visit");
        System.out.println("2. Go back");
        System.out.print("Enter your choice: ");

        int visitOption = scanner.nextInt();
        scanner.nextLine();

        switch (visitOption) {
            case 1:
                System.out.println("\nSelected: Schedule Visit");
                System.out.println("============================================");
                addVisitForApplication(applicationId, scanner);
                break;

            case 2:
                System.out.println("Selected: Go back");
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
        }
    }
    
    public void addVisitForApplication(int applicationId, Scanner scanner) {
        try {
            LocalDateTime visitDateTime = validateTimestampInput(scanner, "Enter visit date and time (YYYY-MM-DD HH:mm:ss): ");
            Timestamp visitTimestamp = Timestamp.valueOf(visitDateTime);
            
            System.out.print("Enter visit details: ");
            String visitDetails = scanner.nextLine();

            Visit visit = new Visit(0, applicationId, visitTimestamp, "Scheduled", visitDetails);
            boolean isVisitAdded = visitService.addVisit(visit);

            if (isVisitAdded) {
                System.out.println("Visit added successfully.");
            }
        } catch (Exception e) {
            handleException("Error adding new visit for application", e);
        }
    }


    public void editVisit(Visit existingVisit, Scanner scanner) {
        LocalDateTime updatedVisitDateTime = validateTimestampInput(scanner, "Enter updated visit date and time (YYYY-MM-DD HH:mm:ss): ");
        Timestamp updatedVisitTimestamp = Timestamp.valueOf(updatedVisitDateTime);

        System.out.print("Enter updated visit status: ");
        String updatedVisitStatus = scanner.nextLine();
        System.out.print("Enter updated visit details: ");
        String updatedVisitDetails = scanner.nextLine();

        int applicationId = existingVisit.getApplicationId();
        Visit updatedVisit = new Visit(existingVisit.getVisitId(), applicationId, updatedVisitTimestamp, updatedVisitStatus, updatedVisitDetails);

        boolean isVisitUpdated = visitService.updateVisit(existingVisit.getVisitId(), updatedVisit);

        if (isVisitUpdated) {
            System.out.println("Visit updated successfully.");
        }
    }

    public void deleteVisit(Visit existingVisit, Scanner scanner) {
        System.out.print("Are you sure you want to delete this visit (Y/N): ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("Y")) {
            boolean isVisitDeleted = visitService.deleteVisit(existingVisit.getVisitId());
            if (isVisitDeleted) {
                System.out.println("Visit deleted successfully.");
            }
        } else {
            System.out.println("Deletion canceled.");
        }
    }

    public void editVisitOption(Scanner scanner) {
        try {
            System.out.print("Enter Visit ID to edit: ");
            int visitId = scanner.nextInt();
            scanner.nextLine();

            Visit existingVisit = visitService.getVisitById(visitId);

            if (existingVisit != null) {
                System.out.println("\nExisting Visit Details:");
                displayVisitDetails(existingVisit);

                editVisit(existingVisit, scanner);
            } else {
                System.out.println("Visit not found.");
            }
        } catch (Exception e) {
            handleException("Error editing visit", e);
        }
    }

    public void deleteVisitOption(Scanner scanner) {
        try {
            System.out.print("Enter Visit ID to delete: ");
            int visitId = scanner.nextInt();
            scanner.nextLine();

            Visit existingVisit = visitService.getVisitById(visitId);

            if (existingVisit != null) {
                System.out.println("\nExisting Visit Details:");
                displayVisitDetails(existingVisit);

                deleteVisit(existingVisit, scanner);
            } else {
                System.out.println("Visit not found.");
            }
        } catch (Exception e) {
            handleException("Error deleting visit", e);
        }
    }
}
