package main.java.placementApplicationTracker.service;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.PlacementRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AdminService {

    private static final Logger LOGGER = Logger.getLogger(AdminService.class.getName());

    public static Admin getAdminDetails(int adminId) {
        Admin admin = null;
        String query = "SELECT * FROM Admin WHERE AdminId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, adminId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    admin = new Admin(
                            resultSet.getInt("AdminId"),
                            resultSet.getString("Password"),
                            resultSet.getString("FullName"),
                            resultSet.getString("Email"),
                            resultSet.getString("Designation")
                    );
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting admin details", e);
        }
        return admin;
    }

    public static boolean updateAdminPassword(int adminId, String currentPassword, String newPassword) {
        String query = "UPDATE Admin SET Password = ? WHERE AdminId = ? AND Password = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newPassword);
            statement.setInt(2, adminId);
            statement.setString(3, currentPassword);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating admin password", e);
            return false;
        }
    }

    public static boolean updateAdminDetails(int adminId, String updatedFullName, String updatedEmail,
                                             String updatedDesignation) {
        String query = "UPDATE Admin SET FullName = ?, Email = ?, Designation = ? WHERE AdminId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, updatedFullName);
            statement.setString(2, updatedEmail);
            statement.setString(3, updatedDesignation);
            statement.setInt(4, adminId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating admin details", e);
            return false;
        }
    }
}
