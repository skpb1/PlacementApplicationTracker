package main.java.placementApplicationTracker.repo.intf;

import java.util.List;

import main.java.placementApplicationTracker.model.Visit;

public interface VisitRepo {
	List<Visit> getVisits();
    List<Visit> getVisitsByApplicationId(int applicationId);
    Visit getVisitById(int visitId);
    boolean addVisit(Visit visit);
    boolean updateVisit(int visitId, Visit updatedVisit);
    boolean deleteVisit(int visitId);
}
