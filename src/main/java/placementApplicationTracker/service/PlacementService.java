package main.java.placementApplicationTracker.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.PlacementRepository;

public class PlacementService {
	private static final Logger LOGGER = Logger.getLogger(PlacementService.class.getName());
	
	public static List<Opportunity> getOpportunities() {
		List <Opportunity> opportunities = new ArrayList<Opportunity>();
		String query = "SELECT * FROM Opportunity";
		
		try (Connection connection = PlacementRepository.connect();
	             PreparedStatement statement = connection.prepareStatement(query)) {
			try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                	Opportunity opportunity = new Opportunity();
                	opportunity.setAdminId(resultSet.getInt("adminId"));
                	opportunity.setCloseDate(resultSet.getTimestamp("closeDate"));
                	opportunity.setCompanyName(resultSet.getString("companyName"));
                	opportunity.setDescription(resultSet.getString("description"));
                	opportunity.setLocation(resultSet.getString("location"));
                	opportunity.setOpenDate(resultSet.getTimestamp("openDate"));
                	opportunity.setOpportunityId(resultSet.getInt("opportunityId"));
                	opportunity.setRole(resultSet.getString("role"));
                	opportunity.setSalary(resultSet.getInt("salary"));
                	opportunities.add(opportunity);
                }
			}
		} catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting opportunity details", e);
        }
		return opportunities;
	}
	
	public static boolean addOpportunity(Opportunity opportunity) {
        String query = "INSERT INTO Opportunity (CompanyName, Role, Description, Salary, Location, OpenDate, CloseDate, AdminId) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, opportunity.getCompanyName());
            statement.setString(2, opportunity.getRole());
            statement.setString(3, opportunity.getDescription());
            statement.setInt(4, opportunity.getSalary());
            statement.setString(5, opportunity.getLocation());
            statement.setTimestamp(6, opportunity.getOpenDate());
            statement.setTimestamp(7, opportunity.getCloseDate());
            statement.setInt(8, opportunity.getAdminId());

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error adding opportunity", e);
            return false;
        }
    }

    public static boolean updateOpportunity(int opportunityId, Opportunity updatedOpportunity) {
        String query = "UPDATE Opportunity " +
                "SET CompanyName=?, Role=?, Description=?, Salary=?, Location=?, OpenDate=?, CloseDate=?, AdminId=? " +
                "WHERE OpportunityId=?";

        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setString(1, updatedOpportunity.getCompanyName());
            statement.setString(2, updatedOpportunity.getRole());
            statement.setString(3, updatedOpportunity.getDescription());
            statement.setInt(4, updatedOpportunity.getSalary());
            statement.setString(5, updatedOpportunity.getLocation());
            statement.setTimestamp(6, updatedOpportunity.getOpenDate());
            statement.setTimestamp(7, updatedOpportunity.getCloseDate());
            statement.setInt(8, updatedOpportunity.getAdminId());
            statement.setInt(9, opportunityId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error updating opportunity", e);
            return false;
        }
    }

    public static boolean deleteOpportunity(int opportunityId) {
        String query = "DELETE FROM Opportunity WHERE OpportunityId=?";

        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, opportunityId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error deleting opportunity", e);
            return false;
        }
    }

    public static Opportunity getOpportunityById(int opportunityId) {
        String query = "SELECT * FROM Opportunity WHERE OpportunityId=?";
        Opportunity opportunity = null;

        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {

            statement.setInt(1, opportunityId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    opportunity = new Opportunity();
                    opportunity.setOpportunityId(resultSet.getInt("OpportunityId"));
                    opportunity.setCompanyName(resultSet.getString("CompanyName"));
                    opportunity.setRole(resultSet.getString("Role"));
                    opportunity.setDescription(resultSet.getString("Description"));
                    opportunity.setSalary(resultSet.getInt("Salary"));
                    opportunity.setLocation(resultSet.getString("Location"));
                    opportunity.setOpenDate(resultSet.getTimestamp("OpenDate"));
                    opportunity.setCloseDate(resultSet.getTimestamp("CloseDate"));
                    opportunity.setAdminId(resultSet.getInt("AdminId"));
                }
            }

        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error getting opportunity by ID", e);
        }

        return opportunity;
    }
}
