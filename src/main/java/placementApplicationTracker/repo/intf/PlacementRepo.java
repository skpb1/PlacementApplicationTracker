package main.java.placementApplicationTracker.repo.intf;

import java.util.List;

import main.java.placementApplicationTracker.model.Opportunity;

public interface PlacementRepo {

	public List<Opportunity> getOpportunities();
    boolean addOpportunity(Opportunity opportunity);
    boolean updateOpportunity(int opportunityId, Opportunity updatedOpportunity);
    boolean deleteOpportunity(int opportunityId);
    Opportunity getOpportunityById(int opportunityId);
    List<Opportunity> getOpportunitiesByCompanyName(String companyName);
    List<Opportunity> getOpportunitiesByRole(String role);
    List<Opportunity> getOpportunitiesByLocation(String location);
    List<Opportunity> getOpportunitiesBySalaryRange(int minSalary, int maxSalary);
}
