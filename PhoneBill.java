//********************************************************************
// PhoneBill.java
// Author: Your Name
// Demonstrates the use of if-else statements to calculate the bill
// for a cellular telephone company based on the type of service.
//********************************************************************

import java.util.Scanner;

public class PhoneBill {
    public static void main(String[] args) {
        // Create a Scanner object for reading input
        Scanner scan = new Scanner(System.in);

        // Prompt the user to enter the account number
        System.out.print("Enter account number: ");
        int accountNumber = scan.nextInt();

        // Prompt the user to enter the service code (r/R for regular, p/P for premium)
        System.out.print("Enter service code (r/R for regular, p/P for premium): ");
        char serviceCode = scan.next().charAt(0);

        double amountDue = 0.0;

        // Calculate the bill based on the service code
        if (serviceCode == 'r' || serviceCode == 'R') {
            // Regular service
            System.out.print("Enter the number of minutes used: ");
            int minutes = scan.nextInt();
            amountDue = 10.00; // Base charge for regular service

            if (minutes > 50) {
                amountDue += (minutes - 50) * 0.20; // Charge for minutes over 50
            }

            // Output the bill details
            System.out.println("Account number: " + accountNumber);
            System.out.println("Service type: Regular");
            System.out.println("Minutes used: " + minutes);
            System.out.println("Amount due: $" + amountDue);

        } else if (serviceCode == 'p' || serviceCode == 'P') {
            // Premium service
            amountDue = 25.00; // Base charge for premium service

            // Prompt the user to enter the number of minutes used during the day and night
            System.out.print("Enter the number of minutes used during the day (6:00AM - 6:00PM): ");
            int dayMinutes = scan.nextInt();
            System.out.print("Enter the number of minutes used during the night (6:00PM - 6:00AM): ");
            int nightMinutes = scan.nextInt();

            if (dayMinutes > 75) {
                amountDue += (dayMinutes - 75) * 0.10; // Charge for minutes over 75 during the day
            }

            if (nightMinutes > 100) {
                amountDue += (nightMinutes - 100) * 0.05; // Charge for minutes over 100 during the night
            }

            // Output the bill details
            System.out.println("Account number: " + accountNumber);
            System.out.println("Service type: Premium");
            System.out.println("Minutes used (day): " + dayMinutes);
            System.out.println("Minutes used (night): " + nightMinutes);
            System.out.println("Amount due: $" + amountDue);
        } else {
            // Invalid service code
            System.out.println("Invalid service code entered.");
        }
    }
}
