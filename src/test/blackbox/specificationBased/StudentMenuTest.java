package test.blackbox.specificationBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.impl.mock.MockPlacementRepoImpl;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.PlacementRepo;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.studentMenu.StudentMenu;

public class StudentMenuTest {
	private PlacementRepo placementRepo;
	private StudentRepo studentRepo;
	private StudentMenu studentMenu;

	@BeforeEach
	void setup() {
		placementRepo = new MockPlacementRepoImpl();
		studentRepo = new MockStudentRepoImpl();
		studentMenu = new StudentMenu(null, null, placementRepo, null, null, studentRepo, null);
	}

	@Test
	void testOption1() {
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		studentRepo.addStudent(student);
		Scanner scanner = new Scanner("1\n3\n4");
		studentMenu.displayStudentMenu(1, scanner);
	}

	@Test
	void testOption2() {
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		studentRepo.addStudent(student);
		Scanner scanner = new Scanner("2\n2\n4");
		studentMenu.displayStudentMenu(1, scanner);
	}

	@Test
	void testOption3() {
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		studentRepo.addStudent(student);
		Scanner scanner = new Scanner("3\n2\n4");
		studentMenu.displayStudentMenu(1, scanner);
	}

	@Test
	void testLogout() {
		Scanner scanner = new Scanner("4\n");
		studentMenu.displayStudentMenu(1, scanner);
	}

	@Test
	void testInvalidOption() {
		Scanner scanner = new Scanner("5\n4");
		studentMenu.displayStudentMenu(1, scanner);
	}

	@Test
	void testOptionsNullStudent() {
		Scanner scanner = new Scanner("1\n2\n3\n4");
		studentMenu.displayStudentMenu(1, scanner);
	}
}
