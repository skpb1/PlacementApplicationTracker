package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Feedback;
import main.java.placementApplicationTracker.repo.PlacementRepository;

public class FeedbackService {

	private static final Logger LOGGER = Logger.getLogger(FeedbackService.class.getName());

	public static List<Feedback> getFeedbacksByApplicationId(int applicationId) {
		List<Feedback> feedbacks = new ArrayList<Feedback>();

		String query = "SELECT * FROM Feedback WHERE ApplicationId=" + applicationId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Feedback feedback = new Feedback();
					feedback.setFeedbackId(resultSet.getInt("feedbackId"));
					feedback.setApplicationId(resultSet.getInt("applicationId"));
					feedback.setDateTime(resultSet.getTimestamp("dateTime"));
					feedback.setAdminId(resultSet.getInt("adminId"));
					feedback.setComments(resultSet.getString("comments"));
					feedbacks.add(feedback);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Feedback details", e);
		}

		return feedbacks;

	}

}
