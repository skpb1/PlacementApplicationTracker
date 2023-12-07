package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.service.ApplicationService;
import main.java.placementApplicationTracker.service.PlacementService;

public class StudentPlacementMenu {
    private  final Logger LOGGER = Logger.getLogger(StudentPlacementMenu.class.getName());
    private  List<Opportunity> filteredOpportunities;
    private PlacementService placementService;
    private ApplicationService applicationService;
    
    

    public StudentPlacementMenu(PlacementRepo placementRepo, ApplicationRepo applicationRepo) {
		this.placementService = new PlacementService(placementRepo);
		this.applicationService = new ApplicationService(applicationRepo);
	}

	public  void displayPlacementOpportunities(int studentId, Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n\n\n\n");

            try {
                System.out.println("Available opportunities are shown below\n");

                if (filteredOpportunities == null) {
                    filteredOpportunities = placementService.getOpportunities();
                }

                displayOpportunities(filteredOpportunities);

                System.out.println("\n********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. Apply for an opportunity");
                System.out.println("2. Filter Opportunities");
                System.out.println("3. Go back");
                System.out.println("********************************************");
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();
                System.out.println();
                switch (option) {
                    case 1:
                        applyForOpportunity(studentId, scanner);
                        filteredOpportunities = null;
                        break;

                    case 2:
                        filterOpportunities(scanner);
                        break;

                    case 3:
                        System.out.println();
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

    private  void displayOpportunities(List<Opportunity> opportunities) {
        if (!opportunities.isEmpty()) {
            opportunities.forEach(opp -> displayOpportunityDetails(opp));
        } else {
            System.out.println("\nNo Placement Opportunities available\n");
        }
    }

    private  void displayOpportunityDetails(Opportunity opportunity) {
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

    private  void applyForOpportunity(int studentId, Scanner scanner) {
    	try {
            System.out.print("Enter the ID of opportunity you want to apply: ");
            int oppId = scanner.nextInt();
            
            Opportunity existingOpportunity = placementService.getOpportunityById(oppId);

            if (existingOpportunity != null) {
            	System.out.println();
                System.out.println("The Opportunity Details:");
                displayOpportunityDetails(existingOpportunity);
                
				scanner.nextLine();

	            System.out.print("Enter the Resume Content: ");
	            String resumeContent = scanner.nextLine();
	
	            System.out.print("Enter the Cover Letter Content: ");
	            String coverLetterContent = scanner.nextLine();
	            System.out.println();
	            System.out.println();
	            
	            // Apply for the opportunity
	            
                boolean isCreated = applicationService.createApplication(oppId, studentId, resumeContent,
                        coverLetterContent);
                if (isCreated) {
                    System.out.println("Application has been created successfully.");
                    System.out.println();
                } else {
                    System.out.println("Failed to create the application.");
                    System.out.println();
                }
	            
	            System.out.println("Please press enter to continue");
	            scanner.nextLine();
	            System.out.println();
	         
            } else {
                System.out.println("The selected Opportunity could not be found.");
            }
    	} catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error applying for opportunity", e);
            System.out.println("An error occurred while applying for the opportunity. Please try again.");
        }
    }

    private  void filterOpportunities(Scanner scanner) {
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

    private  void handleFilterOption(int filterOption, Scanner scanner) {
    	scanner.nextLine();
        switch (filterOption) {
            case 1:
            	System.out.println();
                System.out.println("Selected: Filter by Company Name");
                System.out.print("Enter Company Name: ");
                String companyName = scanner.nextLine();
                filteredOpportunities = placementService.getOpportunitiesByCompanyName(companyName);
                break;

            case 2:
            	System.out.println();
                System.out.println("Selected: Filter by Role");
                System.out.print("Enter Role: ");
                String role = scanner.nextLine();
                filteredOpportunities = placementService.getOpportunitiesByRole(role);
                break;

            case 3:
            	System.out.println();
                System.out.println("Selected: Filter by Location");
                System.out.print("Enter Location: ");
                String location = scanner.nextLine();
                filteredOpportunities = placementService.getOpportunitiesByLocation(location);
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
}
