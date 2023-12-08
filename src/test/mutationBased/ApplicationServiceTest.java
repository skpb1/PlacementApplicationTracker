package test.mutationBased;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Application;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.service.ApplicationService;

class ApplicationServiceTest {
    private ApplicationService applicationService;
    private ApplicationRepo applicationRepo;

    @BeforeEach
    void setup() {
        applicationRepo = new MockApplicationRepoImpl();
        applicationService = new ApplicationService(applicationRepo);
    }

    @Test
    void testGetAllApplications() {
        Application application = new Application();
        applicationRepo.getAllApplications().add(application);

        List<Application> applications = applicationService.getAllApplications();
        assertEquals(1, applications.size());
    }

    @Test
    void testGetApplicationsByStudent() {
        Application application = new Application();
        application.setStudentId(1);
        applicationRepo.getAllApplications().add(application);

        List<Application> applications = applicationService.getApplicationsByStudent(1);
        assertEquals(1, applications.size());
    }

    @Test
    void testGetApplicationsByOpportunity() {
        Application application = new Application();
        application.setOpportunityId(1);
        applicationRepo.getAllApplications().add(application);

        List<Application> applications = applicationService.getApplicationsByOpportunity(1);
        assertEquals(1, applications.size());
    }

    @Test
    void testGetApplicationByAppId() {
        Application application = new Application();
        application.setApplicationId(1);
        applicationRepo.getAllApplications().add(application);

        Application retrievedApplication = applicationService.getApplicationByAppId(1);
        assertNotNull(retrievedApplication);
        assertEquals(1, retrievedApplication.getApplicationId());
    }

    @Test
    void testWithdrawApplicationByAppId() {
        Application application = new Application();
        application.setApplicationId(1);
        applicationRepo.getAllApplications().add(application);

        boolean isWithdrawn = applicationService.withdrawApplicationByAppId(1);
        assertTrue(isWithdrawn);
        assertEquals(1, application.getWithdrawn());
    }

    @Test
    void testWithdrawApplicationByAppIdFalse() {
       boolean isWithdrawn = applicationService.withdrawApplicationByAppId(1);
        assertFalse(isWithdrawn);
    }
    
    @Test
    void testCreateApplication() {
        boolean isCreated = applicationService.createApplication(1, 1, "resume", "coverLetter");
        assertTrue(isCreated);
        assertEquals(1, applicationRepo.getAllApplications().size());
    }

    @Test
    void testCreateApplicationFalse() {
    	Application application = new Application();
        application.setApplicationId(1);
        application.setOpportunityId(1);
        application.setStudentId(1);
        applicationRepo.getAllApplications().add(application);
        boolean isCreated = applicationService.createApplication(1, 1, "resume", "coverLetter");
        assertFalse(isCreated);
    }
    
    @Test
    void testUpdateApplication() {
        Application application = new Application();
        application.setApplicationId(1);
        applicationRepo.getAllApplications().add(application);

        boolean isUpdated = applicationService.updateApplication(1, "newResume", "newCoverLetter");
        assertTrue(isUpdated);
        assertEquals("newResume", application.getResume());
        assertEquals("newCoverLetter", application.getCoverLetter());
    }
    
    @Test
    void testUpdateApplicationFalse() {
    	boolean isUpdated = applicationService.updateApplication(1, "newResume", "newCoverLetter");
        assertFalse(isUpdated);
    }

    @Test
    void testUpdateApplicationStatus() {
        Application application = new Application();
        application.setApplicationId(1);
        applicationRepo.getAllApplications().add(application);

        boolean isUpdated = applicationService.updateApplicationStatus(1, "a");
        assertTrue(isUpdated);
        assertEquals("Approved", application.getStatus());
    }
    
    @Test
    void testUpdateApplicationStatusFalse() {
        boolean isUpdated = applicationService.updateApplicationStatus(1, "a");
        assertFalse(isUpdated);
    }
}
