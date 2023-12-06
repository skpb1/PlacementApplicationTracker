package test.statementBased;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.service.PlacementService;

class PlacementServiceTest {
	private PlacementService placementService;
	private PlacementRepo placementRepo;
	Timestamp timestamp;

	@BeforeEach
	void setup() {
		placementRepo = new MockPlacementRepoImpl();
		placementService = new PlacementService(placementRepo);
		timestamp = new Timestamp(System.currentTimeMillis());
	}

	@Test
	void testGetOpportunities() {
		Opportunity opportunity = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity);
		
		List<Opportunity> opportunities = placementService.getOpportunities();
		assertTrue(opportunities.size() == 1);
	}
	
	@Test
	void testaddOpportunity() {
		Opportunity opportunity = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		boolean isAdded = placementService.addOpportunity(opportunity);
		assertTrue(isAdded);
	}
	
	@Test
	void testupdateOpportunity() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		Opportunity opportunity2 = new Opportunity(1, "abcd", "roles", "descr", 20000, "locc", timestamp, timestamp, 1);
		
		boolean isUpdated = placementService.updateOpportunity(1, opportunity2);
		assertTrue(isUpdated);
	}
	
	@Test
	void testdeleteOpportunity() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		
		boolean isDeleted = placementService.deleteOpportunity(1);
		assertTrue(isDeleted);
	}
	
	@Test
	void testgetOpportunity() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		
		Opportunity opportunity2 = placementService.getOpportunityById(1);
		assertTrue(opportunity1.equals(opportunity2));
	}
	
	@Test
	void testgetOpportunitiesByCompName() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		
		List<Opportunity> opportunities = placementService.getOpportunitiesByCompanyName("abc");
		assertTrue(opportunities.size() == 1);
	}
	
	@Test
	void testgetOpportunitiesByRole() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		
		List<Opportunity> opportunities = placementService.getOpportunitiesByRole("role");
		assertTrue(opportunities.size() == 1);
	}
	
	@Test
	void testgetOpportunitiesByLocation() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		
		List<Opportunity> opportunities = placementService.getOpportunitiesByLocation("loc");
		assertTrue(opportunities.size() == 1);
	}
	
	@Test
	void testgetOpportunitiesBySalary() {
		Opportunity opportunity1 = new Opportunity(1, "abc", "role", "desc", 2000, "loc", timestamp, timestamp, 1);
		
		placementRepo.addOpportunity(opportunity1);
		
		List<Opportunity> opportunities = placementService.getOpportunitiesBySalaryRange(1000, 3000);
		assertTrue(opportunities.size() == 1);
	}

}
