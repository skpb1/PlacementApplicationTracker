package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.repo.PlacementRepository;

public class ApplicationService {
	private static final Logger LOGGER = Logger.getLogger(ApplicationService.class.getName());
	
    public static List<Application> getAllApplications() {
		
        List<Application> applications = new ArrayList<Application>();
        
        String query = "SELECT * FROM Application";

        try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Application application = new Application();
					application.setApplicationId(resultSet.getInt("applicationId"));
					application.setCoverLetter(resultSet.getString("coverLetter"));
					application.setOpportunityId(resultSet.getInt("opportunityId"));
					application.setStudentId(resultSet.getInt("studentId"));
					application.setWithdrawn(resultSet.getInt("withdrawn"));
					application.setSubmissionDate(resultSet.getTimestamp("submissionDate"));
					application.setResume(resultSet.getString("resume"));
					application.setStatus(resultSet.getString("status"));
					applications.add(application);
				}
			}
		} catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting applications", e);
        }

        return applications;
    }

	public static List<Application> getApplicationsByStudent(int studentId) {

		List<Application> applications = new ArrayList<Application>();

		String query = "SELECT * FROM Application WHERE StudentId=" + studentId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Application application = new Application();
					application.setApplicationId(resultSet.getInt("applicationId"));
					application.setCoverLetter(resultSet.getString("coverLetter"));
					application.setOpportunityId(resultSet.getInt("opportunityId"));
					application.setStudentId(resultSet.getInt("studentId"));
					application.setWithdrawn(resultSet.getInt("withdrawn"));
					application.setSubmissionDate(resultSet.getTimestamp("submissionDate"));
					application.setResume(resultSet.getString("resume"));
					application.setStatus(resultSet.getString("status"));
					applications.add(application);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Application details", e);
		}

		return applications;
	}
	
	public static List<Application> getApplicationsByOpportunity(int opportunityId) {

		List<Application> applications = new ArrayList<Application>();

		String query = "SELECT * FROM Application WHERE OpportunityId=" + opportunityId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				while (resultSet.next()) {
					Application application = new Application();
					application.setApplicationId(resultSet.getInt("applicationId"));
					application.setCoverLetter(resultSet.getString("coverLetter"));
					application.setOpportunityId(resultSet.getInt("opportunityId"));
					application.setStudentId(resultSet.getInt("studentId"));
					application.setWithdrawn(resultSet.getInt("withdrawn"));
					application.setSubmissionDate(resultSet.getTimestamp("submissionDate"));
					application.setResume(resultSet.getString("resume"));
					application.setStatus(resultSet.getString("status"));
					applications.add(application);
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Application details", e);
		}

		return applications;
	}

	public static Application getApplicationByAppId(int appId) {

		Application application = null;

		String query = "SELECT * FROM Application WHERE ApplicationId=" + appId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					application = new Application();
					application.setApplicationId(resultSet.getInt("applicationId"));
					application.setCoverLetter(resultSet.getString("coverLetter"));
					application.setOpportunityId(resultSet.getInt("opportunityId"));
					application.setStudentId(resultSet.getInt("studentId"));
					application.setWithdrawn(resultSet.getInt("withdrawn"));
					application.setSubmissionDate(resultSet.getTimestamp("submissionDate"));
					application.setResume(resultSet.getString("resume"));
					application.setStatus(resultSet.getString("status"));
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Application details", e);
		}

		return application;
	}

	public static boolean withdrawApplicationByAppId(int appId) {

		String query = "UPDATE Application SET Withdrawn = ? WHERE ApplicationId = ?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setInt(1, 1);
			statement.setInt(2, appId);
			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Application details", e);
			return false;
		}
	}

	public static boolean createApplication(int opportunityId, int studentId, String resumeContent,
			String coverLetterContent) {

		boolean isApplicationExists = false;
		String query = "SELECT * FROM Application WHERE StudentId=" + studentId + " AND OpportunityId=" + opportunityId;

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
				if (resultSet.next()) {
					isApplicationExists = true;
				}
			}
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error creating Application", e);
		}

		if (isApplicationExists) {
			System.out.println("An application already exists for this opportunity");
			return false;
		} else {
			String query2 = "INSERT INTO Application (StudentId, OpportunityId, Status, SubmissionDate, Withdrawn, CoverLetter, Resume) VALUES (?, ?, 'Submitted', CURRENT_TIMESTAMP, 0, ?, ?)";

			try (Connection connection = PlacementRepository.connect();
					PreparedStatement statement = connection.prepareStatement(query2)) {
				statement.setInt(1, studentId);
				statement.setInt(2, opportunityId);
				statement.setString(3, resumeContent);
				statement.setString(4, coverLetterContent);
				int rowsAffected = statement.executeUpdate();
				return rowsAffected > 0;
			} catch (SQLException e) {
				LOGGER.log(Level.SEVERE, "Error getting Application details", e);
				return false;
			}
		}
	}

	public static boolean updateApplication(int applicationId, String resumeContent, String coverLetter) {
		String query = "UPDATE Application SET Resume = ?, CoverLetter = ? WHERE ApplicationId = ?";

		try (Connection connection = PlacementRepository.connect();
				PreparedStatement statement = connection.prepareStatement(query)) {
			statement.setString(1, resumeContent);
			statement.setString(2, coverLetter);
			statement.setInt(3, applicationId);
			int rowsAffected = statement.executeUpdate();
			return rowsAffected > 0;
		} catch (SQLException e) {
			LOGGER.log(Level.SEVERE, "Error getting Application details", e);
			return false;
		}
	}
	
	public static boolean updateApplicationStatus(int applicationId, String action) {
		
		String status = null;
		if(action.equals("a")){
			status = "Approved";
		} else { if(action.equals("r")){
			         status = "Rejected";
			     }
		  }
		
        String query = "UPDATE Application SET Status = ? WHERE ApplicationId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, status);
            statement.setInt(2, applicationId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating application status", e);
            return false;
        }
    }
}
