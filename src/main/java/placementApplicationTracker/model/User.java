package main.java.placementApplicationTracker.model;

public class User {
    private int id;
    private String userName;
    private String password;
    private int studentId;

    // Constructor
    public User() {
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}