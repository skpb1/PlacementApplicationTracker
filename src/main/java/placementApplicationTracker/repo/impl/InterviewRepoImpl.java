package main.java.placementApplicationTracker.repo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;

public class InterviewRepoImpl implements InterviewRepo {
	private static final Logger LOGGER = Logger.getLogger(InterviewRepoImpl.class.getName());

	@Override
	public List<Interview> getInterviewsByApplicationId(int applicationId) {
		List<Interview> interviews = new ArrayList<>();
		String query = "SELECT * FROM Interview WHERE ApplicationId=?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, applicationId);

			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Interview interview = mapResultSetToInterview(resultSet);
					interviews.add(interview);
				}
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting interviews by ApplicationId", e);
		}
		return interviews;
	}

	@Override
	public Interview getInterviewById(int interviewId) {
		Interview interview = null;
		String query = "SELECT * FROM Interview WHERE InterviewId=?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, interviewId);

			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					interview = mapResultSetToInterview(resultSet);
				}
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting interview by InterviewId", e);
		}
		return interview;
	}

	@Override
	public List<Interview> getInterviews() {
		List<Interview> interviews = new ArrayList<>();
		String query = "SELECT * FROM Interview";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet resultSet = statement.executeQuery()) {

			while (resultSet.next()) {
				Interview interview = mapResultSetToInterview(resultSet);
				interviews.add(interview);
			}
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error getting all interviews", e);
		}
		return interviews;
	}

	@Override
	public boolean addInterview(Interview interview) {
		String query = "INSERT INTO Interview (ApplicationId, Status, Type, DateTime) VALUES (?, ?, ?, ?)";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, interview.getApplicationId());
			statement.setString(2, interview.getStatus());
			statement.setString(3, interview.getType());
			statement.setTimestamp(4, interview.getDateTime());

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error adding interview", e);
			return false;
		}
	}

	@Override
	public boolean updateInterview(int interviewId, Interview updatedInterview) {
		String query = "UPDATE Interview SET ApplicationId=?, Status=?, Type=?, DateTime=? WHERE InterviewId=?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, updatedInterview.getApplicationId());
			statement.setString(2, updatedInterview.getStatus());
			statement.setString(3, updatedInterview.getType());
			statement.setTimestamp(4, updatedInterview.getDateTime());
			statement.setInt(5, interviewId);

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error updating interview", e);
			return false;
		}
	}

	@Override
	public boolean deleteInterview(int interviewId) {
		String query = "DELETE FROM Interview WHERE InterviewId=?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {

			statement.setInt(1, interviewId);

			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;

		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error deleting interview", e);
			return false;
		}
	}

	private Interview mapResultSetToInterview(ResultSet resultSet) throws Exception {
		Interview interview = new Interview();
		interview.setInterviewId(resultSet.getInt("InterviewId"));
		interview.setApplicationId(resultSet.getInt("ApplicationId"));
		interview.setDateTime(resultSet.getTimestamp("DateTime"));
		interview.setType(resultSet.getString("Type"));
		interview.setStatus(resultSet.getString("Status"));
		return interview;
	}
}
