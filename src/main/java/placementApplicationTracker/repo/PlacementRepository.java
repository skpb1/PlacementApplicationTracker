package main.java.placementApplicationTracker.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PlacementRepository {

    private static final String JDBC_URL = "jdbc:sqlite:placementApplicationTracker.db";
    private static final Logger LOGGER = Logger.getLogger(PlacementRepository.class.getName());

    public static Connection connect() {
        try {
            return DriverManager.getConnection(JDBC_URL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error connecting to the database", e);
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    public static void createTables(Connection connection) {
        List<String> tablesToCreate = new ArrayList<>();

        if (!isTableCreated(connection, "Admin")) {
            tablesToCreate.add("Admin");
        }

        if (!isTableCreated(connection, "Student")) {
            tablesToCreate.add("Student");
        }

        if (!isTableCreated(connection, "Opportunity")) {
            tablesToCreate.add("Opportunity");
        }

        if (!isTableCreated(connection, "Application")) {
            tablesToCreate.add("Application");
        }

        if (!isTableCreated(connection, "Assessment")) {
            tablesToCreate.add("Assessment");
        }

        if (!isTableCreated(connection, "Visit")) {
            tablesToCreate.add("Visit");
        }

        if (!isTableCreated(connection, "Feedback")) {
            tablesToCreate.add("Feedback");
        }

        for (String table : tablesToCreate) {
            createTable(connection, table);
        }
    }

    private static boolean isTableCreated(Connection connection, String tableName) {
        String checkTableSQL = "SELECT name FROM sqlite_master WHERE type='table' AND name='" + tableName + "'";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(checkTableSQL)) {

            return resultSet.next();
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error checking if table exists: " + tableName, e);
            throw new RuntimeException("Error checking if table exists: " + tableName, e);
        }
    }

    private static void createTable(Connection connection, String tableName) {
        switch (tableName) {
            case "Admin":
                createAdminTable(connection);
                break;
            case "Student":
                createStudentTable(connection);
                break;
            case "Opportunity":
                createOpportunityTable(connection);
                break;
            case "Application":
                createApplicationTable(connection);
                break;
            case "Assessment":
                createAssessmentTable(connection);
                break;
            case "Visit":
                createVisitTable(connection);
                break;
            case "Feedback":
                createFeedbackTable(connection);
                break;
            default:
                break;
        }
    }

    private static void createAdminTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Admin ("
                + "AdminId INTEGER PRIMARY KEY,"
                + "Password TEXT NOT NULL,"
                + "FullName TEXT,"
                + "Email TEXT,"
                + "Designation TEXT)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Admin table", e);
            throw new RuntimeException("Error creating Admin table", e);
        }
    }

    private static void createStudentTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Student ("
                + "StudentId INTEGER PRIMARY KEY,"
                + "Password TEXT NOT NULL,"
                + "FullName TEXT,"
                + "Email TEXT,"
                + "Course TEXT,"
                + "PassOutYear INTEGER)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Student table", e);
            throw new RuntimeException("Error creating Student table", e);
        }
    }

    private static void createOpportunityTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Opportunity ("
                + "OpportunityId INTEGER PRIMARY KEY,"
                + "CompanyName TEXT NOT NULL,"
                + "Role TEXT NOT NULL,"
                + "Description TEXT,"
                + "Salary INTEGER NOT NULL,"
                + "Location TEXT,"
                + "OpenDate TIMESTAMP,"
                + "CloseDate TIMESTAMP,"
                + "AdminId INTEGER,"
                + "FOREIGN KEY (AdminId) REFERENCES Admin(AdminId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Opportunity table", e);
            throw new RuntimeException("Error creating Opportunity table", e);
        }
    }

    private static void createApplicationTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Application ("
                + "ApplicationId INTEGER PRIMARY KEY,"
                + "StudentId INTEGER,"
                + "OpportunityId INTEGER,"
                + "Status TEXT,"
                + "SubmissionDate TIMESTAMP,"
                + "Withdrawn INTEGER,"
                + "CoverLetter TEXT,"
                + "Resume TEXT,"
                + "FOREIGN KEY (StudentId) REFERENCES Student(StudentId),"
                + "FOREIGN KEY (OpportunityId) REFERENCES Opportunity(OpportunityId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Application table", e);
            throw new RuntimeException("Error creating Application table", e);
        }
    }

    private static void createAssessmentTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Assessment ("
                + "AssessmentId INTEGER PRIMARY KEY,"
                + "OpportunityId INTEGER,"
                + "DateTime TIMESTAMP,"
                + "Status TEXT,"
                + "Details TEXT,"
                + "FOREIGN KEY (OpportunityId) REFERENCES Opportunity(OpportunityId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Assessment table", e);
            throw new RuntimeException("Error creating Assessment table", e);
        }
    }

    private static void createVisitTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Visit ("
                + "VisitId INTEGER PRIMARY KEY,"
                + "OpportunityId INTEGER,"
                + "DateTime TIMESTAMP,"
                + "Status TEXT,"
                + "Details TEXT,"
                + "FOREIGN KEY (OpportunityId) REFERENCES Opportunity(OpportunityId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Visit table", e);
            throw new RuntimeException("Error creating Visit table", e);
        }
    }

    private static void createFeedbackTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Feedback ("
                + "FeedbackId INTEGER PRIMARY KEY,"
                + "ApplicationId INTEGER,"
                + "AdminId INTEGER,"
                + "Comments TEXT,"
                + "DateTime TIMESTAMP,"
                + "FOREIGN KEY (ApplicationId) REFERENCES Application(ApplicationId),"
                + "FOREIGN KEY (AdminId) REFERENCES Admin(AdminId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        } catch (SQLException e) {
            LOGGER.log(Level.SEVERE, "Error creating Feedback table", e);
            throw new RuntimeException("Error creating Feedback table", e);
        }
    }
}
