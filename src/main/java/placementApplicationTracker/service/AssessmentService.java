package main.java.placementApplicationTracker.service;

import java.util.List;
import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;

public class AssessmentService {

    private AssessmentRepo assessmentRepo;
    
    

    public AssessmentService(AssessmentRepo assessmentRepo) {
		this.assessmentRepo = assessmentRepo;
	}

	public  List<Assessment> getAssessmentsByApplicationId(int applicationId) {
        return assessmentRepo.getAssessmentsByApplicationId(applicationId);
    }
    
    public  Assessment getAssessmentById(int assessmentId) {
    	return assessmentRepo.getAssessmentById(assessmentId);
    }

    public  List<Assessment> getAssessments() {
    	return assessmentRepo.getAssessments();
    }

    public  boolean addAssessment(Assessment assessment) {
    	return assessmentRepo.addAssessment(assessment);
    }

    public  boolean updateAssessment(int assessmentId, Assessment updatedAssessment) {
    	return assessmentRepo.updateAssessment(assessmentId, updatedAssessment);
    }

    public  boolean deleteAssessment(int assessmentId) {
    	return assessmentRepo.deleteAssessment(assessmentId);
    }
}
