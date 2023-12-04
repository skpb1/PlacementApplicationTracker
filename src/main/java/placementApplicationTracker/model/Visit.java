package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Visit {
    private int visitId;
    private int opportunityId;
    private Timestamp dateTime;
    private String status;
    private String details;

    // Constructors

    public Visit() {
    }

    public Visit(int visitId, int opportunityId, Timestamp dateTime, String status, String details) {
        this.visitId = visitId;
        this.opportunityId = opportunityId;
        this.dateTime = dateTime;
        this.status = status;
        this.details = details;
    }

    // Getters and Setters

    public int getVisitId() {
        return visitId;
    }

    public void setVisitId(int visitId) {
        this.visitId = visitId;
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
