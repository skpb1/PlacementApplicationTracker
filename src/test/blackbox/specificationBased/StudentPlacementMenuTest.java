package test.blackbox.specificationBased;

import java.sql.Timestamp;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Opportunity;
import main.java.placementApplicationTracker.repo.impl.mock.MockApplicationRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.intf.ApplicationRepo;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu;

public class StudentPlacementMenuTest {
	private PlacementRepo placementRepo;
	private ApplicationRepo applicationRepo;
	private StudentPlacementMenu studentPlacementMenu;
	
	@BeforeEach
	void setup() {
		placementRepo = new MockPlacementRepoImpl();
		applicationRepo = new MockApplicationRepoImpl();
		studentPlacementMenu = new StudentPlacementMenu(placementRepo, applicationRepo);
	}
	
	@Test
	void testOption1Empty() {
		Scanner scanner = new Scanner("1\n1\n3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testOption1ExistingOpportunity() {
		Scanner scanner = new Scanner("1\n1\nResume\nCoverLetter");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testOption1ExistingApplication() {
		Scanner scanner = new Scanner("1\n1\nResume\nCoverLetter\n\n3");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		applicationRepo.createApplication(1, 1, "a", "a");
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testOption2Valid() {
		Scanner scanner = new Scanner("2\n1\ncompany\n2\n2\nrole\n2\n3\nloc\n2\n4\n100\n3000\n2\n5\n3");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testOption2Invalid() {
		Scanner scanner = new Scanner("2\n6\n4\ncompany\n3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testOption2() {
		Scanner scanner = new Scanner("2\n4\n\n\n3");
		Opportunity opportunity = new Opportunity(1, "company", "role", "desc", 2000, "loc", new Timestamp(System.currentTimeMillis()), new Timestamp(System.currentTimeMillis()),1);
		placementRepo.addOpportunity(opportunity);
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testGoBack() {
		Scanner scanner = new Scanner("3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
	
	@Test
	void testInvalidOption() {
		Scanner scanner = new Scanner("4\n3");
		studentPlacementMenu.displayPlacementOpportunities(1, scanner);
	}
}
