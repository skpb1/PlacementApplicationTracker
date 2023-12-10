package test.blackbox.specificationBased;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Feedback;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.service.FeedbackService;

class FeedbackServiceTest {

	private FeedbackService feedbackService;
    private FeedbackRepo feedbackRepository;

    @BeforeEach
    public void setUp() {
        feedbackRepository = new MockFeedbackRepoImpl();
        feedbackService = new FeedbackService(feedbackRepository);
    }
    
    @Test
    public void testGetFeedbackById() {
    	Feedback feedback = feedbackService.getFeedbackByFeedbackId(1);
    	assertEquals(null, feedback);
    	
    	feedbackRepository.addFeedback(1, "comments");
    	
    	feedback = feedbackService.getFeedbackByFeedbackId(1);
    	assertEquals(1, feedback.getFeedbackId());
    	assertEquals("comments", feedback.getComments());
    }
    
    @Test
    public void testGetFeedbacksByApplicationId() {
    	List<Feedback> feedbacks = feedbackService.getFeedbacksByApplicationId(1);
    	assertEquals(0, feedbacks.size());
    	
    	
    	feedbackRepository.addFeedback(1, "comments");
    	
    	feedbacks = feedbackService.getFeedbacksByApplicationId(1);
    	assertEquals(1, feedbacks.size());
    }
    
    @Test
    public void testAddFeedback() {    	
    	boolean isAdded = feedbackService.addFeedback(1, "comments");
    	assertTrue(isAdded);
    }

}
