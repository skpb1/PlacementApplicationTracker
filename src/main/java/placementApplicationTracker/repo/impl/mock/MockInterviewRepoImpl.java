package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.ArrayList;
import java.util.List;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;

public class MockInterviewRepoImpl implements InterviewRepo {

private final List<Interview> interviews;
	
	public MockInterviewRepoImpl() {
		interviews = new ArrayList<>();
	}
	
	@Override
	public List<Interview> getInterviews() {
		return interviews;
	}

	@Override
	public boolean addInterview(Interview interview) {
		return interviews.add(interview);
	}

	@Override
	public boolean updateInterview(int interviewId, Interview updatedInterview) {
		for (int i = 0; i < interviews.size(); i++) {
            if (interviews.get(i).getInterviewId() == interviewId) {
                interviews.set(i, updatedInterview);
                return true;
            }
        }
        return false;
	}

	@Override
	public boolean deleteInterview(int interviewId) {
		for (Interview interview : interviews) {
            if (interview.getInterviewId() == interviewId) {
                return interviews.remove(interview);
            }
        }
        return false;
	}

	@Override
	public Interview getInterviewById(int interviewId) {
		for (Interview interview : interviews) {
            if (interview.getInterviewId() == interviewId) {
                return interview;
            }
        }
        return null;
	}

	@Override
	public List<Interview> getInterviewsByApplicationId(int applicationId) {
		List<Interview> interviews1 = new ArrayList<>();
		for (Interview interview : interviews) {
            if (interview.getApplicationId() == applicationId) {
                interviews1.add(interview);
            }
        }
        return interviews1;
	}

}
