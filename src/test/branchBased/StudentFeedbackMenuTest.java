package test.branchBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.repo.impl.mock.MockFeedbackRepoImpl;
import main.java.placementApplicationTracker.repo.intf.FeedbackRepo;
import main.java.placementApplicationTracker.studentMenu.StudentFeedbackMenu;

public class StudentFeedbackMenuTest {
	private FeedbackRepo feedbackRepo;
	private StudentFeedbackMenu studentFeedbackMenu;
	
	@BeforeEach
	void setup() {
		feedbackRepo = new MockFeedbackRepoImpl();
		studentFeedbackMenu = new StudentFeedbackMenu(feedbackRepo);
	}
	
	@Test
	void testGoBack() {
		feedbackRepo.addFeedback(1, "comments");
		Scanner scanner = new Scanner("2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
	}
	
	@Test
	void testDefault() {
		feedbackRepo.addFeedback(1, "comments");
		Scanner scanner = new Scanner("3\n2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
	}
	
	@Test
	void testNoFeedbacks() {
		Scanner scanner = new Scanner("1\n2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
	}
	
	@Test
	void testFeedbacksException() {
		feedbackRepo.addFeedback(1, "comments");
		Scanner scanner = new Scanner("1\n2\n");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
	}
	
	@Test
	void testFeedbacks() {
		feedbackRepo.addFeedback(1, "comments");
		Scanner scanner = new Scanner("1\n1\n2");
		studentFeedbackMenu.displayFeedbackMenu(1, scanner);
	}
}
