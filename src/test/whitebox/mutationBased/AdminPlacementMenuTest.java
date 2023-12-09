package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.service.PlacementService;
import main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu;
import main.java.placementApplicationTracker.model.Opportunity;

public class AdminPlacementMenuTest {
    private PlacementRepo placementRepo;
    private AdminPlacementMenu placementMenu;

    @BeforeEach
    void setup() {
        placementRepo = new MockPlacementRepoImpl();
        new PlacementService(placementRepo);
        placementMenu = new AdminPlacementMenu(placementRepo);
    }

    @Test
    void testDisplayMenuOp1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Placement Opportunities available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator()
                + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator()
                + "5. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: " + System.lineSeparator()
                + "Enter Company Name: Enter Role: Enter Description: Enter Salary: Enter Location: Enter Open Date (YYYY-MM-DD HH:mm:ss): Enter Close Date (YYYY-MM-DD HH:mm:ss): Opportunity added successfully."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 0"
                + System.lineSeparator() + "Company Name: CompanyX" + System.lineSeparator() + "Role: Software Engineer"
                + System.lineSeparator() + "Salary: 70000" + System.lineSeparator() + "Location: LocationX"
                + System.lineSeparator() + "Open Date: 2023-12-31 12:00:00.0" + System.lineSeparator()
                + "Close Date: 2024-01-31 12:00:00.0" + System.lineSeparator() + "Description: Exciting role"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Add new opportunity"
                + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator() + "3. Delete opportunity"
                + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator() + "5. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        Scanner scanner = new Scanner(
                "1\nCompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        placementMenu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: company" + System.lineSeparator() + "Role: role"
                + System.lineSeparator() + "Salary: 2000" + System.lineSeparator() + "Location: loc"
                + System.lineSeparator() + "Open Date: 2023-12-31 12:00:00.0" + System.lineSeparator()
                + "Close Date: 2024-01-31 12:00:00.0" + System.lineSeparator() + "Description: desc"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Add new opportunity"
                + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator() + "3. Delete opportunity"
                + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator() + "5. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator()
                + "Enter Opportunity ID to edit: Existing Opportunity Details:" + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: company" + System.lineSeparator() + "Role: role"
                + System.lineSeparator() + "Salary: 2000" + System.lineSeparator() + "Location: loc"
                + System.lineSeparator() + "Open Date: 2023-12-31 12:00:00.0" + System.lineSeparator()
                + "Close Date: 2024-01-31 12:00:00.0" + System.lineSeparator() + "Description: desc"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Enter updated Company Name: Enter updated Role: Enter updated Description: Enter updated Salary: Enter updated Location: Enter updated Open Date (YYYY-MM-DD HH:mm:ss): Enter updated Close Date (YYYY-MM-DD HH:mm:ss): Opportunity updated successfully."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: CompanyX" + System.lineSeparator() + "Role: Software Engineer"
                + System.lineSeparator() + "Salary: 70000" + System.lineSeparator() + "Location: LocationX"
                + System.lineSeparator() + "Open Date: 2023-12-31 12:00:00.0" + System.lineSeparator()
                + "Close Date: 2024-01-31 12:00:00.0" + System.lineSeparator() + "Description: Exciting role"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Add new opportunity"
                + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator() + "3. Delete opportunity"
                + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator() + "5. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        Scanner scanner = new Scanner(
                "2\n1\nCompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc",
                Timestamp.valueOf("2023-12-31 12:00:00"), Timestamp.valueOf("2024-01-31 12:00:00"), 1);
        placementRepo.addOpportunity(opportunity);
        placementMenu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp3() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: company" + System.lineSeparator() + "Role: role"
                + System.lineSeparator() + "Salary: 2000" + System.lineSeparator() + "Location: loc"
                + System.lineSeparator() + "Open Date: 2023-12-31 12:00:00.0" + System.lineSeparator()
                + "Close Date: 2023-12-31 12:00:00.0" + System.lineSeparator() + "Description: desc"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Add new opportunity"
                + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator() + "3. Delete opportunity"
                + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator() + "5. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator()
                + "Enter Opportunity ID to delete: Existing Opportunity Details:" + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: company" + System.lineSeparator() + "Role: role"
                + System.lineSeparator() + "Salary: 2000" + System.lineSeparator() + "Location: loc"
                + System.lineSeparator() + "Open Date: 2023-12-31 12:00:00.0" + System.lineSeparator()
                + "Close Date: 2023-12-31 12:00:00.0" + System.lineSeparator() + "Description: desc"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Are you sure you want to delete this opportunity (Y/N): Opportunity deleted successfully."
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Placement Opportunities available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator()
                + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator()
                + "5. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
                + System.lineSeparator() + "";
        Scanner scanner = new Scanner("3\n1\nY\n");
        Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc",
                Timestamp.valueOf("2023-12-31 12:00:00"), Timestamp.valueOf("2023-12-31 12:00:00"), 1);
        placementRepo.addOpportunity(opportunity);
        placementMenu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp3Else() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: company" + System.lineSeparator() + "Role: role"
                + System.lineSeparator() + "Salary: 2000" + System.lineSeparator() + "Location: loc"
                + System.lineSeparator() + "Open Date: 2023-01-01 00:00:00.0" + System.lineSeparator()
                + "Close Date: 2023-01-01 00:00:00.0" + System.lineSeparator() + "Description: desc"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Please Choose an option:" + System.lineSeparator() + "1. Add new opportunity"
                + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator() + "3. Delete opportunity"
                + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator() + "5. Go back"
                + System.lineSeparator() + "********************************************" + System.lineSeparator()
                + "Enter your choice: " + System.lineSeparator()
                + "Enter Opportunity ID to delete: Existing Opportunity Details:" + System.lineSeparator()
                + "------------------------------------" + System.lineSeparator() + "Placement ID: 1"
                + System.lineSeparator() + "Company Name: company" + System.lineSeparator() + "Role: role"
                + System.lineSeparator() + "Salary: 2000" + System.lineSeparator() + "Location: loc"
                + System.lineSeparator() + "Open Date: 2023-01-01 00:00:00.0" + System.lineSeparator()
                + "Close Date: 2023-01-01 00:00:00.0" + System.lineSeparator() + "Description: desc"
                + System.lineSeparator() + "-----------------------------------------" + System.lineSeparator()
                + "Are you sure you want to delete this opportunity (Y/N): Deletion canceled." + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "All Available opportunities are shown below"
                + System.lineSeparator() + System.lineSeparator() + "------------------------------------"
                + System.lineSeparator() + "Placement ID: 1" + System.lineSeparator() + "Company Name: company"
                + System.lineSeparator() + "Role: role" + System.lineSeparator() + "Salary: 2000"
                + System.lineSeparator() + "Location: loc" + System.lineSeparator() + "Open Date: 2023-01-01 00:00:00.0"
                + System.lineSeparator() + "Close Date: 2023-01-01 00:00:00.0" + System.lineSeparator()
                + "Description: desc" + System.lineSeparator() + "-----------------------------------------"
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator()
                + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator()
                + "5. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: An unexpected error occurred. Please try again."
                + System.lineSeparator() + "";
        Scanner scanner = new Scanner("3\n1\nN\n");
        Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc",
                Timestamp.valueOf("2023-01-01 00:00:00"), Timestamp.valueOf("2023-01-01 00:00:00"), 1);
        placementRepo.addOpportunity(opportunity);
        placementMenu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayMenuOp4() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Placement Opportunities available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator()
                + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator()
                + "5. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: " + System.lineSeparator()
                + "Options to filter the Opportunities" + System.lineSeparator() + "1. Filter by Company Name"
                + System.lineSeparator() + "2. Filter by Role" + System.lineSeparator() + "3. Filter by Location"
                + System.lineSeparator() + "4. Filter by Salary Range" + System.lineSeparator() + "5. Go back"
                + System.lineSeparator() + "Enter your choice: " + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available opportunities are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Placement Opportunities available"
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "********************************************" + System.lineSeparator() + "Please Choose an option:"
                + System.lineSeparator() + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity"
                + System.lineSeparator() + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities"
                + System.lineSeparator() + "5. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator()
                + "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator() + "";
        Scanner scanner = new Scanner("4\n5\n");
        placementMenu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testAddNewOpportunity() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Enter Company Name: Enter Role: Enter Description: Enter Salary: An error occurred while adding a new opportunity. Please try again."
                + System.lineSeparator() + "";
        Scanner scanner = new Scanner(
                "CompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        placementMenu.addNewOpportunity(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditOpportunityEx() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Enter Opportunity ID to edit: An error occurred while editing the opportunity. Please try again."
                + System.lineSeparator() + "";
        Scanner scanner = new Scanner(
                "E\nCompanyX\nUpdated Role\nUpdated Description\nSalary\nUpdated Location\n2023-12-31 12:00:00\n2024-02-28 12:00:00\n");
        placementMenu.editOpportunity(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDeleteOpportunityEx() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Enter Opportunity ID to delete: An error occurred while deleting the opportunity. Please try again."
                + System.lineSeparator() + "";
        Scanner scanner = new Scanner("E\nY\n");
        placementMenu.deleteOpportunity(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testFilterOpportunities() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Options to filter the Opportunities" + System.lineSeparator()
                + "1. Filter by Company Name" + System.lineSeparator() + "2. Filter by Role" + System.lineSeparator()
                + "3. Filter by Location" + System.lineSeparator() + "4. Filter by Salary Range"
                + System.lineSeparator() + "5. Go back" + System.lineSeparator() + "Enter your choice: "
                + System.lineSeparator() + "Selected: Filter by Company Name" + System.lineSeparator()
                + "Enter Company Name: ";
        Scanner scanner = new Scanner("1\nCompanyX\n2\nRoleY\n3\nLocationZ\n4\n\n50000\n80000\n5\n");
        placementMenu.filterOpportunities(scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testHandleFilterOption() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + "Selected: Filter by Company Name" + System.lineSeparator()
                + "Enter Company Name: " + System.lineSeparator() + "Selected: Filter by Role" + System.lineSeparator()
                + "Enter Role: " + System.lineSeparator() + "Selected: Filter by Location" + System.lineSeparator()
                + "Enter Location: " + System.lineSeparator() + "Selected: Filter by Salary Range"
                + System.lineSeparator() + "Enter Minimum Salary (press Enter for default 0): Enter Maximum Salary : "
                + System.lineSeparator() + "Invalid option. Please choose a valid option." + System.lineSeparator()
                + System.lineSeparator() + "";
        Scanner scanner = new Scanner("1\nCompanyX\n2\nRoleY\n3\nLocationZ\n4\n\n50000\n80000\n5\n");
        placementMenu.handleFilterOption(1, scanner);
        placementMenu.handleFilterOption(2, scanner);
        placementMenu.handleFilterOption(3, scanner);
        placementMenu.handleFilterOption(4, scanner);
        placementMenu.handleFilterOption(5, scanner);
        placementMenu.handleFilterOption(6, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testHandleFilterOption1() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + "Selected: Filter by Salary Range" + System.lineSeparator()
                + "Enter Minimum Salary (press Enter for default 0): Enter Maximum Salary : ";
        Scanner scanner1 = new Scanner("\n\n\n80000\n");
        placementMenu.handleFilterOption(4, scanner1);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testHandleFilterOption2() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + "Selected: Filter by Salary Range" + System.lineSeparator()
                + "Enter Minimum Salary (press Enter for default 0): Enter Maximum Salary : ";
        Scanner scanner2 = new Scanner("\n50000\n\n\n");
        placementMenu.handleFilterOption(4, scanner2);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testInvalidOption() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "All Available opportunities are shown below" + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "No Placement Opportunities available" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Please Choose an option:" + System.lineSeparator()
                + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity" + System.lineSeparator()
                + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities" + System.lineSeparator()
                + "5. Go back" + System.lineSeparator() + "********************************************"
                + System.lineSeparator() + "Enter your choice: " + System.lineSeparator()
                + "Invalid option. Please choose a valid option." + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + System.lineSeparator() + "All Available opportunities are shown below" + System.lineSeparator()
                + System.lineSeparator() + System.lineSeparator() + "No Placement Opportunities available"
                + System.lineSeparator() + System.lineSeparator() + System.lineSeparator()
                + "********************************************" + System.lineSeparator() + "Please Choose an option:"
                + System.lineSeparator() + "1. Add new opportunity" + System.lineSeparator() + "2. Edit opportunity"
                + System.lineSeparator() + "3. Delete opportunity" + System.lineSeparator() + "4. Filter Opportunities"
                + System.lineSeparator() + "5. Go back" + System.lineSeparator()
                + "********************************************" + System.lineSeparator() + "Enter your choice: "
                + System.lineSeparator() + "Selected: Go back" + System.lineSeparator() + "";
        Scanner scanner = new Scanner("6\n5\n");
        placementMenu.displayMenu(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testInvalidDateInput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Enter timestamp: Invalid date and time format. Please enter in the format YYYY-MM-DD HH:mm:ss"
                + System.lineSeparator() + "Enter timestamp: 2023-12-31T12:00" + System.lineSeparator() + "";
        Scanner scanner = new Scanner("invalidDate\n2023-12-31 12:00:00\n");
        LocalDateTime dateTime = placementMenu.validateTimestampInput(scanner, "Enter timestamp: ");
        System.out.println(dateTime);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testOpportunityNotFound() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Enter Opportunity ID to edit: Opportunity not found." + System.lineSeparator() + "";
        Scanner scanner = new Scanner("9999\n");
        placementMenu.editOpportunity(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testCancelledDeletion() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        String expectedOutput = "Enter Opportunity ID to delete: Opportunity not found." + System.lineSeparator() + "";
        Scanner scanner = new Scanner("1\nN\n");
        placementMenu.deleteOpportunity(1, scanner);
        System.setOut(originalOut);
        assertEquals(expectedOutput, outContent.toString());
    }
}