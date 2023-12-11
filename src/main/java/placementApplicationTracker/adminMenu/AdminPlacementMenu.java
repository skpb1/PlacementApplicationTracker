package main.java.placementApplicationTracker.adminMenu;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.service.PlacementService;

public class AdminPlacementMenu {

    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(AdminPlacementMenu.class.getName());

    // List to store filtered opportunities
    private List<Opportunity> filteredOpportunities;

    // Service for handling placement operations
    private PlacementService placementService;

    // Constructor to initialize AdminPlacementMenu with necessary service
    public AdminPlacementMenu(PlacementRepo placementRepo) {
        this.placementService = new PlacementService(placementRepo);
    }

    // Method to display the Admin Placement menu and handle user input
    public void displayMenu(int adminId, Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();

            try {
            	// Display available opportunities
                System.out.println();
                System.out.println("All Available opportunities are shown below");
                System.out.println();

                // If filtered opportunities are not set, fetch all opportunities
                if (filteredOpportunities == null) {
                    filteredOpportunities = placementService.getOpportunities();
                }

                displayOpportunities(filteredOpportunities);

                System.out.println();
                System.out.println("********************************************");
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
                
                // Switch statement to handle user's choice
                switch (option) {
                case 1:
                    // Add new opportunity
                    addNewOpportunity(adminId, scanner);
                    // Reset filtered opportunities after adding
                    filteredOpportunities = null;
                    break;

                case 2:
                    // Edit opportunity
                    editOpportunity(adminId, scanner);
                    // Reset filtered opportunities after editing
                    filteredOpportunities = null;
                    break;

                case 3:
                    // Delete opportunity
                    deleteOpportunity(adminId, scanner);
                    // Reset filtered opportunities after deletion
                    filteredOpportunities = null;
                    break;

                case 4:
                    // Filter Opportunities
                    filterOpportunities(scanner);
                    break;

                case 5:
                	// Go back to the previous menu
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

    // Method to display details of all opportunities
    private void displayOpportunities(List<Opportunity> opportunities) {
        if (!opportunities.isEmpty()) {
            opportunities.forEach(opp -> displayOpportunityDetails(opp));
        } else {
            System.out.println();
            System.out.println("No Placement Opportunities available");
            System.out.println();
        }
    }

    // Method to display details of an opportunity
    private void displayOpportunityDetails(Opportunity opportunity) {
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

    // Method to add a new opportunity
    public void addNewOpportunity(int adminId, Scanner scanner) {
        try {
            scanner.nextLine();
   
            // prompt the user for the required details to create a new opportunity

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

            // Validate and get open and close date
            LocalDateTime openDateTime = validateTimestampInput(scanner, "Enter Open Date (YYYY-MM-DD HH:mm:ss): ");
            LocalDateTime closeDateTime = validateTimestampInput(scanner, "Enter Close Date (YYYY-MM-DD HH:mm:ss): ");

            // Convert to Timestamp
            Timestamp openDate = Timestamp.valueOf(openDateTime);
            Timestamp closeDate = Timestamp.valueOf(closeDateTime);

            // Create a new Opportunity object
            Opportunity newOpportunity = new Opportunity(0, companyName, role, description, salary, location, openDate,
                    closeDate, adminId);

            // Add the new opportunity
            boolean isOpportunityAdded = placementService.addOpportunity(newOpportunity);

            if (isOpportunityAdded) {
                System.out.println("Opportunity added successfully.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error adding new opportunity", e);
            System.out.println("An error occurred while adding a new opportunity. Please try again.");
        }
    }

    // Method to edit an existing opportunity
    public void editOpportunity(int adminId, Scanner scanner) {
        try {
            System.out.print("Enter Opportunity ID to edit: ");
            int opportunityId = scanner.nextInt();

            // Get the existing opportunity by ID
            Opportunity existingOpportunity = placementService.getOpportunityById(opportunityId);

            if (existingOpportunity != null) {
                System.out.println("Existing Opportunity Details:");
                displayOpportunityDetails(existingOpportunity);

                // Accept updated details from the user
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

                // Validate and get updated open and close date
                LocalDateTime updatedOpenDateTime = validateTimestampInput(scanner,
                        "Enter updated Open Date (YYYY-MM-DD HH:mm:ss): ");
                LocalDateTime updatedCloseDateTime = validateTimestampInput(scanner,
                        "Enter updated Close Date (YYYY-MM-DD HH:mm:ss): ");

                // Convert to Timestamp
                Timestamp updatedOpenDate = Timestamp.valueOf(updatedOpenDateTime);
                Timestamp updatedCloseDate = Timestamp.valueOf(updatedCloseDateTime);

                // Create an updated Opportunity object
                Opportunity updatedOpportunity = new Opportunity(opportunityId, updatedCompanyName, updatedRole,
                        updatedDescription, updatedSalary, updatedLocation, updatedOpenDate, updatedCloseDate, adminId);

                // Update the opportunity
                boolean isOpportunityUpdated = placementService.updateOpportunity(opportunityId, updatedOpportunity);

                if (isOpportunityUpdated) {
                    System.out.println("Opportunity updated successfully.");
                }
            } else {
                System.out.println("Opportunity not found.");
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error editing opportunity", e);
            System.out.println("An error occurred while editing the opportunity. Please try again.");
        }
    }

    // Method to delete an existing opportunity
    public void deleteOpportunity(int adminId, Scanner scanner) {
        try {
            System.out.print("Enter Opportunity ID to delete: ");
            int opportunityId = scanner.nextInt();
            scanner.nextLine();

            // Get the existing opportunity by ID
            Opportunity existingOpportunity = placementService.getOpportunityById(opportunityId);

            if (existingOpportunity != null) {
                System.out.println("Existing Opportunity Details:");
                displayOpportunityDetails(existingOpportunity);

                // Confirm deletion from the user
                System.out.print("Are you sure you want to delete this opportunity (Y/N): ");
                String choice = scanner.next();

                if (choice.equalsIgnoreCase("Y")) {
                    // Delete the opportunity
                    boolean isOpportunityDeleted = placementService.deleteOpportunity(opportunityId);

                    if (isOpportunityDeleted) {
                        System.out.println("Opportunity deleted successfully.");
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

    // Method to filter opportunities based on user input
    public void filterOpportunities(Scanner scanner) {
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

    // Method to handle different filtering options
    public void handleFilterOption(int filterOption, Scanner scanner) {
        scanner.nextLine();

        switch (filterOption) {
        case 1:
            // Filter by Company Name
            System.out.println();
            System.out.println("Selected: Filter by Company Name");
            System.out.print("Enter Company Name: ");
            String companyName = scanner.nextLine();
            filteredOpportunities = placementService.getOpportunitiesByCompanyName(companyName);
            break;

        case 2:
            // Filter by Role
            System.out.println();
            System.out.println("Selected: Filter by Role");
            System.out.print("Enter Role: ");
            String role = scanner.nextLine();
            filteredOpportunities = placementService.getOpportunitiesByRole(role);
            break;

        case 3:
            // Filter by Location
            System.out.println();
            System.out.println("Selected: Filter by Location");
            System.out.print("Enter Location: ");
            String location = scanner.nextLine();
            filteredOpportunities = placementService.getOpportunitiesByLocation(location);
            break;

        case 4:
            // Filter by Salary Range
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

            // Filter opportunities based on salary range
            filteredOpportunities = placementService.getOpportunitiesBySalaryRange(minSalary, maxSalary);
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
}