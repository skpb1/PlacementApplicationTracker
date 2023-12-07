package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;

public class MockAuthenticationRepoImpl implements AuthenticationRepo {

    private final MockStudentRepoImpl mockStudentRepo;
	private final MockAdminRepoImpl mockAdminRepo;
    private final Map<Integer, String> studentPasswords;
    private final Map<Integer, String> adminPasswords;
    private final Set<Integer> adminIds;
    private final Set<Integer> studentIds;

    public MockAuthenticationRepoImpl(MockStudentRepoImpl mockStudentRepo, MockAdminRepoImpl mockAdminRepo) {
        this.mockStudentRepo = mockStudentRepo;
        this.mockAdminRepo = mockAdminRepo;
        this.studentPasswords = new HashMap<>();
        this.adminPasswords = new HashMap<>();
        this.adminIds = new HashSet<>();
        this.studentIds = new HashSet<>();
    }

    @Override
    public boolean studentLogin(int studentId, String password) {
        return studentPasswords.containsKey(studentId) && studentPasswords.get(studentId).equals(password);
    }

    @Override
    public boolean adminLogin(int adminId, String password) {
        return adminPasswords.containsKey(adminId) && adminPasswords.get(adminId).equals(password);
    }

    @Override
    public boolean doesAdminIdExist(int adminId) {
        return adminIds.contains(adminId);
    }

    @Override
    public boolean doesStudentIdExist(int studentId) {
        return studentIds.contains(studentId);
    }

    @Override
    public boolean studentSignup(int studentId, String password, String fullName, String email, String course, int passOutYear) {
        if (!studentIds.contains(studentId)) {
            studentIds.add(studentId);
            studentPasswords.put(studentId, password);
            Student student = new Student(studentId, password, fullName, email, course, passOutYear);
            mockStudentRepo.addMockStudent(student);
            return true;
        }
        return false;
    }

    @Override
    public boolean adminSignup(int adminId, String password, String fullName, String email, String designation) {
        if (!adminIds.contains(adminId)) {
            adminIds.add(adminId);
            adminPasswords.put(adminId, password);
            mockAdminRepo.addMockAdmin(new Admin(adminId, password, fullName, email, designation));
            return true;
        }
        return false;
    }
}
