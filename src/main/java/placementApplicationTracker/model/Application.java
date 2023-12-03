package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Application {
    private int applicationId;
    private int studentId;
    private int opportunityId;
    private String status;
    private Timestamp submissionDate;
    private int withdrawn;
    private String coverLetter;
    private String resume;

    // Constructors

    // Default constructor
    public Application() {
    }

    // Parameterized constructor
    public Application(int applicationId, int studentId, int opportunityId, String status,
                       Timestamp submissionDate, int withdrawn, String coverLetter, String resume) {
        this.applicationId = applicationId;
        this.studentId = studentId;
        this.opportunityId = opportunityId;
        this.status = status;
        this.submissionDate = submissionDate;
        this.withdrawn = withdrawn;
        this.coverLetter = coverLetter;
        this.resume = resume;
    }

    // Getters and Setters

    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(int opportunityId) {
        this.opportunityId = opportunityId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Timestamp submissionDate) {
        this.submissionDate = submissionDate;
    }

    public int getWithdrawn() {
        return withdrawn;
    }

    public void setWithdrawn(int withdrawn) {
        this.withdrawn = withdrawn;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
