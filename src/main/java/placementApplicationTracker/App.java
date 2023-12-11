
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

    // Define Logger for logging exceptions
    private static final Logger LOGGER = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        try (Connection connection = PlacementRepository.connect()) {

            // Create all the required tables in the SQlite Database
            PlacementRepository.createTables(connection);

            // Initialize Scanner for user input
            Scanner scanner = new Scanner(System.in);

            // Create an instance of the Application main menu with all the repositories
            ApplicationMainMenu applicationMainMenu = new ApplicationMainMenu(
                    new VisitRepoImpl(),
                    new AdminRepoImpl(),
                    new AssessmentRepoImpl(),
                    new ApplicationRepoImpl(),
                    new AuthenticationRepoImpl(),
                    new FeedbackRepoImpl(),
                    new InterviewRepoImpl(),
                    new PlacementRepoImpl(),
                    new StudentRepoImpl()
            );

            // start the application and Display the main menu
            applicationMainMenu.displayMainMenu(scanner);

        } catch (Exception e) {
            // Log and display an error message if there is an issue connecting to the database
            LOGGER.log(Level.SEVERE, "Error connecting to the database", e);
            System.out.println("An error occurred while connecting to the database. Please check the logs.");
        }
    }
}