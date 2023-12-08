package test.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Interview;

public class InterviewTest {
	@Test
	void testInterview() {
		Interview interview = new Interview();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		interview.setInterviewId(1);
		interview.setApplicationId(1);
		interview.setDateTime(timestamp);
		interview.setStatus("status");
		interview.setType("type");
		assertEquals(1, interview.getInterviewId());
		assertEquals("status", interview.getStatus());
		assertEquals("type", interview.getType());
		assertEquals(1, interview.getApplicationId());
		assertEquals(timestamp, interview.getDateTime());
	}
	
	@Test
	void testInterviewConstructor() {
		Interview interview = new Interview(1, 1, new Timestamp(System.currentTimeMillis()), "abc", "abc");
		assertNotNull(interview);
		assertEquals(1, interview.getInterviewId());
	}
}
