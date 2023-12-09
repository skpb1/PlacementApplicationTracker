package main.java.placementApplicationTracker.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class InsertData {

    public static void insertAdminData(Connection connection, int adminId, String password, String fullName, String email, String designation) throws Exception {
        if (!isDataExists(connection, "Admin", "AdminId", adminId)) {
            String insertDataSQL = "INSERT INTO Admin (AdminId, Password, FullName, Email, Designation) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, adminId);
                statement.setString(2, password);
                statement.setString(3, fullName);
                statement.setString(4, email);
                statement.setString(5, designation);
                statement.executeUpdate();
            }
        }
    }

    public static void insertStudentData(Connection connection, int studentId, String password, String fullName, String email, String course, int passOutYear) throws Exception {
        if (!isDataExists(connection, "Student", "StudentId", studentId)) {
            String insertDataSQL = "INSERT INTO Student (StudentId, Password, FullName, Email, Course, PassOutYear) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, studentId);
                statement.setString(2, password);
                statement.setString(3, fullName);
                statement.setString(4, email);
                statement.setString(5, course);
                statement.setInt(6, passOutYear);
                statement.executeUpdate();
            }
        }
    }

    public static void insertOpportunityData(Connection connection, int opportunityId, String companyName, String role, String description, int salary, String location, String openDate, String closeDate, int adminId) throws Exception {
        if (!isDataExists(connection, "Opportunity", "OpportunityId", opportunityId)) {
            String insertDataSQL = "INSERT INTO Opportunity (OpportunityId, CompanyName, Role, Description, Salary, Location, OpenDate, CloseDate, AdminId) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, opportunityId);
                statement.setString(2, companyName);
                statement.setString(3, role);
                statement.setString(4, description);
                statement.setInt(5, salary);
                statement.setString(6, location);
                statement.setTimestamp(7, Timestamp.valueOf(openDate + " 00:00:00"));
                statement.setTimestamp(8, Timestamp.valueOf(closeDate + " 00:00:00"));
                statement.setInt(9, adminId);
                statement.executeUpdate();
            }
        }
    }

    public static void insertApplicationData(Connection connection, int applicationId, int studentId, int opportunityId, String status, String submissionDate, int withdrawn, String coverLetter, String resume ) throws Exception {
        if (!isDataExists(connection, "Application", "ApplicationId", applicationId)) {
            String insertDataSQL = "INSERT INTO Application (ApplicationId, StudentId, OpportunityId, Status, SubmissionDate, Withdrawn, CoverLetter, Resume) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, applicationId);
                statement.setInt(2, studentId);
                statement.setInt(3, opportunityId);
                statement.setString(4, status);
                statement.setTimestamp(5, Timestamp.valueOf(submissionDate + " 00:00:00"));
                statement.setInt(6, withdrawn);
                statement.setString(7, coverLetter);
                statement.setString(8, resume);
                statement.executeUpdate();
            }
        }
    }

    public static void insertAssessmentData(Connection connection, int assessmentId, int applicationId, String dateTime, String status, String details) throws Exception {
        if (!isDataExists(connection, "Assessment", "AssessmentId", assessmentId)) {
            String insertDataSQL = "INSERT INTO Assessment (AssessmentId, ApplicationId, DateTime, Status, Details) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, assessmentId);
                statement.setInt(2, applicationId);
                statement.setTimestamp(3, Timestamp.valueOf(dateTime + " 00:00:00"));
                statement.setString(4, status);
                statement.setString(5, details);
                statement.executeUpdate();
            }
        }
    }

    public static void insertVisitData(Connection connection, int visitId, int applicationId, String dateTime, String status, String details) throws Exception {
        if (!isDataExists(connection, "Visit", "VisitId", visitId)) {
            String insertDataSQL = "INSERT INTO Visit (VisitId, ApplicationId, DateTime, Status, Details) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, visitId);
                statement.setInt(2, applicationId);
                statement.setTimestamp(3, Timestamp.valueOf(dateTime + " 00:00:00"));
                statement.setString(4, status);
                statement.setString(5, details);
                statement.executeUpdate();
            }
        }
    }
    
    public static void insertFeedbackData(Connection connection, int feedbackId, int applicationId, String comments, String dateTime) throws Exception {
        if (!isDataExists(connection, "Feedback", "FeedbackId", feedbackId)) {
            String insertDataSQL = "INSERT INTO Feedback (FeedbackId, ApplicationId, Comments, DateTime) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, feedbackId);
                statement.setInt(2, applicationId);
                statement.setString(3, comments);
                statement.setTimestamp(4, Timestamp.valueOf(dateTime + " 00:00:00"));
                statement.executeUpdate();
            }
        }
    }

    public static void insertInterviewData(Connection connection, int interviewId, int applicationId, String status, String type, String dateTime) throws Exception {
        if (!isDataExists(connection, "Interview", "InterviewId", interviewId)) {
            String insertDataSQL = "INSERT INTO Interview (InterviewId, ApplicationId, Status, Type, DateTime) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, interviewId);
                statement.setInt(2, applicationId);
                statement.setString(3, status);
                statement.setString(4, type);
                statement.setTimestamp(5, Timestamp.valueOf(dateTime + " 00:00:00"));
                statement.executeUpdate();
            }
        }
    }

    public static boolean isDataExists(Connection connection, String tableName, String columnName, int id) throws Exception {
        String checkDataSQL = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = ?";
        try (PreparedStatement statement = connection.prepareStatement(checkDataSQL)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt(1) > 0;
            }
        }
    }
}
