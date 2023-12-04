package main.java.placementApplicationTracker;

import main.java.placementApplicationTracker.menu.StudentMenu;
import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.service.AuthenticationService;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        try (Connection connection = PlacementRepository.connect()) {

            // Create the tables in Database
            PlacementRepository.createTables(connection);

            Scanner scanner = new Scanner(System.in);

            boolean isRunning = true;
            while (isRunning) {
            	System.out.println();
                System.out.println();
                System.out.println();
                System.out.println();
                try {
                	System.out.println("********************************************");
                    System.out.println("Welcome to Placement Application Tracker !");
                    System.out.println();
                    System.out.println("Please Choose an option:");
                    System.out.println("1. Student Login");
                    System.out.println("2. Student Signup");
                    System.out.println("3. Admin Login");
                    System.out.println("4. Admin Signup");
                    System.out.println("5. Exit");
                    System.out.println("********************************************");
                    System.out.println();
                    System.out.print("Enter your choice: ");
                    int option = scanner.nextInt();
                    System.out.println();
                    System.out.println();
                    switch (option) {
                        case 1:
                            System.out.println("Selected: Student Login");
                            System.out.println("============================================");
                            System.out.println();
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
                                break;
                            } else {
                                System.out.println("Invalid student credentials.");
                                System.out.println();
                            }
                            break;

                        case 2:
                            System.out.println("Selected: Student Signup");
                            System.out.println("============================================");
                            System.out.println();
                            System.out.print("Enter StudentId: ");
                            int studentId = scanner.nextInt();
                            scanner.nextLine();

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
                            
                            boolean studentSignUpSuccess = AuthenticationService.studentSignup(studentId, sPassword,
                                    sFullName, sEmail, course, passOutYear);

                            if (studentSignUpSuccess) {
                                System.out.println("Student sign up successful!");
                                System.out.println();
                            } else {
                                System.out.println("Error occurred while signing up as Student");
                                System.out.println();
                            }
                            break;

                        case 3:
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
                            } else {
                                System.out.println("Invalid Admin credentials.");
                                System.out.println();
                            }
                            break;

                        case 4:
                            System.out.println("Selected: Admin Signup");
                            System.out.println("=============================================");
                            System.out.println();
                            System.out.print("Enter AdminId: ");
                            int adminId = scanner.nextInt();
                            scanner.nextLine();

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

                            boolean adminSignUpSuccess = AuthenticationService.adminSignup(adminId, aPassword,
                                    aFullName, aEmail, designation);

                            if (adminSignUpSuccess) {
                                System.out.println("Admin sign up successful!");
                                System.out.println();
                            } else {
                                System.out.println("Error occurred while signing up as Admin");
                                System.out.println();
                            }
                            break;

                        case 5:
                            System.out.println("Selected: Exit");
                            System.out.println("============================================");
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
                    System.out.println("An unexpected error occurred. Please try again." + e);
                    isRunning = false;
                    break;
                }
            }

            scanner.close();
            System.out.println("Application stopped.");

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error connecting to the database", e);
            System.out.println("An error occurred while connecting to the database. Please check the logs.");
        }
    }
}
