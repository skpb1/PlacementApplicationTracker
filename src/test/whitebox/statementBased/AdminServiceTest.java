package test.whitebox.statementBased;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.impl.mock.MockAdminRepoImpl;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;
import main.java.placementApplicationTracker.service.AdminService;

public class AdminServiceTest {
    private AdminService adminService;
    private AdminRepo mockRepo;

    @BeforeEach
    public void setUp() {
        mockRepo = new MockAdminRepoImpl();
        adminService = new AdminService(mockRepo);
    }

    @Test
    public void testGetAdminDetails() {
        Admin mockAdmin = new Admin(1, "adminPass123", "Admin User", "admin@example.com", "Administrator");
        ((MockAdminRepoImpl) adminService.getAdminRepo()).addAdmin(mockAdmin);

        Admin retrievedAdmin = adminService.getAdminDetails(1);
        assertNotNull(retrievedAdmin);
        assertEquals("Admin User", retrievedAdmin.getFullName());
        assertEquals("admin@example.com", retrievedAdmin.getEmail());
        assertEquals("Administrator", retrievedAdmin.getDesignation());
    }

    @Test
    public void testUpdateAdminPassword() {
        Admin mockAdmin = new Admin(1, "adminPass123", "Admin User", "admin@example.com", "Administrator");
        ((MockAdminRepoImpl) adminService.getAdminRepo()).addAdmin(mockAdmin);

        boolean isUpdated = adminService.updateAdminPassword(1, "adminPass123", "newAdminPass456");
        assertTrue(isUpdated);

        Admin updatedAdmin = adminService.getAdminDetails(1);
        assertEquals("newAdminPass456", updatedAdmin.getPassword());
    }

    @Test
    public void testUpdateAdminDetails() {
        Admin mockAdmin = new Admin(1, "adminPass123", "Admin User", "admin@example.com", "Administrator");
        ((MockAdminRepoImpl) adminService.getAdminRepo()).addAdmin(mockAdmin);

        boolean isUpdated = adminService.updateAdminDetails(1, "New Admin User", "newadmin@example.com", "Manager");
        assertTrue(isUpdated);

        Admin updatedAdmin = adminService.getAdminDetails(1);
        assertEquals("New Admin User", updatedAdmin.getFullName());
        assertEquals("newadmin@example.com", updatedAdmin.getEmail());
        assertEquals("Manager", updatedAdmin.getDesignation());
    }
}
