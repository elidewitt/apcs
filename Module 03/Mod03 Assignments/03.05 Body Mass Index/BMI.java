/**
 * @author Eli R DeWitt
 * @version 10/21/21
 * @description This is a program that takes input from the user regarding height and weigth to print their BMI and what it means to the terminal.
 */

import java.util.Scanner;
public class BMI
{
    public static void main(String[] args)
    {
        class convert
        {
            static double getMeters(double feet) {
                return feet * 0.3048;
            }
            static double getKilograms(double pounds) {
                return pounds * 0.453592;
            }
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Please enter the following information");

        System.out.println("Firt and last name (FIRST LAST): ");
        String name = scanner.nextLine();

        System.out.println("Hight (FEET INCHES)");
        String heightFeet = scanner.next();
        String heightInches = scanner.nextLine();

        System.out.println("Weight (POUNDS)");
        String weight = scanner.nextLine();

        double kilograms = convert.getKilograms(Float.parseFloat(weight));
        double meters = convert.getMeters(Float.parseFloat(heightFeet) + (Float.parseFloat(heightInches) / 12));
        double BMI = kilograms/(meters * meters);

        String category;
        if (BMI < 18.5) category = "Underweight";
        else if (BMI < 25.0) category = "Normal or Healthy Weight";
        else if (BMI < 30) category = "Overweight";
        else category = "Obese";

        System.out.println("\nBody Mass Index Calculator");
        System.out.println("================================");
        System.out.println("Name: " + name);
        System.out.println("Height (m): " + meters);
        System.out.println("Weight (kg): " + kilograms);
        System.out.println("BMI: " + BMI);
        System.out.println("Category: " + category);
    }
}