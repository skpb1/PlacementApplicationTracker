package main.java.placementApplicationTracker.repo.intf;

import java.util.List;

import main.java.placementApplicationTracker.model.Feedback;

public interface FeedbackRepo {

	List<Feedback> getFeedbacksByApplicationId(int applicationId);

	boolean addFeedback(int applicationId, String comments);

	Feedback getFeedbackByFeedbackId(int feedbackId);

}
