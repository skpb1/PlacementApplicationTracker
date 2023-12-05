package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Timestamp;

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
					feedback.setComments(resultSet.getString("comments"));
					feedbacks.add(feedback);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Feedback details", e);
		}

		return feedbacks;

	}
	
	
	public static Feedback getFeedbackByFeedbackId(int feedbackId) {
		Feedback feedback = null;

		String query = "SELECT * FROM Feedback WHERE FeedbackId=" + feedbackId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					feedback = new Feedback();
					feedback.setFeedbackId(resultSet.getInt("feedbackId"));
					feedback.setApplicationId(resultSet.getInt("applicationId"));
					feedback.setDateTime(resultSet.getTimestamp("dateTime"));
					feedback.setComments(resultSet.getString("comments"));
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Feedback details", e);
		}

		return feedback;
	}
	
	public static boolean addFeedback(int applicationId, String comments) {
        String query = "INSERT INTO Feedback (ApplicationId, Comments, DateTime) VALUES (?, ?, ?)";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, applicationId);
            statement.setString(2, comments);
            statement.setTimestamp(3, new Timestamp(System.currentTimeMillis()));

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error adding feedback", e);
            return false;
        }
    }

}
