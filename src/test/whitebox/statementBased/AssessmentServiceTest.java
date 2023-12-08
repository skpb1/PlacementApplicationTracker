package test.whitebox.statementBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.service.AssessmentService;

class AssessmentServiceTest {

    private AssessmentService assessmentService;
    private AssessmentRepo assessmentRepo;
    private Timestamp timestamp;

    @BeforeEach
    void setup() {
        assessmentRepo = new MockAssessmentRepoImpl();
        assessmentService = new AssessmentService(assessmentRepo);
        timestamp = new Timestamp(System.currentTimeMillis());
    }

    @Test
    void testGetAssessmentsByApplicationId() {
        Assessment assessment1 = new Assessment(1, 1, timestamp, "details1", "status1");
        assessmentRepo.addAssessment(assessment1);

        Assessment assessment2 = new Assessment(2, 1, timestamp, "details2", "status2");
        assessmentRepo.addAssessment(assessment2);

        List<Assessment> assessments = assessmentService.getAssessmentsByApplicationId(1);
        assertEquals(2, assessments.size());
    }

    @Test
    void testGetAssessmentById() {
        Assessment assessment1 = new Assessment(1, 1, timestamp, "details1", "status1");
        assessmentRepo.addAssessment(assessment1);

        Assessment retrievedAssessment = assessmentService.getAssessmentById(1);
        assertEquals(assessment1, retrievedAssessment);
    }

    @Test
    void testGetAssessments() {
        Assessment assessment1 = new Assessment(1, 1, timestamp, "details1", "status1");
        assessmentRepo.addAssessment(assessment1);

        List<Assessment> assessments = assessmentService.getAssessments();
        assertEquals(1, assessments.size());
    }

    @Test
    void testAddAssessment() {
        Assessment assessment = new Assessment(1, 1, timestamp, "details", "status");
        assertTrue(assessmentService.addAssessment(assessment));
    }

    @Test
    void testUpdateAssessment() {
        Assessment originalAssessment = new Assessment(1, 1, timestamp, "details1", "status1");
        assessmentRepo.addAssessment(originalAssessment);

        Assessment updatedAssessment = new Assessment(1, 1, timestamp, "details2", "status2");
        assertTrue(assessmentService.updateAssessment(1, updatedAssessment));

        Assessment retrievedAssessment = assessmentService.getAssessmentById(1);
        assertEquals(updatedAssessment, retrievedAssessment);
    }

    @Test
    void testDeleteAssessment() {
        Assessment assessment = new Assessment(1, 1, timestamp, "details", "status");
        assessmentRepo.addAssessment(assessment);

        assertTrue(assessmentService.deleteAssessment(1));
        assertFalse(assessmentService.deleteAssessment(2));
    }
}
