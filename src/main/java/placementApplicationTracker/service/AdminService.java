package main.java.placementApplicationTracker.service;

import main.java.placementApplicationTracker.model.Admin;
import main.java.placementApplicationTracker.repo.intf.AdminRepo;

public class AdminService {

	private AdminRepo adminRepo;
	
	

	public AdminService(AdminRepo adminRepo) {
		this.adminRepo = adminRepo;
	}

	public Admin getAdminDetails(int adminId) {
		return adminRepo.getAdminDetails(adminId);
	}

	public boolean updateAdminPassword(int adminId, String currentPassword, String newPassword) {
		return adminRepo.updateAdminPassword(adminId, currentPassword, newPassword);
	}

	public boolean updateAdminDetails(int adminId, String updatedFullName, String updatedEmail,
			String updatedDesignation) {
		return adminRepo.updateAdminDetails(adminId, updatedFullName, updatedEmail, updatedDesignation);
	}
}
