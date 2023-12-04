package main.java.placementApplicationTracker.model;

import java.sql.Timestamp;

public class Opportunity {
    private int opportunityId;
    private String companyName;
    private String role;
    private String description;
    private int salary;
    private String location;
    private Timestamp openDate;
    private Timestamp closeDate;
    private int adminId;

    // Constructors

    public Opportunity() {
    }

    public Opportunity(int opportunityId, String companyName, String role, String description, int salary, String location, Timestamp openDate, Timestamp closeDate, int adminId) {
        this.opportunityId = opportunityId;
        this.companyName = companyName;
        this.role = role;
        this.description = description;
        this.salary = salary;
        this.location = location;
        this.openDate = openDate;
        this.closeDate = closeDate;
        this.adminId = adminId;
    }

    // Getters and Setters

    public int getOpportunityId() {
        return opportunityId;
    }

    public void setOpportunityId(int opportunityId) {
        this.opportunityId = opportunityId;
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String name) {
        this.companyName = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Timestamp getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Timestamp openDate) {
        this.openDate = openDate;
    }

    public Timestamp getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(Timestamp closeDate) {
        this.closeDate = closeDate;
    }

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }
}
