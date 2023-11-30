package main.java.placementApplicationTracker.model;

public class Student {
    private int studentId;
    private String studentName;
    private String studentEmail;
    private String course;
    private int passOutYear;

    // Constructor
    public Student() {
    }

    // Getters
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public String getCourse() {
        return course;
    }

    public int getPassOutYear() {
        return passOutYear;
    }

    // Setters
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public void setPassOutYear(int passOutYear) {
        this.passOutYear = passOutYear;
    }
}