package test.whitebox.branchBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Student;

public class StudentTest {
	@Test
	void testStudent() {
		Student student = new Student();
		student.setStudentId(1);
		student.setEmail("email");
		student.setPassword("pass");
		student.setCourse("course");
		student.setFullName("name");
		student.setPassOutYear(2000);
		assertEquals(1, student.getStudentId());
		assertEquals("email", student.getEmail());
		assertEquals("pass", student.getPassword());
		assertEquals("course", student.getCourse());
		assertEquals("name", student.getFullName());
		assertEquals(2000, student.getPassOutYear());
	}
	
	@Test
	void testStudentConstructor() {
		Student student = new Student(1, "pass", "name", "email", "course", 2000);
		assertNotNull(student);
		assertEquals(1, student.getStudentId());
	}
}
