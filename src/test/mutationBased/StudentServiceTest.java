package test.mutationBased;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.service.StudentService;

public class StudentServiceTest {
	private StudentService studentService;
	private StudentRepo mockRepo;

    @BeforeEach
    public void setUp() {
        mockRepo = new MockStudentRepoImpl();
        studentService = new StudentService(mockRepo);
    }

    @Test
    public void testGetStudentDetails() {
        Student mockStudent = new Student(1, "pass123", "John Doe", "john@example.com", "Computer Science", 2022);
        ((MockStudentRepoImpl) studentService.getStudentRepo()).addStudent(mockStudent);

        Student retrievedStudent = studentService.getStudentDetails(1);
        assertNotNull(retrievedStudent);
        assertEquals("John Doe", retrievedStudent.getFullName());
        assertEquals("john@example.com", retrievedStudent.getEmail());
        assertEquals("Computer Science", retrievedStudent.getCourse());
        assertEquals(2022, retrievedStudent.getPassOutYear());
    }

    @Test
    public void testUpdateStudentPassword() {
        Student mockStudent = new Student(1, "pass123", "John Doe", "john@example.com", "Computer Science", 2022);
        ((MockStudentRepoImpl) studentService.getStudentRepo()).addStudent(mockStudent);

        boolean isUpdated = studentService.updateStudentPassword(1, "pass123", "newPass456");
        assertTrue(isUpdated);

        Student updatedStudent = studentService.getStudentDetails(1);
        assertEquals("newPass456", updatedStudent.getPassword());
    }
    
    @Test
    public void testUpdateStudentPasswordFalse() {
        boolean isUpdated = studentService.updateStudentPassword(1, "pass123", "newPass456");
        assertFalse(isUpdated);
    }
    
    @Test
    public void testUpdateStudentDetailsFalse() {
    	boolean isUpdated = studentService.updateStudentDetails(1, "Jane Doe", "jane@example.com", "Electrical Engineering", 2023);
        assertFalse(isUpdated);
    }

    @Test
    public void testUpdateStudentDetails() {
        Student mockStudent = new Student(1, "pass123", "John Doe", "john@example.com", "Computer Science", 2022);
        ((MockStudentRepoImpl) studentService.getStudentRepo()).addStudent(mockStudent);

        boolean isUpdated = studentService.updateStudentDetails(1, "Jane Doe", "jane@example.com", "Electrical Engineering", 2023);
        assertTrue(isUpdated);

        Student updatedStudent = studentService.getStudentDetails(1);
        assertEquals("Jane Doe", updatedStudent.getFullName());
        assertEquals("jane@example.com", updatedStudent.getEmail());
        assertEquals("Electrical Engineering", updatedStudent.getCourse());
        assertEquals(2023, updatedStudent.getPassOutYear());
    }
}
