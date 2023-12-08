package test.branchBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Feedback;

public class FeedbackTest {
	@Test
	void testFeedback() {
		Feedback feedback = new Feedback();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		feedback.setFeedbackId(1);
		feedback.setApplicationId(1);
		feedback.setDateTime(timestamp);
		feedback.setComments("comments");
		assertEquals(1, feedback.getFeedbackId());
		assertEquals("comments", feedback.getComments());
		assertEquals(1, feedback.getApplicationId());
		assertEquals(timestamp, feedback.getDateTime());
	}
	
	@Test
	void testFeedbackConstructor() {
		Feedback feedback = new Feedback(1, 1, "abc", new Timestamp(System.currentTimeMillis()));
		assertNotNull(feedback);
		assertEquals(1, feedback.getFeedbackId());
	}
}
