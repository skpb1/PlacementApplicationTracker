package test.whitebox.statementBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Assessment;

public class AssessmentTest {
	@Test
	void testAssessment() {
		Assessment assessment = new Assessment();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		assessment.setAssessmentId(1);
		assessment.setApplicationId(1);
		assessment.setDateTime(timestamp);
		assessment.setDetails("details");
		assessment.setStatus("status");
		assertEquals(1, assessment.getAssessmentId());
		assertEquals("details", assessment.getDetails());
		assertEquals("status", assessment.getStatus());
		assertEquals(1, assessment.getApplicationId());
		assertEquals(timestamp, assessment.getDateTime());
	}
	
	@Test
	void testAssessmentConstructor() {
		Assessment assessment = new Assessment(1, 1, new Timestamp(System.currentTimeMillis()), "abc", "abc");
		assertNotNull(assessment);
		assertEquals(1, assessment.getAssessmentId());
	}

}
