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
	
	public static Visit getVisitByVisitId(int visitId) {
		Visit visit = null;

		String query = "SELECT * FROM Visit WHERE VisitId=" + visitId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					visit = new Visit();
					visit.setVisitId(resultSet.getInt("visitId"));
					visit.setApplicationId(resultSet.getInt("applicationId"));
					visit.setDateTime(resultSet.getTimestamp("dateTime"));
					visit.setDetails(resultSet.getString("details"));
					visit.setStatus(resultSet.getString("status"));
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Visit details", e);
		}

		return visit;
	}

}
