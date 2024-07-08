//********************************************************************
// Game.java
// Author: Your Name
// Demonstrates the use of random number generation and if-else statements
// to play the scissor-rock-paper game.
//********************************************************************

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        // Create a Random object for generating random numbers
        Random random = new Random();

        // Generate a random number (0, 1, or 2) for the computer's choice
        int computerChoice = random.nextInt(3);

        // Create a Scanner object for reading input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter their choice (0 for scissors, 1 for rock, 2 for paper)
        System.out.print("Enter a number (0 for scissors, 1 for rock, 2 for paper): ");
        int userChoice = scan.nextInt();

        // Output the choices
        System.out.println("Computer's choice: " + computerChoice);
        System.out.println("Your choice: " + userChoice);

        // Determine the winner
        if (userChoice == computerChoice) {
            System.out.println("It's a draw!");
        } else if ((userChoice == 0 && computerChoice == 2) ||
                   (userChoice == 1 && computerChoice == 0) ||
                   (userChoice == 2 && computerChoice == 1)) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}
