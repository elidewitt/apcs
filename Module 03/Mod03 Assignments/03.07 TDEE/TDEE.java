/**
 * @author Eli R DeWitt
 * @version 10/27/21
 * @description This program takes input from the user to calculate TDEE
 */

import java.util.Scanner;
public class TDEE
{
    public static void main(String[] args)
    {

        String alphabet = "ABCDEF";

        double[] male = {1.0, 1.3, 1.6, 1.7, 2.1, 2.4};
        double[] female = {1.0, 1.3, 1.5, 1.6, 1.9, 2.2};

        String errorText = "YOU MADE AN ERROR. Pleace restart the program and correctly choose one of the options.";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Please enter your BMR: ");
        Double bmr = Double.parseDouble(scanner.nextLine());

        System.out.print("Please enter your gender (M/F): ");
        String gender = scanner.nextLine().toUpperCase();

        System.out.println("\nSelect Your Activity Level");
        System.out.println("[A] Resting (Sleeping, Reclining)");
        System.out.println("[B] Sedentary (Restricted Mobility");
        System.out.println("[C] Light (Sitting, Standing");
        System.out.println("[D] Moderate (Light Manual Labor, Dancing, Riding Bike)");
        System.out.println("[E] Very Active (Team Sports, Hard Manual Labor)");
        System.out.println("[F] Extremely Active (Full-time Athlete, Heavy Manual Labor)");

        System.out.print("\nEnter the letter corresponding to your activity level: ");
        String al = scanner.nextLine().toUpperCase();

        // Calculations
        int index = alphabet.indexOf(al);
        if (index == -1) System.out.println(errorText);
        double af;
        if (gender.equals("F")) af = female[index];
        else if (gender.equals("M")) af = male[index];
        else {System.out.println(errorText); af = 0.0;}
        double tdee = bmr * af;

        System.out.println("\n");

        System.out.println("Your Results:");
        System.out.println("Name: " + name + "\t\tGender: " + gender);
        System.out.println("BMR: " + bmr + " calories\t\t Activity Factor: " + af);
        System.out.println("TDEE: " + tdee + " calories");
    }
}