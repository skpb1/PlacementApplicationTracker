package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
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
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	Scanner scanner = new Scanner("3\n");
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "Selected: Go back" + System.lineSeparator()
    			+ "============================================" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "";
    	Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
    	detailsMenu.displayEditDetailsMenu(student, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenu() {
        Scanner scanner = new Scanner("1\nUpdated Name\nupdated.email@example.com\nUpdated Course\n2025\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "Please enter updated details below:" + System.lineSeparator()
    			+ "============================================" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Enter updated Full Name: Enter updated Email: Enter updated Course: Enter updated Pass Out Year: Student details updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Updated Name" + System.lineSeparator()
    			+ "Email: Updated Course" + System.lineSeparator()
    			+ "Course: 2025" + System.lineSeparator()
    			+ "Pass Out Year: 3" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
        System.setOut(originalOut);
 		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditPasswordMenu() {
        Scanner scanner = new Scanner("password\nnewPassword\nnewPassword\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        studentRepo.addStudent(student);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = "Enter current password: Enter new password: Confirm new password: Password updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "";
        detailsMenu.EditPasswordMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditPasswordMenuIncorrectCurrentPassword() {
        Scanner scanner = new Scanner("incorrectPassword\npassword\nnewPassword\nnewPassword\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = "Enter current password: Entered current password is not correct. Please try again." + System.lineSeparator()
    			+ "Enter current password: Enter new password: Confirm new password: Password updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.EditPasswordMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditPasswordMenuMismatchedNewPassword() {
        Scanner scanner = new Scanner("password\nnewPassword\nmismatchedPassword\nnewPassword\nnewPassword\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = "Enter current password: Enter new password: Confirm new password: New password and confirmation do not match. Please try again." + System.lineSeparator()
    			+ "Enter new password: Confirm new password: Password updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.EditPasswordMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuInvalidOption() {
        Scanner scanner = new Scanner("4\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "Invalid option. Please choose a valid option." + System.lineSeparator()
    			+ "============================================" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuException() {
        Scanner scanner = new Scanner("\n");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuOption1Fail() {
        Scanner scanner = new Scanner("1\nemail\nCourse\n2025\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "Please enter updated details below:" + System.lineSeparator()
    			+ "============================================" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Enter updated Full Name: Enter updated Email: Enter updated Course: Enter updated Pass Out Year: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuOption1Pass() {
        Scanner scanner = new Scanner("1\nUpdated Name\nemail@example.com\nUpdated Course\n2025\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "Please enter updated details below:" + System.lineSeparator()
    			+ "============================================" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Enter updated Full Name: Enter updated Email: Enter updated Course: Enter updated Pass Out Year: Student details updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Updated Name" + System.lineSeparator()
    			+ "Email: Updated Course" + System.lineSeparator()
    			+ "Course: 2025" + System.lineSeparator()
    			+ "Pass Out Year: 3" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testDisplayEditDetailsMenuOption2() {
        Scanner scanner = new Scanner("2\n\n3");
        Student student = new Student(1, "password", "Full Name", "email@example.com", "Course", 2022);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Student Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Student ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Course: Course" + System.lineSeparator()
    			+ "Pass Out Year: 2022" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Please Choose an option:" + System.lineSeparator()
    			+ "1. Edit Details" + System.lineSeparator()
    			+ "2. Update Password" + System.lineSeparator()
    			+ "3. Go back" + System.lineSeparator()
    			+ "********************************************" + System.lineSeparator()
    			+ "Enter your choice: " + System.lineSeparator()
    			+ "Selected: Update Password" + System.lineSeparator()
    			+ "============================================" + System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Enter current password: Entered current password is not correct. Please try again." + System.lineSeparator()
    			+ "Enter current password: Entered current password is not correct. Please try again." + System.lineSeparator()
    			+ "Enter current password: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        studentRepo.addStudent(student);
        detailsMenu.displayEditDetailsMenu(student, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
}
