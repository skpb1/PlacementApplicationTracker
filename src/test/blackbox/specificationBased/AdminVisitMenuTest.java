package test.blackbox.specificationBased;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Visit;
import main.java.placementApplicationTracker.repo.impl.mock.MockVisitRepoImpl;
import main.java.placementApplicationTracker.repo.intf.VisitRepo;
import main.java.placementApplicationTracker.service.VisitService;
import main.java.placementApplicationTracker.adminMenu.AdminVisitMenu;

public class AdminVisitMenuTest {
	private VisitRepo visitRepo;
	private AdminVisitMenu visitMenu;

	@BeforeEach
	void setup() {
		visitRepo = new MockVisitRepoImpl();
		new VisitService(visitRepo);
		visitMenu = new AdminVisitMenu(visitRepo);
	}

	@Test
	void testOp1() {
		Scanner scanner = new Scanner("1\n\n1\n\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1c1() {
		Scanner scanner = new Scanner("1\n\n1\n\n1\n1\n2023-12-31 12:00:00\nUpdated Status\nUpdated Details\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1c2() {
		Scanner scanner = new Scanner("1\n\n1\n\n2\n1\nY\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1c2No() {
		Scanner scanner = new Scanner("1\n\n1\n\n2\n1\nN\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1c3() {
		Scanner scanner = new Scanner("1\n\n1\n\n3\nnew company visit\n2023-12-31 12:00:00\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1c4() {
		Scanner scanner = new Scanner("1\n\n1\n\n4\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1cInvalid() {
		Scanner scanner = new Scanner("1\n\n1\n\n99\n");
		visitRepo.addVisit(new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit1"));
		visitRepo.addVisit(new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "visit2"));
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1nC1() {
		Scanner scanner = new Scanner("1\n\n1\n\n1\n2023-12-31 12:00:00\nNew company visit\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1nC1Invalid() {
		Scanner scanner = new Scanner("1\n\n1\n\n1\n2023-12-31\n2023-12-31 12:00:00\nNew company visit\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp1nC2() {
		Scanner scanner = new Scanner("1\n\n1\n\n2\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp2() {
		Scanner scanner = new Scanner("2\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testOp3() {
		Scanner scanner = new Scanner("3\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testInvalidOption() {
		Scanner scanner = new Scanner("69\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testMenu() {
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		visitMenu.displayMenu(scanner);
	}

	@Test
	void testValidateTimestampInput() {
		Scanner scanner = new Scanner("2023-12-31 12:00:00\n");
		LocalDateTime dateTime = visitMenu.validateTimestampInput(scanner, "Enter timestamp: ");
		System.out.println(dateTime);
	}

	@Test
	void testManageVisitForApplication() {
		Scanner scanner = new Scanner("1\nCompany Visit\n2023-12-31 12:00:00\n");
		visitMenu.manageVisitForApplication(scanner, 1);
	}

	@Test
	void testNoVisits() {
		Scanner scanner = new Scanner("1\nCompany Visit\n2023-12-31 12:00:00\n");
		visitMenu.handleNoVisit(1, scanner);
	}

	@Test
	void testExistingVisit() {
		Scanner scanner = new Scanner("1\n2\n3\n4\n");
		List<Visit> visitList = List.of(
				new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ABC Company Visit"),
				new Visit(2, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "XYZ Company Visit"));
		visitMenu.handleExistingVisit(visitList, 1, scanner);
	}

	@Test
	void testAddVisit() {
		Scanner scanner = new Scanner("Visit details\n2023-12-31 12:00:00\n");
		visitMenu.addVisitForApplication(1, scanner);
	}

	@Test
	void testEditVisit() throws ParseException {
		Scanner scanner = new Scanner("2023-12-31 12:00:00\nUpdated\nVisit Details\n");
		Visit existingVisit = new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "ABC");
		visitMenu.editVisit(existingVisit, scanner);
	}

	@Test
	void testDeleteVisit() {
		Scanner scanner = new Scanner("Y\n");
		Visit existingVisit = new Visit(1, 1, Timestamp.valueOf(LocalDateTime.now()), "Scheduled", "XYZ");
		visitMenu.deleteVisit(existingVisit, scanner);
	}

	@Test
	void testEditVisitOption() {
		Scanner scanner = new Scanner("1\n");
		visitMenu.editVisitOption(scanner);
	}

	@Test
	void testDeleteVisitOption() {
		Scanner scanner = new Scanner("1\n");
		visitMenu.deleteVisitOption(scanner);
	}
}
