package main.java.placementApplicationTracker.service;

import java.util.List;
import main.java.placementApplicationTracker.model.Feedback;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;

public class FeedbackService {

	private FeedbackRepo feedbackRepo;
	
	
	public FeedbackService(FeedbackRepo feedbackRepo) {
		this.feedbackRepo = feedbackRepo;
	}

	public List<Feedback> getFeedbacksByApplicationId(int applicationId) {
		
		return feedbackRepo.getFeedbacksByApplicationId(applicationId);

	}

	public Feedback getFeedbackByFeedbackId(int feedbackId) {
		return feedbackRepo.getFeedbackByFeedbackId(feedbackId);
	}

	public  boolean addFeedback(int applicationId, String comments) {
        return feedbackRepo.addFeedback(applicationId, comments);
    }

}
