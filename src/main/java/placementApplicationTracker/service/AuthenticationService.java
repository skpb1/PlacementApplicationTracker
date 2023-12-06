package main.java.placementApplicationTracker.service;

import main.java.placementApplicationTracker.repo.PlacementRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthenticationService {

    private static final Logger LOGGER = Logger.getLogger(AuthenticationService.class.getName());

    public static boolean studentLogin(int studentId, String password) {
        String query = "SELECT * FROM Student WHERE StudentId = ? AND Password = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, studentId);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error during student login", e);
            return false;
        }
    }

    public static boolean adminLogin(int adminId, String password) {
        String query = "SELECT * FROM Admin WHERE AdminId = ? AND Password = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, adminId);
            statement.setString(2, password);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error during admin login", e);
            return false;
        }
    }

    public static boolean doesAdminIdExist(int adminId) {
        String query = "SELECT * FROM Admin WHERE AdminId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, adminId);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error checking admin ID existence", e);
            return false;
        }
    }

    public static boolean doesStudentIdExist(int studentId) {
        String query = "SELECT * FROM Student WHERE StudentId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, studentId);
            try (ResultSet resultSet = statement.executeQuery()) {
                return resultSet.next();
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error checking student ID existence", e);
            return false;
        }
    }

    public static boolean studentSignup(int studentId, String password, String fullName, String email, String course, int passOutYear) {
        try {
            String insertStudentQuery = "INSERT INTO Student (StudentId, Password, FullName, Email, Course, PassOutYear) VALUES (?, ?, ?, ?, ?, ?)";
            try (Connection connection = PlacementRepository.connect();
                 PreparedStatement statement = connection.prepareStatement(insertStudentQuery)) {
                statement.setInt(1, studentId);
                statement.setString(2, password);
                statement.setString(3, fullName);
                statement.setString(4, email);
                statement.setString(5, course);
                statement.setInt(6, passOutYear);

                int rowsAffected = statement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error during student signup", e);
            return false;
        }
    }

    public static boolean adminSignup(int adminId, String password, String fullName, String email, String designation) {
        try {
            String insertAdminQuery = "INSERT INTO Admin (AdminId, Password, FullName, Email, Designation) VALUES (?, ?, ?, ?, ?)";
            try (Connection connection = PlacementRepository.connect();
                 PreparedStatement statement = connection.prepareStatement(insertAdminQuery)) {
                statement.setInt(1, adminId);
                statement.setString(2, password);
                statement.setString(3, fullName);
                statement.setString(4, email);
                statement.setString(5, designation);

                int rowsAffected = statement.executeUpdate();
                return rowsAffected > 0;
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error during admin signup", e);
            return false;
        }
    }
}
