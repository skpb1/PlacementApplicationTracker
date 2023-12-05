package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.service.ApplicationService;
import main.java.placementApplicationTracker.service.PlacementService;

public class StudentPlacementMenu {
	private static final Logger LOGGER = Logger.getLogger(StudentPlacementMenu.class.getName());

	public static void displayPlacementOpportunities(int studentId, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {

				System.out.println();
				System.out.println("Available opportunities are shown below");
				System.out.println();

				List<Opportunity> opportunities;
				opportunities = PlacementService.getOpportunities();

				if (opportunities.size() != 0) {
					opportunities.forEach(item -> {
						System.out.println("------------------------------------");
						System.out.println("Placement ID: " + item.getOpportunityId());
						System.out.println("Company Name: " + item.getCompanyName());
						System.out.println("Role: " + item.getRole());
						System.out.println("Salary: " + item.getSalary());
						System.out.println("Location: " + item.getLocation());
						System.out.println("Open Date: " + item.getOpenDate());
						System.out.println("Close Date: " + item.getCloseDate());
						System.out.println("Description: " + item.getDescription());
						System.out.println("-----------------------------------------");
					});
				} else {
					System.out.println();
					System.out.println("No Placement Opportunities available");
					System.out.println();
				}

				System.out.println();
				System.out.println();
				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Apply for an opportunity");
				System.out.println("2. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					System.out.println("Selected: Apply for an opportunity");
					System.out.println("============================================");
					System.out.println();
					System.out.println();

					if (opportunities.size() != 0) {
						System.out.print("Enter the ID of opportunity you want to apply: ");
						int oppId = scanner.nextInt();
						scanner.nextLine();

						System.out.print("Enter the Resume Content: ");
						String resumeContent = scanner.nextLine();

						System.out.print("Enter the Cover Letter Content: ");
						String coverLetterContent = scanner.nextLine();
						System.out.println();
						System.out.println();
						// Apply for the opportunity
						try {
							boolean isCreated = ApplicationService.createApplication(oppId, studentId, resumeContent,
									coverLetterContent);
							if (isCreated) {
								System.out.println("Application has been creating successfully.");
								System.out.println();
							} else {
								System.out.println("Failed to create the application.");
								System.out.println();
							}
						} catch (Exception e) {
							LOGGER.log(Level.SEVERE, "Error creating application", e);
						}

						System.out.println("Please press enter to continue");
						scanner.nextLine();
						System.out.println();
					} else {
						System.out.println();
						System.out.println("No Placement Opportunities available");
						System.out.println();
					}
					break;

				case 2:
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
				LOGGER.log(Level.SEVERE, "Error in menu option processing", e);
				System.out.println("An unexpected error occurred. Please try again.");
				isRunning = false;
				break;
			}
		}

	}
}
