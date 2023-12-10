package test.blackbox.specificationBased;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;
import main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu;

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
    void testOption1() {
        Scanner scanner = new Scanner("1\n\n1\n\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_1() {
        Scanner scanner = new Scanner("1\n\n1\n\n1\n1\n2023-12-31 12:00:00\nUpdated Status\nUpdated Details\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_2() {
        Scanner scanner = new Scanner("1\n\n1\n\n2\n1\nY\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_2_No() {
        Scanner scanner = new Scanner("1\n\n1\n\n2\n1\nN\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_3() {
        Scanner scanner = new Scanner("1\n\n1\n\n3\n2023-12-31 12:00:00\nnew assessment\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_4() {
        Scanner scanner = new Scanner("1\n\n1\n\n4\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_Invalid() {
        Scanner scanner = new Scanner("1\n\n1\n\n99\n");
        assessmentRepo.addAssessment(new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass1"));
        assessmentRepo.addAssessment(new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ass2"));
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_1_1() {
        Scanner scanner = new Scanner("1\n\n1\n\n1\n2023-12-31 12:00:00\nnew assessment\n");
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption1_1_2() {
        Scanner scanner = new Scanner("1\n\n1\n\n2\n");
        assessmentMenu.displayMenu(scanner);
    }
    
    
    @Test
    void testOption2() {
        Scanner scanner = new Scanner("2\n");
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testOption3() {
        Scanner scanner = new Scanner("3\n");
        assessmentMenu.displayMenu(scanner);
    }
    
    @Test
    void testDisplayMenuInvalid() {
        Scanner scanner = new Scanner("69\n");
        assessmentMenu.displayMenu(scanner);
    }

    @Test
    void testDisplayMenu() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n");
        assessmentMenu.displayMenu(scanner);
    }

    @Test
    void testManageAssessmentForApplication() {
        Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
        assessmentMenu.manageAssessmentForApplication(scanner, 1);
    }

    @Test
    void testHandleNoAssessment() {
        Scanner scanner = new Scanner("1\nTechnical\n2023-12-31 12:00:00\n");
        assessmentMenu.handleNoAssessment(1, scanner);
    }

    @Test
    void testExistingAssessment() {
        Scanner scanner = new Scanner("1\n2\n3\n4\n");
        List<Assessment> assessmentList = List.of(
                new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical"),
                new Assessment(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "HR")
        );
        assessmentMenu.handleExistingAssessment(assessmentList, 1, scanner);
    }

    @Test
    void testAddAssessment() {
        Scanner scanner = new Scanner("Technical\n2023-12-31 12:00:00\n");
        assessmentMenu.addAssessmentForApplication(1, scanner);
    }

    @Test
    void testEditAssessment() throws ParseException {
        Scanner scanner = new Scanner("2023-12-31 12:00:00\nUpdated\nTechnical Details\n");
        Assessment existingAssessment = new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical");
        assessmentMenu.editAssessment(existingAssessment, scanner);
    }

    @Test
    void testDeleteAssessment() {
        Scanner scanner = new Scanner("Y\n");
        Assessment existingAssessment = new Assessment(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "Technical");
        assessmentMenu.deleteAssessment(existingAssessment, scanner);
    }

    @Test
    void testEditAssessmentOption() {
        Scanner scanner = new Scanner("1\n");
        assessmentMenu.editAssessmentOption(scanner);
    }

    @Test
    void testDeleteAssessmentOption() {
        Scanner scanner = new Scanner("1\n");
        assessmentMenu.deleteAssessmentOption(scanner);
    }

    @Test
    void testValidateTimestampInput() {
        Scanner scanner = new Scanner("2023-12-31 12:00:00\n");
        LocalDateTime dateTime = assessmentMenu.validateTimestampInput(scanner, "Enter timestamp: ");
        System.out.println(dateTime);
    }
}
