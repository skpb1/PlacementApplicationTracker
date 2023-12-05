package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.PlacementRepository;

public class VisitService {

    private static final Logger LOGGER = Logger.getLogger(VisitService.class.getName());

    public static List<Visit> getVisits() {
        List<Visit> visits = new ArrayList<>();

        String query = "SELECT * FROM Visit";

        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                Visit visit = mapResultSetToVisit(resultSet);
                visits.add(visit);
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting Visit details", e);
        }

        return visits;
    }
    
    public static List<Visit> getVisitsByApplicationId(int applicationId) {
		List<Visit> visits = new ArrayList<Visit>();

		String query = "SELECT * FROM Visit WHERE ApplicationId=" + applicationId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				System.out.println("Result" + resultSet);
				while (resultSet.next()) {
					Visit visit = new Visit();
					visit.setVisitId(resultSet.getInt("visitId"));
					visit.setApplicationId(resultSet.getInt("applicationId"));
					visit.setDateTime(resultSet.getTimestamp("dateTime"));
					visit.setDetails(resultSet.getString("details"));
					visit.setStatus(resultSet.getString("status"));
					visits.add(visit);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Visit details", e);
		}

		return visits;

	}

    public static Visit getVisitById(int visitId) {
        Visit visit = null;

        String query = "SELECT * FROM Visit WHERE VisitId = ?";

        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, visitId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    visit = mapResultSetToVisit(resultSet);
                }
            }
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting Visit details", e);
        }

        return visit;
    }

    public static boolean addVisit(Visit visit) {
        String query = "INSERT INTO Visit (ApplicationId, DateTime, Status, Details) VALUES (?, ?, ?, ?)";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, visit.getApplicationId());
            statement.setTimestamp(2, visit.getDateTime());
            statement.setString(3, visit.getStatus());
            statement.setString(4, visit.getDetails());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error adding visit", e);
            return false;
        }
    }

    public static boolean updateVisit(int visitId, Visit updatedVisit) {
        String query = "UPDATE Visit SET ApplicationId=?, DateTime=?, Status=?, Details=? WHERE VisitId=?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, updatedVisit.getApplicationId());
            statement.setTimestamp(2, updatedVisit.getDateTime());
            statement.setString(3, updatedVisit.getStatus());
            statement.setString(4, updatedVisit.getDetails());
            statement.setInt(5, visitId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating visit", e);
            return false;
        }
    }

    public static boolean deleteVisit(int visitId) {
        String query = "DELETE FROM Visit WHERE VisitId=?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, visitId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error deleting visit", e);
            return false;
        }
    }

    private static Visit mapResultSetToVisit(ResultSet resultSet) throws SQLException {
        Visit visit = new Visit();
        visit.setVisitId(resultSet.getInt("VisitId"));
        visit.setApplicationId(resultSet.getInt("ApplicationId"));
        visit.setDateTime(resultSet.getTimestamp("DateTime"));
        visit.setStatus(resultSet.getString("Status"));
        visit.setDetails(resultSet.getString("Details"));
        return visit;
    }
}
