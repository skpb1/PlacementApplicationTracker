package test.whitebox.mutationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.service.AdminService;
import main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu;

public class AdminDetailsMenuTest {
    private AdminRepo adminRepo;
    private AdminDetailsMenu detailsMenu;

    @BeforeEach
    void setup() {
        adminRepo = new MockAdminRepoImpl();
        new AdminService(adminRepo);
        detailsMenu = new AdminDetailsMenu(adminRepo);
    }
    
    
    @Test
    void testGoBack() {
    	ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	Scanner scanner = new Scanner("3\n");
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
    	Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        adminRepo.addAdmin(admin);
    	detailsMenu.displayEditDetailsMenu(admin, scanner);
    	System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenu() {
        Scanner scanner = new Scanner("1\n\nUpdated Name\nupdated.email@example.com\nUpdated admin\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
    			+ "Enter updated Full Name: Enter updated Email: Enter updated Designation: Admin details updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Updated Name" + System.lineSeparator()
    			+ "Email: updated.email@example.com" + System.lineSeparator()
    			+ "Designation: Updated admin" + System.lineSeparator()
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
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
        System.setOut(originalOut);
 		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditPasswordMenu() {
        Scanner scanner = new Scanner("password\nnewPassword\nnewPassword\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        adminRepo.addAdmin(admin);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = "Enter current password: Enter new password: Confirm new password: Password updated successfully." + System.lineSeparator()
    			+ "";
        detailsMenu.editPasswordMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditPasswordMenuIncorrectCurrentPassword() {
        Scanner scanner = new Scanner("incorrectPassword\npassword\nnewPassword\nnewPassword\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = "Enter current password: Password entered is incorrect. Please try again." + System.lineSeparator()
    			+ "Enter current password: Enter new password: Confirm new password: Password updated successfully." + System.lineSeparator()
    			+ "";
        adminRepo.addAdmin(admin);
        detailsMenu.editPasswordMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testEditPasswordMenuMismatchedNewPassword() {
        Scanner scanner = new Scanner("password\nnewPassword\nmismatchedPassword\nnewPassword\nnewPassword\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = "Enter current password: Enter new password: Confirm new password: New password and confirmation do not match. Please try again." + System.lineSeparator()
    			+ "Enter new password: Confirm new password: Password updated successfully." + System.lineSeparator()
    			+ "";
        adminRepo.addAdmin(admin);
        detailsMenu.editPasswordMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuInvalidOption() {
        Scanner scanner = new Scanner("4\n3");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuException() {
        Scanner scanner = new Scanner("\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuOption1Fail() {
        Scanner scanner = new Scanner("1\n\nUpdated Name\nUpdated.email@example.com");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
    			+ "Enter updated Full Name: Enter updated Email: Enter updated Designation: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void testDisplayEditDetailsMenuOption1Pass() {
        Scanner scanner = new Scanner("1\n\nUpdated Name\nemail@example.com\nUpdated admin");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
    			+ "Enter updated Full Name: Enter updated Email: Enter updated Designation: Admin details updated successfully." + System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Updated Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: Updated admin" + System.lineSeparator()
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
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
    
    @Test
    void testDisplayEditDetailsMenuOption2() {
        Scanner scanner = new Scanner("2\n\n3");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "admin");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
		PrintStream originalOut = System.out;
		System.setOut(new PrintStream(outContent));
    	String expectedOutput = System.lineSeparator()
    			+ System.lineSeparator()
    			+ "Current Admin Details:" + System.lineSeparator()
    			+ "------------------------------------" + System.lineSeparator()
    			+ "Admin ID: 1" + System.lineSeparator()
    			+ "Full Name: Full Name" + System.lineSeparator()
    			+ "Email: email@example.com" + System.lineSeparator()
    			+ "Designation: admin" + System.lineSeparator()
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
    			+ "Enter current password: Password entered is incorrect. Please try again." + System.lineSeparator()
    			+ "Enter current password: Password entered is incorrect. Please try again." + System.lineSeparator()
    			+ "Enter current password: An unexpected error occurred. Please try again." + System.lineSeparator()
    			+ "";
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
        System.setOut(originalOut);
		assertEquals(expectedOutput, outContent.toString());
    }
}
