package main.java.placementApplicationTracker.repo.intf;

public interface AuthenticationRepo {

	boolean studentLogin(int studentId, String password);

	boolean adminLogin(int adminId, String password);

	boolean doesAdminIdExist(int adminId);

	boolean doesStudentIdExist(int studentId);

	boolean studentSignup(int studentId, String password, String fullName, String email, String course,
			int passOutYear);

	boolean adminSignup(int adminId, String password, String fullName, String email, String designation);

}
