package test.blackbox.specificationBased;

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
    void testDisplayEditDetailsOption1Fail() {
        Scanner scanner = new Scanner("1\nemail\nDesignation\n3");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
    }

    @Test
    void testDisplayEditDetailsOption1Pass() {
        Scanner scanner = new Scanner("1\nUpdated Name\nemail@example.com\nUpdated Designation\n3");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
    }
    
    @Test
    void testEditPassword() {
        Scanner scanner = new Scanner("password\nnewPassword\nnewPassword\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.editPasswordMenu(admin, scanner);
    }

    @Test
    void testDisplayEditDetails() {
        Scanner scanner = new Scanner("1\nUpdated Name\nupdated.email@example.com\nUpdated Designation\n3");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
    }

    @Test
    void testEditPasswordMenuIncorrectPassword() {
        Scanner scanner = new Scanner("incorrectPassword\npassword\nnewPassword\nnewPassword\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.editPasswordMenu(admin, scanner);
    }

    @Test
    void testEditPasswordMismatch() {
        Scanner scanner = new Scanner("password\nnewPassword\nmismatchedPassword\nnewPassword\nnewPassword\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.editPasswordMenu(admin, scanner);
    }
    
    @Test
    void testDisplayEditDetailsInvalidOption() {
        Scanner scanner = new Scanner("4\n3");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
    }

    @Test
    void testDisplayEditDetailsException() {
        Scanner scanner = new Scanner("\n");
        Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
        detailsMenu.displayEditDetailsMenu(admin, scanner);
    }
    
    @Test
    void testGoBack() {
    	Scanner scanner = new Scanner("3\n");
    	Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
    	detailsMenu.displayEditDetailsMenu(admin, scanner);
    }
    
    @Test
    void testOption2() {
    	Scanner scanner = new Scanner("2\npassword\npass1\npass1\n3\n");
    	Admin admin = new Admin(1, "password", "Full Name", "email@example.com", "Designation");
        adminRepo.addAdmin(admin);
    	detailsMenu.displayEditDetailsMenu(admin, scanner);
    }
}
