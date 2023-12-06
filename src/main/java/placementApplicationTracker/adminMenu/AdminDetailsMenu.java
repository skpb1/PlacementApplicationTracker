package main.java.placementApplicationTracker.adminMenu;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.service.AdminService;

public class AdminDetailsMenu {

	private final Logger LOGGER = Logger.getLogger(AdminDetailsMenu.class.getName());
	private AdminService adminService;

	public AdminDetailsMenu(AdminRepo adminRepo) {
		adminService = new AdminService(adminRepo);
	}

	public void displayEditDetailsMenu(Admin admin, Scanner scanner) {

		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			try {
				// Retrieve and display admin details
				System.out.println("Current Admin Details:");
				System.out.println();
				System.out.println("------------------------------------");
				System.out.println("Admin ID: " + admin.getAdminId());
				System.out.println("Full Name: " + admin.getFullName());
				System.out.println("Email: " + admin.getEmail());
				System.out.println("Designation: " + admin.getDesignation());
				System.out.println("------------------------------------");

				System.out.println();
				System.out.println("********************************************");
				System.out.println("Please Choose an option:");
				System.out.println("1. Edit Details");
				System.out.println("2. Update Password");
				System.out.println("3. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					// Get updated details from the user
					System.out.println("Please enter updated details below:");
					System.out.println("============================================");
					System.out.println();
					scanner.nextLine();
					System.out.print("Enter updated Full Name: ");
					String updatedFullName = scanner.nextLine();
					System.out.print("Enter updated Email: ");
					String updatedEmail = scanner.nextLine();
					System.out.print("Enter updated Designation: ");
					String updatedDesignation = scanner.nextLine();

					// Update admin details
					try {
						boolean isUpdated = adminService.updateAdminDetails(admin.getAdminId(), updatedFullName,
								updatedEmail, updatedDesignation);

						if (isUpdated) {
							System.out.println("Admin details updated successfully.");
							System.out.println();
						} else {
							System.out.println("Failed to update admin details.");
							System.out.println();
						}
					} catch (Exception e) {
						LOGGER.log(Level.SEVERE, "Error updating admin details", e);
					}
					break;

				case 2:
					System.out.println("Selected: Update Password");
					System.out.println("============================================");
					System.out.println();
					editPasswordMenu(admin, scanner);
					break;

				case 3:
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

	public void editPasswordMenu(Admin admin, Scanner scanner) {
		// Retrieve and update admin password
		String enteredCurrentPassword;

		do {
			System.out.print("Enter current password: ");
			enteredCurrentPassword = scanner.nextLine();
			scanner.nextLine();

			// Compare entered current password with the actual current password
			if (!enteredCurrentPassword.equals(admin.getPassword())) {
				System.out.println("Entered current password is not correct. Please try again.");
			}
		} while (!enteredCurrentPassword.equals(admin.getPassword()));

		// Prompt for the new password
		String newPassword;
		String confirmNewPassword;

		do {
			System.out.print("Enter new password: ");
			newPassword = scanner.nextLine();

			// Prompt for confirmation of the new password
			System.out.print("Confirm new password: ");
			confirmNewPassword = scanner.nextLine();

			// Compare new password and confirmation
			if (!newPassword.equals(confirmNewPassword)) {
				System.out.println("New password and confirmation do not match. Please try again.");
			}
		} while (!newPassword.equals(confirmNewPassword));

		// Update admin password
		try {
			boolean isPasswordUpdated = adminService.updateAdminPassword(admin.getAdminId(), enteredCurrentPassword,
					newPassword);

			if (isPasswordUpdated) {
				System.out.println("Password updated successfully.");
				System.out.println();
			} else {
				System.out.println("Failed to update password. Please check your current password.");
				System.out.println();
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error updating admin password", e);
		}
	}
}
