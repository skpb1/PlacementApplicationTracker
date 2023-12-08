package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Visit;

public class VisitTest {
	@Test
	void testVisit() {
		Visit visit = new Visit();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		visit.setVisitId(1);
		visit.setApplicationId(1);
		visit.setDateTime(timestamp);
		visit.setStatus("status");
		visit.setDetails("details");
		assertEquals(1, visit.getVisitId());
		assertEquals("status", visit.getStatus());
		assertEquals("details", visit.getDetails());
		assertEquals(1, visit.getApplicationId());
		assertEquals(timestamp, visit.getDateTime());
	}
	
	@Test
	void testVisitConstructor() {
		Visit visit = new Visit(1, 1, new Timestamp(System.currentTimeMillis()), "abc", "abc");
		assertNotNull(visit);
		assertEquals(1, visit.getVisitId());
	}
}
