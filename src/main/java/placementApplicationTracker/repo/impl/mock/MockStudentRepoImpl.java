package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.HashMap;
import java.util.Map;
import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;

public class MockStudentRepoImpl implements StudentRepo {

	private final Map<Integer, Student> students = new HashMap<>();

    @Override
    public Student getStudentDetails(int studentId) {
        // Simulating retrieving student details from a mock database
        return students.get(studentId);
    }

    @Override
    public boolean updateStudentPassword(int studentId, String currentPassword, String newPassword) {
        // Simulating updating student password in a mock database
        Student student = students.get(studentId);
        if (student != null && student.getPassword().equals(currentPassword)) {
            student.setPassword(newPassword);
            students.put(studentId, student);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateStudentDetails(int studentId, String updatedFullName, String updatedEmail,
                                        String updatedCourse, int updatedPassOutYear) {
        // Simulating updating student details in a mock database
        Student student = students.get(studentId);
        if (student != null) {
            student.setFullName(updatedFullName);
            student.setEmail(updatedEmail);
            student.setCourse(updatedCourse);
            student.setPassOutYear(updatedPassOutYear);
            students.put(studentId, student);
            return true;
        }
        return false;
    }

    public void addMockStudent(Student student) {
        students.put(student.getStudentId(), student);
    }

}
