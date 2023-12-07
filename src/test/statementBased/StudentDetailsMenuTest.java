package test.statementBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu;

public class StudentDetailsMenuTest {
	private StudentRepo studentRepo;
	private StudentDetailsMenu menu;
	
	@BeforeEach
	void setup() {
		studentRepo = new MockStudentRepoImpl();
		menu = new StudentDetailsMenu(studentRepo);
	}
	
	@Test
	void testInvalidOption() {
		Scanner scanner = new Scanner("4\n3");
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		menu.displayEditDetailsMenu(student, scanner);
	}
	
	@Test
	void testException() {
		Scanner scanner = new Scanner("\n");
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		menu.displayEditDetailsMenu(student, scanner);
	}
	
	@Test
	void testOption1Fail() {
		Scanner scanner = new Scanner("1\nemail\ncourse\n2021\n3");
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		menu.displayEditDetailsMenu(student, scanner);
	}
	
	@Test
	void testOption1Pass() {
		Scanner scanner = new Scanner("1\nname\nemail\ncourse\n2021\n3");
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		studentRepo.addStudent(student);
		menu.displayEditDetailsMenu(student, scanner);
	}
	
	@Test
	void testOption2() {
		Scanner scanner = new Scanner("2\npass\n\npass1\npass\n");
		Student student = new Student(1, "pass", "name", "email", "course", 2021);
		studentRepo.addStudent(student);
		menu.displayEditDetailsMenu(student, scanner);
	}
}
