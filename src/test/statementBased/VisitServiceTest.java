package test.statementBased;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.VisitService;

class VisitServiceTest {
	private VisitService visitService;
    private VisitRepo visitRepository;
    private Timestamp timestamp;

    @BeforeEach
    public void setUp() {
        visitRepository = new MockVisitRepoImpl();
        visitService = new VisitService(visitRepository);
        timestamp = new Timestamp(System.currentTimeMillis());
    }
    
    @Test
    public void testGetAllVisits() {
    	List<Visit> visits = visitService.getVisits();
        assertEquals(0, visits.size());

        Visit visit1 = new Visit(1, 1, timestamp, "Scheduled", "Details");
        Visit visit2 = new Visit(2, 1, timestamp, "Completed", "Details");

        visitRepository.addVisit(visit1);
        visitRepository.addVisit(visit2);

        visits = visitService.getVisits();
        assertEquals(2, visits.size());
    }
    
    @Test
    public void testGetVisitById() {
    	Visit visit = visitService.getVisitById(1);
    	assertEquals(null, visit);
    	
    	Visit visit1 = new Visit(1, 1, timestamp, "Scheduled", "Details");
    	
    	visitRepository.addVisit(visit1);
    	
    	visit = visitService.getVisitById(1);
    	assertTrue(new ReflectionEquals(visit).matches(visit1));
    }
    
    @Test
    public void testGetVisitsByApplicationId() {
    	List<Visit> visits = visitService.getVisitsByApplicationId(1);
    	assertEquals(0, visits.size());
    	
    	Visit visit1 = new Visit(1, 1, timestamp, "Scheduled", "Details");
    	
    	visitRepository.addVisit(visit1);
    	
    	visits = visitService.getVisitsByApplicationId(1);
    	assertEquals(1, visits.size());
    }
    
    @Test
    public void testAddVisit() {
    	Visit visit1 = new Visit(1, 1, timestamp, "Scheduled", "Details");
    	
//    	visitRepository.addVisit(visit1);
    	boolean isAdded = visitService.addVisit(visit1);
    	assertTrue(isAdded);
    }
    
    @Test
    public void testUpdateVisit() {
    	Visit visit1 = new Visit(1, 1, timestamp, "Scheduled", "Details");
    	
    	visitRepository.addVisit(visit1);
    	
    	Visit visit2 = new Visit(1, 1, timestamp, "Scheduled 2", "Details 2");
    	
//    	visitRepository.updateVisit(1, visit2);
    	boolean isUpdated = visitService.updateVisit(1, visit2);
    	assertTrue(isUpdated);
    }
    
    @Test
    public void testDeleteVisit() {
    	Visit visit1 = new Visit(1, 1, timestamp, "Scheduled", "Details");
    	
    	visitRepository.addVisit(visit1);
    	
//    	Visit visit2 = new Visit(1, 1, timestamp, "Scheduled 2", "Details 2");
    	
//    	visitRepository.deleteVisit(1);
    	boolean isDeleted= visitService.deleteVisit(1);
    	assertTrue(isDeleted);
    }
}
