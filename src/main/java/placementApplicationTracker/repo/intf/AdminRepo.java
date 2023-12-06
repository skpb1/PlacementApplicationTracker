package main.java.placementApplicationTracker.repo.intf;

import main.java.placementApplicationTracker.model.Admin;

public interface AdminRepo {

	boolean updateAdminDetails(int adminId, String updatedFullName, String updatedEmail, String updatedDesignation);

	boolean updateAdminPassword(int adminId, String currentPassword, String newPassword);

	Admin getAdminDetails(int adminId);

}
