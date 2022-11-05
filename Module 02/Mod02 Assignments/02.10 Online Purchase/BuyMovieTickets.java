/**
 * @author Eli R DeWitt
 * @version October 11th, 2021
 * @description This program takes input from the user about their movie tickets and prints a receipt to the console.
 */

import java.util.Scanner;

public class BuyMovieTickets
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! Before proceeding to your showing, please enter the following information.\n");

        System.out.print("First and last name (FIRST LAST): ");
        String firstName = scanner.next();
        String lastName = scanner.nextLine();

        System.out.print("Today's date (mm/dd/yyy): ");
        String date = scanner.nextLine();

        System.out.print("Movie title: ");
        String title = scanner.nextLine();

        System.out.print("Price per ticket: ");
        String price = scanner.nextLine();

        System.out.print("Quantity of tickets: ");
        String quantity = scanner.nextLine();

        System.out.print("Debit card number (#####-###-####): ");
        String debitNum = scanner.nextLine();

        System.out.print("Debit card PIN (#####): ");
        String debitPIN = scanner.nextLine();

        System.out.println("\n********************************\n");

        System.out.println("Your e-Receipt\n");
        System.out.println(date.replaceAll("/", "-"));
        System.out.println(firstName.charAt(0) + ". " + lastName);
        System.out.println("Account: #####-###-" + debitNum.substring(10, 14));
        System.out.println("Movie: " + title);
        System.out.println("Number of Tickets: " + quantity);
        System.out.println("Ticket Price : " + Float.parseFloat(price));
        System.out.println("\n$" + Float.parseFloat(price) * Integer.parseInt(quantity) + " will be debited to your account.\n\nThank you. Enjoy your movie tonight.");
        
    }
}