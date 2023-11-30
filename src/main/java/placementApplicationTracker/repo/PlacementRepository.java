package main.java.placementApplicationTracker.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PlacementRepository {

    private static final String JDBC_URL = "jdbc:sqlite:placementApplicationTracker.db";

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection(JDBC_URL);
    }

    public static void createTables(Connection connection) throws SQLException {
        List<String> tablesToCreate = new ArrayList<>();

        if (!isTableCreated(connection, "Student")) {
            tablesToCreate.add("Student");
        }

        if (!isTableCreated(connection, "User")) {
            tablesToCreate.add("User");
        }

        if (!isTableCreated(connection, "Job")) {
            tablesToCreate.add("Job");
        }

        if (!isTableCreated(connection, "PlacementApplication")) {
            tablesToCreate.add("PlacementApplication");
        }

        if (!isTableCreated(connection, "Assessment")) {
            tablesToCreate.add("Assessment");
        }

        if (!isTableCreated(connection, "Visit")) {
            tablesToCreate.add("Visit");
        }

        for (String table : tablesToCreate) {
            createTable(connection, table);
        }
    }

    private static boolean isTableCreated(Connection connection, String tableName) throws SQLException {
        String checkTableSQL = "SELECT name FROM sqlite_master WHERE type='table' AND name='" + tableName + "'";
        try (Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(checkTableSQL)) {

            return resultSet.next();
        }
    }

    private static void createTable(Connection connection, String tableName) throws SQLException {
        switch (tableName) {
            case "Student":
                createStudentTable(connection);
                break;
            case "User":
                createUserTable(connection);
                break;
            case "Job":
                createJobTable(connection);
                break;
            case "PlacementApplication":
                createPlacementApplicationTable(connection);
                break;
            case "Assessment":
                createAssessmentTable(connection);
                break;
            case "Visit":
                createVisitTable(connection);
                break;
            default:
                break;
        }
    }

    private static void createStudentTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Student ("
                + "studentId INTEGER PRIMARY KEY,"
                + "studentName TEXT NOT NULL,"
                + "studentEmail TEXT,"
                + "course TEXT,"
                + "passOutYear INTEGER)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static void createUserTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS User ("
                + "id INTEGER PRIMARY KEY,"
                + "userName TEXT NOT NULL,"
                + "password TEXT NOT NULL,"
                + "studentId INTEGER NOT NULL,"
                + "FOREIGN KEY (studentId) REFERENCES Student(studentId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static void createJobTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Job ("
                + "jobId INTEGER PRIMARY KEY,"
                + "companyName TEXT NOT NULL,"
                + "location TEXT,"
                + "jobRole TEXT,"
                + "jobDescription TEXT,"
                + "salary INTEGER,"
                + "ApplicationLastDate TIMESTAMP)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static void createPlacementApplicationTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS PlacementApplication ("
                + "applicationId INTEGER PRIMARY KEY,"
                + "studentId INTEGER NOT NULL,"
                + "jobId INTEGER NOT NULL,"
                + "applicationDate TIMESTAMP NOT NULL,"
                + "applicationStatus TEXT,"
                + "FOREIGN KEY (studentId) REFERENCES Student(studentId),"
                + "FOREIGN KEY (jobId) REFERENCES Job(jobId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static void createAssessmentTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Assessment ("
                + "assessmentId INTEGER PRIMARY KEY,"
                + "applicationId INTEGER,"
                + "assessmentDate TIMESTAMP NOT NULL,"
                + "result TEXT NOT NULL,"
                + "FOREIGN KEY (applicationId) REFERENCES PlacementApplication(applicationId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static void createVisitTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Visit ("
                + "visitId INTEGER PRIMARY KEY,"
                + "applicationId INTEGER,"
                + "visitDate TIMESTAMP NOT NULL,"
                + "visitPurpose TEXT NOT NULL,"
                + "visitResult TEXT NOT NULL,"
                + "FOREIGN KEY (applicationId) REFERENCES PlacementApplication(applicationId))";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }
}
