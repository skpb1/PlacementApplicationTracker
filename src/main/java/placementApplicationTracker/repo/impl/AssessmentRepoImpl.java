package main.java.placementApplicationTracker.repo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;

public class AssessmentRepoImpl implements AssessmentRepo {
	private final Logger LOGGER = Logger.getLogger(AssessmentRepoImpl.class.getName());

	@Override
	public List<Assessment> getAssessmentsByApplicationId(int applicationId) {
		List<Assessment> assessments = new ArrayList<>();

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
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting Assessment details", e);
		}

		return assessments;
	}

	@Override
	public Assessment getAssessmentById(int assessmentId) {
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
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting Assessment details", e);
		}

		return assessment;
	}

	@Override
	public List<Assessment> getAssessments() {
		List<Assessment> assessments = new ArrayList<>();

		String query = "SELECT * FROM Assessment";

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
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting Assessment details", e);
		}

		return assessments;
	}

	@Override
	public boolean addAssessment(Assessment assessment) {
		String query = "INSERT INTO Assessment (ApplicationId, DateTime, Status, Details) VALUES (?, ?, ?, ?)";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, assessment.getApplicationId());
			statement.setTimestamp(2, assessment.getDateTime());
			statement.setString(3, assessment.getStatus());
			statement.setString(4, assessment.getDetails());

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error adding assessment", e);
			return false;
		}
	}

	@Override
	public boolean updateAssessment(int assessmentId, Assessment updatedAssessment) {
		String query = "UPDATE Assessment SET ApplicationId=?, DateTime=?, Status=?, Details=? WHERE AssessmentId=?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, updatedAssessment.getApplicationId());
			statement.setTimestamp(2, updatedAssessment.getDateTime());
			statement.setString(3, updatedAssessment.getStatus());
			statement.setString(4, updatedAssessment.getDetails());
			statement.setInt(5, assessmentId);

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error updating assessment", e);
			return false;
		}
	}

	@Override
	public boolean deleteAssessment(int assessmentId) {
		String query = "DELETE FROM Assessment WHERE AssessmentId=?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, assessmentId);

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error deleting assessment", e);
			return false;
		}
	}
}
