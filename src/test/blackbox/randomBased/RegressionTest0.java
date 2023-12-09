package test.blackbox.randomBased;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu studentInterviewMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu(interviewRepo0);
        java.util.Scanner scanner3 = null;
        studentInterviewMenu1.displayInterviewMenu((int) (short) 1, scanner3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Visit visit3 = visitService1.getVisitById((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList2 = placementService1.getOpportunities();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails((int) (byte) 0, "hi!", "hi!", "", (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication(10, 10, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList3 = placementService1.getOpportunitiesByLocation("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu studentAssessmentMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner3 = null;
        studentAssessmentMenu1.displayAssessmentMenu(1, scanner3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = feedbackService1.addFeedback((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails(0, "", "", "", 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        main.java.placementApplicationTracker.model.Admin admin15 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner16 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDetailsMenu1.editPasswordMenu(admin15, scanner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        main.java.placementApplicationTracker.model.Assessment assessment3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = assessmentService1.updateAssessment((int) (short) 100, assessment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication((int) (byte) 1, (-1), "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Visit visit3 = visitService1.getVisitById((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        application8.setStatus("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner6, (java.lang.Integer) 100);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList2 = applicationService1.getAllApplications();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Feedback feedback3 = feedbackService1.getFeedbackByFeedbackId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = feedbackService1.addFeedback(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = placementService1.updateOpportunity((int) ' ', opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        interview0.setInterviewId(10);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setFullName("hi!");
        java.util.Scanner scanner6 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student2, scanner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        interview0.setInterviewId((int) (short) 10);
        int int3 = interview0.getInterviewId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = authenticationService1.doesAdminIdExist((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) (byte) 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = placementService1.updateOpportunity(1, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        java.sql.Timestamp timestamp2 = null;
        feedback0.setDateTime(timestamp2);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp5, "", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = interviewService1.updateInterview(0, interview8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Interview interview3 = interviewService1.getInterviewById(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList3 = placementService1.getOpportunitiesByRole("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner3 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleNoAssessment((int) 'a', scanner3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (short) 1, "hi!", "", "", "");
        java.lang.String str6 = admin5.getFullName();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        main.java.placementApplicationTracker.model.Interview interview4 = new main.java.placementApplicationTracker.model.Interview();
        interview4.setInterviewId((int) (short) 10);
        int int7 = interview4.getInterviewId();
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview();
        main.java.placementApplicationTracker.model.Interview[] interviewArray9 = new main.java.placementApplicationTracker.model.Interview[] { interview4, interview8 };
        java.util.ArrayList<main.java.placementApplicationTracker.model.Interview> interviewList10 = new java.util.ArrayList<main.java.placementApplicationTracker.model.Interview>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<main.java.placementApplicationTracker.model.Interview>) interviewList10, interviewArray9);
        java.util.Scanner scanner13 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleExistingInterview((java.util.List<main.java.placementApplicationTracker.model.Interview>) interviewList10, (int) (short) -1, scanner13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertNotNull(interviewArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.studentLogin(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList2 = visitService1.getVisits();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication(52, (int) (byte) 100, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        int int1 = student0.getPassOutYear();
        int int2 = student0.getStudentId();
        student0.setCourse("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        student2.setPassword("");
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student2, scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (short) 1, "hi!", "", "", "");
        java.lang.Class<?> wildcardClass6 = admin5.getClass();
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = assessmentService1.deleteAssessment(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = studentService1.updateStudentDetails(100, "hi!", "hi!", "", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Interview interview3 = interviewService1.getInterviewById((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) '#', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = studentService1.updateStudentDetails((int) 'a', "hi!", "", "hi!", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu studentAssessmentMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner3 = null;
        studentAssessmentMenu1.displayAssessmentMenu(10, scanner3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Feedback feedback3 = feedbackService1.getFeedbackByFeedbackId((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setLocation("hi!");
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        java.lang.Class<?> wildcardClass11 = application8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Application application3 = applicationService1.getApplicationByAppId(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        visit5.setDateTime(timestamp6);
        java.sql.Timestamp timestamp8 = null;
        visit5.setDateTime(timestamp8);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity2 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp3 = opportunity2.getOpenDate();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = placementService1.addOpportunity(opportunity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(timestamp3);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Feedback feedback3 = feedbackService1.getFeedbackByFeedbackId(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setPassword("");
        java.lang.String str4 = student0.getCourse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        interview0.setStatus("");
        interview0.setType("hi!");
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authenticationService1.studentSignup(100, "hi!", "hi!", "hi!", "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        main.java.placementApplicationTracker.model.Assessment assessment2 = new main.java.placementApplicationTracker.model.Assessment();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = assessmentService1.addAssessment(assessment2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Interview> interviewList2 = interviewService1.getInterviews();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Visit visit8 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp5, "", "hi!");
        visit8.setVisitId((int) (byte) 0);
        visit8.setStatus("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = visitService1.updateVisit(0, visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        student2.setFullName("hi!");
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student2, scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        visit5.setDateTime(timestamp6);
        int int8 = visit5.getVisitId();
        visit5.setApplicationId(0);
        int int11 = visit5.getVisitId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList3 = placementService1.getOpportunitiesByCompanyName("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authenticationService1.studentSignup((int) (short) -1, "hi!", "hi!", "hi!", "hi!", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Assessment> assessmentList2 = assessmentService1.getAssessments();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu adminApplicationMenu5 = new main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        adminApplicationMenu5.displayMenu((int) (byte) 1, scanner7);
        java.util.Scanner scanner10 = null;
        adminApplicationMenu5.displayMenu((int) (short) 1, scanner10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        main.java.placementApplicationTracker.model.Admin admin0 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str1 = admin0.getEmail();
        java.lang.String str2 = admin0.getEmail();
        int int3 = admin0.getAdminId();
        java.lang.String str4 = admin0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        java.lang.String str10 = admin7.getPassword();
        admin7.setAdminId((int) (short) 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        main.java.placementApplicationTracker.model.Interview interview3 = new main.java.placementApplicationTracker.model.Interview();
        interview3.setStatus("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = interviewService1.updateInterview(1, interview3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authenticationService1.studentSignup((int) (byte) 1, "", "", "", "", 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus((int) (short) 100, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (byte) 0, 1, timestamp2, "", "hi!");
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        java.lang.String str3 = opportunity0.getDescription();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Admin admin3 = adminService1.getAdminDetails((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Interview interview3 = interviewService1.getInterviewById((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Visit visit3 = visitService1.getVisitById((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        feedback0.setComments("");
        java.sql.Timestamp timestamp4 = feedback0.getDateTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(timestamp4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(0, (int) '4', "hi!", timestamp3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Feedback> feedbackList3 = feedbackService1.getFeedbacksByApplicationId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        opportunity0.setCompanyName("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview(0, 100, timestamp2, "hi!", "hi!");
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        application8.setWithdrawn(0);
        application8.setCoverLetter("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) (byte) 10, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setStudentId(0);
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        main.java.placementApplicationTracker.model.Student student8 = new main.java.placementApplicationTracker.model.Student();
        student8.setPassword("hi!");
        student8.setPassOutYear((int) (byte) -1);
        java.util.Scanner scanner13 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student8, scanner13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        java.lang.String str2 = student0.getPassword();
        student0.setPassword("");
        student0.setPassword("");
        student0.setPassword("hi!");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = visitService1.deleteVisit((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        java.sql.Timestamp timestamp2 = feedback0.getDateTime();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(timestamp2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) ' ', "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        admin7.setDesignation("hi!");
        admin7.setFullName("");
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) (short) 1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (byte) 100, (int) '4', 0, "", timestamp4, (int) (byte) 100, "hi!", "hi!");
        int int9 = application8.getWithdrawn();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setStudentId(0);
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        main.java.placementApplicationTracker.model.Student student8 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str9 = student8.getFullName();
        student8.setPassword("");
        java.util.Scanner scanner12 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student8, scanner12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity3.setCompanyName("");
        int int6 = opportunity3.getAdminId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = placementService1.updateOpportunity((int) (short) 10, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        java.sql.Timestamp timestamp11 = null;
        application8.setSubmissionDate(timestamp11);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Feedback> feedbackList3 = feedbackService1.getFeedbacksByApplicationId(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview((int) 'a', scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.sql.Timestamp timestamp6 = null;
        main.java.placementApplicationTracker.model.Interview interview9 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp6, "", "hi!");
        java.lang.String str10 = interview9.getStatus();
        interview9.setType("hi!");
        java.sql.Timestamp timestamp13 = interview9.getDateTime();
        int int14 = interview9.getApplicationId();
        java.util.Scanner scanner15 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.deleteInterview(interview9, scanner15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(timestamp13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = visitService1.deleteVisit((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = interviewService1.deleteInterview((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        main.java.placementApplicationTracker.model.Admin admin0 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str1 = admin0.getEmail();
        java.lang.String str2 = admin0.getPassword();
        admin0.setAdminId((int) (byte) 100);
        java.lang.String str5 = admin0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = authenticationService1.adminSignup(10, "hi!", "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authenticationService1.studentSignup(52, "", "hi!", "", "hi!", 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Opportunity opportunity3 = placementService1.getOpportunityById(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Interview> interviewList3 = interviewService1.getInterviewsByApplicationId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner2, (java.lang.Integer) 97);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        main.java.placementApplicationTracker.model.Interview interview3 = new main.java.placementApplicationTracker.model.Interview();
        java.lang.String str4 = interview3.getType();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = interviewService1.updateInterview(10, interview3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = authenticationService1.doesAdminIdExist((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(100, (int) (short) 100, timestamp2, "", "hi!");
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.sql.Timestamp timestamp6 = null;
        main.java.placementApplicationTracker.model.Interview interview9 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp6, "", "hi!");
        java.util.Scanner scanner10 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.deleteInterview(interview9, scanner10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Visit visit3 = visitService1.getVisitById((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setResume("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Opportunity opportunity3 = placementService1.getOpportunityById(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.lang.String str6 = visit5.getDetails();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        java.sql.Timestamp timestamp13 = application8.getSubmissionDate();
        int int14 = application8.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(timestamp13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Application application3 = applicationService1.getApplicationByAppId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Admin admin3 = adminService1.getAdminDetails((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList3 = placementService1.getOpportunitiesByLocation("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Admin admin3 = adminService1.getAdminDetails((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus((int) (short) -1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) (short) -1, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner7 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview(10, scanner7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity3.setCompanyName("");
        int int6 = opportunity3.getAdminId();
        java.lang.String str7 = opportunity3.getRole();
        java.lang.String str8 = opportunity3.getCompanyName();
        java.lang.String str9 = opportunity3.getLocation();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = placementService1.updateOpportunity(0, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        interview0.setStatus("");
        interview0.setStatus("hi!");
        interview0.setInterviewId((int) (short) 1);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        visit5.setDateTime(timestamp6);
        int int8 = visit5.getVisitId();
        int int9 = visit5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner2);
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview((int) (short) 100, scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        main.java.placementApplicationTracker.model.Admin admin0 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str1 = admin0.getEmail();
        java.lang.String str2 = admin0.getPassword();
        java.lang.String str3 = admin0.getDesignation();
        java.lang.String str4 = admin0.getFullName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        java.lang.String str4 = opportunity0.getRole();
        java.lang.String str5 = opportunity0.getCompanyName();
        java.lang.String str6 = opportunity0.getLocation();
        int int7 = opportunity0.getAdminId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.displayMenu(scanner4);
        java.util.Scanner scanner7 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit((int) '#', scanner7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        main.java.placementApplicationTracker.model.Assessment assessment6 = new main.java.placementApplicationTracker.model.Assessment();
        java.lang.String str7 = assessment6.getDetails();
        main.java.placementApplicationTracker.model.Assessment assessment8 = new main.java.placementApplicationTracker.model.Assessment();
        int int9 = assessment8.getAssessmentId();
        main.java.placementApplicationTracker.model.Assessment assessment10 = new main.java.placementApplicationTracker.model.Assessment();
        assessment10.setDetails("hi!");
        main.java.placementApplicationTracker.model.Assessment assessment13 = new main.java.placementApplicationTracker.model.Assessment();
        assessment13.setDetails("hi!");
        main.java.placementApplicationTracker.model.Assessment assessment16 = new main.java.placementApplicationTracker.model.Assessment();
        int int17 = assessment16.getAssessmentId();
        main.java.placementApplicationTracker.model.Assessment assessment18 = new main.java.placementApplicationTracker.model.Assessment();
        int int19 = assessment18.getAssessmentId();
        int int20 = assessment18.getAssessmentId();
        java.lang.String str21 = assessment18.getStatus();
        int int22 = assessment18.getApplicationId();
        main.java.placementApplicationTracker.model.Assessment assessment23 = new main.java.placementApplicationTracker.model.Assessment();
        int int24 = assessment23.getAssessmentId();
        int int25 = assessment23.getAssessmentId();
        java.lang.String str26 = assessment23.getStatus();
        int int27 = assessment23.getApplicationId();
        main.java.placementApplicationTracker.model.Assessment assessment28 = new main.java.placementApplicationTracker.model.Assessment();
        assessment28.setDetails("hi!");
        main.java.placementApplicationTracker.model.Assessment[] assessmentArray31 = new main.java.placementApplicationTracker.model.Assessment[] { assessment6, assessment8, assessment10, assessment13, assessment16, assessment18, assessment23, assessment28 };
        java.util.ArrayList<main.java.placementApplicationTracker.model.Assessment> assessmentList32 = new java.util.ArrayList<main.java.placementApplicationTracker.model.Assessment>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<main.java.placementApplicationTracker.model.Assessment>) assessmentList32, assessmentArray31);
        java.util.Scanner scanner35 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleExistingAssessment((java.util.List<main.java.placementApplicationTracker.model.Assessment>) assessmentList32, 0, scanner35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(assessmentArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setStudentId(0);
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        main.java.placementApplicationTracker.model.Student student8 = new main.java.placementApplicationTracker.model.Student();
        int int9 = student8.getPassOutYear();
        java.lang.String str10 = student8.getFullName();
        java.util.Scanner scanner11 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student8, scanner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Student student4 = studentService1.getStudentDetails((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        int int12 = application8.getApplicationId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Interview> interviewList3 = interviewService1.getInterviewsByApplicationId((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        java.lang.String str1 = assessment0.getDetails();
        int int2 = assessment0.getApplicationId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin2 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str3 = admin2.getEmail();
        java.lang.String str4 = admin2.getEmail();
        int int5 = admin2.getAdminId();
        java.util.Scanner scanner6 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDetailsMenu1.editPasswordMenu(admin2, scanner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        java.sql.Timestamp timestamp13 = application8.getSubmissionDate();
        int int14 = application8.getWithdrawn();
        int int15 = application8.getStudentId();
        application8.setApplicationId((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(timestamp13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        interview0.setStatus("");
        interview0.setStatus("hi!");
        java.sql.Timestamp timestamp5 = interview0.getDateTime();
        org.junit.Assert.assertNull(timestamp5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        int int11 = application8.getOpportunityId();
        application8.setStudentId((-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setApplicationId(97);
        int int10 = visit5.getVisitId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
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
        java.util.Scanner scanner16 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleNoAssessment((int) (byte) 10, scanner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner6, (java.lang.Integer) (-1));
        java.util.Scanner scanner9 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner9);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setStatus("");
        visit5.setVisitId(97);
        java.sql.Timestamp timestamp12 = visit5.getDateTime();
        org.junit.Assert.assertNull(timestamp12);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) 'a', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        opportunity0.setDescription("");
        opportunity0.setAdminId(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        application8.setCoverLetter("");
        application8.setResume("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.sql.Timestamp timestamp6 = null;
        main.java.placementApplicationTracker.model.Visit visit9 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp6, "", "hi!");
        visit9.setDetails("hi!");
        java.util.Scanner scanner12 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.deleteVisit(visit9, scanner12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity2 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity2.setCompanyName("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = placementService1.addOpportunity(opportunity2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        int int12 = application8.getStudentId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        opportunity0.setDescription("");
        opportunity0.setCompanyName("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) 'a', (int) (byte) 1, (int) (byte) 0, "", timestamp4, (int) (byte) 0, "", "");
        int int9 = application8.getStudentId();
        java.lang.String str10 = application8.getStatus();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        feedback0.setComments("hi!");
        java.sql.Timestamp timestamp4 = feedback0.getDateTime();
        feedback0.setApplicationId((int) (short) -1);
        feedback0.setComments("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(timestamp4);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails((-1), "hi!", "", "", (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) -1);
        application8.setWithdrawn(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        int int2 = feedback0.getFeedbackId();
        int int3 = feedback0.getFeedbackId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu studentPlacementMenu2 = new main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu(placementRepo0, applicationRepo1);
        java.util.Scanner scanner4 = null;
        studentPlacementMenu2.displayPlacementOpportunities((int) (byte) 100, scanner4);
        java.util.Scanner scanner7 = null;
        studentPlacementMenu2.displayPlacementOpportunities((int) '4', scanner7);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        opportunity0.setCompanyName("");
        org.junit.Assert.assertNull(timestamp1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getRole();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        main.java.placementApplicationTracker.model.Admin admin10 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str11 = admin10.getDesignation();
        java.util.Scanner scanner12 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin10, scanner12);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo14 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu15 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo14);
        main.java.placementApplicationTracker.model.Admin admin21 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner22 = null;
        adminDetailsMenu15.displayEditDetailsMenu(admin21, scanner22);
        admin21.setDesignation("hi!");
        java.lang.String str26 = admin21.getPassword();
        java.util.Scanner scanner27 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDetailsMenu1.editPasswordMenu(admin21, scanner27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.studentLogin(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = adminService1.updateAdminDetails((-1), "hi!", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = assessmentService1.deleteAssessment(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminAssessmentMenu1.displayMenu(scanner8);
        java.util.Scanner scanner10 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner10);
        java.util.Scanner scanner12 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner12);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp2, "hi!", "hi!");
        java.lang.String str6 = assessment5.getDetails();
        int int7 = assessment5.getAssessmentId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        main.java.placementApplicationTracker.model.Assessment assessment3 = new main.java.placementApplicationTracker.model.Assessment();
        int int4 = assessment3.getAssessmentId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = assessmentService1.updateAssessment((int) (short) 0, assessment3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu adminApplicationMenu5 = new main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        adminApplicationMenu5.displayMenu((int) (byte) 1, scanner7);
        java.sql.Timestamp timestamp13 = null;
        main.java.placementApplicationTracker.model.Application application17 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp13, (int) '4', "", "");
        java.lang.String str18 = application17.getResume();
        java.lang.String str19 = application17.getCoverLetter();
        application17.setOpportunityId((int) 'a');
        int int22 = application17.getOpportunityId();
        java.lang.String str23 = application17.getCoverLetter();
        main.java.placementApplicationTracker.model.Application[] applicationArray24 = new main.java.placementApplicationTracker.model.Application[] { application17 };
        java.util.ArrayList<main.java.placementApplicationTracker.model.Application> applicationList25 = new java.util.ArrayList<main.java.placementApplicationTracker.model.Application>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<main.java.placementApplicationTracker.model.Application>) applicationList25, applicationArray24);
        java.util.Scanner scanner27 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminApplicationMenu5.displayApplications((java.util.List<main.java.placementApplicationTracker.model.Application>) applicationList25, scanner27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(applicationArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        opportunity0.setDescription("");
        java.sql.Timestamp timestamp8 = null;
        opportunity0.setCloseDate(timestamp8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(10, (int) (short) 10, "hi!", timestamp3);
        feedback4.setComments("hi!");
        feedback4.setComments("hi!");
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = studentService1.updateStudentDetails((int) ' ', "", "", "hi!", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) '#', "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo2 = adminService1.getAdminRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = adminService1.updateAdminPassword((int) (short) 100, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(adminRepo2);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus(0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp5, "", "hi!");
        java.lang.String str9 = interview8.getStatus();
        interview8.setType("hi!");
        java.sql.Timestamp timestamp12 = interview8.getDateTime();
        int int13 = interview8.getApplicationId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = interviewService1.updateInterview((int) (byte) 0, interview8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(timestamp12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.addNewOpportunity((int) (short) 100, scanner3);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Feedback feedback3 = feedbackService1.getFeedbackByFeedbackId((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.studentLogin((int) ' ', "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        admin7.setDesignation("hi!");
        admin7.setEmail("hi!");
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setDetails("hi!");
        java.sql.Timestamp timestamp8 = visit5.getDateTime();
        org.junit.Assert.assertNull(timestamp8);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        assessment0.setDetails("hi!");
        int int3 = assessment0.getAssessmentId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        int int1 = student0.getPassOutYear();
        java.lang.String str2 = student0.getFullName();
        student0.setPassOutYear((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleNoAssessment((-1), scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Assessment assessment7 = new main.java.placementApplicationTracker.model.Assessment(52, (int) (byte) 10, timestamp4, "", "");
        assessment7.setApplicationId((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = assessmentService1.addAssessment(assessment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = authenticationService1.adminSignup((int) (byte) 0, "", "", "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        int int13 = application8.getOpportunityId();
        java.lang.String str14 = application8.getCoverLetter();
        java.lang.String str15 = application8.getResume();
        java.sql.Timestamp timestamp16 = application8.getSubmissionDate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(timestamp16);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = visitService1.deleteVisit((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setDetails("hi!");
        java.lang.String str8 = visit5.getStatus();
        visit5.setApplicationId(100);
        visit5.setDetails("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Visit visit3 = visitService1.getVisitById((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner2, (java.lang.Integer) 100);
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment();
        int int6 = assessment5.getAssessmentId();
        int int7 = assessment5.getAssessmentId();
        main.java.placementApplicationTracker.model.Assessment assessment8 = new main.java.placementApplicationTracker.model.Assessment();
        int int9 = assessment8.getAssessmentId();
        int int10 = assessment8.getAssessmentId();
        java.sql.Timestamp timestamp11 = assessment8.getDateTime();
        main.java.placementApplicationTracker.model.Assessment assessment12 = new main.java.placementApplicationTracker.model.Assessment();
        int int13 = assessment12.getAssessmentId();
        int int14 = assessment12.getAssessmentId();
        main.java.placementApplicationTracker.model.Assessment assessment15 = new main.java.placementApplicationTracker.model.Assessment();
        int int16 = assessment15.getAssessmentId();
        int int17 = assessment15.getAssessmentId();
        java.sql.Timestamp timestamp18 = assessment15.getDateTime();
        java.sql.Timestamp timestamp21 = null;
        main.java.placementApplicationTracker.model.Assessment assessment24 = new main.java.placementApplicationTracker.model.Assessment(52, (int) (byte) 10, timestamp21, "", "");
        main.java.placementApplicationTracker.model.Assessment[] assessmentArray25 = new main.java.placementApplicationTracker.model.Assessment[] { assessment5, assessment8, assessment12, assessment15, assessment24 };
        java.util.ArrayList<main.java.placementApplicationTracker.model.Assessment> assessmentList26 = new java.util.ArrayList<main.java.placementApplicationTracker.model.Assessment>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<main.java.placementApplicationTracker.model.Assessment>) assessmentList26, assessmentArray25);
        java.util.Scanner scanner29 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleExistingAssessment((java.util.List<main.java.placementApplicationTracker.model.Assessment>) assessmentList26, (int) (short) 0, scanner29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNull(timestamp11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNull(timestamp18);
        org.junit.Assert.assertNotNull(assessmentArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 0, (int) (byte) -1, (int) (byte) -1, "", timestamp4, 100, "", "hi!");
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit((int) (byte) 100, scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        feedback0.setComments("hi!");
        java.sql.Timestamp timestamp4 = feedback0.getDateTime();
        feedback0.setComments("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(timestamp4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        main.java.placementApplicationTracker.model.Admin admin0 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str1 = admin0.getDesignation();
        int int2 = admin0.getAdminId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo2 = adminService1.getAdminRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = adminService1.updateAdminPassword(100, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(adminRepo2);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Student student4 = studentService1.getStudentDetails((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setCourse("");
        student2.setEmail("hi!");
        java.lang.String str8 = student2.getEmail();
        java.util.Scanner scanner9 = null;
        // The following exception was thrown during execution in test generation
        try {
            studentDetailsMenu1.EditPasswordMenu(student2, scanner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner4, (java.lang.Integer) 100);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        application8.setOpportunityId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.adminMenu.AdminMenu adminMenu7 = new main.java.placementApplicationTracker.adminMenu.AdminMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, adminRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        adminMenu7.displayAdminMenu((int) 'a', scanner9);
        java.util.Scanner scanner12 = null;
        adminMenu7.displayAdminMenu((int) '#', scanner12);
        java.util.Scanner scanner15 = null;
        adminMenu7.displayAdminMenu((-1), scanner15);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setDetails("hi!");
        java.lang.String str8 = visit5.getStatus();
        visit5.setApplicationId(100);
        visit5.setStatus("");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication((int) 'a', (int) (short) 1, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner2);
        java.util.Scanner scanner5 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview(10, scanner5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Application application3 = applicationService1.getApplicationByAppId((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        java.lang.Class<?> wildcardClass12 = application8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu studentApplicationDetailMenu5 = new main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        studentApplicationDetailMenu5.displayMenu(100, scanner7);
        java.util.Scanner scanner10 = null;
        studentApplicationDetailMenu5.displayMenu((int) (short) -1, scanner10);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.adminMenu.AdminMenu adminMenu7 = new main.java.placementApplicationTracker.adminMenu.AdminMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, adminRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        adminMenu7.displayAdminMenu((int) (short) 0, scanner9);
        java.util.Scanner scanner12 = null;
        adminMenu7.displayAdminMenu(10, scanner12);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        assessment0.setDetails("hi!");
        java.lang.String str3 = assessment0.getStatus();
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (byte) 100, (int) '4', 0, "", timestamp4, (int) (byte) 100, "hi!", "hi!");
        application8.setResume("hi!");
        java.lang.String str11 = application8.getCoverLetter();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner3 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleNoAssessment((int) (byte) 1, scanner3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) ' ', "hi!", "hi!", "", (int) (byte) 100, "", timestamp6, timestamp7, (int) 'a');
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminAssessmentMenu1.displayMenu(scanner8);
        main.java.placementApplicationTracker.model.Assessment assessment10 = new main.java.placementApplicationTracker.model.Assessment();
        int int11 = assessment10.getAssessmentId();
        int int12 = assessment10.getAssessmentId();
        java.sql.Timestamp timestamp13 = assessment10.getDateTime();
        java.util.Scanner scanner14 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.deleteAssessment(assessment10, scanner14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNull(timestamp13);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setEmail("hi!");
        java.lang.String str4 = student0.getFullName();
        student0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp2, "hi!", "hi!");
        assessment5.setAssessmentId(10);
        java.sql.Timestamp timestamp8 = null;
        assessment5.setDateTime(timestamp8);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Interview interview3 = interviewService1.getInterviewById((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Interview interview7 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp4, "", "hi!");
        java.lang.String str8 = interview7.getStatus();
        interview7.setType("hi!");
        java.sql.Timestamp timestamp11 = interview7.getDateTime();
        int int12 = interview7.getApplicationId();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = interviewService1.addInterview(interview7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(timestamp11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 97 + "'", int12 == 97);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo2 = adminService1.getAdminRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = adminService1.updateAdminPassword((int) (byte) 100, "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(adminRepo2);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.displayMenu(100, scanner3);
        java.util.Scanner scanner6 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminPlacementMenu1.handleFilterOption((int) (byte) 0, scanner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByStudent((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
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
        adminAssessmentMenu1.manageAssessmentForApplication(scanner10, (java.lang.Integer) 1);
        main.java.placementApplicationTracker.model.Assessment assessment13 = new main.java.placementApplicationTracker.model.Assessment();
        assessment13.setDetails("hi!");
        java.util.Scanner scanner16 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.deleteAssessment(assessment13, scanner16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = authenticationService1.adminSignup((int) (short) 100, "hi!", "hi!", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.displayMenu(100, scanner3);
        java.util.Scanner scanner6 = null;
        adminPlacementMenu1.addNewOpportunity((int) (byte) 1, scanner6);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getEmail();
        int int2 = student0.getStudentId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = feedbackService1.addFeedback((int) 'a', "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        int int1 = student0.getPassOutYear();
        java.lang.String str2 = student0.getFullName();
        student0.setStudentId((-1));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Interview> interviewList3 = interviewService1.getInterviewsByApplicationId(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = interviewService1.deleteInterview((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        java.lang.String str4 = opportunity0.getRole();
        java.lang.String str5 = opportunity0.getCompanyName();
        int int6 = opportunity0.getAdminId();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.adminMenu.AdminApplicationProcessMenu adminApplicationProcessMenu5 = new main.java.placementApplicationTracker.adminMenu.AdminApplicationProcessMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        adminApplicationProcessMenu5.displayMenu(100, scanner7);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setEmail("hi!");
        java.lang.String str4 = student0.getPassword();
        int int5 = student0.getPassOutYear();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) -1);
        application8.setResume("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner2, (java.lang.Integer) (-1));
        java.util.Scanner scanner5 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner5, (java.lang.Integer) 1);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = authenticationService1.doesAdminIdExist(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByStudent(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.editInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.editInterviewOption(scanner8);
        java.sql.Timestamp timestamp12 = null;
        main.java.placementApplicationTracker.model.Interview interview15 = new main.java.placementApplicationTracker.model.Interview((int) (short) -1, (-1), timestamp12, "hi!", "");
        interview15.setApplicationId(52);
        java.util.Scanner scanner18 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.deleteInterview(interview15, scanner18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) (byte) 1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (short) 1, "hi!", "", "", "");
        admin5.setAdminId((int) '#');
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Interview interview3 = interviewService1.getInterviewById((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.lang.String str1 = opportunity0.getDescription();
        opportunity0.setSalary((int) 'a');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        int int13 = application8.getOpportunityId();
        java.lang.String str14 = application8.getCoverLetter();
        application8.setOpportunityId(0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
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
        studentApplicationMenu5.displayApplicationMenu((int) (byte) -1, scanner13);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setPassword("");
        student0.setStudentId((int) (short) 100);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit(52, (int) (short) 100, timestamp2, "hi!", "hi!");
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.displayMenu(scanner4);
        java.sql.Timestamp timestamp8 = null;
        main.java.placementApplicationTracker.model.Visit visit11 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp8, "", "hi!");
        visit11.setVisitId((int) (byte) 0);
        visit11.setStatus("");
        java.sql.Timestamp timestamp16 = null;
        visit11.setDateTime(timestamp16);
        java.util.Scanner scanner18 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.deleteVisit(visit11, scanner18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = interviewService1.deleteInterview((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        student0.setPassword("hi!");
        int int3 = student0.getPassOutYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.studentLogin((int) (byte) -1, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(1, 0, timestamp2, "hi!", "");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        int int2 = feedback0.getFeedbackId();
        feedback0.setComments("hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.displayMenu(scanner4);
        java.sql.Timestamp timestamp8 = null;
        main.java.placementApplicationTracker.model.Visit visit11 = new main.java.placementApplicationTracker.model.Visit(10, (int) (byte) 10, timestamp8, "hi!", "hi!");
        java.util.Scanner scanner12 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.deleteVisit(visit11, scanner12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setStatus("");
        int int10 = visit5.getVisitId();
        int int11 = visit5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Interview interview3 = interviewService1.getInterviewById(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        java.lang.String str10 = admin7.getPassword();
        java.lang.String str11 = admin7.getEmail();
        java.lang.String str12 = admin7.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) -1, (-1), timestamp2, "hi!", "");
        interview5.setApplicationId(52);
        java.sql.Timestamp timestamp8 = interview5.getDateTime();
        org.junit.Assert.assertNull(timestamp8);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp5, "", "hi!");
        java.sql.Timestamp timestamp9 = null;
        interview8.setDateTime(timestamp9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = interviewService1.updateInterview(0, interview8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) 1);
        application8.setApplicationId(100);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        main.java.placementApplicationTracker.model.Student student6 = new main.java.placementApplicationTracker.model.Student((int) (short) 100, "hi!", "", "hi!", "", (int) (byte) 0);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication(0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
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
        main.java.placementApplicationTracker.model.Assessment assessment15 = new main.java.placementApplicationTracker.model.Assessment();
        java.lang.String str16 = assessment15.getDetails();
        java.sql.Timestamp timestamp19 = null;
        main.java.placementApplicationTracker.model.Assessment assessment22 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp19, "hi!", "hi!");
        assessment22.setAssessmentId(10);
        int int25 = assessment22.getAssessmentId();
        main.java.placementApplicationTracker.model.Assessment assessment26 = new main.java.placementApplicationTracker.model.Assessment();
        java.lang.String str27 = assessment26.getDetails();
        int int28 = assessment26.getApplicationId();
        java.sql.Timestamp timestamp31 = null;
        main.java.placementApplicationTracker.model.Assessment assessment34 = new main.java.placementApplicationTracker.model.Assessment(0, (int) (short) 1, timestamp31, "hi!", "hi!");
        java.sql.Timestamp timestamp37 = null;
        main.java.placementApplicationTracker.model.Assessment assessment40 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp37, "hi!", "hi!");
        assessment40.setAssessmentId(10);
        java.sql.Timestamp timestamp43 = null;
        assessment40.setDateTime(timestamp43);
        main.java.placementApplicationTracker.model.Assessment assessment45 = new main.java.placementApplicationTracker.model.Assessment();
        java.lang.String str46 = assessment45.getDetails();
        java.sql.Timestamp timestamp49 = null;
        main.java.placementApplicationTracker.model.Assessment assessment52 = new main.java.placementApplicationTracker.model.Assessment(52, (int) (byte) 10, timestamp49, "", "");
        assessment52.setApplicationId((int) '#');
        main.java.placementApplicationTracker.model.Assessment assessment55 = new main.java.placementApplicationTracker.model.Assessment();
        int int56 = assessment55.getAssessmentId();
        int int57 = assessment55.getAssessmentId();
        java.sql.Timestamp timestamp58 = assessment55.getDateTime();
        main.java.placementApplicationTracker.model.Assessment assessment59 = new main.java.placementApplicationTracker.model.Assessment();
        int int60 = assessment59.getAssessmentId();
        int int61 = assessment59.getAssessmentId();
        java.sql.Timestamp timestamp64 = null;
        main.java.placementApplicationTracker.model.Assessment assessment67 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp64, "hi!", "hi!");
        java.lang.String str68 = assessment67.getDetails();
        java.sql.Timestamp timestamp71 = null;
        main.java.placementApplicationTracker.model.Assessment assessment74 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp71, "hi!", "hi!");
        assessment74.setAssessmentId(10);
        int int77 = assessment74.getAssessmentId();
        main.java.placementApplicationTracker.model.Assessment[] assessmentArray78 = new main.java.placementApplicationTracker.model.Assessment[] { assessment15, assessment22, assessment26, assessment34, assessment40, assessment45, assessment52, assessment55, assessment59, assessment67, assessment74 };
        java.util.ArrayList<main.java.placementApplicationTracker.model.Assessment> assessmentList79 = new java.util.ArrayList<main.java.placementApplicationTracker.model.Assessment>();
        boolean boolean80 = java.util.Collections.addAll((java.util.Collection<main.java.placementApplicationTracker.model.Assessment>) assessmentList79, assessmentArray78);
        java.util.Scanner scanner82 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleExistingAssessment((java.util.List<main.java.placementApplicationTracker.model.Assessment>) assessmentList79, (int) (byte) -1, scanner82);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 10 + "'", int25 == 10);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNull(timestamp58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 10 + "'", int77 == 10);
        org.junit.Assert.assertNotNull(assessmentArray78);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + true + "'", boolean80 == true);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Feedback feedback3 = feedbackService1.getFeedbackByFeedbackId((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (int) (byte) 10, timestamp2, "", "");
        assessment5.setApplicationId((int) '#');
        assessment5.setAssessmentId((int) (short) 1);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setStudentId(0);
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        student2.setEmail("hi!");
        int int10 = student2.getStudentId();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo6 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo7 = null;
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo8 = null;
        main.java.placementApplicationTracker.mainMenu.ApplicationMainMenu applicationMainMenu9 = new main.java.placementApplicationTracker.mainMenu.ApplicationMainMenu(visitRepo0, adminRepo1, assessmentRepo2, applicationRepo3, authenticationRepo4, feedbackRepo5, interviewRepo6, placementRepo7, studentRepo8);
        java.util.Scanner scanner10 = null;
        applicationMainMenu9.displayMainMenu(scanner10);
        java.util.Scanner scanner12 = null;
        applicationMainMenu9.displayMainMenu(scanner12);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        java.sql.Timestamp timestamp4 = opportunity0.getCloseDate();
        org.junit.Assert.assertNull(timestamp1);
        org.junit.Assert.assertNull(timestamp4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(100, 0, "", timestamp3);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        java.lang.String str2 = student0.getPassword();
        student0.setPassword("");
        student0.setPassword("");
        java.lang.String str7 = student0.getFullName();
        java.lang.String str8 = student0.getPassword();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.sql.Timestamp timestamp8 = null;
        main.java.placementApplicationTracker.model.Interview interview11 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp8, "", "hi!");
        java.lang.String str12 = interview11.getStatus();
        interview11.setInterviewId((int) (byte) 1);
        java.util.Scanner scanner15 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.deleteInterview(interview11, scanner15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        java.sql.Timestamp timestamp6 = null;
        opportunity0.setCloseDate(timestamp6);
        java.sql.Timestamp timestamp8 = opportunity0.getOpenDate();
        org.junit.Assert.assertNull(timestamp1);
        org.junit.Assert.assertNull(timestamp8);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        int int11 = application8.getApplicationId();
        int int12 = application8.getWithdrawn();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) -1, (-1), timestamp2, "hi!", "");
        interview5.setApplicationId(52);
        interview5.setStatus("");
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = adminService1.updateAdminPassword((int) (short) 0, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = visitService1.deleteVisit((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.manageVisitForApplication(scanner4, (java.lang.Integer) 97);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setStudentId(0);
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        student2.setStudentId(10);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp5, "", "hi!");
        java.lang.String str9 = interview8.getStatus();
        interview8.setStatus("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = interviewService1.updateInterview((int) (short) 0, interview8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = authenticationService1.doesStudentIdExist(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getStatus();
        interview5.setType("hi!");
        java.sql.Timestamp timestamp9 = interview5.getDateTime();
        int int10 = interview5.getApplicationId();
        interview5.setApplicationId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(timestamp9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = authenticationService1.adminSignup(0, "", "", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo2 = adminService1.getAdminRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = adminService1.updateAdminDetails((int) (short) 1, "hi!", "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(adminRepo2);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 10, "hi!", "", "", (int) (short) -1, "", timestamp6, timestamp7, (int) (byte) 100);
        java.lang.String str10 = opportunity9.getDescription();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.editInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner8);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        int int13 = application8.getOpportunityId();
        java.sql.Timestamp timestamp14 = null;
        application8.setSubmissionDate(timestamp14);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        feedback0.setComments("hi!");
        java.sql.Timestamp timestamp4 = feedback0.getDateTime();
        feedback0.setApplicationId((int) (short) -1);
        int int7 = feedback0.getFeedbackId();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(timestamp4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = applicationService1.updateApplicationStatus((int) (short) 0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        java.lang.String str10 = admin7.getPassword();
        admin7.setEmail("hi!");
        int int13 = admin7.getAdminId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner2, (java.lang.Integer) 100);
        java.util.Scanner scanner5 = null;
        adminAssessmentMenu1.manageAssessmentForApplication(scanner5, (java.lang.Integer) 100);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.adminLogin((int) (byte) 1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminPlacementMenu1.handleFilterOption((int) (short) 1, scanner3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(10, (int) (short) 10, "hi!", timestamp3);
        feedback4.setComments("hi!");
        feedback4.setApplicationId(52);
        feedback4.setFeedbackId((int) (byte) 1);
        feedback4.setFeedbackId((int) (short) 10);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Feedback feedback3 = feedbackService1.getFeedbackByFeedbackId(97);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 10, "hi!", "", "hi!", 0, "", timestamp6, timestamp7, (int) ' ');
        opportunity9.setDescription("");
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        int int2 = feedback0.getApplicationId();
        feedback0.setApplicationId((int) (byte) 0);
        int int5 = feedback0.getApplicationId();
        feedback0.setApplicationId((int) (byte) 1);
        feedback0.setFeedbackId((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = assessmentService1.deleteAssessment((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Interview interview7 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp4, "", "hi!");
        java.lang.String str8 = interview7.getStatus();
        interview7.setType("hi!");
        java.sql.Timestamp timestamp11 = interview7.getDateTime();
        interview7.setType("");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = interviewService1.addInterview(interview7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(timestamp11);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        int int1 = student0.getPassOutYear();
        int int2 = student0.getStudentId();
        student0.setEmail("");
        student0.setPassOutYear(0);
        student0.setCourse("");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (int) (byte) 10, timestamp2, "", "");
        assessment5.setAssessmentId((int) (short) 0);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails((int) '#', "hi!", "hi!", "", (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        java.lang.String str4 = opportunity0.getRole();
        java.lang.String str5 = opportunity0.getCompanyName();
        opportunity0.setAdminId((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Assessment assessment8 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp5, "hi!", "hi!");
        assessment8.setAssessmentId(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = assessmentService1.updateAssessment((int) 'a', assessment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        java.sql.Timestamp timestamp6 = opportunity0.getOpenDate();
        java.sql.Timestamp timestamp7 = null;
        opportunity0.setCloseDate(timestamp7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(timestamp6);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Assessment assessment7 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp4, "hi!", "hi!");
        assessment7.setAssessmentId(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = assessmentService1.addAssessment(assessment7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.editInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.editInterviewOption(scanner8);
        java.util.Scanner scanner11 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview((int) (short) 0, scanner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        int int1 = feedback0.getFeedbackId();
        int int2 = feedback0.getApplicationId();
        feedback0.setFeedbackId((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.studentMenu.StudentMenu studentMenu7 = new main.java.placementApplicationTracker.studentMenu.StudentMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, studentRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        studentMenu7.displayStudentMenu((int) '#', scanner9);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) 100);
        java.lang.String str13 = application8.getResume();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        java.sql.Timestamp timestamp19 = null;
        main.java.placementApplicationTracker.model.Assessment assessment22 = new main.java.placementApplicationTracker.model.Assessment(52, (int) (byte) 10, timestamp19, "", "");
        java.util.Scanner scanner23 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.deleteAssessment(assessment22, scanner23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) -1, (-1), timestamp2, "hi!", "");
        interview5.setApplicationId(52);
        int int8 = interview5.getInterviewId();
        java.lang.String str9 = interview5.getStatus();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setFullName("hi!");
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        main.java.placementApplicationTracker.model.Student student8 = new main.java.placementApplicationTracker.model.Student();
        int int9 = student8.getPassOutYear();
        int int10 = student8.getStudentId();
        java.util.Scanner scanner11 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student8, scanner11);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.displayMenu(100, scanner3);
        java.util.Scanner scanner6 = null;
        adminPlacementMenu1.editOpportunity((int) (short) 10, scanner6);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Assessment assessment8 = new main.java.placementApplicationTracker.model.Assessment((int) (byte) 1, (int) ' ', timestamp5, "hi!", "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = assessmentService1.updateAssessment(1, assessment8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
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
        studentMenu7.displayStudentMenu((int) (short) -1, scanner15);
        java.util.Scanner scanner18 = null;
        studentMenu7.displayStudentMenu(1, scanner18);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Interview interview7 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp4, "", "hi!");
        java.sql.Timestamp timestamp8 = null;
        interview7.setDateTime(timestamp8);
        interview7.setStatus("hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = interviewService1.addInterview(interview7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) -1);
        application8.setApplicationId(52);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Admin admin3 = adminService1.getAdminDetails(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails((int) (short) 1, "hi!", "hi!", "", (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 10, "hi!", "", "", (int) (short) -1, "", timestamp6, timestamp7, (int) (byte) 100);
        java.lang.String str10 = opportunity9.getLocation();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Assessment> assessmentList3 = assessmentService1.getAssessmentsByApplicationId((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = placementService1.deleteOpportunity(52);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp2, "hi!", "hi!");
        java.lang.String str6 = assessment5.getDetails();
        assessment5.setStatus("");
        java.sql.Timestamp timestamp9 = assessment5.getDateTime();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(timestamp9);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu studentInterviewMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentInterviewMenu(interviewRepo0);
        java.util.Scanner scanner3 = null;
        studentInterviewMenu1.displayInterviewMenu((int) '4', scanner3);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        java.sql.Timestamp timestamp13 = application8.getSubmissionDate();
        int int14 = application8.getWithdrawn();
        application8.setStudentId((int) '4');
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(timestamp13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        main.java.placementApplicationTracker.model.Interview interview0 = new main.java.placementApplicationTracker.model.Interview();
        java.lang.String str1 = interview0.getType();
        int int2 = interview0.getApplicationId();
        int int3 = interview0.getApplicationId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
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
        studentApplicationMenu5.displayApplicationMenu((int) (byte) 1, scanner13);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = interview5.getDateTime();
        org.junit.Assert.assertNull(timestamp6);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        opportunity0.setDescription("");
        opportunity0.setAdminId((int) (byte) 10);
        int int10 = opportunity0.getSalary();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (byte) 100, (int) '4', 0, "", timestamp4, (int) (byte) 100, "hi!", "hi!");
        java.sql.Timestamp timestamp9 = null;
        application8.setSubmissionDate(timestamp9);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setCourse("");
        student0.setEmail("hi!");
        student0.setFullName("hi!");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        java.util.Scanner scanner17 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit((int) (byte) 0, scanner17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminAssessmentMenu1.displayMenu(scanner8);
        java.util.Scanner scanner10 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner10);
        java.util.Scanner scanner12 = null;
        adminAssessmentMenu1.displayMenu(scanner12);
        java.util.Scanner scanner14 = null;
        adminAssessmentMenu1.displayMenu(scanner14);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        java.sql.Timestamp timestamp13 = application8.getSubmissionDate();
        int int14 = application8.getWithdrawn();
        int int15 = application8.getStudentId();
        int int16 = application8.getStudentId();
        application8.setStatus("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(timestamp13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        int int1 = assessment0.getAssessmentId();
        int int2 = assessment0.getAssessmentId();
        java.lang.String str3 = assessment0.getStatus();
        int int4 = assessment0.getApplicationId();
        java.sql.Timestamp timestamp5 = null;
        assessment0.setDateTime(timestamp5);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        int int11 = application8.getStudentId();
        java.lang.String str12 = application8.getCoverLetter();
        application8.setStudentId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentVisitMenu studentVisitMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentVisitMenu(visitRepo0);
        java.util.Scanner scanner3 = null;
        studentVisitMenu1.displayVisitMenu((int) (byte) 100, scanner3);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        java.lang.String str11 = application8.getResume();
        application8.setResume("");
        int int14 = application8.getOpportunityId();
        application8.setStatus("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp4 = opportunity3.getOpenDate();
        opportunity3.setLocation("");
        opportunity3.setRole("hi!");
        java.sql.Timestamp timestamp9 = null;
        opportunity3.setCloseDate(timestamp9);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = placementService1.updateOpportunity((int) (short) 1, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(timestamp4);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        main.java.placementApplicationTracker.model.Admin admin0 = new main.java.placementApplicationTracker.model.Admin();
        java.lang.String str1 = admin0.getEmail();
        java.lang.String str2 = admin0.getPassword();
        java.lang.String str3 = admin0.getFullName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
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
        main.java.placementApplicationTracker.model.Admin admin22 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner23 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminDetailsMenu1.editPasswordMenu(admin22, scanner23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 10, "hi!", "", "", (int) (short) -1, "", timestamp6, timestamp7, (int) (byte) 100);
        opportunity9.setOpportunityId(100);
        int int12 = opportunity9.getOpportunityId();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 100 + "'", int12 == 100);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (byte) 100, 100, timestamp2, "", "hi!");
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        java.util.Scanner scanner20 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleNoAssessment((-1), scanner20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment((int) (short) 0, (int) (byte) -1, timestamp2, "hi!", "");
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo2 = studentService1.getStudentRepo();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = studentService1.updateStudentDetails((int) (byte) -1, "", "", "hi!", (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(studentRepo2);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(1, 1, "hi!", timestamp3);
        feedback4.setFeedbackId((int) '#');
        feedback4.setApplicationId((int) 'a');
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.editInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.editInterviewOption(scanner8);
        java.util.Scanner scanner11 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview(0, scanner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit(52, (int) '4', timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = visit5.getDateTime();
        org.junit.Assert.assertNull(timestamp6);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu studentApplicationDetailMenu5 = new main.java.placementApplicationTracker.studentMenu.StudentApplicationDetailMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        studentApplicationDetailMenu5.displayMenu((int) (byte) -1, scanner7);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        java.lang.String str10 = admin7.getPassword();
        admin7.setEmail("");
        admin7.setDesignation("");
        admin7.setDesignation("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.sql.Timestamp timestamp6 = null;
        main.java.placementApplicationTracker.model.Interview interview9 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp6, "", "hi!");
        interview9.setStatus("hi!");
        java.lang.String str12 = interview9.getType();
        java.util.Scanner scanner13 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.deleteInterview(interview9, scanner13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = applicationService1.updateApplication((int) (byte) 10, "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        student0.setPassword("");
        java.lang.String str3 = student0.getFullName();
        java.lang.String str4 = student0.getFullName();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        application8.setOpportunityId((-1));
        application8.setStudentId(100);
        application8.setOpportunityId(0);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setPassword("");
        student0.setPassOutYear((int) ' ');
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        java.lang.String str2 = student0.getPassword();
        int int3 = student0.getStudentId();
        student0.setPassOutYear((int) (byte) 100);
        java.lang.String str6 = student0.getCourse();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu studentAssessmentMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner3 = null;
        studentAssessmentMenu1.displayAssessmentMenu((int) ' ', scanner3);
        java.util.Scanner scanner6 = null;
        studentAssessmentMenu1.displayAssessmentMenu((int) (short) 0, scanner6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setVisitId(100);
        java.sql.Timestamp timestamp10 = null;
        visit5.setDateTime(timestamp10);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (short) 1, "hi!", "", "", "");
        admin5.setDesignation("hi!");
        java.lang.String str8 = admin5.getPassword();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.lang.String str8 = interview5.getType();
        interview5.setStatus("");
        interview5.setInterviewId(1);
        int int13 = interview5.getInterviewId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.sql.Timestamp timestamp8 = null;
        interview5.setDateTime(timestamp8);
        int int10 = interview5.getApplicationId();
        java.sql.Timestamp timestamp11 = null;
        interview5.setDateTime(timestamp11);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        int int11 = application8.getOpportunityId();
        java.lang.Class<?> wildcardClass12 = application8.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.adminLogin(0, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        int int10 = application8.getWithdrawn();
        int int11 = application8.getOpportunityId();
        int int12 = application8.getOpportunityId();
        int int13 = application8.getApplicationId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu studentDetailsMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentDetailsMenu(studentRepo0);
        main.java.placementApplicationTracker.model.Student student2 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str3 = student2.getFullName();
        student2.setStudentId(0);
        java.util.Scanner scanner6 = null;
        studentDetailsMenu1.displayEditDetailsMenu(student2, scanner6);
        student2.setEmail("");
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        feedback0.setComments("");
        java.sql.Timestamp timestamp4 = null;
        feedback0.setDateTime(timestamp4);
        int int6 = feedback0.getApplicationId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.editInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.displayMenu(scanner4);
        java.util.Scanner scanner6 = null;
        adminInterviewMenu1.editInterviewOption(scanner6);
        java.util.Scanner scanner8 = null;
        adminInterviewMenu1.editInterviewOption(scanner8);
        java.sql.Timestamp timestamp12 = null;
        main.java.placementApplicationTracker.model.Interview interview15 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp12, "", "hi!");
        java.lang.String str16 = interview15.getType();
        interview15.setApplicationId((int) ' ');
        interview15.setType("");
        main.java.placementApplicationTracker.model.Interview interview21 = new main.java.placementApplicationTracker.model.Interview();
        interview21.setStatus("");
        java.sql.Timestamp timestamp26 = null;
        main.java.placementApplicationTracker.model.Interview interview29 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp26, "", "hi!");
        java.lang.String str30 = interview29.getStatus();
        interview29.setInterviewId((int) (byte) 1);
        java.sql.Timestamp timestamp35 = null;
        main.java.placementApplicationTracker.model.Interview interview38 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp35, "", "hi!");
        java.lang.String str39 = interview38.getStatus();
        interview38.setStatus("");
        java.sql.Timestamp timestamp44 = null;
        main.java.placementApplicationTracker.model.Interview interview47 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp44, "", "hi!");
        interview47.setStatus("hi!");
        java.lang.String str50 = interview47.getType();
        interview47.setStatus("");
        main.java.placementApplicationTracker.model.Interview interview53 = new main.java.placementApplicationTracker.model.Interview();
        java.lang.String str54 = interview53.getType();
        int int55 = interview53.getApplicationId();
        int int56 = interview53.getApplicationId();
        main.java.placementApplicationTracker.model.Interview interview57 = new main.java.placementApplicationTracker.model.Interview();
        interview57.setInterviewId((int) (short) 10);
        main.java.placementApplicationTracker.model.Interview interview60 = new main.java.placementApplicationTracker.model.Interview();
        interview60.setInterviewId((int) (short) 10);
        main.java.placementApplicationTracker.model.Interview interview63 = new main.java.placementApplicationTracker.model.Interview();
        java.lang.String str64 = interview63.getType();
        main.java.placementApplicationTracker.model.Interview interview65 = new main.java.placementApplicationTracker.model.Interview();
        interview65.setStatus("");
        interview65.setType("hi!");
        main.java.placementApplicationTracker.model.Interview[] interviewArray70 = new main.java.placementApplicationTracker.model.Interview[] { interview15, interview21, interview29, interview38, interview47, interview53, interview57, interview60, interview63, interview65 };
        java.util.ArrayList<main.java.placementApplicationTracker.model.Interview> interviewList71 = new java.util.ArrayList<main.java.placementApplicationTracker.model.Interview>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<main.java.placementApplicationTracker.model.Interview>) interviewList71, interviewArray70);
        java.util.Scanner scanner74 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleExistingInterview((java.util.List<main.java.placementApplicationTracker.model.Interview>) interviewList71, 0, scanner74);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(interviewArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.sql.Timestamp timestamp8 = null;
        interview5.setDateTime(timestamp8);
        interview5.setType("hi!");
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setStatus("");
        int int10 = visit5.getVisitId();
        visit5.setDetails("hi!");
        int int13 = visit5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = studentService1.updateStudentDetails((int) (byte) -1, "", "", "", (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu adminPlacementMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminPlacementMenu(placementRepo0);
        java.util.Scanner scanner3 = null;
        adminPlacementMenu1.displayMenu(100, scanner3);
        java.util.Scanner scanner6 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminPlacementMenu1.handleFilterOption(100, scanner6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.lang.String str8 = interview5.getType();
        int int9 = interview5.getInterviewId();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        admin7.setDesignation("hi!");
        java.lang.String str12 = admin7.getDesignation();
        java.lang.String str13 = admin7.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.studentLogin((int) (byte) 0, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setPassword("");
        student0.setEmail("");
        student0.setFullName("hi!");
        java.lang.String str8 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        main.java.placementApplicationTracker.model.Student student6 = new main.java.placementApplicationTracker.model.Student(10, "hi!", "", "", "hi!", 52);
        int int7 = student6.getPassOutYear();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (byte) 100, (int) '4', 0, "", timestamp4, (int) (byte) 100, "hi!", "hi!");
        application8.setResume("hi!");
        int int11 = application8.getWithdrawn();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setFullName("");
        java.lang.String str4 = student0.getFullName();
        java.lang.String str5 = student0.getCourse();
        student0.setEmail("");
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) ' ', "", "hi!", "hi!", "");
        admin5.setPassword("");
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo5 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo6 = null;
        main.java.placementApplicationTracker.adminMenu.AdminMenu adminMenu7 = new main.java.placementApplicationTracker.adminMenu.AdminMenu(visitRepo0, applicationRepo1, placementRepo2, assessmentRepo3, interviewRepo4, adminRepo5, feedbackRepo6);
        java.util.Scanner scanner9 = null;
        adminMenu7.displayAdminMenu((int) (short) 0, scanner9);
        java.util.Scanner scanner12 = null;
        adminMenu7.displayAdminMenu((int) ' ', scanner12);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.lang.String str1 = opportunity0.getDescription();
        java.sql.Timestamp timestamp2 = opportunity0.getOpenDate();
        java.lang.String str3 = opportunity0.getRole();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(timestamp2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Student student3 = studentService1.getStudentDetails((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        int int6 = opportunity0.getOpportunityId();
        opportunity0.setDescription("hi!");
        java.sql.Timestamp timestamp9 = null;
        opportunity0.setOpenDate(timestamp9);
        org.junit.Assert.assertNull(timestamp1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setVisitId(0);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.lang.String str8 = interview5.getType();
        interview5.setApplicationId(52);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
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
        adminAssessmentMenu1.deleteAssessmentOption(scanner12);
        java.util.Scanner scanner14 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner14);
        java.util.Scanner scanner17 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.handleNoAssessment((-1), scanner17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = feedbackService1.addFeedback(97, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.lang.String str8 = interview5.getType();
        interview5.setStatus("");
        interview5.setInterviewId(1);
        interview5.setStatus("hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        main.java.placementApplicationTracker.model.Visit visit3 = new main.java.placementApplicationTracker.model.Visit();
        java.lang.String str4 = visit3.getDetails();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = visitService1.updateVisit((int) (short) 0, visit3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getType();
        interview5.setType("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.sql.Timestamp timestamp3 = null;
        main.java.placementApplicationTracker.model.Feedback feedback4 = new main.java.placementApplicationTracker.model.Feedback(10, (int) (short) 10, "hi!", timestamp3);
        feedback4.setComments("hi!");
        feedback4.setApplicationId(52);
        feedback4.setFeedbackId((int) (byte) 1);
        int int11 = feedback4.getApplicationId();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.deleteVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.displayMenu(scanner6);
        java.util.Scanner scanner9 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit((int) (short) 100, scanner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        java.lang.String str5 = opportunity0.getLocation();
        java.lang.String str6 = opportunity0.getDescription();
        opportunity0.setCompanyName("");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        java.sql.Timestamp timestamp13 = null;
        application8.setSubmissionDate(timestamp13);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
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
        studentAuthMenu8.studentSignup(scanner9);
        java.util.Scanner scanner11 = null;
        studentAuthMenu8.studentSignup(scanner11);
        java.util.Scanner scanner13 = null;
        studentAuthMenu8.studentLogin(scanner13);
        java.util.Scanner scanner15 = null;
        studentAuthMenu8.studentLogin(scanner15);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment((int) (short) 0, (int) (byte) 1, timestamp2, "", "hi!");
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        assessment0.setDetails("hi!");
        assessment0.setDetails("");
        java.lang.String str5 = assessment0.getStatus();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        main.java.placementApplicationTracker.model.Admin admin5 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.lang.String str6 = admin5.getDesignation();
        java.lang.String str7 = admin5.getEmail();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = studentService1.updateStudentPassword(0, "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setStudentId((int) (short) 100);
        application8.setResume("");
        application8.setResume("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (byte) 0, (int) (short) -1, timestamp2, "hi!", "hi!");
        java.sql.Timestamp timestamp6 = interview5.getDateTime();
        org.junit.Assert.assertNull(timestamp6);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getStatus();
        interview5.setType("hi!");
        java.sql.Timestamp timestamp9 = interview5.getDateTime();
        int int10 = interview5.getApplicationId();
        java.lang.String str11 = interview5.getStatus();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(timestamp9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(0, (int) (short) 1, timestamp2, "hi!", "hi!");
        java.sql.Timestamp timestamp6 = null;
        assessment5.setDateTime(timestamp6);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        assessment0.setDetails("hi!");
        assessment0.setDetails("");
        assessment0.setApplicationId(0);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getFullName();
        student0.setCourse("");
        java.lang.String str4 = student0.getCourse();
        student0.setPassOutYear(0);
        java.lang.String str7 = student0.getEmail();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = interviewService1.deleteInterview((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
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
        studentAuthMenu8.studentSignup(scanner9);
        java.util.Scanner scanner11 = null;
        studentAuthMenu8.studentLogin(scanner11);
        java.util.Scanner scanner13 = null;
        studentAuthMenu8.studentLogin(scanner13);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        int int4 = opportunity0.getAdminId();
        int int5 = opportunity0.getSalary();
        opportunity0.setAdminId((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = studentService1.updateStudentPassword((int) 'a', "hi!", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        opportunity0.setAdminId(52);
        opportunity0.setSalary((int) (short) 0);
        java.lang.String str8 = opportunity0.getRole();
        opportunity0.setSalary((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setOpportunityId(0);
        org.junit.Assert.assertNull(timestamp1);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = authenticationService1.adminSignup((int) 'a', "hi!", "", "hi!", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        application8.setOpportunityId((int) 'a');
        application8.setWithdrawn((int) (byte) 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        java.lang.String str1 = student0.getCourse();
        java.lang.String str2 = student0.getFullName();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.service.InterviewService interviewService1 = new main.java.placementApplicationTracker.service.InterviewService(interviewRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Interview interview8 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp5, "", "hi!");
        java.lang.String str9 = interview8.getStatus();
        interview8.setType("hi!");
        java.sql.Timestamp timestamp12 = interview8.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = interviewService1.updateInterview((int) (short) -1, interview8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(timestamp12);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner2, (java.lang.Integer) (-1));
        java.util.Scanner scanner5 = null;
        adminInterviewMenu1.editInterviewOption(scanner5);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(0, (int) (short) 1, timestamp2, "hi!", "hi!");
        int int6 = assessment5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment((-1), (int) (byte) -1, timestamp2, "hi!", "");
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList4 = placementService1.getOpportunitiesBySalaryRange((int) (short) 10, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Application application3 = applicationService1.getApplicationByAppId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.service.AssessmentService assessmentService1 = new main.java.placementApplicationTracker.service.AssessmentService(assessmentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Assessment assessment3 = assessmentService1.getAssessmentById(1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        int int1 = assessment0.getAssessmentId();
        assessment0.setStatus("");
        assessment0.setAssessmentId((int) (short) 0);
        assessment0.setApplicationId(0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getType();
        interview5.setApplicationId((int) ' ');
        interview5.setInterviewId(97);
        interview5.setInterviewId((int) (short) 0);
        int int13 = interview5.getApplicationId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        main.java.placementApplicationTracker.model.Student student0 = new main.java.placementApplicationTracker.model.Student();
        int int1 = student0.getPassOutYear();
        java.lang.String str2 = student0.getFullName();
        java.lang.String str3 = student0.getEmail();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication(52, 0, "", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 100, (int) (short) 10, (int) (short) 1, "hi!", timestamp4, (int) ' ', "", "hi!");
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity(10, "hi!", "hi!", "hi!", 0, "", timestamp6, timestamp7, 100);
        opportunity9.setSalary((int) (byte) 10);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        java.lang.String str10 = application8.getCoverLetter();
        int int11 = application8.getApplicationId();
        java.sql.Timestamp timestamp12 = application8.getSubmissionDate();
        application8.setResume("");
        application8.setCoverLetter("hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNull(timestamp12);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        assessment0.setDetails("hi!");
        assessment0.setDetails("");
        java.sql.Timestamp timestamp5 = assessment0.getDateTime();
        java.sql.Timestamp timestamp6 = null;
        assessment0.setDateTime(timestamp6);
        org.junit.Assert.assertNull(timestamp5);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        main.java.placementApplicationTracker.model.Opportunity opportunity3 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp4 = opportunity3.getOpenDate();
        opportunity3.setLocation("");
        opportunity3.setRole("hi!");
        int int9 = opportunity3.getOpportunityId();
        opportunity3.setDescription("hi!");
        java.sql.Timestamp timestamp12 = null;
        opportunity3.setCloseDate(timestamp12);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = placementService1.updateOpportunity((int) (short) 10, opportunity3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(timestamp4);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner2, (java.lang.Integer) (-1));
        java.util.Scanner scanner5 = null;
        adminInterviewMenu1.displayMenu(scanner5);
        java.util.Scanner scanner7 = null;
        adminInterviewMenu1.manageInterviewForApplication(scanner7, (java.lang.Integer) 52);
        java.util.Scanner scanner11 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminInterviewMenu1.handleNoInterview((int) (short) 100, scanner11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp2, "hi!", "hi!");
        java.lang.String str6 = assessment5.getStatus();
        java.sql.Timestamp timestamp7 = assessment5.getDateTime();
        java.sql.Timestamp timestamp8 = null;
        assessment5.setDateTime(timestamp8);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(timestamp7);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo0 = null;
        main.java.placementApplicationTracker.service.FeedbackService feedbackService1 = new main.java.placementApplicationTracker.service.FeedbackService(feedbackRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = feedbackService1.addFeedback((-1), "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        application8.setApplicationId((int) (byte) -1);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setStatus("");
        visit5.setStatus("hi!");
        java.sql.Timestamp timestamp12 = visit5.getDateTime();
        org.junit.Assert.assertNull(timestamp12);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        java.lang.String str4 = opportunity0.getRole();
        java.lang.String str5 = opportunity0.getCompanyName();
        java.lang.String str6 = opportunity0.getLocation();
        java.lang.String str7 = opportunity0.getDescription();
        java.sql.Timestamp timestamp8 = null;
        opportunity0.setCloseDate(timestamp8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        main.java.placementApplicationTracker.model.Assessment assessment0 = new main.java.placementApplicationTracker.model.Assessment();
        int int1 = assessment0.getAssessmentId();
        int int2 = assessment0.getAssessmentId();
        java.lang.String str3 = assessment0.getStatus();
        assessment0.setStatus("");
        java.lang.String str6 = assessment0.getDetails();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Visit> visitList3 = visitService1.getVisitsByApplicationId((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setDetails("hi!");
        java.lang.String str8 = visit5.getStatus();
        visit5.setVisitId(0);
        visit5.setVisitId((int) ' ');
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = applicationService1.createApplication(97, (int) ' ', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Assessment assessment5 = new main.java.placementApplicationTracker.model.Assessment(52, (-1), timestamp2, "hi!", "hi!");
        assessment5.setAssessmentId(10);
        int int8 = assessment5.getAssessmentId();
        int int9 = assessment5.getAssessmentId();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        int int6 = opportunity0.getOpportunityId();
        opportunity0.setDescription("hi!");
        java.sql.Timestamp timestamp9 = opportunity0.getOpenDate();
        org.junit.Assert.assertNull(timestamp1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNull(timestamp9);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
        adminInterviewMenu1.editInterviewOption(scanner13);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        main.java.placementApplicationTracker.repo.intf.StudentRepo studentRepo0 = null;
        main.java.placementApplicationTracker.service.StudentService studentService1 = new main.java.placementApplicationTracker.service.StudentService(studentRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = studentService1.updateStudentPassword((int) '4', "", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit(10, (int) (byte) 10, timestamp2, "hi!", "hi!");
        int int6 = visit5.getApplicationId();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean4 = authenticationService1.adminLogin(1, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        adminAuthMenu8.adminLogin(scanner11);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        admin7.setDesignation("hi!");
        java.lang.String str12 = admin7.getPassword();
        admin7.setFullName("");
        java.lang.String str15 = admin7.getPassword();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Application> applicationList3 = applicationService1.getApplicationsByOpportunity((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu adminInterviewMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminInterviewMenu(interviewRepo0);
        java.util.Scanner scanner2 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminInterviewMenu1.deleteInterviewOption(scanner4);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        feedback0.setComments("");
        java.lang.String str4 = feedback0.getComments();
        feedback0.setFeedbackId((int) (byte) 0);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        interview5.setStatus("hi!");
        java.sql.Timestamp timestamp8 = null;
        interview5.setDateTime(timestamp8);
        int int10 = interview5.getApplicationId();
        interview5.setStatus("hi!");
        interview5.setType("");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        main.java.placementApplicationTracker.model.Feedback feedback0 = new main.java.placementApplicationTracker.model.Feedback();
        java.lang.String str1 = feedback0.getComments();
        feedback0.setComments("");
        java.sql.Timestamp timestamp4 = null;
        feedback0.setDateTime(timestamp4);
        int int6 = feedback0.getFeedbackId();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) (short) 1, (int) (short) 10, 10, "", timestamp4, (int) '4', "", "");
        java.lang.String str9 = application8.getResume();
        application8.setOpportunityId((int) (byte) 10);
        application8.setResume("hi!");
        application8.setResume("");
        application8.setApplicationId((int) (short) 10);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.studentMenu.StudentVisitMenu studentVisitMenu1 = new main.java.placementApplicationTracker.studentMenu.StudentVisitMenu(visitRepo0);
        java.util.Scanner scanner3 = null;
        studentVisitMenu1.displayVisitMenu(97, scanner3);
        java.util.Scanner scanner6 = null;
        studentVisitMenu1.displayVisitMenu((int) (byte) -1, scanner6);
        java.util.Scanner scanner9 = null;
        studentVisitMenu1.displayVisitMenu((int) (short) -1, scanner9);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (short) 0, "hi!", "", "", 0, "", timestamp6, timestamp7, 97);
        java.lang.String str10 = opportunity9.getRole();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        java.sql.Timestamp timestamp4 = null;
        main.java.placementApplicationTracker.model.Application application8 = new main.java.placementApplicationTracker.model.Application((int) 'a', (int) (byte) 1, (int) (byte) 0, "", timestamp4, (int) (byte) 0, "", "");
        int int9 = application8.getStudentId();
        java.sql.Timestamp timestamp10 = null;
        application8.setSubmissionDate(timestamp10);
        int int12 = application8.getStudentId();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        opportunity0.setCompanyName("");
        int int3 = opportunity0.getAdminId();
        java.lang.String str4 = opportunity0.getRole();
        java.lang.String str5 = opportunity0.getDescription();
        java.sql.Timestamp timestamp6 = opportunity0.getCloseDate();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(timestamp6);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.service.PlacementService placementService1 = new main.java.placementApplicationTracker.service.PlacementService(placementRepo0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<main.java.placementApplicationTracker.model.Opportunity> opportunityList3 = placementService1.getOpportunitiesByCompanyName("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.editVisitOption(scanner2);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminVisitMenu adminVisitMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminVisitMenu(visitRepo0);
        java.util.Scanner scanner2 = null;
        adminVisitMenu1.deleteVisitOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminVisitMenu1.editVisitOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminVisitMenu1.deleteVisitOption(scanner6);
        java.util.Scanner scanner9 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminVisitMenu1.handleNoVisit((int) (byte) -1, scanner9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        main.java.placementApplicationTracker.model.Opportunity opportunity0 = new main.java.placementApplicationTracker.model.Opportunity();
        java.sql.Timestamp timestamp1 = opportunity0.getOpenDate();
        opportunity0.setLocation("");
        opportunity0.setRole("hi!");
        opportunity0.setRole("hi!");
        org.junit.Assert.assertNull(timestamp1);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu adminDetailsMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminDetailsMenu(adminRepo0);
        main.java.placementApplicationTracker.model.Admin admin7 = new main.java.placementApplicationTracker.model.Admin((int) (byte) 0, "", "hi!", "hi!", "");
        java.util.Scanner scanner8 = null;
        adminDetailsMenu1.displayEditDetailsMenu(admin7, scanner8);
        admin7.setDesignation("hi!");
        admin7.setEmail("");
        admin7.setEmail("");
        admin7.setAdminId(52);
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Interview interview5 = new main.java.placementApplicationTracker.model.Interview((int) (short) 100, (int) 'a', timestamp2, "", "hi!");
        java.lang.String str6 = interview5.getStatus();
        interview5.setType("hi!");
        java.sql.Timestamp timestamp9 = interview5.getDateTime();
        int int10 = interview5.getApplicationId();
        java.lang.String str11 = interview5.getType();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(timestamp9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 97 + "'", int10 == 97);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        visit5.setVisitId((int) (byte) 0);
        visit5.setStatus("");
        int int10 = visit5.getVisitId();
        int int11 = visit5.getVisitId();
        visit5.setStatus("hi!");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo0 = null;
        main.java.placementApplicationTracker.service.ApplicationService applicationService1 = new main.java.placementApplicationTracker.service.ApplicationService(applicationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = applicationService1.withdrawApplicationByAppId(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo0 = null;
        main.java.placementApplicationTracker.service.AdminService adminService1 = new main.java.placementApplicationTracker.service.AdminService(adminRepo0);
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo2 = adminService1.getAdminRepo();
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo3 = adminService1.getAdminRepo();
        main.java.placementApplicationTracker.repo.intf.AdminRepo adminRepo4 = adminService1.getAdminRepo();
        // The following exception was thrown during execution in test generation
        try {
            main.java.placementApplicationTracker.model.Admin admin6 = adminService1.getAdminDetails((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(adminRepo2);
        org.junit.Assert.assertNull(adminRepo3);
        org.junit.Assert.assertNull(adminRepo4);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        main.java.placementApplicationTracker.repo.intf.AuthenticationRepo authenticationRepo0 = null;
        main.java.placementApplicationTracker.service.AuthenticationService authenticationService1 = new main.java.placementApplicationTracker.service.AuthenticationService(authenticationRepo0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = authenticationService1.studentSignup(100, "", "", "", "hi!", 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.service.VisitService visitService1 = new main.java.placementApplicationTracker.service.VisitService(visitRepo0);
        java.sql.Timestamp timestamp5 = null;
        main.java.placementApplicationTracker.model.Visit visit8 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp5, "", "hi!");
        java.sql.Timestamp timestamp9 = null;
        visit8.setDateTime(timestamp9);
        int int11 = visit8.getVisitId();
        visit8.setApplicationId(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = visitService1.updateVisit(1, visit8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        java.sql.Timestamp timestamp6 = null;
        java.sql.Timestamp timestamp7 = null;
        main.java.placementApplicationTracker.model.Opportunity opportunity9 = new main.java.placementApplicationTracker.model.Opportunity((int) (byte) 0, "", "hi!", "hi!", 10, "", timestamp6, timestamp7, (int) (byte) -1);
        java.lang.String str10 = opportunity9.getLocation();
        opportunity9.setDescription("");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        java.sql.Timestamp timestamp2 = null;
        main.java.placementApplicationTracker.model.Visit visit5 = new main.java.placementApplicationTracker.model.Visit((int) (short) 1, 0, timestamp2, "", "hi!");
        java.sql.Timestamp timestamp6 = null;
        visit5.setDateTime(timestamp6);
        visit5.setVisitId(100);
        visit5.setDetails("hi!");
        int int12 = visit5.getApplicationId();
        java.lang.String str13 = visit5.getStatus();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        main.java.placementApplicationTracker.repo.intf.PlacementRepo placementRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu studentPlacementMenu2 = new main.java.placementApplicationTracker.studentMenu.StudentPlacementMenu(placementRepo0, applicationRepo1);
        java.util.Scanner scanner4 = null;
        studentPlacementMenu2.displayPlacementOpportunities((int) (byte) 100, scanner4);
        java.util.Scanner scanner7 = null;
        studentPlacementMenu2.displayPlacementOpportunities(32, scanner7);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        main.java.placementApplicationTracker.repo.intf.VisitRepo visitRepo0 = null;
        main.java.placementApplicationTracker.repo.intf.ApplicationRepo applicationRepo1 = null;
        main.java.placementApplicationTracker.repo.intf.FeedbackRepo feedbackRepo2 = null;
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo3 = null;
        main.java.placementApplicationTracker.repo.intf.InterviewRepo interviewRepo4 = null;
        main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu adminApplicationMenu5 = new main.java.placementApplicationTracker.adminMenu.AdminApplicationMenu(visitRepo0, applicationRepo1, feedbackRepo2, assessmentRepo3, interviewRepo4);
        java.util.Scanner scanner7 = null;
        adminApplicationMenu5.displayMenu((int) (byte) -1, scanner7);
        java.util.Scanner scanner10 = null;
        adminApplicationMenu5.displayMenu(32, scanner10);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        main.java.placementApplicationTracker.model.Assessment assessment2 = new main.java.placementApplicationTracker.model.Assessment();
        assessment2.setDetails("hi!");
        assessment2.setDetails("");
        java.util.Scanner scanner7 = null;
        // The following exception was thrown during execution in test generation
        try {
            adminAssessmentMenu1.deleteAssessment(assessment2, scanner7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        main.java.placementApplicationTracker.repo.intf.AssessmentRepo assessmentRepo0 = null;
        main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu adminAssessmentMenu1 = new main.java.placementApplicationTracker.adminMenu.AdminAssessmentMenu(assessmentRepo0);
        java.util.Scanner scanner2 = null;
        adminAssessmentMenu1.editAssessmentOption(scanner2);
        java.util.Scanner scanner4 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner4);
        java.util.Scanner scanner6 = null;
        adminAssessmentMenu1.deleteAssessmentOption(scanner6);
    }
}

