package test.blackbox.specificationBased;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Timestamp;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.service.InterviewService;

public class InterviewServiceTest {
	private InterviewService interviewService;
    private InterviewRepo interviewRepository;
    private Timestamp timestamp;

    @BeforeEach
    public void setUp() {
        interviewRepository = new MockInterviewRepoImpl();
        interviewService = new InterviewService(interviewRepository);
        timestamp = new Timestamp(System.currentTimeMillis());
    }
    
    @Test
    public void testGetAllInterviews() {
    	List<Interview> interviews = interviewService.getInterviews();
        assertEquals(0, interviews.size());

        Interview interview1 = new Interview(1, 1, timestamp, "Scheduled", "Details");
        Interview interview2 = new Interview(2, 1, timestamp, "Completed", "Details");

        interviewRepository.addInterview(interview1);
        interviewRepository.addInterview(interview2);

        interviews = interviewService.getInterviews();
        assertEquals(2, interviews.size());
    }
    
    @Test
    public void testGetInterviewById() {
    	Interview interview = interviewService.getInterviewById(1);
    	assertEquals(null, interview);
    	
    	Interview interview1 = new Interview(1, 1, timestamp, "Scheduled", "Details");
    	
    	interviewRepository.addInterview(interview1);
    	
    	interview = interviewService.getInterviewById(1);
    	assertNotNull(interview);
    }
    
    @Test
    public void testGetInterviewsByApplicationId() {
    	List<Interview> interviews = interviewService.getInterviewsByApplicationId(1);
    	assertEquals(0, interviews.size());
    	
    	Interview interview1 = new Interview(1, 1, timestamp, "Scheduled", "Details");
    	
    	interviewRepository.addInterview(interview1);
    	
    	interviews = interviewService.getInterviewsByApplicationId(1);
    	assertEquals(1, interviews.size());
    }
    
    @Test
    public void testAddInterview() {
    	Interview interview1 = new Interview(1, 1, timestamp, "Scheduled", "Details");
    	
    	boolean isAdded = interviewService.addInterview(interview1);
    	assertTrue(isAdded);
    }
    
    @Test
    public void testUpdateInterview() {
    	Interview interview1 = new Interview(1, 1, timestamp, "Scheduled", "Details");
    	
    	interviewRepository.addInterview(interview1);
    	
    	Interview interview2 = new Interview(1, 1, timestamp, "Scheduled 2", "Details 2");
    	
    	boolean isUpdated = interviewService.updateInterview(1, interview2);
    	assertTrue(isUpdated);
    }
    
    @Test
    public void testDeleteInterview() {
    	Interview interview1 = new Interview(1, 1, timestamp, "Scheduled", "Details");
    	
    	interviewRepository.addInterview(interview1);
    	boolean isDeleted= interviewService.deleteInterview(1);
    	assertTrue(isDeleted);
    }
}
