package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Assessment {
    private int assessmentId;
    private int applicationId;
    private Timestamp assessmentDate;
    private String result;

    // Constructor
    public Assessment() {
    }

    // Getters
    public int getAssessmentId() {
        return assessmentId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public Timestamp getAssessmentDate() {
        return assessmentDate;
    }

    public String getResult() {
        return result;
    }

    // Setters
    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public void setAssessmentDate(Timestamp assessmentDate) {
        this.assessmentDate = assessmentDate;
    }

    public void setResult(String result) {
        this.result = result;
    }
}