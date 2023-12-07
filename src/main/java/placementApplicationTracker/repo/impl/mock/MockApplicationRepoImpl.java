package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.ArrayList;
import java.util.List;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;

public class MockApplicationRepoImpl implements ApplicationRepo {

    private final List<Application> applications;

    public MockApplicationRepoImpl() {
        applications = new ArrayList<>();
    }

    @Override
    public List<Application> getAllApplications() {
        return applications;
    }

    @Override
    public List<Application> getApplicationsByStudent(int studentId) {
        List<Application> applicationsByStudent = new ArrayList<>();
        applications.forEach(application -> {
            if (application.getStudentId() == studentId) {
                applicationsByStudent.add(application);
            }
        });
        return applicationsByStudent;
    }

    @Override
    public List<Application> getApplicationsByOpportunity(int opportunityId) {
        List<Application> applicationsByOpportunity = new ArrayList<>();
        applications.forEach(application -> {
            if (application.getOpportunityId() == opportunityId) {
                applicationsByOpportunity.add(application);
            }
        });
        return applicationsByOpportunity;
    }

    @Override
    public Application getApplicationByAppId(int appId) {
        for (Application application : applications) {
            if (application.getApplicationId() == appId) {
                return application;
            }
        }
        return null;
    }

    @Override
    public boolean withdrawApplicationByAppId(int appId) {
        for (Application application : applications) {
            if (application.getApplicationId() == appId) {
                application.setWithdrawn(1);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean createApplication(int opportunityId, int studentId, String resumeContent, String coverLetterContent) {
        // Assuming no duplicate applications are allowed in the mock
        for (Application application : applications) {
            if (application.getOpportunityId() == opportunityId && application.getStudentId() == studentId) {
                System.out.println("An application already exists for this opportunity");
                return false;
            }
        }

        Application newApplication = new Application();
        newApplication.setOpportunityId(opportunityId);
        newApplication.setStudentId(studentId);
        newApplication.setStatus("Submitted");
        newApplication.setSubmissionDate(null); // Set based on the system timestamp in a real scenario
        newApplication.setWithdrawn(0);
        newApplication.setCoverLetter(coverLetterContent);
        newApplication.setResume(resumeContent);

        return applications.add(newApplication);
    }

    @Override
    public boolean updateApplication(int applicationId, String resumeContent, String coverLetter) {
        for (Application application : applications) {
            if (application.getApplicationId() == applicationId) {
                application.setResume(resumeContent);
                application.setCoverLetter(coverLetter);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateApplicationStatus(int applicationId, String action) {
        String status = null;
        if (action.equals("a")) {
            status = "Approved";
        } else if (action.equals("r")) {
            status = "Rejected";
        }

        for (Application application : applications) {
            if (application.getApplicationId() == applicationId) {
                application.setStatus(status);
                return true;
            }
        }
        return false;
    }
}
