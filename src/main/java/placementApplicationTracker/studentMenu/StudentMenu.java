package main.java.placementApplicationTracker.studentMenu;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.StudentService;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentMenu {
    // Logger for logging exceptions
    private final Logger LOGGER = Logger.getLogger(StudentMenu.class.getName());

    // Repositories and services needed for Student menu operations
    private VisitRepo visitRepo;
    private ApplicationRepo applicationRepo;
    private PlacementRepo placementRepo;
    private AssessmentRepo assessmentRepo;
    private InterviewRepo interviewRepo;
    private StudentService studentService;
    private StudentRepo studentRepo;
    private FeedbackRepo feedbackRepo;

    // Constructor to initialize the StudentMenu with necessary repositories and services
    public StudentMenu(VisitRepo visitRepo, ApplicationRepo applicationRepo,
                       PlacementRepo placementRepo, AssessmentRepo assessmentRepo,
                       InterviewRepo interviewRepo, StudentRepo studentRepo,
                       FeedbackRepo feedbackRepo) {
        this.visitRepo = visitRepo;
        this.applicationRepo = applicationRepo;
        this.placementRepo = placementRepo;
        this.assessmentRepo = assessmentRepo;
        this.interviewRepo = interviewRepo;
        this.studentService = new StudentService(studentRepo);
        this.feedbackRepo = feedbackRepo;
        this.studentRepo = studentRepo;
    }

    // Method to display the Student menu and handle user input
    public void displayStudentMenu(int studentId, Scanner scanner) {

        boolean isRunning = true;

        while (isRunning) {
            try {
                // Retrieve student full name to display welcome message
                Student student = studentService.getStudentDetails(studentId);
                String studentName = (student != null) ? student.getFullName() : "Unknown";

                System.out.println();
                System.out.println("Welcome, " + studentName + "!");
                System.out.println();

                System.out.println("********************************************");
                System.out.println("Please Choose an option:");
                System.out.println("1. View Placement Opportunities");
                System.out.println("2. Manage Applications");
                System.out.println("3. Manage Personal Details");
                System.out.println("4. Logout");
                System.out.println("********************************************");
                System.out.println();
                System.out.print("Enter your choice: ");

                int option = scanner.nextInt();

                // Switch statement to handle user's choice
                switch (option) {
                    case 1:
                        System.out.println("Selected: View Placement Opportunities");
                        System.out.println("===========================================");
                        System.out.println();
                        if (student != null) {
                            StudentPlacementMenu menu = new StudentPlacementMenu(placementRepo, applicationRepo);
                            menu.displayPlacementOpportunities(studentId, scanner); // Open the student placement menu
                        } else {
                            System.out.println("Student details not found.");
                            System.out.println();
                        }
                        break;

                    case 2:
                        System.out.println("Selected: Manage Applications");
                        System.out.println("===========================================");
                        System.out.println();
                        if (student != null) {
                            StudentApplicationMenu studentApplicationMenu = new StudentApplicationMenu(visitRepo,
                                    applicationRepo, feedbackRepo, assessmentRepo, interviewRepo);
                            studentApplicationMenu.displayApplicationMenu(studentId, scanner); // Open the student application menu
                        } else {
                            System.out.println("Student details not found.");
                            System.out.println();
                        }
                        break;

                    case 3:
                        System.out.println("Selected: Manage Personal Details");
                        System.out.println("===========================================");
                        System.out.println();
                        if (student != null) {
                            StudentDetailsMenu detailsMenu = new StudentDetailsMenu(studentRepo);
                            detailsMenu.displayEditDetailsMenu(student, scanner); // Open the student details menu
                        } else {
                            System.out.println("Student details not found.");
                            System.out.println();
                        }
                        break;

                    case 4:
                    	// Logout and go back to the application main menu
                        System.out.println("Selected: Logout");
                        System.out.println("=========================================");
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

