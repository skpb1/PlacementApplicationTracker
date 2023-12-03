package main.java.placementApplicationTracker.model;

public class Student {
    private int studentId;
    private String password;
    private String fullName;
    private String email;
    private String course;
    private int passOutYear;

    // Constructors

    public Student() {
    }

    public Student(int studentId, String password, String fullName, String email, String course, int passOutYear) {
        this.studentId = studentId;
        this.password = password;
        this.fullName = fullName;
        this.email = email;
        this.course = course;
        this.passOutYear = passOutYear;
    }

    // Getters and Setters

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
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

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getPassOutYear() {
        return passOutYear;
    }

    public void setPassOutYear(int passOutYear) {
        this.passOutYear = passOutYear;
    }
}
