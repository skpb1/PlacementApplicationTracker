package main.java.placementApplicationTracker.service;

import java.util.List;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;

public class InterviewService {

	private InterviewRepo interviewRepo;

	public InterviewService(InterviewRepo interviewRepo) {
		this.interviewRepo = interviewRepo;
	}

	public List<Interview> getInterviewsByApplicationId(int applicationId) {
		return interviewRepo.getInterviewsByApplicationId(applicationId);

	}

	public Interview getInterviewById(int interviewId) {
		return interviewRepo.getInterviewById(interviewId);
	}

	public List<Interview> getInterviews() {
		return interviewRepo.getInterviews();
	}

	public boolean addInterview(Interview interview) {
		return interviewRepo.addInterview(interview);
	}

	public boolean updateInterview(int interviewId, Interview updatedInterview) {
		return interviewRepo.updateInterview(interviewId, updatedInterview);
	}

	public boolean deleteInterview(int interviewId) {
		return interviewRepo.deleteInterview(interviewId);
	}

}
