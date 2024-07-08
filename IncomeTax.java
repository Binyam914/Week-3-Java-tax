//********************************************************************
// IncomeTax.java
// Author: Your Name
// Demonstrates the use of if-else statements to determine the tax
// bracket based on annual income.
//********************************************************************

import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter their annual income
        System.out.print("Enter your annual income: ");
        int income = scan.nextInt();

        // Output the entered income amount
        System.out.println("Your annual income is: $" + income);

        // Determine and output the tax bracket
        if (income <= 50000) {
            System.out.println("Tax bracket: 5%");
        } else if (income <= 100000) {
            System.out.println("Tax bracket: 15%");
        } else if (income <= 150000) {
            System.out.println("Tax bracket: 20%");
        } else if (income <= 250000) {
            System.out.println("Tax bracket: 30%");
        } else if (income <= 500000) {
            System.out.println("Tax bracket: 35%");
        } else {
            System.out.println("Tax bracket: 50%");
        }
    }
}
