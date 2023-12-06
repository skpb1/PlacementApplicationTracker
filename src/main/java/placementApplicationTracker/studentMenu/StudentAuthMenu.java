package main.java.placementApplicationTracker.studentMenu;

import java.util.Scanner;

import main.java.placementApplicationTracker.service.AuthenticationService;

public class StudentAuthMenu {
	
	public static void studentLogin(Scanner scanner) {
        System.out.println("Selected: Student Login");
        System.out.println("============================================");
        System.out.print("Enter StudentId: ");
        int sId = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Password: ");
        String sPass = scanner.nextLine();

        System.out.println();
        System.out.println();
        boolean studentLoginSuccess = AuthenticationService.studentLogin(sId, sPass);

        if (studentLoginSuccess) {
            System.out.println("Student login successful!");
            System.out.println();
            StudentMenu.displayStudentMenu(sId, scanner); // open student menu
        } else {
            System.out.println("Invalid student credentials.");
            System.out.println();
        }
    }

    public static void studentSignup(Scanner scanner) {
        System.out.println("Selected: Student Signup");
        System.out.println("============================================");
        System.out.print("Enter StudentId: ");
        int studentId = scanner.nextInt();
        scanner.nextLine();
        
        // Check if the admin ID already exists
	    if (AuthenticationService.doesStudentIdExist(studentId)) {
	        System.out.println("The student ID already exists. Please go to the login tab");
	        return;
	    }

        System.out.print("Enter Password: ");
        String sPassword = scanner.nextLine();

        System.out.print("Enter FullName: ");
        String sFullName = scanner.nextLine();

        System.out.print("Enter Email: ");
        String sEmail = scanner.nextLine();

        System.out.print("Enter Course: ");
        String course = scanner.nextLine();

        System.out.print("Enter PassOutYear: ");
        int passOutYear = scanner.nextInt();

        System.out.println();
        System.out.println();

        boolean studentSignUpSuccess = AuthenticationService.studentSignup(studentId, sPassword, sFullName, sEmail, course, passOutYear);

        if (studentSignUpSuccess) {
            System.out.println("Student sign up successful!");
            System.out.println();
        } else {
            System.out.println("Error occurred while signing up as Student");
            System.out.println();
        }
    }


}
