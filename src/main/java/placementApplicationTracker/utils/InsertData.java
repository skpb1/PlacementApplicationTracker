package main.java.placementApplicationTracker.utils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class InsertData {

    public static void insertSampleData(Connection connection) throws SQLException {
        insertStudentData(connection, 1, "John Doe", "john.doe@example.com", "BSc Computer Science", 2026);
        insertStudentData(connection, 2, "John Snow", "john.snow@example.com", "Bsc Electrical Engineering", 2026);
        insertStudentData(connection, 3, "John Cena", "john.cena@example.com", "Msc Computer Science", 2024);

        insertUserData(connection, 1, "john_doe", "pwd123", 1);
        insertUserData(connection, 2, "john_snow", "pwd456", 2);

        insertJobData(connection, 1, "XYZ Corporation", "CityA", "Software Dev", "Java development", 80000,
                "2024-01-15");
        insertJobData(connection, 2, "ABC Ltd", "CityB", "Electrical Engineer", "Circuit design", 75000, "2024-01-20");
        insertJobData(connection, 3, "EFG Ltd", "CityC", "Junior Dev", "Backend Pyhton development", 30000,
                "2024-01-25");

        insertPlacementApplicationData(connection, 1, 1, 1, "2023-11-29", "Submitted");
        insertPlacementApplicationData(connection, 2, 1, 2, "2023-11-29", "Pending");
        insertPlacementApplicationData(connection, 3, 2, 1, "2023-11-25", "AwaitingAssessment");
        insertPlacementApplicationData(connection, 4, 2, 2, "2023-11-02", "AwaitingVisit");
        insertPlacementApplicationData(connection, 5, 3, 3, "2023-11-01", "Success");

        insertAssessmentData(connection, 2, 3, "2023-12-15", "Pending");
        insertAssessmentData(connection, 1, 4, "2023-11-17", "Pass");

        insertVisitData(connection, 2, 4, "2023-12-02", "Interview", "Pending");
        insertVisitData(connection, 1, 5, "2023-11-21", "Interview", "Pass");
    }

    private static void insertStudentData(Connection connection, int studentId, String studentName, String studentEmail,
            String course, int passOutYear) throws SQLException {
        if (!isDataExists(connection, "Student", "studentId", studentId)) {
            String insertDataSQL = "INSERT INTO Student (studentId, studentName, studentEmail, course, passOutYear) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, studentId);
                statement.setString(2, studentName);
                statement.setString(3, studentEmail);
                statement.setString(4, course);
                statement.setInt(5, passOutYear);
                statement.executeUpdate();
            }
        }
    }

    private static void insertUserData(Connection connection, int id, String userName, String password, int studentId)
            throws SQLException {
        if (!isDataExists(connection, "User", "id", id)) {
            String insertDataSQL = "INSERT INTO User (id, userName, password, studentId) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, id);
                statement.setString(2, userName);
                statement.setString(3, password);
                statement.setInt(4, studentId);
                statement.executeUpdate();
            }
        }
    }

    private static void insertJobData(Connection connection, int jobId, String companyName, String location,
            String jobRole, String jobDescription, int salary, String applicationLastDate) throws SQLException {
        if (!isDataExists(connection, "Job", "jobId", jobId)) {
            String insertDataSQL = "INSERT INTO Job (jobId, companyName, location, jobRole, jobDescription, salary, ApplicationLastDate) VALUES (?, ?, ?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, jobId);
                statement.setString(2, companyName);
                statement.setString(3, location);
                statement.setString(4, jobRole);
                statement.setString(5, jobDescription);
                statement.setInt(6, salary);
                statement.setTimestamp(7, Timestamp.valueOf(applicationLastDate + " 00:00:00"));
                statement.executeUpdate();
            }
        }
    }

    private static void insertPlacementApplicationData(Connection connection, int applicationId, int studentId,
            int jobId, String applicationDate, String applicationStatus) throws SQLException {
        if (!isDataExists(connection, "PlacementApplication", "applicationId", applicationId)) {
            String insertDataSQL = "INSERT INTO PlacementApplication (applicationId, studentId, jobId, applicationDate, applicationStatus) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, applicationId);
                statement.setInt(2, studentId);
                statement.setInt(3, jobId);
                statement.setTimestamp(4, Timestamp.valueOf(applicationDate + " 00:00:00"));
                statement.setString(5, applicationStatus);
                statement.executeUpdate();
            }
        }
    }

    private static void insertAssessmentData(Connection connection, int assessmentId, int appId, String assessmentDate,
            String result) throws SQLException {
        if (!isDataExists(connection, "Assessment", "assessmentId", assessmentId)) {
            String insertDataSQL = "INSERT INTO Assessment (assessmentId, applicationId, assessmentDate, result) VALUES (?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, assessmentId);
                statement.setInt(2, appId);
                statement.setTimestamp(3, Timestamp.valueOf(assessmentDate + " 00:00:00"));
                statement.setString(4, result);
                statement.executeUpdate();
            }
        }
    }

    private static void insertVisitData(Connection connection, int visitId, int appId, String visitDate,
            String visitPurpose, String visitResult) throws SQLException {
        if (!isDataExists(connection, "Visit", "visitId", visitId)) {
            String insertDataSQL = "INSERT INTO Visit (visitId, applicationId, visitDate, visitPurpose, visitResult) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement statement = connection.prepareStatement(insertDataSQL)) {
                statement.setInt(1, visitId);
                statement.setInt(2, appId);
                statement.setTimestamp(3, Timestamp.valueOf(visitDate + " 00:00:00"));
                statement.setString(4, visitPurpose);
                statement.setString(5, visitResult);
                statement.executeUpdate();
            }
        }
    }

    private static boolean isDataExists(Connection connection, String tableName, String columnName, int id)
            throws SQLException {
        String checkDataSQL = "SELECT COUNT(*) FROM " + tableName + " WHERE " + columnName + " = ?";
        try (PreparedStatement statement = connection.prepareStatement(checkDataSQL)) {
            statement.setInt(1, id);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next() && resultSet.getInt(1) > 0;
            }
        }
    }
}
