
package main.java.placementApplicationTracker;

import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.repo.impl.AdminRepoImpl;
import main.java.placementApplicationTracker.repo.impl.ApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.AssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.AuthenticationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.FeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.InterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.PlacementRepoImpl;
import main.java.placementApplicationTracker.repo.impl.StudentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.VisitRepoImpl;
import main.java.placementApplicationTracker.mainMenu.ApplicationMainMenu;

import java.util.Scanner;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

	private static final Logger LOGGER = Logger.getLogger(App.class.getName());

	public static void main(String[] args) {

		try (Connection connection = PlacementRepository.connect()) {

			// Create the tables in Database
			PlacementRepository.createTables(connection);

			Scanner scanner = new Scanner(System.in);

			ApplicationMainMenu applicationMainMenu = new ApplicationMainMenu(new VisitRepoImpl(), new AdminRepoImpl(),
					new AssessmentRepoImpl(), new ApplicationRepoImpl(), new AuthenticationRepoImpl(),
					new FeedbackRepoImpl(), new InterviewRepoImpl(), new PlacementRepoImpl(), new StudentRepoImpl());
			applicationMainMenu.displayMainMenu(scanner);

//            boolean isRunning = true;
//            while (isRunning) {
//                System.out.println();
//                System.out.println("********************************************");
//                System.out.println("Welcome to Placement Application Tracker !");
//                System.out.println();
//                System.out.println("Please Choose an option:");
//                System.out.println("1. Student Login");
//                System.out.println("2. Student Signup");
//                System.out.println("3. Admin Login");
//                System.out.println("4. Admin Signup");
//                System.out.println("5. Exit");
//                System.out.println("********************************************");
//                System.out.println();
//                System.out.print("Enter your choice: ");
//                int option = scanner.nextInt();
//                System.out.println();
//                System.out.println();
//                switch (option) {
//                    case 1:
//                        StudentAuthMenu.studentLogin(scanner);
//                        break;
//
//                    case 2:
//                    	StudentAuthMenu.studentSignup(scanner);
//                        break;
//
//                    case 3:
//                    	AdminAuthMenu.adminLogin(scanner);
//                        break;
//
//                    case 4:
//                    	AdminAuthMenu.adminSignup(scanner);
//                        break;
//
//                    case 5:
//                        System.out.println("Selected: Exit");
//                        System.out.println("============================================");
//                        isRunning = false;
//                        break;
//
//                    default:
//                        System.out.println("Invalid option. Please choose a valid option.");
//                        System.out.println("============================================");
//                        System.out.println();
//                        break;
//                }
//            }
//
//            scanner.close();
//            System.out.println("Application stopped.");

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error connecting to the database", e);
			System.out.println("An error occurred while connecting to the database. Please check the logs.");
		}
	}
}
