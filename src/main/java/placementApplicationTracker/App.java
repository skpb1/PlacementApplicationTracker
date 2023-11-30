package main.java.placementApplicationTracker;

import main.java.placementApplicationTracker.repo.PlacementRepository;
import main.java.placementApplicationTracker.service.PlacementService;
import main.java.placementApplicationTracker.utils.InsertData;

import java.sql.Connection;
import java.sql.SQLException;

public class App {

    public static void main(String[] args) {

        try (Connection connection = PlacementRepository.connect();) {

            // Create the tables in Database
            PlacementRepository.createTables(connection);

            // Insert sample data
            InsertData.insertSampleData(connection);

            // Get and display all jobs
            displayAllJobs();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void displayAllJobs() {
        System.out.println("List of Jobs:");
        PlacementService.getAllJobs().forEach(job -> {
            System.out.println("Job ID: " + job.getJobId());
            System.out.println("Company Name: " + job.getCompanyName());
            System.out.println("Location: " + job.getLocation());
            System.out.println("Job Role: " + job.getJobRole());
            System.out.println("Job Description: " + job.getJobDescription());
            System.out.println("Salary: " + job.getSalary());
            System.out.println("Application Last Date: " + job.getApplicationLastDate());
            System.out.println("---------------------------");
        });
    }
}
