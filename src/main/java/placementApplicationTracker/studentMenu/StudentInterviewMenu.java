package main.java.placementApplicationTracker.studentMenu;

import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import main.java.placementApplicationTracker.model.Interview;
import main.java.placementApplicationTracker.repo.intf.InterviewRepo;
import main.java.placementApplicationTracker.service.InterviewService;

public class StudentInterviewMenu {
	private final Logger LOGGER = Logger.getLogger(StudentInterviewMenu.class.getName());
	private InterviewService interviewService;

	public StudentInterviewMenu(InterviewRepo interviewRepo) {
		interviewService = new InterviewService(interviewRepo);
	}

	public void displayInterviewMenu(int applicationId, Scanner scanner) {
		boolean isRunning = true;

		while (isRunning) {
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			try {
				List<Interview> interviews = null;

				interviews = interviewService.getInterviewsByApplicationId(applicationId);
				

				if (interviews.size() != 0) {
					System.out.println();
					System.out.println("Interviews List is shown below");
					System.out.println();

					interviews.forEach(interview -> {
						System.out.println("------------------------------------------");
						System.out.println("Interview Id: " + interview.getInterviewId());
						System.out.println("DateTime: " + interview.getDateTime());
						System.out.println("------------------------------------------");
					});
				} else {
					System.out.println();
					System.out.println("No Interviews found");
					System.out.println();
				}

				System.out.println();
				System.out.println("********************************************");
				System.out.println("1. Show Details of an Interview");
				System.out.println("2. Go back");
				System.out.println("********************************************");
				System.out.println();
				System.out.print("Enter your choice: ");

				int option;
				option = scanner.nextInt();
				System.out.println();
				switch (option) {
				case 1:
					System.out.println("Selected: Show Details of an Interview");
					System.out.println("============================================");
					System.out.println();

					if (interviews.size() != 0) {
						System.out.println();
						System.out.println("Enter the Interview Id:");
						int interviewId = scanner.nextInt();
						Interview interview = interviewService.getInterviewById(interviewId);
						System.out.println();
						System.out.println("Interview Details are shown below");
						System.out.println();
						System.out.println("------------------------------------------");
						System.out.println("Interview Id: " + interview.getInterviewId());
						System.out.println("DateTime: " + interview.getDateTime());
						System.out.println("Status: " + interview.getStatus());
						System.out.println("Type: " + interview.getType());
						System.out.println("------------------------------------------");
						System.out.println();
						System.out.println();

						scanner.nextLine();

						System.out.println("Press Enter to continue");
						scanner.nextLine();
						System.out.println();
					} else {
						System.out.println();
						System.out.println("No Interviews found");
						System.out.println();
					}
					break;
				case 2:
					System.out.println("Selected: Go back");
					System.out.println("============================================");
					System.out.println();
					isRunning = false;
					break;
				default:
					System.out.println("Invalid option. Please choose a valid option.");
					System.out.println("============================================");
					System.out.println();
					break;
				}

			} catch (Exception e) {
				LOGGER.log(Level.SEVERE, "Error in menu option processing", e);
				System.out.println("An unexpected error occurred. Please try again.");
				isRunning = false;
				break;
			}
		}

	}
}
