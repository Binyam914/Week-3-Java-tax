//********************************************************************
// CheckNumber.java
// Author: Your Name
// Demonstrates the use of if-else statements to check if a number
// is positive, negative, or zero.
//********************************************************************

import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scan.nextInt();

        // Output the entered number
        System.out.println("You entered: " + number);

        // Determine if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}
