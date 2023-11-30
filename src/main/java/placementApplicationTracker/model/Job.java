package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Job {
    private int jobId;
    private String companyName;
    private String location;
    private String jobRole;
    private String jobDescription;
    private int salary;
    private Timestamp applicationLastDate;

    // Constructor
    public Job() {
    }

    // Getters
    public int getJobId() {
        return jobId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getLocation() {
        return location;
    }

    public String getJobRole() {
        return jobRole;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public int getSalary() {
        return salary;
    }

    public Timestamp getApplicationLastDate() {
        return applicationLastDate;
    }

    // Setters
    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setJobRole(String jobRole) {
        this.jobRole = jobRole;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setApplicationLastDate(Timestamp applicationLastDate) {
        this.applicationLastDate = applicationLastDate;
    }
}
