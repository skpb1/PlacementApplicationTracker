package test.blackbox.specificationBased;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import main.java.placementApplicationTracker.model.Admin;

public class AdminTest {
	@Test
	void testAdmin() {
		Admin admin = new Admin();
		admin.setAdminId(1);
		admin.setEmail("email");
		admin.setPassword("pass");
		admin.setDesignation("des");
		admin.setFullName("name");
		assertEquals(1, admin.getAdminId());
		assertEquals("email", admin.getEmail());
		assertEquals("pass", admin.getPassword());
		assertEquals("des", admin.getDesignation());
		assertEquals("name", admin.getFullName());
	}
	
	@Test
	void testAdminConstructor() {
		Admin admin = new Admin(1, "pass", "name", "email", "des");
		assertNotNull(admin);
		assertEquals(1, admin.getAdminId());
	}
}
