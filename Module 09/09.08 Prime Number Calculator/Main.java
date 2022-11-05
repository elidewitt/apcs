/**
 * This is the main class to run the procedural portion of the program
 * 
 * @author Eli R DeWitt
 * @version 3/18/22
 * @purpose This program surveys the user for lower and upper bounds and find prime between said values
 * 
 * @PMR I liked this lesson, especially as a math person! It is an interesting algorithm, especially
 * considering that there is no formula to generate primes other than a brute force.
 */

public class Main {
    public static void main(String [] args) {
        System.out.println("\n~ Prime Number Calculator ~\n");

        // initialize the user input and calculator
        UserInput ui = new UserInput();
        PrimeCalculator calculator = new PrimeCalculator();
        
        // survey the user for lower and upper bounds
        int lowerBound = ui.getInt("Enter Lower Bound", 0);
        int upperBound = ui.getInt("Enter Upper Bound", lowerBound);
        
        //print the results
        System.out.printf("%35s%n", "Results");
        for (int i = 0; i < 75; i++) System.out.print("-");
        System.out.printf("%nFound %s primes between %s and %s%n", calculator.getPrimesInRange(lowerBound, upperBound), lowerBound, upperBound);
        System.out.printf("%nPrimes between %s and %s: %s%n", lowerBound, upperBound, calculator.getMemory());
    }
}
