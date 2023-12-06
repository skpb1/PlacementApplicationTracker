package main.java.placementApplicationTracker.repo.intf;

import java.util.List;

import main.java.placementApplicationTracker.model.Interview;

public interface InterviewRepo {
	List<Interview> getInterviewsByApplicationId(int applicationId);

	Interview getInterviewById(int interviewId);

	List<Interview> getInterviews();

	boolean addInterview(Interview interview);

	boolean updateInterview(int interviewId, Interview updatedInterview);

	boolean deleteInterview(int interviewId);
}
