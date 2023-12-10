package test.blackbox.specificationBased;

import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.studentMenu.StudentVisitMenu;

class StudentVisitMenuTest {

	private VisitRepo visitRepo;
	private StudentVisitMenu studentVisitMenu;
	private Timestamp timestamp;
	
	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
		studentVisitMenu = new StudentVisitMenu(visitRepo);
		timestamp = new Timestamp(System.currentTimeMillis());
	}
	
	@Test
	void testVisits() {
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("1\n1\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
	}
	
	@Test
	void testGoBack() {
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("2");
		studentVisitMenu.displayVisitMenu(1, scanner);
	}
	
	@Test
	void testDefault() {
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("3\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
	}
	
	@Test
	void testNoVisits() {
		Scanner scanner = new Scanner("1\n2");
		studentVisitMenu.displayVisitMenu(1, scanner);
	}
	
	@Test
	void testVisitsException() {
		Visit visit = new Visit(1, 1, timestamp, "status", "details");
		visitRepo.addVisit(visit);
		Scanner scanner = new Scanner("1\n2\n");
		studentVisitMenu.displayVisitMenu(1, scanner);
	}

}
