package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Interview {
	private int interviewId;
    private int applicationId;
    private Timestamp dateTime;
    private String status;
    private String type;

    // Constructors

    public Interview() {
    }

    public Interview(int interviewId, int applicationId, Timestamp dateTime, String status, String type) {
        this.interviewId = interviewId;
        this.applicationId = applicationId;
        this.dateTime = dateTime;
        this.status = status;
        this.type = type;
    }

    // Getters and Setters

    public int getInterviewId() {
        return interviewId;
    }

    public void setInterviewId(int interviewId) {
        this.interviewId = interviewId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
