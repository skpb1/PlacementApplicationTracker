package main.java.placementApplicationTracker.repo.impl.mock;

import java.util.HashMap;
import java.util.Map;
import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;

public class MockAdminRepoImpl implements AdminRepo {

    private final Map<Integer, Admin> admins = new HashMap<>();

    @Override
    public Admin getAdminDetails(int adminId) {
        // Simulating retrieving admin details from a mock database
        return admins.get(adminId);
    }

    @Override
    public boolean updateAdminPassword(int adminId, String currentPassword, String newPassword) {
        // Simulating updating admin password in a mock database
        Admin admin = admins.get(adminId);
        if (admin != null && admin.getPassword().equals(currentPassword)) {
            admin.setPassword(newPassword);
            admins.put(adminId, admin);
            return true;
        }
        return false;
    }

    @Override
    public boolean updateAdminDetails(int adminId, String updatedFullName, String updatedEmail,
            String updatedDesignation) {
        // Simulating updating admin details in a mock database
        Admin admin = admins.get(adminId);
        if (admin != null) {
            admin.setFullName(updatedFullName);
            admin.setEmail(updatedEmail);
            admin.setDesignation(updatedDesignation);
            admins.put(adminId, admin);
            return true;
        }
        return false;
    }

    @Override
    public void addAdmin(Admin admin) {
    	admins.put(admin.getAdminId(), admin);
    }

}
