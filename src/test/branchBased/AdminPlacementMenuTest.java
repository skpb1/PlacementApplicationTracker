package test.branchBased;

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
        Scanner scanner = new Scanner("1\nCompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        placementMenu.displayMenu(1, scanner);
    }
    
    @Test
    void testDisplayMenuOp2() {
        Scanner scanner = new Scanner("2\n1\nCompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		placementRepo.addOpportunity(opportunity);		
        placementMenu.displayMenu(1, scanner);
    }
    
    @Test
    void testDisplayMenuOp3() {
        Scanner scanner = new Scanner("3\n1\nY\n");
        Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		placementRepo.addOpportunity(opportunity);
        placementMenu.displayMenu(1, scanner);
    }
    
    @Test
    void testDisplayMenuOp3Else() {
        Scanner scanner = new Scanner("3\n1\nN\n");
        Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		placementRepo.addOpportunity(opportunity);
        placementMenu.displayMenu(1, scanner);
    }
    
    @Test
    void testDisplayMenuOp4() {
        Scanner scanner = new Scanner("4\n5\n");
        placementMenu.displayMenu(1, scanner);
    }

    @Test
    void testAddNewOpportunity() {
        Scanner scanner = new Scanner("CompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        placementMenu.addNewOpportunity(1, scanner);
    }

    @Test
    void testEditOpportunityEx() {
        Scanner scanner = new Scanner("E\nCompanyX\nUpdated Role\nUpdated Description\nSalary\nUpdated Location\n2023-12-31 12:00:00\n2024-02-28 12:00:00\n");
        placementMenu.editOpportunity(1, scanner);
    }

    @Test
    void testDeleteOpportunityEx() {
        Scanner scanner = new Scanner("E\nY\n");
        placementMenu.deleteOpportunity(1, scanner);
    }

    @Test
    void testFilterOpportunities() {
        Scanner scanner = new Scanner("1\nCompanyX\n2\nRoleY\n3\nLocationZ\n4\n\n50000\n80000\n5\n");
        placementMenu.filterOpportunities(scanner);
    }

    @Test
    void testHandleFilterOption() {
        Scanner scanner = new Scanner("1\nCompanyX\n2\nRoleY\n3\nLocationZ\n4\n\n50000\n80000\n5\n");
        placementMenu.handleFilterOption(1, scanner);
        placementMenu.handleFilterOption(2, scanner);
        placementMenu.handleFilterOption(3, scanner);
        placementMenu.handleFilterOption(4, scanner);
        placementMenu.handleFilterOption(5, scanner);
        placementMenu.handleFilterOption(6, scanner);
    }
    
    @Test
    void testHandleFilterOption1() {
        Scanner scanner1 = new Scanner("\n\n\n80000\n");
        placementMenu.handleFilterOption(4, scanner1);  
    }
     
    @Test
    void testHandleFilterOption2() {
        Scanner scanner2 = new Scanner("\n50000\n\n\n");
        placementMenu.handleFilterOption(4, scanner2);  
    }
    
    @Test
    void testInvalidOption() {
        Scanner scanner = new Scanner("6\n5\n");
        placementMenu.displayMenu(1, scanner);
    }

    @Test
    void testInvalidDateInput() {
        Scanner scanner = new Scanner("invalidDate\n2023-12-31 12:00:00\n");
        LocalDateTime dateTime = placementMenu.validateTimestampInput(scanner, "Enter timestamp: ");
        System.out.println(dateTime);
    }

    @Test
    void testOpportunityNotFound() {
        Scanner scanner = new Scanner("9999\n");
        placementMenu.editOpportunity(1, scanner);
    }

    @Test
    void testCancelledDeletion() {
        Scanner scanner = new Scanner("1\nN\n");
        placementMenu.deleteOpportunity(1, scanner);
    }
}
