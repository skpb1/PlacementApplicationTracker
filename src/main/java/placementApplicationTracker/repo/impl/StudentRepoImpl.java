package main.java.placementApplicationTracker.repo.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Student;
import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.repo.intf.StudentRepo;

public class StudentRepoImpl implements StudentRepo {

	private final Logger LOGGER = Logger.getLogger(StudentRepoImpl.class.getName());

	@Override
    public Student getStudentDetails(int studentId) {
        Student student = null;
        String query = "SELECT * FROM Student WHERE StudentId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, studentId);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    student = new Student(
                            resultSet.getInt("StudentId"),
                            resultSet.getString("Password"),
                            resultSet.getString("FullName"),
                            resultSet.getString("Email"),
                            resultSet.getString("Course"),
                            resultSet.getInt("PassOutYear")
                    );
                }
            }
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error getting student details", e);
        }
        return student;
    }

	@Override
    public boolean updateStudentPassword(int studentId, String currentPassword, String newPassword) {
        String query = "UPDATE Student SET Password = ? WHERE StudentId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, newPassword);
            statement.setInt(2, studentId);
//            statement.setString(3, currentPassword);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error updating student password", e);
            return false;
        }
    }

	@Override
    public boolean updateStudentDetails(int studentId, String updatedFullName, String updatedEmail,
                                               String updatedCourse, int updatedPassOutYear) {
        String query = "UPDATE Student SET FullName = ?, Email = ?, Course = ?, PassOutYear = ? WHERE StudentId = ?";
        try (Connection connection = PlacementRepository.connect();
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, updatedFullName);
            statement.setString(2, updatedEmail);
            statement.setString(3, updatedCourse);
            statement.setInt(4, updatedPassOutYear);
            statement.setInt(5, studentId);

            int rowsAffected = statement.executeUpdate();
            return rowsAffected > 0;
        } catch (Exception e) {
            LOGGER.log(Level.SEVERE, "Error updating student details", e);
            return false;
        }
    }

	@Override
	public void addStudent(Student student) {
		
	}

}
