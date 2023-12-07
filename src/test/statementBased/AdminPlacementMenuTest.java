package test.statementBased;

import java.time.LocalDateTime;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.service.PlacementService;
import main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu;

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
    void testDisplayMenu() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n5\n");
        placementMenu.displayMenu(1, scanner);
    }

    @Test
    void testAddNewOpportunity() {
        Scanner scanner = new Scanner("CompanyX\nSoftware Engineer\nExciting role\n70000\nLocationX\n2023-12-31 12:00:00\n2024-01-31 12:00:00\n");
        placementMenu.addNewOpportunity(1, scanner);
    }

    @Test
    void testEditOpportunity() {
        Scanner scanner = new Scanner("1\nCompanyX\nUpdated Role\nUpdated Description\n80000\nUpdated Location\n2023-12-31 12:00:00\n2024-02-28 12:00:00\n");
        placementMenu.editOpportunity(1, scanner);
    }

    @Test
    void testDeleteOpportunity() {
        Scanner scanner = new Scanner("1\nY\n");
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
    }

    @Test
    void testValidateTimestampInput() {
        Scanner scanner = new Scanner("2023-12-31 12:00:00\n");
        LocalDateTime dateTime = placementMenu.validateTimestampInput(scanner, "Enter timestamp: ");
        System.out.println(dateTime);
    }
}
