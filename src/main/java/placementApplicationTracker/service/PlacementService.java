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
}
