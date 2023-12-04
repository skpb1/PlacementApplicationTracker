package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.PlacementRepository;

public class AssessmentService {
	private static final Logger LOGGER = Logger.getLogger(AssessmentService.class.getName());

	public static List<Assessment> getAssessmentsByApplicationId(int applicationId) {
		List<Assessment> assessments = new ArrayList<Assessment>();

		String query = "SELECT * FROM Assessment WHERE ApplicationId=" + applicationId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Assessment assessment = new Assessment();
					assessment.setAssessmentId(resultSet.getInt("assessmentId"));
					assessment.setApplicationId(resultSet.getInt("applicationId"));
					assessment.setDateTime(resultSet.getTimestamp("dateTime"));
					assessment.setDetails(resultSet.getString("details"));
					assessment.setStatus(resultSet.getString("status"));
					assessments.add(assessment);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Assessment details", e);
		}

		return assessments;

	}

	public static Assessment getAssessmentByAssessmentId(int assessmentId) {
		Assessment assessment = null;

		String query = "SELECT * FROM Assessment WHERE AssessmentId=" + assessmentId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					assessment = new Assessment();
					assessment.setAssessmentId(resultSet.getInt("assessmentId"));
					assessment.setApplicationId(resultSet.getInt("applicationId"));
					assessment.setDateTime(resultSet.getTimestamp("dateTime"));
					assessment.setDetails(resultSet.getString("details"));
					assessment.setStatus(resultSet.getString("status"));
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Assessment details", e);
		}

		return assessment;
	}

}
