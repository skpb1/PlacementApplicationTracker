package test.whitebox.branchBased;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockAuthenticationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.studentMenu.StudentAuthMenu;

public class StudentAuthMenuTest {
	private VisitRepo visitRepo;
	private ApplicationRepo applicationRepo;
	private PlacementRepo placementRepo;
	private AssessmentRepo assessmentRepo;
	private InterviewRepo interviewRepo;
	private StudentRepo studentRepo;
	private FeedbackRepo feedbackRepo;
	private AuthenticationRepo authenticationRepo;
	private StudentAuthMenu menu;
	
	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
    	this.assessmentRepo = new MockAssessmentRepoImpl();
		this.feedbackRepo = new MockFeedbackRepoImpl();
		this.interviewRepo = new MockInterviewRepoImpl();
		this.applicationRepo = new MockApplicationRepoImpl();
		studentRepo = new MockStudentRepoImpl();
		authenticationRepo = new MockAuthenticationRepoImpl();
		menu = new StudentAuthMenu(visitRepo, assessmentRepo, applicationRepo, authenticationRepo, feedbackRepo, interviewRepo, placementRepo, studentRepo);
	}
	
	@Test
	void testStudentLoginFail() {
		Scanner scanner = new Scanner("1\npass\n");
		menu.studentLogin(scanner);
	}
	
	@Test
	void testStudentLoginException() {
		Scanner scanner = new Scanner("a");
		assertDoesNotThrow(() -> menu.studentLogin(scanner));
	}
	
	@Test
	void testStudentLoginPass() {
		Scanner scanner = new Scanner("1\npass\n");
		authenticationRepo.studentSignup(1, "pass", "name", "email", "course", 0);
		menu.studentLogin(scanner);
	}
	
	@Test
	void testStudentSignupPass() {
		Scanner scanner = new Scanner("1\npass\nname\nemail\ncourse\n0");
		menu.studentSignup(scanner);
	}
	
	@Test
	void testStudentSignupFail() {
		Scanner scanner = new Scanner("1\n");
		authenticationRepo.studentSignup(1, "pass", "name", "email", "course", 0);
		menu.studentSignup(scanner);
	}
	
	@Test
	void testStudentSignupFail2() {
		Scanner scanner = new Scanner("1\n\n\n\n\n");
		menu.studentSignup(scanner);
	}
	
	@Test
	void testStudentSignupException() {
		Scanner scanner = new Scanner("a");
		assertDoesNotThrow(() -> menu.studentSignup(scanner));
	}

}
