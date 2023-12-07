package main.java.placementApplicationTracker.repo.intf;

import main.java.placementApplicationTracker.model.Student;

public interface StudentRepo {
	public Student getStudentDetails(int studentId);
	public boolean updateStudentPassword(int studentId, String currentPassword, String newPassword);
	public boolean updateStudentDetails(int studentId, String updatedFullName, String updatedEmail,
            String updatedCourse, int updatedPassOutYear);
	public void addStudent(Student student);
}
