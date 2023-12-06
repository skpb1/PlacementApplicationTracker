package main.java.placementApplicationTracker.service;

import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;

public class AuthenticationService {

	private AuthenticationRepo authenticationRepo;

    public AuthenticationService(AuthenticationRepo authenticationRepo) {
		this.authenticationRepo = authenticationRepo;
	}

	public  boolean studentLogin(int studentId, String password) {
        return authenticationRepo.studentLogin(studentId, password);
    }

    public  boolean adminLogin(int adminId, String password) {
        return authenticationRepo.adminLogin(adminId, password);
    }

    public  boolean doesAdminIdExist(int adminId) {
        return authenticationRepo.doesAdminIdExist(adminId);
    }

    public  boolean doesStudentIdExist(int studentId) {
    	return authenticationRepo.doesStudentIdExist(studentId);
    }

    public  boolean studentSignup(int studentId, String password, String fullName, String email, String course, int passOutYear) {
    	return authenticationRepo.studentSignup(studentId, password, fullName, email, course, passOutYear);
    }

    public  boolean adminSignup(int adminId, String password, String fullName, String email, String designation) {
    	return authenticationRepo.adminSignup(adminId, password, fullName, email, designation);
    }
}
