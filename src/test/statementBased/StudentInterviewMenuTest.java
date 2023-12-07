package test.statementBased;

import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.impl.mock.MockInterviewRepoImpl;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu;

public class StudentInterviewMenuTest {
	private InterviewRepo interviewRepo;
	private StudentInterviewMenu studentInterviewMenu;
	private Timestamp timestamp;
	
	@BeforeEach
	void setup() {
		interviewRepo = new MockInterviewRepoImpl();
		studentInterviewMenu = new StudentInterviewMenu(interviewRepo);
		timestamp = new Timestamp(System.currentTimeMillis());
	}
	
	@Test
	void testGoBack() {
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
	}
	
	@Test
	void testDefault() {
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("3\n2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
	}
	
	@Test
	void testNoInterviews() {
		Scanner scanner = new Scanner("1\n2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
	}
	
	@Test
	void testInterviewsException() {
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("1\n2\n");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
	}
	
	@Test
	void testInterviews() {
		Interview interview = new Interview(1, 1, timestamp, "status", "details");
		interviewRepo.addInterview(interview);
		Scanner scanner = new Scanner("1\n1\n2");
		studentInterviewMenu.displayInterviewMenu(1, scanner);
	}
}
