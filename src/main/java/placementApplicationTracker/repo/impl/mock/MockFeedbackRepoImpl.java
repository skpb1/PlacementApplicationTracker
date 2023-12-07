package main.java.placementApplicationTracker.repo.impl.mock;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import main.java.placementApplicationTracker.model.Feedback;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;

public class MockFeedbackRepoImpl implements FeedbackRepo {
	private final List<Feedback> feedbacks;
	
	public MockFeedbackRepoImpl() {
		feedbacks = new ArrayList<>();
	}
	
	@Override
	public List<Feedback> getFeedbacksByApplicationId(int applicationId) {
		List<Feedback> feedbacksByApplicationId = new ArrayList<>();
        for (Feedback feedback : feedbacks) {
            if (feedback.getApplicationId() == applicationId) {
                feedbacksByApplicationId.add(feedback);
            }
        }
        return feedbacksByApplicationId;
	}

	@Override
	public boolean addFeedback(int applicationId, String comments) {
		Feedback feedback = new Feedback(feedbacks.size() + 1, applicationId, comments, new Timestamp(System.currentTimeMillis()));
		return feedbacks.add(feedback);
	}

	@Override
	public Feedback getFeedbackByFeedbackId(int feedbackId) {
        for (Feedback feedback : feedbacks) {
            if (feedback.getFeedbackId() == feedbackId) {
                return feedback;
            }
        }
        return null;
	}

}
