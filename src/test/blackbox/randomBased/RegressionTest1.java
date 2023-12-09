package test.blackbox.randomBased;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setDetails("hi!");
        java.lang.String str8 = visit5.getStatus();
        visit5.setApplicationId(100);
        int int11 = visit5.getApplicationId();
        visit5.setDetails("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.sql.Timestamp timestamp8 = null;
        interview5.setDateTime(timestamp8);
        int int10 = interview5.getApplicationId();
        interview5.setStatus("hi!");
        java.lang.String str13 = interview5.getStatus();
        interview5.setType("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.studentLogin((int) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 0, "", "hi!", "hi!", 10, "", timestamp6, timestamp7, (int) (byte) -1);
        java.lang.String str10 = opportunity9.getLocation();
        opportunity9.setOpportunityId((int) (short) 0);
        int int13 = opportunity9.getAdminId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo6 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo7 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAuthMenu adminAuthMenu8 = new main.java.placementApplicationTracker.adminMenu.AdminAuthMenu(visitRepo0, authenticationRepo1, applicationRepo2, placementRepo3, assessmentRepo4, interviewRepo5, adminRepo6, feedbackRepo7);
        java.util.Scanner scanner9 = null;
        adminAuthMenu8.adminLogin(scanner9);
        java.util.Scanner scanner11 = null;
        adminAuthMenu8.adminSignup(scanner11);
        java.util.Scanner scanner13 = null;
        adminAuthMenu8.adminLogin(scanner13);
        java.util.Scanner scanner15 = null;
        adminAuthMenu8.adminSignup(scanner15);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo6 = null;
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo7 = null;
        main.java.placementApplicationTracker.studentMenu.StudentAuthMenu studentAuthMenu8 = new main.java.placementApplicationTracker.studentMenu.StudentAuthMenu(visitRepo0, assessmentRepo1, applicationRepo2, authenticationRepo3, feedbackRepo4, interviewRepo5, placementRepo6, studentRepo7);
        java.util.Scanner scanner9 = null;
        studentAuthMenu8.studentLogin(scanner9);
        java.util.Scanner scanner11 = null;
        studentAuthMenu8.studentSignup(scanner11);
        java.util.Scanner scanner13 = null;
        studentAuthMenu8.studentLogin(scanner13);
        java.util.Scanner scanner15 = null;
        studentAuthMenu8.studentSignup(scanner15);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        java.lang.String str11 = application8.getResume();
        int int12 = application8.getWithdrawn();
        java.sql.Timestamp timestamp13 = application8.getSubmissionDate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNull(timestamp13);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setDetails("hi!");
        java.lang.String str8 = visit5.getStatus();
        visit5.setVisitId(52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (short) 1, "hi!", "", "", "");
        admin5.setPassword("");
        java.lang.String str8 = admin5.getPassword();
        java.lang.String str9 = admin5.getDesignation();
        java.lang.String str10 = admin5.getFullName();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner6);
        main.java.placementApplicationTracker.model.Assessment assessment8 = new main.java.placementApplicationTracker.model.Assessment();
        assessment8.setDetails("hi!");
        assessment8.setDetails("");
        java.util.Scanner scanner13 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.deleteAssessment(assessment8, scanner13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        java.sql.Timestamp timestamp8 = null;
        java.sql.Timestamp timestamp9 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity11 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 0, "", "hi!", "hi!", 10, "", timestamp8, timestamp9, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = placementService1.addOpportunity(opportunity11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(100, 0, "hi!", timestamp3);
        int int5 = feedback4.getApplicationId();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = adminService1.updateAdminDetails((int) (byte) 100, "", "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.editVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.editVisitOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminVisitMenu1.editVisitOption(scanner8);
        java.util.Scanner scanner10 = null;
        adminVisitMenu1.deleteVisitOption(scanner10);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Assessment> assessmentList3 = assessmentService1.getAssessmentsByApplicationId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.studentMenu.StudentMenu studentMenu7 = new main.java.placementApplicationTracker.studentMenu.StudentMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, studentRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        studentMenu7.displayStudentMenu(97, scanner9);
        java.util.Scanner scanner12 = null;
        studentMenu7.displayStudentMenu(0, scanner12);
        java.util.Scanner scanner15 = null;
        studentMenu7.displayStudentMenu((int) (byte) 10, scanner15);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.displayMenu(100, scanner3);
        java.util.Scanner scanner6 = null;
        adminPlacementMenu1.addNewOpportunity((int) (byte) 0, scanner6);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Assessment assessment8 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp5, "hi!", "hi!");
        java.lang.String str9 = assessment8.getDetails();
        java.lang.String str10 = assessment8.getDetails();
        java.lang.String str11 = assessment8.getDetails();
        assessment8.setApplicationId((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = assessmentService1.updateAssessment((int) (short) 1, assessment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        int int13 = application8.getOpportunityId();
        int int14 = application8.getOpportunityId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        java.lang.String str11 = application8.getResume();
        int int12 = application8.getWithdrawn();
        java.lang.String str13 = application8.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setFullName("hi!");
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        main.java.placementApplicationTracker.model.Student student8 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str9 = student8.getFullName();
        student8.setEmail("hi!");
        java.lang.String str12 = student8.getPassword();
        java.util.Scanner scanner13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student8, scanner13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 0, "", "hi!", "hi!", 10, "", timestamp6, timestamp7, (int) (byte) -1);
        opportunity9.setSalary(100);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.addNewOpportunity((int) (short) -1, scanner3);
        java.util.Scanner scanner6 = null;
        adminPlacementMenu1.displayMenu(0, scanner6);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        visit5.setDateTime(timestamp6);
        int int8 = visit5.getVisitId();
        visit5.setApplicationId(0);
        visit5.setDetails("hi!");
        java.sql.Timestamp timestamp13 = null;
        visit5.setDateTime(timestamp13);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = assessmentService1.deleteAssessment((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        student0.setPassword("");
        student0.setCourse("");
        int int5 = student0.getPassOutYear();
        student0.setStudentId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.editVisitOption(scanner4);
        java.util.Scanner scanner7 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit(0, scanner7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        java.lang.String str11 = application8.getResume();
        int int12 = application8.getWithdrawn();
        application8.setResume("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        java.lang.String str11 = application8.getResume();
        application8.setResume("");
        int int14 = application8.getOpportunityId();
        int int15 = application8.getStudentId();
        java.sql.Timestamp timestamp16 = application8.getSubmissionDate();
        java.lang.String str17 = application8.getCoverLetter();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertNull(timestamp16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        int int6 = opportunity0.getOpportunityId();
        opportunity0.setRole("hi!");
        java.sql.Timestamp timestamp9 = null;
        opportunity0.setCloseDate(timestamp9);
        org.junit.Assert.assertNull(timestamp1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        main.java.placementApplicationTracker.model.Admin admin10 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str11 = admin10.getDesignation();
        java.util.Scanner scanner12 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin10, scanner12);
        main.java.placementApplicationTracker.model.Admin admin14 = null;
        java.util.Scanner scanner15 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin14, scanner15);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo17 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu18 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo17);
        main.java.placementApplicationTracker.model.Admin admin24 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner25 = null;
        adminDetailsMenu18.displayEditDetailsMenu(admin24, scanner25);
        java.lang.String str27 = admin24.getPassword();
        admin24.setEmail("");
        java.util.Scanner scanner30 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin24, scanner30);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo32 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu33 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo32);
        main.java.placementApplicationTracker.model.Admin admin39 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner40 = null;
        adminDetailsMenu33.displayEditDetailsMenu(admin39, scanner40);
        admin39.setDesignation("hi!");
        admin39.setEmail("");
        java.util.Scanner scanner46 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDetailsMenu1.editPasswordMenu(admin39, scanner46);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.lang.String str1 = opportunity0.getDescription();
        java.lang.String str2 = opportunity0.getLocation();
        java.lang.String str3 = opportunity0.getLocation();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment((int) '#', (-1), timestamp2, "hi!", "");
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setPassword("");
        student0.setEmail("");
        student0.setPassOutYear(52);
        java.lang.String str8 = student0.getCourse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.studentMenu.StudentMenu studentMenu7 = new main.java.placementApplicationTracker.studentMenu.StudentMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, studentRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        studentMenu7.displayStudentMenu(97, scanner9);
        java.util.Scanner scanner12 = null;
        studentMenu7.displayStudentMenu(0, scanner12);
        java.util.Scanner scanner15 = null;
        studentMenu7.displayStudentMenu((int) (byte) 0, scanner15);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        int int2 = feedback0.getApplicationId();
        feedback0.setApplicationId((int) (byte) 0);
        feedback0.setFeedbackId((int) ' ');
        java.lang.String str7 = feedback0.getComments();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.editVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.deleteVisitOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminVisitMenu1.displayMenu(scanner8);
        java.util.Scanner scanner11 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit((int) (byte) 1, scanner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (short) 1, "hi!", "", "", "");
        admin5.setAdminId((int) (short) 1);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        student0.setPassword("");
        java.lang.String str3 = student0.getFullName();
        java.lang.String str4 = student0.getEmail();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        java.sql.Timestamp timestamp4 = null;
        opportunity0.setOpenDate(timestamp4);
        opportunity0.setOpportunityId((int) (short) -1);
        opportunity0.setOpportunityId((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        opportunity0.setDescription("");
        opportunity0.setAdminId((int) (byte) 10);
        java.sql.Timestamp timestamp10 = opportunity0.getOpenDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(timestamp10);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication(32, 0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(0, (int) (byte) 100, timestamp2, "", "");
        assessment5.setAssessmentId(97);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = new main.java.placementApplicationTracker.model.Opportunity();
        java.lang.String str4 = opportunity3.getDescription();
        java.sql.Timestamp timestamp5 = opportunity3.getOpenDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = placementService1.updateOpportunity(0, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(timestamp5);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp2, "hi!", "hi!");
        java.lang.String str6 = assessment5.getDetails();
        java.lang.String str7 = assessment5.getDetails();
        java.lang.String str8 = assessment5.getDetails();
        assessment5.setApplicationId((int) (short) 0);
        java.sql.Timestamp timestamp11 = assessment5.getDateTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(timestamp11);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.deleteVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.displayMenu(scanner6);
        main.java.placementApplicationTracker.model.Visit visit8 = new main.java.placementApplicationTracker.model.Visit();
        java.lang.String str9 = visit8.getDetails();
        visit8.setApplicationId(10);
        java.lang.String str12 = visit8.getStatus();
        adminVisitMenu1.displayVisitDetails(visit8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setFullName("");
        java.lang.String str4 = student0.getFullName();
        student0.setStudentId((int) (short) 1);
        java.lang.String str7 = student0.getFullName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByStudent(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        java.lang.String str10 = admin7.getFullName();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner2, (java.lang.Integer) (-1));
        java.util.Scanner scanner5 = null;
        adminInterviewMenu1.displayMenu(scanner5);
        java.util.Scanner scanner7 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner7, (java.lang.Integer) 52);
        java.util.Scanner scanner10 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner10, (java.lang.Integer) 52);
        java.util.Scanner scanner13 = null;
        adminInterviewMenu1.displayMenu(scanner13);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (byte) 100, (int) '4', 0, "", timestamp4, (int) (byte) 100, "hi!", "hi!");
        application8.setStatus("hi!");
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        main.java.placementApplicationTracker.model.Student student6 = new main.java.placementApplicationTracker.model.Student((int) (byte) -1, "hi!", "hi!", "", "hi!", (int) (short) -1);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        java.lang.String str1 = interview0.getType();
        int int2 = interview0.getInterviewId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.addNewOpportunity((int) (short) 0, scanner3);
        java.util.Scanner scanner6 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminPlacementMenu1.handleFilterOption(10, scanner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Assessment> assessmentList3 = assessmentService1.getAssessmentsByApplicationId((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getType();
        interview5.setApplicationId((int) ' ');
        interview5.setType("");
        interview5.setStatus("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByStudent((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu studentPlacementMenu2 = new main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu(placementRepo0, applicationRepo1);
        java.util.Scanner scanner4 = null;
        studentPlacementMenu2.displayPlacementOpportunities((int) '#', scanner4);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        feedback0.setApplicationId((int) '4');
        java.sql.Timestamp timestamp4 = feedback0.getDateTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(timestamp4);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        main.java.placementApplicationTracker.model.Admin admin0 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str1 = admin0.getEmail();
        java.lang.String str2 = admin0.getPassword();
        admin0.setAdminId(0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        feedback0.setComments("hi!");
        java.sql.Timestamp timestamp4 = feedback0.getDateTime();
        feedback0.setApplicationId((int) (short) -1);
        java.sql.Timestamp timestamp7 = feedback0.getDateTime();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(timestamp4);
        org.junit.Assert.assertNull(timestamp7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        opportunity0.setCompanyName("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.lang.String str1 = opportunity0.getDescription();
        java.sql.Timestamp timestamp2 = null;
        opportunity0.setCloseDate(timestamp2);
        java.lang.String str4 = opportunity0.getCompanyName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        application8.setCoverLetter("");
        application8.setStatus("");
        int int16 = application8.getOpportunityId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = authenticationService1.doesStudentIdExist((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity2 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp3 = opportunity2.getOpenDate();
        opportunity2.setLocation("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = placementService1.addOpportunity(opportunity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(timestamp3);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.lang.String str1 = opportunity0.getDescription();
        java.sql.Timestamp timestamp2 = null;
        opportunity0.setCloseDate(timestamp2);
        java.sql.Timestamp timestamp4 = null;
        opportunity0.setCloseDate(timestamp4);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.editVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.deleteVisitOption(scanner6);
        java.sql.Timestamp timestamp10 = null;
        main.java.placementApplicationTracker.model.Visit visit13 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp10, "", "hi!");
        java.sql.Timestamp timestamp14 = null;
        visit13.setDateTime(timestamp14);
        visit13.setVisitId(100);
        java.util.Scanner scanner18 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.deleteVisit(visit13, scanner18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = studentService1.updateStudentDetails(52, "", "hi!", "hi!", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner8);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        int int6 = opportunity0.getOpportunityId();
        java.sql.Timestamp timestamp7 = null;
        opportunity0.setCloseDate(timestamp7);
        org.junit.Assert.assertNull(timestamp1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) -1);
        application8.setStatus("");
        int int15 = application8.getOpportunityId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) 'a', (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        feedback0.setComments("hi!");
        int int4 = feedback0.getApplicationId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Visit visit8 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp5, "", "hi!");
        visit8.setDetails("hi!");
        java.lang.String str11 = visit8.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = visitService1.updateVisit((int) (short) 10, visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.displayMenu(scanner6);
        java.util.Scanner scanner8 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner8);
        java.util.Scanner scanner10 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner10);
        java.util.Scanner scanner12 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner12, (java.lang.Integer) 1);
        java.util.Scanner scanner15 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner15);
        java.util.Scanner scanner17 = null;
        adminAssessmentMenu1.displayMenu(scanner17);
        java.sql.Timestamp timestamp21 = null;
        main.java.placementApplicationTracker.model.Assessment assessment24 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp21, "hi!", "hi!");
        java.lang.String str25 = assessment24.getDetails();
        java.lang.String str26 = assessment24.getDetails();
        java.util.Scanner scanner27 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.deleteAssessment(assessment24, scanner27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(1, 1, "hi!", timestamp3);
        feedback4.setFeedbackId((int) '#');
        int int7 = feedback4.getFeedbackId();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 35 + "'", int7 == 35);
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) (byte) -1, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        java.sql.Timestamp timestamp13 = application8.getSubmissionDate();
        java.lang.String str14 = application8.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(timestamp13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.displayMenu(scanner6);
        java.util.Scanner scanner8 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner8);
        java.util.Scanner scanner10 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner10);
        java.util.Scanner scanner12 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner12, (java.lang.Integer) 1);
        java.util.Scanner scanner15 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner15);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu studentInterviewMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu(interviewRepo0);
        java.util.Scanner scanner3 = null;
        studentInterviewMenu1.displayInterviewMenu(1, scanner3);
        java.util.Scanner scanner6 = null;
        studentInterviewMenu1.displayInterviewMenu(10, scanner6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus(32, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = new main.java.placementApplicationTracker.model.Opportunity();
        int int4 = opportunity3.getSalary();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = placementService1.updateOpportunity((int) (short) 1, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = interviewService1.deleteInterview((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        int int1 = student0.getPassOutYear();
        java.lang.String str2 = student0.getPassword();
        java.lang.String str3 = student0.getEmail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        feedback0.setComments("");
        java.sql.Timestamp timestamp4 = null;
        feedback0.setDateTime(timestamp4);
        java.sql.Timestamp timestamp6 = feedback0.getDateTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(timestamp6);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.addNewOpportunity((int) (short) 0, scanner3);
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminPlacementMenu1.filterOpportunities(scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication(100, 1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner2, (java.lang.Integer) 97);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo2 = adminService1.getAdminRepo();
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo3 = adminService1.getAdminRepo();
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo4 = adminService1.getAdminRepo();
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Admin admin6 = adminService1.getAdminDetails((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(adminRepo2);
        org.junit.Assert.assertNull(adminRepo3);
        org.junit.Assert.assertNull(adminRepo4);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Assessment assessment7 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp4, "hi!", "hi!");
        java.lang.String str8 = assessment7.getDetails();
        assessment7.setStatus("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = assessmentService1.addAssessment(assessment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 0, "", "hi!", "hi!", 10, "", timestamp6, timestamp7, (int) (byte) -1);
        java.lang.String str10 = opportunity9.getLocation();
        java.lang.Class<?> wildcardClass11 = opportunity9.getClass();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.studentMenu.StudentApplicationMenu studentApplicationMenu5 = new main.java.placementApplicationTracker.studentMenu.StudentApplicationMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        studentApplicationMenu5.displayApplicationMenu((int) (short) -1, scanner7);
        java.util.Scanner scanner10 = null;
        studentApplicationMenu5.displayApplicationMenu((int) (byte) 0, scanner10);
        java.util.Scanner scanner13 = null;
        studentApplicationMenu5.displayApplicationMenu((int) ' ', scanner13);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setStatus("");
        visit5.setStatus("hi!");
        int int12 = visit5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) -1, (-1), timestamp2, "hi!", "");
        interview5.setStatus("");
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.lang.Class<?> wildcardClass2 = adminVisitMenu1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        interview5.setDateTime(timestamp6);
        int int8 = interview5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 97 + "'", int8 == 97);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) 100);
        application8.setApplicationId((int) (byte) 1);
        java.lang.String str15 = application8.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authenticationService1.studentSignup(32, "", "", "hi!", "hi!", 52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = studentService1.updateStudentPassword(32, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        application8.setCoverLetter("");
        application8.setWithdrawn(32);
        application8.setResume("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getType();
        interview5.setApplicationId((int) ' ');
        interview5.setInterviewId(97);
        int int11 = interview5.getInterviewId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 97 + "'", int11 == 97);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setFullName("hi!");
        student0.setEmail("");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        int int6 = opportunity0.getAdminId();
        java.sql.Timestamp timestamp7 = opportunity0.getCloseDate();
        java.lang.String str8 = opportunity0.getLocation();
        opportunity0.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(timestamp7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = studentService1.updateStudentPassword(52, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu studentApplicationDetailMenu5 = new main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        studentApplicationDetailMenu5.displayMenu(100, scanner7);
        java.util.Scanner scanner10 = null;
        studentApplicationDetailMenu5.displayMenu(52, scanner10);
        java.util.Scanner scanner13 = null;
        studentApplicationDetailMenu5.displayMenu((int) '#', scanner13);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 0, "", "hi!", "hi!", 10, "", timestamp6, timestamp7, (int) (byte) -1);
        java.sql.Timestamp timestamp10 = opportunity9.getCloseDate();
        java.sql.Timestamp timestamp11 = null;
        opportunity9.setCloseDate(timestamp11);
        org.junit.Assert.assertNull(timestamp10);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 0, (int) (byte) 10, timestamp2, "", "");
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = studentService1.updateStudentPassword((int) (byte) 10, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getCourse();
        student0.setStudentId(0);
        int int4 = student0.getPassOutYear();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(1, 1, "hi!", timestamp3);
        feedback4.setFeedbackId((int) '#');
        feedback4.setFeedbackId((int) '#');
        feedback4.setApplicationId((int) (byte) 0);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails(0, "hi!", "", "hi!", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = assessmentService1.deleteAssessment((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        main.java.placementApplicationTracker.model.Assessment assessment3 = new main.java.placementApplicationTracker.model.Assessment();
        int int4 = assessment3.getAssessmentId();
        int int5 = assessment3.getAssessmentId();
        java.lang.String str6 = assessment3.getStatus();
        int int7 = assessment3.getApplicationId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = assessmentService1.updateAssessment((int) '#', assessment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (byte) 100, (int) '4', 0, "", timestamp4, (int) (byte) 100, "hi!", "hi!");
        int int9 = application8.getApplicationId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        main.java.placementApplicationTracker.model.Visit visit0 = new main.java.placementApplicationTracker.model.Visit();
        java.lang.String str1 = visit0.getDetails();
        visit0.setApplicationId(10);
        visit0.setApplicationId((int) (short) 10);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.displayMenu(scanner6);
        java.util.Scanner scanner8 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner8);
        java.util.Scanner scanner10 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner10);
        java.util.Scanner scanner12 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner12, (java.lang.Integer) 1);
        java.util.Scanner scanner15 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner15, (java.lang.Integer) 52);
        java.util.Scanner scanner18 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner18);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.adminLogin(35, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setFullName("hi!");
        java.lang.String str4 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.deleteVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.editVisitOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminVisitMenu1.deleteVisitOption(scanner8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        int int11 = application8.getOpportunityId();
        int int12 = application8.getStudentId();
        java.lang.String str13 = application8.getResume();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication((int) ' ', (int) (byte) 0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.displayMenu(scanner8);
        java.util.Scanner scanner10 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner10, (java.lang.Integer) 52);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Assessment> assessmentList3 = assessmentService1.getAssessmentsByApplicationId(35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        int int11 = application8.getOpportunityId();
        int int12 = application8.getOpportunityId();
        java.lang.String str13 = application8.getStatus();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = studentService1.updateStudentDetails((int) (byte) 100, "", "", "hi!", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) 'a', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.deleteVisitOption(scanner4);
        java.sql.Timestamp timestamp8 = null;
        main.java.placementApplicationTracker.model.Visit visit11 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp8, "", "hi!");
        java.sql.Timestamp timestamp12 = null;
        visit11.setDateTime(timestamp12);
        int int14 = visit11.getVisitId();
        adminVisitMenu1.displayVisitDetails(visit11);
        int int16 = visit11.getVisitId();
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        visit5.setDateTime(timestamp6);
        int int8 = visit5.getVisitId();
        visit5.setApplicationId(0);
        visit5.setVisitId(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = authenticationService1.doesAdminIdExist((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.adminMenu.AdminMenu adminMenu7 = new main.java.placementApplicationTracker.adminMenu.AdminMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, adminRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        adminMenu7.displayAdminMenu((int) (byte) 10, scanner9);
        java.util.Scanner scanner12 = null;
        adminMenu7.displayAdminMenu((int) (byte) 0, scanner12);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp5, "", "hi!");
        java.lang.String str9 = interview8.getStatus();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = interviewService1.updateInterview(100, interview8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }
}

