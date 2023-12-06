package main.java.placementApplicationTracker.service;

import java.util.List;
import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;

public class PlacementService {
	private PlacementRepo placementRepo;

	public PlacementService(PlacementRepo placementRepo) {
		this.placementRepo = placementRepo;
	}

	public List<Opportunity> getOpportunities() {
		return placementRepo.getOpportunities();
	}

	public boolean addOpportunity(Opportunity opportunity) {
		return placementRepo.addOpportunity(opportunity);
	}

	public boolean updateOpportunity(int opportunityId, Opportunity updatedOpportunity) {
		return placementRepo.updateOpportunity(opportunityId, updatedOpportunity);
	}

	public boolean deleteOpportunity(int opportunityId) {
		return placementRepo.deleteOpportunity(opportunityId);
	}

	public Opportunity getOpportunityById(int opportunityId) {
		return placementRepo.getOpportunityById(opportunityId);
	}

	public List<Opportunity> getOpportunitiesByCompanyName(String companyName) {
		return placementRepo.getOpportunitiesByCompanyName(companyName);
	}

	public List<Opportunity> getOpportunitiesByRole(String role) {
		return placementRepo.getOpportunitiesByRole(role);
	}

	public List<Opportunity> getOpportunitiesByLocation(String location) {
		return placementRepo.getOpportunitiesByLocation(location);
	}

	public List<Opportunity> getOpportunitiesBySalaryRange(int minSalary, int maxSalary) {

		return placementRepo.getOpportunitiesBySalaryRange(minSalary, maxSalary);
	}

}
