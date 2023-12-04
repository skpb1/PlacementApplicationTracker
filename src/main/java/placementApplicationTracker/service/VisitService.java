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
		List<Visit> assessments = new ArrayList<Visit>();

		String query = "SELECT * FROM Visit WHERE ApplicationId=" + applicationId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Visit assessment = new Visit();
					assessment.setVisitId(resultSet.getInt("visitId"));
					assessment.setApplicationId(resultSet.getInt("applicationId"));
					assessment.setDateTime(resultSet.getTimestamp("dateTime"));
					assessment.setDetails(resultSet.getString("details"));
					assessment.setStatus(resultSet.getString("status"));
					assessments.add(assessment);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Visit details", e);
		}

		return assessments;

	}

}
