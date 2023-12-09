package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu;
import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;

public class AdminAssessmentMenuTest {
    private AssessmentRepo assessmentRepo;
    private AdminAssessmentMenu assessmentMenu;

    @BeforeEach
    void setup() {
        assessmentRepo = new MockAssessmentRepoImpl();
        new AssessmentService(assessmentRepo);
        assessmentMenu = new AdminAssessmentMenu(assessmentRepo);
    }

    @Test
    void testDisplayMenu() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Assessments available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Manage assessment for an application"
                + System.lineSeparator() + "============================================" + System.lineSeparator()
                + System.lineSeparator() + "Enter the Application ID: " + System.lineSeparator()
                + "No Assessment found for this application" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + System.lineSeparator()
                + "Please choose an option:" + System.lineSeparator() + "1. Schedule Assessment" + System.lineSeparator()
                + "2. Go back" + System.lineSeparator()
                + "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
                + System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
                + System.lineSeparator() + "4. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator() + "Enter your choice: "
                + System.lineSeparator() + "Selected: Go back" + System.lineSeparator() + "";
        assessmentMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp1() {
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
        Scanner scanner = new Scanner("1\n\n1\n\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, timestamp, "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, timestamp, "Scheduled", "ass2"));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Assessment ID: 1" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: ass1" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Assessment ID: 2" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: ass2" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Manage assessment for an application"
                + System.lineSeparator() + "============================================" + System.lineSeparator()
                + System.lineSeparator() + "Enter the Application ID: " + System.lineSeparator()
                + "Found Assessment details for the application" + System.lineSeparator() + System.lineSeparator()
                + "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 1"
                + System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
                + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass1"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "-----------------------------------------" + System.lineSeparator() + "Assessment ID: 2"
                + System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
                + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: ass2"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Edit Assessment" + System.lineSeparator()
                + "2. Delete Assessment" + System.lineSeparator() + "3. Add New Assessment" + System.lineSeparator()
                + "4. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Assessment ID: 1" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: ass1" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Assessment ID: 2" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: ass2" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        assessmentMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp2() {
        Scanner scanner = new Scanner("2\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Assessments available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Edit Assessment" + System.lineSeparator()
                + "============================================" + System.lineSeparator() + System.lineSeparator()
                + "Enter Assessment ID to edit: An unexpected error occurred. Please try again." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
                + System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
                + System.lineSeparator() + "4. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        assessmentMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp3() {
        Scanner scanner = new Scanner("3\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Assessments available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Delete Assessment" + System.lineSeparator()
                + "============================================" + System.lineSeparator() + System.lineSeparator()
                + "Enter Assessment ID to delete: An unexpected error occurred. Please try again." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Assessments available" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Manage assessment for an application"
                + System.lineSeparator() + "2. Edit assessment" + System.lineSeparator() + "3. Delete assessment"
                + System.lineSeparator() + "4. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        assessmentMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuInvalid() {
        Scanner scanner = new Scanner("69\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Assessments available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Invalid option. Please choose a valid option."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available assessments are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Assessments available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage assessment for an application" + System.lineSeparator() + "2. Edit assessment"
                + System.lineSeparator() + "3. Delete assessment" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        assessmentMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }
}