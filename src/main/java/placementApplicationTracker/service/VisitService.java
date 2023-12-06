package main.java.placementApplicationTracker.service;

import java.util.List;
import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;

public class VisitService {
	private final VisitRepo visitRepository;

    public VisitService(VisitRepo visitRepository) {
        this.visitRepository = visitRepository;
    }

    public List<Visit> getVisits() {
        return visitRepository.getVisits();
    }

    public List<Visit> getVisitsByApplicationId(int applicationId) {
        return visitRepository.getVisitsByApplicationId(applicationId);
    }

    public Visit getVisitById(int visitId) {
        return visitRepository.getVisitById(visitId);
    }

    public boolean addVisit(Visit visit) {
        return visitRepository.addVisit(visit);
    }

    public boolean updateVisit(int visitId, Visit updatedVisit) {
        return visitRepository.updateVisit(visitId, updatedVisit);
    }

    public boolean deleteVisit(int visitId) {
        return visitRepository.deleteVisit(visitId);
    }
}
