package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.adminMenu.AdminVisitMenu;
import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.VisitService;

public class AdminVisitMenuTest {
    private VisitRepo visitRepo;
    private AdminVisitMenu visitMenu;

    @BeforeEach
    void setup() {
        visitRepo = new MockVisitRepoImpl();
        new VisitService(visitRepo);
        visitMenu = new AdminVisitMenu(visitRepo);
    }

    @Test
    void testDisplayMenu() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Manage visit for an application"
                + System.lineSeparator() + "============================================" + System.lineSeparator()
                + System.lineSeparator() + "Enter the Application ID: " + System.lineSeparator()
                + "No Visit found for this application" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + System.lineSeparator()
                + "Please choose an option:" + System.lineSeparator() + "1. Schedule Visit" + System.lineSeparator()
                + "2. Go back" + System.lineSeparator()
                + "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available visits are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Visits available" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Manage visit for an application"
                + System.lineSeparator() + "2. Edit visit" + System.lineSeparator() + "3. Delete visit"
                + System.lineSeparator() + "4. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator() + "Enter your choice: "
                + System.lineSeparator() + "Selected: Go back" + System.lineSeparator() + "";
        visitMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp1() {
        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());
        Scanner scanner = new Scanner("1\n\n1\n\n");
        visitRepo.addVisit(new Visit(1, 1, timestamp, "Scheduled", "visit1"));
        visitRepo.addVisit(new Visit(2, 1, timestamp, "Scheduled", "visit2"));
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Visit ID: 1" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: visit1" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Visit ID: 2" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: visit2" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Manage visit for an application"
                + System.lineSeparator() + "============================================" + System.lineSeparator()
                + System.lineSeparator() + "Enter the Application ID: " + System.lineSeparator()
                + "Found Visit details for the application" + System.lineSeparator() + System.lineSeparator()
                + "-----------------------------------------" + System.lineSeparator() + "Visit ID: 1"
                + System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
                + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: visit1"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "-----------------------------------------" + System.lineSeparator() + "Visit ID: 2"
                + System.lineSeparator() + "Application ID: 1" + System.lineSeparator() + "Date and Time: " + timestamp
                + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator() + "Details: visit2"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Edit Visit" + System.lineSeparator()
                + "2. Delete Visit" + System.lineSeparator() + "3. Add new Visit" + System.lineSeparator()
                + "4. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Visit ID: 1" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: visit1" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Visit ID: 2" + System.lineSeparator() + "Application ID: 1" + System.lineSeparator()
                + "Date and Time: " + timestamp + System.lineSeparator() + "Status: Scheduled" + System.lineSeparator()
                + "Details: visit2" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        visitMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp2() {
        Scanner scanner = new Scanner("2\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Edit Visit" + System.lineSeparator()
                + "============================================" + System.lineSeparator() + System.lineSeparator()
                + "Enter Visit ID to edit: An unexpected error occurred. Please try again." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available visits are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Visits available" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Manage visit for an application"
                + System.lineSeparator() + "2. Edit visit" + System.lineSeparator() + "3. Delete visit"
                + System.lineSeparator() + "4. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        visitMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp3() {
        Scanner scanner = new Scanner("3\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Selected: Delete Visit" + System.lineSeparator()
                + "============================================" + System.lineSeparator() + System.lineSeparator()
                + "Enter Visit ID to delete: An unexpected error occurred. Please try again." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available visits are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Visits available" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Manage visit for an application"
                + System.lineSeparator() + "2. Edit visit" + System.lineSeparator() + "3. Delete visit"
                + System.lineSeparator() + "4. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        visitMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuInvalid() {
        Scanner scanner = new Scanner("69\n");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator() + "Invalid option. Please choose a valid option."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available visits are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Visits available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Manage visit for an application" + System.lineSeparator() + "2. Edit visit"
                + System.lineSeparator() + "3. Delete visit" + System.lineSeparator() + "4. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        visitMenu.displayMenu(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }
}