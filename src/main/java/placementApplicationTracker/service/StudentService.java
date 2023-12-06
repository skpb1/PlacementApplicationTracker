package main.java.placementApplicationTracker.service;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;

public class StudentService {

	private StudentRepo studentRepo;
	
	public StudentService(StudentRepo studentRepo) {
		this.studentRepo = studentRepo;
	}
	
	public StudentRepo getStudentRepo() {
        return studentRepo;
    }
	
	 public Student getStudentDetails(int studentId) {
		 return studentRepo.getStudentDetails(studentId);
	 }
	
	 public boolean updateStudentPassword(int studentId, String currentPassword, String newPassword) {
		 return studentRepo.updateStudentPassword(studentId, currentPassword, newPassword);
	 }
	 
	 public boolean updateStudentDetails(int studentId, String updatedFullName, String updatedEmail,
           String updatedCourse, int updatedPassOutYear) {
		 return studentRepo.updateStudentDetails(studentId, updatedFullName, updatedEmail, updatedCourse, updatedPassOutYear);
	 }
}
