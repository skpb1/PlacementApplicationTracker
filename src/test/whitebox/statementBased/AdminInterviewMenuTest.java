package test.whitebox.statementBased;

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
    void testDisplayMenuOp1() {
        Scanner scanner = new Scanner("1\n\n1\n\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1c1() {
        Scanner scanner = new Scanner("1\n\n1\n\n1\n1\n2023-12-31 12:00:00\nUpdated Status\nUpdated Details\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1c2() {
        Scanner scanner = new Scanner("1\n\n1\n\n2\n1\nY\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1c2No() {
        Scanner scanner = new Scanner("1\n\n1\n\n2\n1\nN\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1c3() {
        Scanner scanner = new Scanner("1\n\n1\n\n3\nTech round2\n2023-12-31 12:00:00\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1c4() {
        Scanner scanner = new Scanner("1\n\n1\n\n4\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1cInvalid() {
        Scanner scanner = new Scanner("1\n\n1\n\n99\n");
        interviewRepo.addInterview(new Interview(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"));
        interviewRepo.addInterview(new Interview(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR"));
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1nC1() {
        Scanner scanner = new Scanner("1\n\n1\n\n1\n2023-12-31 12:00:00\nTechnical\n");
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1nC1Invalid() {
        Scanner scanner = new Scanner("1\n\n1\n\n1\n2023-12-31\n2023-12-31 12:00:00\nTechnical\n");
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp1nC2() {
        Scanner scanner = new Scanner("1\n\n1\n\n2\n");
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp2() {
        Scanner scanner = new Scanner("2\n");
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuOp3() {
        Scanner scanner = new Scanner("3\n");
        interviewMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuInvalid() {
        Scanner scanner = new Scanner("69\n");
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
