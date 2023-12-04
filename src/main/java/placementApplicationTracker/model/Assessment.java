package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Assessment {
    private int assessmentId;
    private int opportunityId;
    private Timestamp dateTime;
    private String status;
    private String details;

    // Constructors

    public Assessment() {
    }

    public Assessment(int assessmentId, int opportunityId, Timestamp dateTime, String status, String details) {
        this.assessmentId = assessmentId;
        this.opportunityId = opportunityId;
        this.dateTime = dateTime;
        this.status = status;
        this.details = details;
    }

    // Getters and Setters

    public int getAssessmentId() {
        return assessmentId;
    }

    public void setAssessmentId(int assessmentId) {
        this.assessmentId = assessmentId;
    }

    public int getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(int opportunityId) {
        this.opportunityId = opportunityId;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
