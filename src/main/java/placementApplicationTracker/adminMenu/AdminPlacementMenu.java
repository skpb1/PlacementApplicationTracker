package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.service.PlacementService;

public class AdminPlacementMenu {

    private static final Logger LOGGER = Logger.getLogger(AdminPlacementMenu.class.getName());
    private static List<Opportunity> filteredOpportunities;

    public static void displayMenu(int adminId, Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n\n\n\n");

            try {
                System.out.println("\nAll Available opportunities are shown below\n");
                
                if (filteredOpportunities == null) {
                    filteredOpportunities = PlacementService.getOpportunities();
                }

                displayOpportunities(filteredOpportunities);

                System.out.println("\n********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Add new opportunity");
                System.out.println("2. Edit opportunity");
                System.out.println("3. Delete opportunity");
                System.out.println("4. Filter Opportunities");
                System.out.println("5. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        addNewOpportunity(adminId, scanner);
                        break;

                    case 2:
                        editOpportunity(adminId, scanner);
                        break;

                    case 3:
                        deleteOpportunity(adminId, scanner);
                        break;
                        
                    case 4:
                        filterOpportunities(scanner);
                        break;

                    case 5:
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
    
    private static void displayOpportunities(List<Opportunity> opportunities) {
        if (!opportunities.isEmpty()) {
            opportunities.forEach(AdminPlacementMenu::displayOpportunityDetails);
        } else {
            System.out.println("\nNo Placement Opportunities available\n");
        }
    }

    private static void displayOpportunityDetails(Opportunity opportunity) {
        System.out.println("------------------------------------");
        System.out.println("Placement ID: " + opportunity.getOpportunityId());
        System.out.println("Company Name: " + opportunity.getCompanyName());
        System.out.println("Role: " + opportunity.getRole());
        System.out.println("Salary: " + opportunity.getSalary());
        System.out.println("Location: " + opportunity.getLocation());
        System.out.println("Open Date: " + opportunity.getOpenDate());
        System.out.println("Close Date: " + opportunity.getCloseDate());
        System.out.println("Description: " + opportunity.getDescription());
        System.out.println("-----------------------------------------");
    }

    private static void addNewOpportunity(int adminId, Scanner scanner) {
        try {
			scanner.nextLine();

            System.out.print("Enter Company Name: ");
            String companyName = scanner.nextLine();

            System.out.print("Enter Role: ");
            String role = scanner.nextLine();

            System.out.print("Enter Description: ");
            String description = scanner.nextLine();

            System.out.print("Enter Salary: ");
            int salary = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter Location: ");
            String location = scanner.nextLine();

            LocalDateTime openDateTime = validateTimestampInput(scanner, "Enter Open Date (YYYY-MM-DD HH:mm:ss): ");
            LocalDateTime closeDateTime = validateTimestampInput(scanner, "Enter Close Date (YYYY-MM-DD HH:mm:ss): ");

            Timestamp openDate = Timestamp.valueOf(openDateTime);
            Timestamp closeDate = Timestamp.valueOf(closeDateTime);

            Opportunity newOpportunity = new Opportunity(0, companyName, role, description, salary, location, openDate,
                    closeDate, adminId);

            boolean isOpportunityAdded = PlacementService.addOpportunity(newOpportunity);

            if (isOpportunityAdded) {
                System.out.println("Opportunity added successfully.");
            } else {
                System.out.println("Failed to add opportunity.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error adding new opportunity", e);
            System.out.println("An error occurred while adding a new opportunity. Please try again.");
        }
    }

    private static void editOpportunity(int adminId, Scanner scanner) {
        try {
            System.out.print("Enter Opportunity ID to edit: ");
            int opportunityId = scanner.nextInt();

            Opportunity existingOpportunity = PlacementService.getOpportunityById(opportunityId);

            if (existingOpportunity != null) {
                System.out.println("Existing Opportunity Details:");
                displayOpportunityDetails(existingOpportunity);

				scanner.nextLine();

                System.out.print("Enter updated Company Name: ");
                String updatedCompanyName = scanner.nextLine();

                System.out.print("Enter updated Role: ");
                String updatedRole = scanner.nextLine();

                System.out.print("Enter updated Description: ");
                String updatedDescription = scanner.nextLine();

                System.out.print("Enter updated Salary: ");
                int updatedSalary = scanner.nextInt();
                scanner.nextLine();

                System.out.print("Enter updated Location: ");
                String updatedLocation = scanner.nextLine();

                LocalDateTime updatedOpenDateTime = validateTimestampInput(scanner, "Enter updated Open Date (YYYY-MM-DD HH:mm:ss): ");
                LocalDateTime updatedCloseDateTime = validateTimestampInput(scanner, "Enter updated Close Date (YYYY-MM-DD HH:mm:ss): ");

                Timestamp updatedOpenDate = Timestamp.valueOf(updatedOpenDateTime);
                Timestamp updatedCloseDate = Timestamp.valueOf(updatedCloseDateTime);

                Opportunity updatedOpportunity = new Opportunity(opportunityId, updatedCompanyName, updatedRole,
                        updatedDescription, updatedSalary, updatedLocation, updatedOpenDate, updatedCloseDate, adminId);

                boolean isOpportunityUpdated = PlacementService.updateOpportunity(opportunityId, updatedOpportunity);

                if (isOpportunityUpdated) {
                    System.out.println("Opportunity updated successfully.");
                } else {
                    System.out.println("Failed to update opportunity.");
                }
            } else {
                System.out.println("Opportunity not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error editing opportunity", e);
            System.out.println("An error occurred while editing the opportunity. Please try again.");
        }
    }

    private static void deleteOpportunity(int adminId, Scanner scanner) {
        try {
            System.out.print("Enter Opportunity ID to delete: ");
            int opportunityId = scanner.nextInt();
            scanner.nextLine();

            Opportunity existingOpportunity = PlacementService.getOpportunityById(opportunityId);

            if (existingOpportunity != null) {
                System.out.println("Existing Opportunity Details:");
                displayOpportunityDetails(existingOpportunity);

                System.out.print("Are you sure you want to delete this opportunity (Y/N): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("Y")) {
                    boolean isOpportunityDeleted = PlacementService.deleteOpportunity(opportunityId);

                    if (isOpportunityDeleted) {
                        System.out.println("Opportunity deleted successfully.");
                    } else {
                        System.out.println("Failed to delete opportunity.");
                    }
                } else {
                    System.out.println("Deletion canceled.");
                }
            } else {
                System.out.println("Opportunity not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error deleting opportunity", e);
            System.out.println("An error occurred while deleting the opportunity. Please try again.");
        }
    }
    
    private static void filterOpportunities(Scanner scanner) {
        System.out.println("Options to filter the Opportunities");
        System.out.println("1. Filter by Company Name");
        System.out.println("2. Filter by Role");
        System.out.println("3. Filter by Location");
        System.out.println("4. Filter by Salary Range");
        System.out.println("5. Go back");
        System.out.print("Enter your choice: ");

        int filterOption = scanner.nextInt();
        handleFilterOption(filterOption, scanner);
    }

    private static void handleFilterOption(int filterOption, Scanner scanner) {
    	scanner.nextLine();
 
        switch (filterOption) {
            case 1:
            	System.out.println();
                System.out.println("Selected: Filter by Company Name");
                System.out.print("Enter Company Name: ");
                String companyName = scanner.nextLine();
                filteredOpportunities = PlacementService.getOpportunitiesByCompanyName(companyName);
                break;

            case 2:
            	System.out.println();
                System.out.println("Selected: Filter by Role");
                System.out.print("Enter Role: ");
                String role = scanner.nextLine();
                filteredOpportunities = PlacementService.getOpportunitiesByRole(role);
                break;

            case 3:
            	System.out.println();
                System.out.println("Selected: Filter by Location");
                System.out.print("Enter Location: ");
                String location = scanner.nextLine();
                filteredOpportunities = PlacementService.getOpportunitiesByLocation(location);
                break;

            case 4:
            	System.out.println();
                System.out.println("Selected: Filter by Salary Range");
                
                // Get minimum salary
                System.out.print("Enter Minimum Salary (press Enter for default 0): ");
                String minSalaryInput = scanner.nextLine();
                int minSalary = minSalaryInput.isEmpty() ? 0 : Integer.parseInt(minSalaryInput);

                // Get maximum salary
                System.out.print("Enter Maximum Salary : ");
                String maxSalaryInput = scanner.nextLine();
                int maxSalary = maxSalaryInput.isEmpty() ? 0 : Integer.parseInt(maxSalaryInput);

                filteredOpportunities = PlacementService.getOpportunitiesBySalaryRange(minSalary, maxSalary);
                break;

            case 5:
                System.out.println();
                break;

            default:
                System.out.println("Invalid option. Please choose a valid option.");
                System.out.println();
                break;
        }
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
}
