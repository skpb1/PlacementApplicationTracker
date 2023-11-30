package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Visit {
    private int visitId;
    private int applicationId;
    private Timestamp visitDate;
    private String visitPurpose;
    private String visitResult;

    // Constructor
    public Visit() {
    }

    // Getters
    public int getVisitId() {
        return visitId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public Timestamp getVisitDate() {
        return visitDate;
    }

    public String getVisitPurpose() {
        return visitPurpose;
    }

    public String getVisitResult() {
        return visitResult;
    }

    // Setters
    public void setVisitId(int visitId) {
        this.visitId = visitId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public void setVisitDate(Timestamp visitDate) {
        this.visitDate = visitDate;
    }

    public void setVisitPurpose(String visitPurpose) {
        this.visitPurpose = visitPurpose;
    }

    public void setVisitResult(String visitResult) {
        this.visitResult = visitResult;
    }
}