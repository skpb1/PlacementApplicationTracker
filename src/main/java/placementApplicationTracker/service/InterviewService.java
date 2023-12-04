package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.PlacementRepository;

public class InterviewService {

	private static final Logger LOGGER = Logger.getLogger(InterviewService.class.getName());

	public static List<Interview> getInterviewsByApplicationId(int applicationId) {
		List<Interview> interviews = new ArrayList<Interview>();

		String query = "SELECT * FROM Interview WHERE ApplicationId=" + applicationId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Interview interview = new Interview();
					interview.setInterviewId(resultSet.getInt("interviewId"));
					interview.setApplicationId(resultSet.getInt("applicationId"));
					interview.setDateTime(resultSet.getTimestamp("dateTime"));
					interview.setType(resultSet.getString("type"));
					interview.setStatus(resultSet.getString("status"));
					interviews.add(interview);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Interview details", e);
		}

		return interviews;

	}
	
	public static Interview getInterviewByInterviewId(int interviewId) {
		Interview interview = null;

		String query = "SELECT * FROM Interview WHERE InterviewId=" + interviewId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					interview = new Interview();
					interview.setInterviewId(resultSet.getInt("interviewId"));
					interview.setApplicationId(resultSet.getInt("applicationId"));
					interview.setDateTime(resultSet.getTimestamp("dateTime"));
					interview.setType(resultSet.getString("type"));
					interview.setStatus(resultSet.getString("status"));
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Interview details", e);
		}

		return interview;
	}

}
