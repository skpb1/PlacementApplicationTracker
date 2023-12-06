package main.java.placementApplicationTracker.adminMenu;

import java.util.Scanner;

import main.java.placementApplicationTracker.service.AuthenticationService;

public class AdminAuthMenu {
	
	public static void adminLogin(Scanner scanner) {
        System.out.println("Selected: Admin Login");
        System.out.println("============================================");

        System.out.print("Enter AdminId: ");
        int aId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Password: ");
        String aPass = scanner.nextLine();

        System.out.println();
        System.out.println();
        boolean adminLoginSuccess = AuthenticationService.adminLogin(aId, aPass);

        if (adminLoginSuccess) {
            System.out.println("Admin login successful!");
            System.out.println();
            AdminMenu.displayAdminMenu(aId, scanner); // open admin menu
        } else {
            System.out.println("Invalid Admin credentials.");
            System.out.println();
        }
    }

	public static void adminSignup(Scanner scanner) {
	    System.out.println("Selected: Admin Signup");
	    System.out.println("=============================================");
	    
	    // Get admin ID from the user
	    System.out.print("Enter AdminId: ");
	    int adminId = scanner.nextInt();
	    scanner.nextLine();

	    // Check if the admin ID already exists
	    if (AuthenticationService.doesAdminIdExist(adminId)) {
	        System.out.println("Admin ID already exists. Please go to the login tab");
	        return;
	    }

	    // Get other details from the user
	    System.out.print("Enter Password: ");
	    String aPassword = scanner.nextLine();

	    System.out.print("Enter FullName: ");
	    String aFullName = scanner.nextLine();

	    System.out.print("Enter Email: ");
	    String aEmail = scanner.nextLine();

	    System.out.print("Enter Designation: ");
	    String designation = scanner.nextLine();
	    System.out.println();
	    System.out.println();

	    // Attempt to sign up the admin
	    boolean adminSignUpSuccess = AuthenticationService.adminSignup(adminId, aPassword, aFullName, aEmail, designation);

	    if (adminSignUpSuccess) {
	        System.out.println("Admin sign up successful!");
	        System.out.println();
	    } else {
	        System.out.println("Error occurred while signing up as Admin");
	        System.out.println();
	    }
	}



}
