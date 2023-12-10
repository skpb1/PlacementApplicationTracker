package test.blackbox.specificationBased;

import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Assessment;
import main.java.placementApplicationTracker.repo.impl.mock.MockAssessmentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AssessmentRepo;
import main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu;

public class StudentAssessmentMenuTest {
	private AssessmentRepo assessmentRepo;
	private StudentAssessmentMenu studentAssessmentMenu;
	
	@BeforeEach
	void setup() {
		assessmentRepo = new MockAssessmentRepoImpl();
		studentAssessmentMenu = new StudentAssessmentMenu(assessmentRepo);
	}
	
	@Test
	void testAssessments() {
		Assessment assessment = new Assessment(1, 1, new Timestamp(System.currentTimeMillis()), "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("1\n1\n2");
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
	}
	
	@Test
	void testNoAssessments() {
		Scanner scanner = new Scanner("1\n2");
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
	}
	
	@Test
	void testGoBack() {
		Assessment assessment = new Assessment(1, 1, new Timestamp(System.currentTimeMillis()), "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("2");
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
	}
	
	@Test
	void testDefault() {
		Assessment assessment = new Assessment(1, 1, new Timestamp(System.currentTimeMillis()), "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("3\n2");
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
	}
	
	@Test
	void testAssessmentsException() {
		Assessment assessment = new Assessment(1, 1, new Timestamp(System.currentTimeMillis()), "status", "details");
		assessmentRepo.addAssessment(assessment);
		Scanner scanner = new Scanner("1\n2\n");
		studentAssessmentMenu.displayAssessmentMenu(1, scanner);
	}
	
}
