package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Feedback {
    private int feedbackId;
    private int applicationId;
    private int adminId;
    private String comments;
    private Timestamp dateTime;

    // Constructors

    public Feedback() {
    }

    public Feedback(int feedbackId, int applicationId, int adminId, String comments, Timestamp dateTime) {
        this.feedbackId = feedbackId;
        this.applicationId = applicationId;
        this.adminId = adminId;
        this.comments = comments;
        this.dateTime = dateTime;
    }

    // Getters and Setters

    public int getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(int feedbackId) {
        this.feedbackId = feedbackId;
    }

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }
}
