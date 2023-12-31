package main.java.placementApplicationTracker.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.utils.InsertData;

public class PlacementRepository {

    // JDBC URL for SQLite database
    private static final String JDBC_URL = "jdbc:sqlite:placementApplicationTracker.db";
    private static final Logger LOGGER = Logger.getLogger(PlacementRepository.class.getName());

    // Establish a connection to the SQLite database
    public static Connection connect() {
        try {
            return DriverManager.getConnection(JDBC_URL);
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error connecting to the database", e);
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    // Create necessary tables if they do not exist
    public static void createTables(Connection connection) {

        try {
            // List to store the names of tables that needs to be created
            List<String> tablesToCreate = new ArrayList<>();

            // Check if each table exists; if not, add it to the list
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

            if (!isTableCreated(connection, "Interview")) {
                tablesToCreate.add("Interview");
            }

            if (!isTableCreated(connection, "Feedback")) {
                tablesToCreate.add("Feedback");
            }

            // Create tables from the list
            for (String table : tablesToCreate) {
                createTable(connection, table);
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error while creating tables: " + e);
        }
    }

    // Check if a table already exists
    private static boolean isTableCreated(Connection connection, String tableName) {
        String checkTableSQL = "SELECT name FROM sqlite_master WHERE type='table' AND name='" + tableName + "'";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(checkTableSQL)) {

            return resultSet.next();
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error checking if table exists: " + tableName, e);
            throw new RuntimeException("Error checking if table exists: " + tableName, e);
        }
    }

    // Creates table based on the name
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
            case "Interview":
                createInterviewTable(connection);
                break;
            case "Feedback":
                createFeedbackTable(connection);
                break;
            default:
                break;
        }
    }

    // Create the Admin table
    private static void createAdminTable(Connection connection) {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS Admin (" +
                "AdminId INTEGER PRIMARY KEY AUTOINCREMENT," +
                "Password TEXT NOT NULL," +
                "FullName TEXT," +
                "Email TEXT," +
                "Designation TEXT)";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
            // Insert some initial data into the Admin table
            InsertData.insertAdminData(connection, 1, "admin_password", "Admin User", "admin@example.com", "Admin Designation");
            InsertData.insertAdminData(connection, 2, "another_admin_password", "Another Admin User", "another_admin@example.com", "Senior Admin");
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error creating Admin table", e);
            throw new RuntimeException("Error creating Admin table", e);
        }
    }

    // Create the Student table
	private static void createStudentTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Student (" + "StudentId INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "Password TEXT NOT NULL," + "FullName TEXT," + "Email TEXT," + "Course TEXT,"
				+ "PassOutYear INTEGER)";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Student table
			InsertData.insertStudentData(connection, 1, "123", "User One", "user1@example.com", "Computer Science",
					2023);
			InsertData.insertStudentData(connection, 2, "123", "User Two", "user2@example.com",
					"Electrical Engineering", 2022);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Student table", e);
			throw new RuntimeException("Error creating Student table", e);
		}
	}

	// Create the Opportunity table
	private static void createOpportunityTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Opportunity ("
				+ "OpportunityId INTEGER PRIMARY KEY AUTOINCREMENT," + "CompanyName TEXT NOT NULL,"
				+ "Role TEXT NOT NULL," + "Description TEXT," + "Salary INTEGER NOT NULL," + "Location TEXT,"
				+ "OpenDate TIMESTAMP," + "CloseDate TIMESTAMP," + "AdminId INTEGER,"
				+ "FOREIGN KEY (AdminId) REFERENCES Admin(AdminId))";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Opportunity table
			InsertData.insertOpportunityData(connection, 1, "abc ltd", "Software Developer Intern",
					"Internship for software development", 35000, "CityA", "2023-01-01", "2023-03-01", 1);
			InsertData.insertOpportunityData(connection, 2, "def ltd", "Data Scientist",
					"Full-time position for data science", 30000, "CityB", "2023-02-01", "2023-04-01", 2);
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Opportunity table", e);
			throw new RuntimeException("Error creating Opportunity table", e);
		}
	}

	// Create the Application table
	private static void createApplicationTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Application ("
				+ "ApplicationId INTEGER PRIMARY KEY AUTOINCREMENT," + "StudentId INTEGER," + "OpportunityId INTEGER,"
				+ "Status TEXT," + "SubmissionDate TIMESTAMP," + "Withdrawn INTEGER," + "CoverLetter TEXT,"
				+ "Resume TEXT," + "FOREIGN KEY (StudentId) REFERENCES Student(StudentId),"
				+ "FOREIGN KEY (OpportunityId) REFERENCES Opportunity(OpportunityId))";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Application table
			InsertData.insertApplicationData(connection, 1, 1, 1, "Submitted", "2023-02-15", 0,
					"Cover letter for User 1, Application 1", "Resume for User 1, Application 1");
			InsertData.insertApplicationData(connection, 2, 2, 2, "Pending", "2023-02-20", 0,
					"Cover letter for User 2, Application 2", "Resume for User 2, Application 2");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Application table", e);
			throw new RuntimeException("Error creating Application table", e);
		}
	}

	// Create the Assessment table
	private static void createAssessmentTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Assessment ("
				+ "AssessmentId INTEGER PRIMARY KEY AUTOINCREMENT," + "ApplicationId INTEGER," + "DateTime TIMESTAMP,"
				+ "Status TEXT," + "Details TEXT,"
				+ "FOREIGN KEY (ApplicationId) REFERENCES Application(ApplicationId))";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Assessment table
			InsertData.insertAssessmentData(connection, 1, 1, "2023-02-25", "Scheduled",
					"Assessment Details for User 1, Application 1");
			InsertData.insertAssessmentData(connection, 2, 2, "2023-02-28", "Pending",
					"Assessment Details for User 2, Application 2");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Assessment table", e);
			throw new RuntimeException("Error creating Assessment table", e);
		}
	}

	// Create the Visit table
	private static void createVisitTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Visit (" + "VisitId INTEGER PRIMARY KEY AUTOINCREMENT,"
				+ "ApplicationId INTEGER," + "DateTime TIMESTAMP," + "Status TEXT," + "Details TEXT,"
				+ "FOREIGN KEY (ApplicationId) REFERENCES Application(ApplicationId))";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Visit table
			InsertData.insertVisitData(connection, 1, 1, "2023-03-05", "Scheduled",
					"Visit Details for User 1, Application 1");
			InsertData.insertVisitData(connection, 2, 2, "2023-03-08", "Confirmed",
					"Visit Details for User 2, Application 2");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Visit table", e);
			throw new RuntimeException("Error creating Visit table", e);
		}
	}

	// Create the Interview table
	private static void createInterviewTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Interview ("
				+ "InterviewId INTEGER PRIMARY KEY AUTOINCREMENT," + "ApplicationId INTEGER," + "Status TEXT,"
				+ "Type TEXT," + "DateTime TIMESTAMP,"
				+ "FOREIGN KEY (ApplicationId) REFERENCES Application(ApplicationId))";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Interview table
			InsertData.insertInterviewData(connection, 1, 1, "Scheduled", "Technical", "2023-03-10");
			InsertData.insertInterviewData(connection, 2, 2, "Scheduled", "HR", "2023-03-12");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Interview table", e);
			throw new RuntimeException("Error creating Interview table", e);
		}
	}

	// Create the Feedback table
	private static void createFeedbackTable(Connection connection) {
		String createTableSQL = "CREATE TABLE IF NOT EXISTS Feedback ("
				+ "FeedbackId INTEGER PRIMARY KEY AUTOINCREMENT," + "ApplicationId INTEGER," + "Comments TEXT,"
				+ "DateTime TIMESTAMP," + "FOREIGN KEY (ApplicationId) REFERENCES Application(ApplicationId))";
		try (Statement statement = connection.createStatement()) {
			statement.execute(createTableSQL);
			// Insert some initial data into the Feedback table
			InsertData.insertFeedbackData(connection, 1, 1, "Good performance in the assessment", "2023-03-10");
			InsertData.insertFeedbackData(connection, 2, 2, "Further improvements needed", "2023-03-12");
		} catch (Exception e) {
			LOGGER.log(Level.SEVERE, "Error creating Feedback table", e);
			throw new RuntimeException("Error creating Feedback table", e);
		}
	}
}
