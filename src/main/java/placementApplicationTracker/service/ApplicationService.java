package main.java.placementApplicationTracker.service;

import java.util.List;
import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;

public class ApplicationService {
	private ApplicationRepo applicationRepo;
	
	

	public ApplicationService(ApplicationRepo applicationRepo) {
		this.applicationRepo = applicationRepo;
	}

	public List<Application> getAllApplications() {

		return applicationRepo.getAllApplications();
	}

	public List<Application> getApplicationsByStudent(int studentId) {

		return applicationRepo.getApplicationsByStudent(studentId);
	}

	public List<Application> getApplicationsByOpportunity(int opportunityId) {

		return applicationRepo.getApplicationsByOpportunity(opportunityId);
	}

	public Application getApplicationByAppId(int appId) {

		return applicationRepo.getApplicationByAppId(appId);
	}

	public boolean withdrawApplicationByAppId(int appId) {

		return applicationRepo.withdrawApplicationByAppId(appId);
	}

	public boolean createApplication(int opportunityId, int studentId, String resumeContent,
			String coverLetterContent) {

		return applicationRepo.createApplication(opportunityId, studentId, resumeContent, coverLetterContent);
	}

	public boolean updateApplication(int applicationId, String resumeContent, String coverLetter) {
		return applicationRepo.updateApplication(applicationId, resumeContent, coverLetter);
	}

	public boolean updateApplicationStatus(int applicationId, String action) {

		return applicationRepo.updateApplicationStatus(applicationId, action);
	}
}
