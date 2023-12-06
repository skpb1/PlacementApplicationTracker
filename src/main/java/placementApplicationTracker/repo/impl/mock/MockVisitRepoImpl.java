package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.ArrayList;
import java.util.List;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;

public class MockVisitRepoImpl implements VisitRepo {
	private final List<Visit> visits;

    public MockVisitRepoImpl() {
        this.visits = new ArrayList<>();
    }

    @Override
    public List<Visit> getVisits() {
        return visits;
    }

    @Override
    public List<Visit> getVisitsByApplicationId(int applicationId) {
        List<Visit> visitsByApplicationId = new ArrayList<>();
        for (Visit visit : visits) {
            if (visit.getApplicationId() == applicationId) {
                visitsByApplicationId.add(visit);
            }
        }
        return visitsByApplicationId;
    }

    @Override
    public Visit getVisitById(int visitId) {
        for (Visit visit : visits) {
            if (visit.getVisitId() == visitId) {
                return visit;
            }
        }
        return null;
    }

    @Override
    public boolean addVisit(Visit visit) {
        return visits.add(visit);
    }

    @Override
    public boolean updateVisit(int visitId, Visit updatedVisit) {
        for (int i = 0; i < visits.size(); i++) {
            if (visits.get(i).getVisitId() == visitId) {
                visits.set(i, updatedVisit);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteVisit(int visitId) {
        Visit visitToRemove = null;
        for (Visit visit : visits) {
            if (visit.getVisitId() == visitId) {
                visitToRemove = visit;
                break;
            }
        }
        return visits.remove(visitToRemove);
    }

}
