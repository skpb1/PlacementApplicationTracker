package test.statementBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Timestamp;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Opportunity;

public class OpportunityTest {
	@Test
	void testOpportunity() {
		Opportunity opportunity = new Opportunity();
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		opportunity.setOpportunityId(1);
		opportunity.setAdminId(1);
		opportunity.setCloseDate(timestamp);
		opportunity.setOpenDate(timestamp);
		opportunity.setCompanyName("company");
		opportunity.setDescription("desc");
		opportunity.setLocation("loc");
		opportunity.setRole("role");
		opportunity.setSalary(2000);
		assertEquals(1, opportunity.getOpportunityId());
		assertEquals(1, opportunity.getAdminId());
		assertEquals("company", opportunity.getCompanyName());
		assertEquals("desc", opportunity.getDescription());
		assertEquals("loc", opportunity.getLocation());
		assertEquals("role", opportunity.getRole());
		assertEquals(2000, opportunity.getSalary());
		assertEquals(timestamp, opportunity.getCloseDate());
		assertEquals(timestamp, opportunity.getOpenDate());
	}

	@Test
	void testOpportunityConstructor() {
		Opportunity opportunity = new Opportunity(1, "comp", "role", "des", 2, "loc",
				new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()), 1);
		assertNotNull(opportunity);
		assertEquals(1, opportunity.getOpportunityId());
	}
}
