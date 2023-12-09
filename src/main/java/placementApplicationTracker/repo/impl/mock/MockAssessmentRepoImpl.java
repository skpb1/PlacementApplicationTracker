package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.ArrayList;
import java.util.List;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;

public class MockAssessmentRepoImpl implements AssessmentRepo {

	private final List<Assessment> assessments;

	public MockAssessmentRepoImpl() {
		assessments = new ArrayList<>();
	}

	@Override
	public List<Assessment> getAssessmentsByApplicationId(int applicationId) {
		List<Assessment> assessmentsByApplication = new ArrayList<>();
		for (Assessment assessment : assessments) {
			if (assessment.getApplicationId() == applicationId) {
				assessmentsByApplication.add(assessment);
			}
		}
		return assessmentsByApplication;
	}

	@Override
	public Assessment getAssessmentById(int assessmentId) {
		for (Assessment assessment : assessments) {
			if (assessment.getAssessmentId() == assessmentId) {
				return assessment;
			}
		}
		return null;
	}

	@Override
	public List<Assessment> getAssessments() {
		return new ArrayList<>(assessments);
	}

	@Override
	public boolean addAssessment(Assessment assessment) {
		if (assessment != null) {
			return assessments.add(assessment);
		} else {
			return false;
		}
	}

	@Override
	public boolean updateAssessment(int assessmentId, Assessment updatedAssessment) {
		for (int i = 0; i < assessments.size(); i++) {
			if (assessments.get(i).getAssessmentId() == assessmentId) {
				assessments.set(i, updatedAssessment);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteAssessment(int assessmentId) {
		for (Assessment assessment : assessments) {
			if (assessment.getAssessmentId() == assessmentId) {
				return assessments.remove(assessment);
			}
		}
		return false;
	}
}
