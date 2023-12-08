package test.whitebox.statementBased;

import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.impl.mock.MockStudentRepoImpl;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;
import main.java.placementApplicationTracker.service.StudentService;
import main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu;

public class StudentDetailsMenuTest {
    private StudentRepo studentRepo;
    private StudentDetailsMenu detailsMenu;

    @BeforeEach
    void setup() {
        studentRepo = new MockStudentRepoImpl();
        new StudentService(studentRepo);
        detailsMenu = new StudentDetailsMenu(studentRepo);
    }
    
    @Test
    void testGoBack() {
    	Scanner scanner = new Scanner("3\n");
    	Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
    	detailsMenu.displayEditDetailsMenu(student, scanner);
    }

    @Test
    void testDisplayEditDetailsMenu() {
        Scanner scanner = new Scanner("1\nUpdated Name\nupdated.email@example.com\nUpdated Course\n2025\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
    }

    @Test
    void testEditPasswordMenu() {
        Scanner scanner = new Scanner("password\nnewPassword\nnewPassword\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.EditPasswordMenu(student, scanner);
    }

    @Test
    void testEditPasswordMenuIncorrectCurrentPassword() {
        Scanner scanner = new Scanner("incorrectPassword\npassword\nnewPassword\nnewPassword\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.EditPasswordMenu(student, scanner);
    }

    @Test
    void testEditPasswordMenuMismatchedNewPassword() {
        Scanner scanner = new Scanner("password\nnewPassword\nmismatchedPassword\nnewPassword\nnewPassword\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.EditPasswordMenu(student, scanner);
    }

    @Test
    void testDisplayEditDetailsMenuInvalidOption() {
        Scanner scanner = new Scanner("4\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
    }

    @Test
    void testDisplayEditDetailsMenuException() {
        Scanner scanner = new Scanner("\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
    }

    @Test
    void testDisplayEditDetailsMenuOption1Fail() {
        Scanner scanner = new Scanner("1\nemail\nCourse\n2025\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
    }

    @Test
    void testDisplayEditDetailsMenuOption1Pass() {
        Scanner scanner = new Scanner("1\nUpdated Name\nemail@example.com\nUpdated Course\n2025\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
    }
    
    @Test
    void testDisplayEditDetailsMenuOption2() {
        Scanner scanner = new Scanner("2\n\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
    }
}
