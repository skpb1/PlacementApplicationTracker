package main.java.placementApplicationTracker.repo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;

public class AdminRepoImpl implements AdminRepo {
	private final Logger LOGGER = Logger.getLogger(AdminRepo.class.getName());

	@Override
	public Admin getAdminDetails(int adminId) {
		Admin admin = null;
		String query = "SELECT * FROM Admin WHERE AdminId = ?";
		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, adminId);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					admin = new Admin(resultSet.getInt("AdminId"), resultSet.getString("Password"),
							resultSet.getString("FullName"), resultSet.getString("Email"),
							resultSet.getString("Designation"));
				}
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting admin details", e);
		}
		return admin;
	}

	@Override
	public boolean updateAdminPassword(int adminId, String currentPassword, String newPassword) {
		String query = "UPDATE Admin SET Password = ? WHERE AdminId = ? AND Password = ?";
		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, newPassword);
			statement.setInt(2, adminId);
			statement.setString(3, currentPassword);

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error updating admin password", e);
			return false;
		}
	}

	@Override
	public boolean updateAdminDetails(int adminId, String updatedFullName, String updatedEmail,
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
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error updating admin details", e);
			return false;
		}
	}
}
