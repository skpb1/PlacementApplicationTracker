package main.java.placementApplicationTracker.service;

import main.java.placementApplicationTracker.model.Job;
import main.java.placementApplicationTracker.repo.PlacementRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlacementService {

    private static final String SELECT_ALL_JOBS = "SELECT * FROM Job";

    public static List<Job> getAllJobs() {
        List<Job> jobs = new ArrayList<>();

        try (Connection connection = PlacementRepository.connect();
                PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_JOBS);
                ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                Job job = createJobFromResultSet(resultSet);
                jobs.add(job);
            }

        } catch (SQLException e) {
            e.printStackTrace(); // Handle the exception based on your application's error handling strategy.
        }

        return jobs;
    }

    private static Job createJobFromResultSet(ResultSet resultSet) throws SQLException {
        Job job = new Job();
        job.setJobId(resultSet.getInt("jobId"));
        job.setCompanyName(resultSet.getString("companyName"));
        job.setLocation(resultSet.getString("location"));
        job.setJobRole(resultSet.getString("jobRole"));
        job.setJobDescription(resultSet.getString("jobDescription"));
        job.setSalary(resultSet.getInt("salary"));
        job.setApplicationLastDate(resultSet.getTimestamp("ApplicationLastDate"));
        return job;
    }
}
