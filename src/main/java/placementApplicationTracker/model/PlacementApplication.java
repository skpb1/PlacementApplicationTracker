package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class PlacementApplication {
    private int applicationId;
    private int studentId;
    private int jobId;
    private Timestamp applicationDate;
    private String applicationStatus;

    // Constructor
    public PlacementApplication() {
    }

    // Getters
    public int getApplicationId() {
        return applicationId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getJobId() {
        return jobId;
    }

    public Timestamp getApplicationDate() {
        return applicationDate;
    }

    public String getApplicationStatus() {
        return applicationStatus;
    }

    // Setters
    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setApplicationDate(Timestamp applicationDate) {
        this.applicationDate = applicationDate;
    }

    public void setApplicationStatus(String applicationStatus) {
        this.applicationStatus = applicationStatus;
    }
}