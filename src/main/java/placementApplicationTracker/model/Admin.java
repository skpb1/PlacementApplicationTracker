package main.java.placementApplicationTracker.model;

public class Admin {
    private int adminId;
    private String password;
    private String fullName;
    private String email;
    private String designation;

    // Constructors

    public Admin() {
    }

    public Admin(int adminId, String password, String fullName, String email, String designation) {
        this.adminId = adminId;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.designation = designation;
    }

    // Getters and Setters

    public int getAdminId() {
        return adminId;
    }

    public void setAdminId(int adminId) {
        this.adminId = adminId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
