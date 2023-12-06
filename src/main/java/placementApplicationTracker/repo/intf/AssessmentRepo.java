package main.java.placementApplicationTracker.repo.intf;

import java.util.List;

import main.java.placementApplicationTracker.model.Assessment;

public interface AssessmentRepo {

	boolean deleteAssessment(int assessmentId);

	boolean updateAssessment(int assessmentId, Assessment updatedAssessment);

	boolean addAssessment(Assessment assessment);

	List<Assessment> getAssessments();

	Assessment getAssessmentById(int assessmentId);

	List<Assessment> getAssessmentsByApplicationId(int applicationId);

}
