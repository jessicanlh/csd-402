//Jessica Long-Heinicke Module 2 Assignment 2.2 1/19/25

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Random random = new Random();

            int userWins = 0;
            int computerWins = 0;
            int ties = 0;

            System.out.println("Welcome to Rock-Paper-Scissors!");
            System.out.println("Instructions: Enter 1 for Rock, 2 for Paper, 3 for Scissors. To quit, enter 0.");

            while (true) {
                // Prompt the user for their choice
                System.out.print("Enter your choice: ");
                int userChoice = scanner.nextInt();

                // Exit the game if the user enters 0
                if (userChoice == 0) {
                    System.out.println("Thank you for playing!");
                    System.out.println("Final Scores:");
                    System.out.println("You won " + userWins + " times.");
                    System.out.println("Computer won " + computerWins + " times.");
                    System.out.println("Ties: " + ties);
                    break;
                }

                // Validate user input
                if (userChoice < 1 || userChoice > 3) {
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
                    continue;
                }

                // Generate computer's choice (1, 2, or 3)
                int computerChoice = random.nextInt(3) + 1;

                // Display the choices
                System.out.println("You chose: " + choiceToString(userChoice));
                System.out.println("Computer chose: " + choiceToString(computerChoice));

                // Determine the winner
                if (userChoice == computerChoice) {
                    System.out.println("It's a tie!");
                    ties++;
                } else if ((userChoice == 1 && computerChoice == 3) ||
                        (userChoice == 2 && computerChoice == 1) ||
                        (userChoice == 3 && computerChoice == 2)) {
                    System.out.println("You win!");
                    userWins++;
                } else {
                    System.out.println("Computer wins!");
                    computerWins++;
                }

                // Display current scores
                System.out.println("Current Scores:");
                System.out.println("You: " + userWins + " | Computer: " + computerWins + " | Ties: " + ties);
                System.out.println();
            }
        }
    }

    // Helper method to convert choice number to string
    public static String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Rock";
            case 2 -> "Paper";
            case 3 -> "Scissors";
            default -> "Unknown";
        };
    }
}
