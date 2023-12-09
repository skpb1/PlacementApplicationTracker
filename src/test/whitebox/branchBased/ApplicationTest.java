package test.whitebox.branchBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Application;

public class ApplicationTest {
	@Test
	void testApplication() {
		Application application = new Application();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		application.setApplicationId(1);
		application.setCoverLetter("cover");
		application.setOpportunityId(1);
		application.setResume("resume");
		application.setStatus("status");
		application.setStudentId(1);
		application.setSubmissionDate(timestamp);
		application.setWithdrawn(0);
		assertEquals(1, application.getApplicationId());
		assertEquals("cover", application.getCoverLetter());
		assertEquals("resume", application.getResume());
		assertEquals("status", application.getStatus());
		assertEquals(1, application.getOpportunityId());
		assertEquals(1, application.getStudentId());
		assertEquals(timestamp, application.getSubmissionDate());
		assertEquals(0, application.getWithdrawn());
	}
	
	@Test
	void testApplicationConstructor() {
		Application application = new Application(1, 1, 1, "status", new Timestamp(System.currentTimeMillis()), 0, "abc", "abc");
		assertNotNull(application);
		assertEquals(1, application.getApplicationId());
	}
}
