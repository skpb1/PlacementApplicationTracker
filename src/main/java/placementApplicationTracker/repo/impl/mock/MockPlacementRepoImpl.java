package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.ArrayList;
import java.util.List;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;

public class MockPlacementRepoImpl implements PlacementRepo {

	private final List<Opportunity> opportunities;

	public MockPlacementRepoImpl() {
		opportunities = new ArrayList<>();
	}

	@Override
	public List<Opportunity> getOpportunities() {
		return opportunities;
	}

	@Override
	public boolean addOpportunity(Opportunity opportunity) {
		if (opportunity != null) {
			return opportunities.add(opportunity);
		} else {
			return false;
		}
	}

	@Override
	public boolean updateOpportunity(int opportunityId, Opportunity updatedOpportunity) {
		for (int i = 0; i < opportunities.size(); i++) {
			if (opportunities.get(i).getOpportunityId() == opportunityId) {
				opportunities.set(i, updatedOpportunity);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteOpportunity(int opportunityId) {
		for (Opportunity opportunity : opportunities) {
			if (opportunity.getOpportunityId() == opportunityId) {
				return opportunities.remove(opportunity);
			}
		}
		return false;
	}

	@Override
	public Opportunity getOpportunityById(int opportunityId) {
		for (Opportunity opportunity : opportunities) {
			if (opportunity.getOpportunityId() == opportunityId) {
				return opportunity;
			}
		}
		return null;
	}

	@Override
	public List<Opportunity> getOpportunitiesByCompanyName(String companyName) {
		List<Opportunity> opportunitiesByCompany = new ArrayList<>();
		opportunities.forEach(opportunity -> {
			if (opportunity.getCompanyName().contains(companyName)) {
				opportunitiesByCompany.add(opportunity);
			}
		});
		return opportunitiesByCompany;
	}

	@Override
	public List<Opportunity> getOpportunitiesByRole(String role) {
		List<Opportunity> opportunitiesByRole = new ArrayList<>();
		opportunities.forEach(opportunity -> {
			if (opportunity.getRole().contains(role)) {
				opportunitiesByRole.add(opportunity);
			}
		});
		return opportunitiesByRole;
	}

	@Override
	public List<Opportunity> getOpportunitiesByLocation(String location) {
		List<Opportunity> opportunitiesByLocation = new ArrayList<>();
		opportunities.forEach(opportunity -> {
			if (opportunity.getLocation().contains(location)) {
				opportunitiesByLocation.add(opportunity);
			}
		});
		return opportunitiesByLocation;
	}

	@Override
	public List<Opportunity> getOpportunitiesBySalaryRange(int minSalary, int maxSalary) {
		List<Opportunity> opportunitiesByLocation = new ArrayList<>();
		opportunities.forEach(opportunity -> {
			if (opportunity.getSalary() > minSalary && opportunity.getSalary() < maxSalary) {
				opportunitiesByLocation.add(opportunity);
			}
		});
		return opportunitiesByLocation;
	}

}
