package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu;

public class StudentPlacementMenuTest {
	private PlacementRepo placementRepo;
	private ApplicationRepo applicationRepo;
	private StudentPlacementMenu studentPlacementMenu;
	
	@BeforeEach
	void setup() {
		placementRepo = new MockPlacementRepoImpl();
		applicationRepo = new MockApplicationRepoImpl();
		studentPlacementMenu = new StudentPlacementMenu(placementRepo, applicationRepo);
	}
	
	@Test
	void testGoBack() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("3\n");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testInvalidOption() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator();
		Scanner scanner = new Scanner("4\n3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testOption1Empty() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Enter the ID of opportunity you want to apply: The selected Opportunity could not be found." + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("1\n1\n3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testOption1ExistingOpportunity() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Enter the ID of opportunity you want to apply: " + System.lineSeparator()
				+ "The Opportunity Details:" + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Enter the Resume Content: Enter the Cover Letter Content: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Application has been created successfully." + System.lineSeparator()
				+ System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ "An error occurred while applying for the opportunity. Please try again." + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator();
		Scanner scanner = new Scanner("1\n1\nResume\nCoverLetter");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", timestamp, timestamp,1);
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testOption1ExistingApplication() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Enter the ID of opportunity you want to apply: " + System.lineSeparator()
				+ "The Opportunity Details:" + System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ "Enter the Resume Content: Enter the Cover Letter Content: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "An application already exists for this opportunity" + System.lineSeparator()
				+ "Please press enter to continue" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("1\n1\nResume\nCoverLetter\n\n3");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", timestamp, timestamp,1);
		applicationRepo.createApplication(1, 1, "a", "a");
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testOption2Valid() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter by Company Name" + System.lineSeparator()
				+ "Enter Company Name: " + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter by Role" + System.lineSeparator()
				+ "Enter Role: " + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter by Location" + System.lineSeparator()
				+ "Enter Location: " + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter by Salary Range" + System.lineSeparator()
				+ "Enter Minimum Salary (press Enter for default 0): Enter Maximum Salary : " + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("2\n1\ncompany\n2\n2\nrole\n2\n3\nloc\n2\n4\n100\n3000\n2\n5\n3");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testOption2Invalid() {
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Invalid option. Please choose a valid option." + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("2\n6\n4\ncompany\n3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
	
	@Test
	void testOption2() {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
		String expectedOutput = System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ "------------------------------------" + System.lineSeparator()
				+ "Placement ID: 1" + System.lineSeparator()
				+ "Company Name: company" + System.lineSeparator()
				+ "Role: role" + System.lineSeparator()
				+ "Salary: 2000" + System.lineSeparator()
				+ "Location: loc" + System.lineSeparator()
				+ "Open Date: "+timestamp+System.lineSeparator()
				+ "Close Date: "+timestamp+System.lineSeparator()
				+ "Description: desc" + System.lineSeparator()
				+ "-----------------------------------------" + System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Options to filter the Opportunities" + System.lineSeparator()
				+ "1. Filter by Company Name" + System.lineSeparator()
				+ "2. Filter by Role" + System.lineSeparator()
				+ "3. Filter by Location" + System.lineSeparator()
				+ "4. Filter by Salary Range" + System.lineSeparator()
				+ "5. Go back" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ "Selected: Filter by Salary Range" + System.lineSeparator()
				+ "Enter Minimum Salary (press Enter for default 0): Enter Maximum Salary : " + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "Available opportunities are shown below" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "No Placement Opportunities available" + System.lineSeparator()
				+ System.lineSeparator()
				+ System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Please Choose an option:" + System.lineSeparator()
				+ "1. Apply for an opportunity" + System.lineSeparator()
				+ "2. Filter Opportunities" + System.lineSeparator()
				+ "3. Go back" + System.lineSeparator()
				+ "********************************************" + System.lineSeparator()
				+ "Enter your choice: " + System.lineSeparator()
				+ System.lineSeparator()
				+ "Selected: Go back" + System.lineSeparator()
				+ "";
		Scanner scanner = new Scanner("2\n4\n\n\n3");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
		System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
	}
}
