package main.java.placementApplicationTracker.repo.intf;

import java.util.List;

import main.java.placementApplicationTracker.model.Application;

public interface ApplicationRepo {

	boolean updateApplicationStatus(int applicationId, String action);

	boolean updateApplication(int applicationId, String resumeContent, String coverLetter);

	boolean createApplication(int opportunityId, int studentId, String resumeContent, String coverLetterContent);

	boolean withdrawApplicationByAppId(int appId);

	Application getApplicationByAppId(int appId);

	List<Application> getApplicationsByOpportunity(int opportunityId);

	List<Application> getApplicationsByStudent(int studentId);

	List<Application> getAllApplications();

}
