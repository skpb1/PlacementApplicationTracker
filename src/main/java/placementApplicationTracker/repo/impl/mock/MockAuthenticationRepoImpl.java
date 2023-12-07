package main.java.placementApplicationTracker.repo.impl.mock;
 
import java.util.ArrayList;
import java.util.List;
 
import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.intf.AuthenticationRepo;
 
public class MockAuthenticationRepoImpl implements AuthenticationRepo {
    private final List<Student> studentList = new ArrayList<>();
    private final List<Admin> adminList = new ArrayList<>();
 
    @Override
    public boolean studentLogin(int studentId, String password) {
        for(Student student : studentList) {
            if (student.getStudentId() == studentId && student.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
 
    @Override
    public boolean adminLogin(int adminId, String password) {
        for(Admin admin : adminList) {
            if (admin.getAdminId() == adminId && admin.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
 
    @Override
    public boolean doesAdminIdExist(int adminId) {
        for(Admin admin : adminList) {
            if (admin.getAdminId() == adminId) {
                return true;
            }
        }
        return false;
    }
 
    @Override
    public boolean doesStudentIdExist(int studentId) {
        for(Student student : studentList) {
            if (student.getStudentId() == studentId) {
                return true;
            }
        }
        return false;
    }
 
    @Override
    public boolean studentSignup(int studentId, String password, String fullName, String email, String course,
            int passOutYear) {
        Student student = new Student(studentId, password, fullName, email, course, passOutYear);
        return studentList.add(student);
    }
 
    @Override
    public boolean adminSignup(int adminId, String password, String fullName, String email, String designation) {
        Admin admin = new Admin(adminId, password, fullName, email, designation);
        return adminList.add(admin);
    }
}
