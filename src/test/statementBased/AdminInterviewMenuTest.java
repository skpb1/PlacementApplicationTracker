package test.statementBased;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.service.InterviewService;
import main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu;

public class AdminInterviewMenuTest {
    private InterviewRepo interviewRepo;
    private AdminInterviewMenu interviewMenu;

    @BeforeEach
    void setup() {
        interviewRepo = new MockInterviewRepoImpl();
        new InterviewService(interviewRepo);
        interviewMenu = new AdminInterviewMenu(interviewRepo);
    }

    @Test
    void testDisplayMenu() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n");
        interviewMenu.displayMenu(scanner);
    }

    @Test
    void testManageInterviewForApplication() {
        Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
        interviewMenu.manageInterviewForApplication(scanner, 1);
    }
    
    @Test
    void testHandleNoInterview() {
        Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
        interviewMenu.handleNoInterview(1, scanner);
    }

    @Test
    void testHandleExistingInterview() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n");
        List<Interview> interviewList = List.of(
                new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"),
                new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR")
        );
        interviewMenu.handleExistingInterview(interviewList, 1, scanner);
    }

    @Test
    void testAddInterviewForApplication() {
        Scanner scanner = new Scanner("Technical\n2023-12-31 12:00:00\n");
        interviewMenu.addInterviewForApplication(1, scanner);
    }

    @Test
    void testEditInterview() throws ParseException {
        Scanner scanner = new Scanner("2023-12-31 12:00:00\nUpdated\nTechnical\n");
        Interview existingInterview = new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical");
        interviewMenu.editInterview(existingInterview, scanner);
    }

    @Test
    void testDeleteInterview() {
        Scanner scanner = new Scanner("Y\n");
        Interview existingInterview = new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical");
        interviewMenu.deleteInterview(existingInterview, scanner);
    }

    @Test
    void testEditInterviewOption() {
        Scanner scanner = new Scanner("1\n");
        interviewMenu.editInterviewOption(scanner);
    }

    @Test
    void testDeleteInterviewOption() {
        Scanner scanner = new Scanner("1\n");
        interviewMenu.deleteInterviewOption(scanner);
    }

    @Test
    void testValidateTimestampInput() {
        Scanner scanner = new Scanner("2023-12-31 12:00:00\n");
        LocalDateTime dateTime = interviewMenu.validateTimestampInput(scanner, "Enter timestamp: ");
        System.out.println(dateTime);
    }
}
