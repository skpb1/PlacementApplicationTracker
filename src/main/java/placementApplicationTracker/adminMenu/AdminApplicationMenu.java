package main.java.placementApplicationTracker.adminMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.service.ApplicationService;

public class AdminApplicationMenu {

    private static final Logger LOGGER = Logger.getLogger(AdminApplicationMenu.class.getName());

    public static void displayMenu(int adminId, Scanner scanner) {

    	boolean isRunning = true;

		while (isRunning) {
			try {

				displayApplications(ApplicationService.getAllApplications(), scanner);
				
				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Filter Applications");
				System.out.println("2. Process an Application");
				System.out.println("3. Go back");
				System.out.println("********************************************");
				System.out.println();

				int option = scanner.nextInt();

				switch (option) {
				case 1:
					System.out.println("Selected: Filter Applications");
					System.out.println("============================================");
					System.out.println();
					filterApplicationsMenu(adminId, scanner);
					break;
					
				case 2:
					System.out.println("Selected: Process an Application");
					System.out.println("============================================");
					System.out.println();
					System.out.println("Please Enter the Application ID:");
					int appId = scanner.nextInt();
					AdminApplicationProcessMenu.displayMenu(appId, scanner);
					break;
					
				case 3:
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
    
    public static void filterApplicationsMenu(int adminId, Scanner scanner) {
    	
    	boolean isRunning = true;

		while (isRunning) {
			try {
				System.out.println("Options to filter the Applications");
				System.out.println("1. Filter by Opportunity ID");
				System.out.println("2. Filter by Student ID");
				System.out.println("3. Go back");
				System.out.print("Enter your choice: ");
				
				int option = scanner.nextInt();
				
				switch (option) {
				    case 1:
				        System.out.println("Selected: Filter by Opportunity ID");
				        System.out.print("Enter Opportunity ID: ");
				        int opportunityId = scanner.nextInt();
				        displayApplications(ApplicationService.getApplicationsByOpportunity(opportunityId), scanner);
				        break;
				        
				    case 2:
				        System.out.println("Selected: Filter by Student ID");
				        System.out.print("Enter Student ID: ");
				        int studentId = scanner.nextInt();
				        displayApplications(ApplicationService.getApplicationsByStudent(studentId), scanner);
				        break;
				        
				    case 3:
				    	System.out.println();
						isRunning = false;
						break;
	
				    default:
				        System.out.println("Invalid option. Please choose a valid option.");
						System.out.println();
				        break;
				}
			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, "Error in filter menu option processing", e);
				System.out.println("An unexpected error occurred. Please try again.");
				isRunning = false;
				break;
			}
		}
    }
    
    public static void displayApplications(List<Application> applications, Scanner scanner) {
    	
		scanner.nextLine();
    	
		if (applications.size() == 0) {
			System.out.println();
			System.out.println("No applications to display!!!. Cannot find any Placement applications in Database.");
			System.out.println();
			System.out.println("------------------------------------");
			
			System.out.println("Please press enter to continue");
			scanner.nextLine();
			System.out.println();

		} else {
			System.out.println();
			System.out.println("Applications List is shown below");
			System.out.println();
			applications.forEach(item -> {
				System.out.println("------------------------------------");
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
