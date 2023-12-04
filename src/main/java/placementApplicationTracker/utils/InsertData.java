package main.java.placementApplicationTracker.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
//import java.util.Random;

public class InsertData {

    public static void insertSampleData(Connection connection) throws SQLException {
    	// Insert sample data for the Admin table
        insertAdminData(connection, 1, "admin_password", "Admin User", "admin@example.com", "Admin Designation");
        insertAdminData(connection, 2, "another_admin_password", "Another Admin User", "another_admin@example.com", "Senior Admin");

        // Insert sample data for the Student table
        insertStudentData(connection, 1, "user1_password", "User One", "user1@example.com", "Computer Science", 2023);
        insertStudentData(connection, 2, "user2_password", "User Two", "user2@example.com", "Electrical Engineering", 2022);

        // Insert sample data for the Opportunity table
        insertOpportunityData(connection, 1, "abc ltd", "Software Developer Intern", "Internship for software development", 35000, "CityA", "2023-01-01", "2023-03-01", 1);
        insertOpportunityData(connection, 2, "def ltd", "Data Scientist", "Full-time position for data science", 30000, "CityB", "2023-02-01", "2023-04-01", 2);

        // Insert sample data for the Application table
        insertApplicationData(connection, 1, 1, 1, "Submitted", "2023-02-15", 0, "Cover letter for User 1, Application 1", "Resume for User 1, Application 1");
        insertApplicationData(connection, 2, 2, 2, "Pending", "2023-02-20", 0, "Cover letter for User 2, Application 2", "Resume for User 2, Application 2");

        // Insert sample data for the Assessment table
        insertAssessmentData(connection, 1, 1, "2023-02-25", "Scheduled", "Assessment Details for User 1, Application 1");
        insertAssessmentData(connection, 2, 2, "2023-02-28", "Pending", "Assessment Details for User 2, Application 2");

        // Insert sample data for the Visit table
        insertVisitData(connection, 1, 1, "2023-03-05", "Scheduled", "Visit Details for User 1, Application 1");
        insertVisitData(connection, 2, 2, "2023-03-08", "Confirmed", "Visit Details for User 2, Application 2");

        // Insert sample data for the Feedback table
        insertFeedbackData(connection, 1, 1, 1, "Good performance in the assessment", "2023-03-10");
        insertFeedbackData(connection, 2, 2, 1, "Further improvements needed", "2023-03-12");
    }

    private static void insertAdminData(Connection connection, int adminId, String password, String fullName, String email, String designation) throws SQLException {
        if (!isDataExists(connection, "Admin", "AdminId", adminId)) {
            String insertDataSQL = "INSERT INTO Admin (AdminId, Password, FullName, Email, Designation) VALUES (?, ?, ?, ?, ?, ?)";
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

    private static void insertStudentData(Connection connection, int studentId, String password, String fullName, String email, String course, int passOutYear) throws SQLException {
        if (!isDataExists(connection, "Student", "StudentId", studentId)) {
            String insertDataSQL = "INSERT INTO Student (StudentId, Password, FullName, Email, Course, PassOutYear) VALUES (?, ?, ?, ?, ?, ?, ?)";
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

    private static void insertOpportunityData(Connection connection, int opportunityId, String companyName, String role, String description, int salary, String location, String openDate, String closeDate, int adminId) throws SQLException {
        if (!isDataExists(connection, "Opportunity", "OpportunityId", opportunityId)) {
            String insertDataSQL = "INSERT INTO Opportunity (OpportunityId, Title, Description, Location, OpenDate, CloseDate, AdminId) VALUES (?, ?, ?, ?, ?, ?, ?)";
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

    private static void insertApplicationData(Connection connection, int applicationId, int studentId, int opportunityId, String status, String submissionDate, int withdrawn, String coverLetter, String resume ) throws SQLException {
        if (!isDataExists(connection, "Application", "ApplicationId", applicationId)) {
            String insertDataSQL = "INSERT INTO Application (ApplicationId, studentId, OpportunityId, Status, SubmissionDate, Withdrawn, CoverLetter, Resume) VALUES (?, ?, ?, ?, ?, ?)";
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

    private static void insertAssessmentData(Connection connection, int assessmentId, int opportunityId, String dateTime, String status, String details) throws SQLException {
        if (!isDataExists(connection, "Assessment", "AssessmentId", assessmentId)) {
            String insertDataSQL = "INSERT INTO Assessment (AssessmentId, OpportunityId, DateTime, Status, Details) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, assessmentId);
                statement.setInt(2, opportunityId);
                statement.setTimestamp(3, Timestamp.valueOf(dateTime + " 00:00:00"));
                statement.setString(4, status);
                statement.setString(5, details);
                statement.executeUpdate();
            }
        }
    }

    private static void insertVisitData(Connection connection, int visitId, int applicationId, String dateTime, String status, String details) throws SQLException {
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

    private static void insertFeedbackData(Connection connection, int feedbackId, int applicationId, int adminId, String comments, String dateTime) throws SQLException {
        if (!isDataExists(connection, "Feedback", "FeedbackId", feedbackId)) {
            String insertDataSQL = "INSERT INTO Feedback (FeedbackId, ApplicationId, AdminId, Comments, DateTime) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, feedbackId);
                statement.setInt(2, applicationId);
                statement.setInt(3, adminId);
                statement.setString(4, comments);
                statement.setTimestamp(5, Timestamp.valueOf(dateTime + " 00:00:00"));
                statement.executeUpdate();
            }
        }
    }

    private static boolean isDataExists(Connection connection, String tableName, String columnName, int id) throws SQLException {
        String checkDataSQL = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = ?";
        try (PreparedStatement statement = connection.prepareStatement(checkDataSQL)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt(1) > 0;
            }
        }
    }
}
