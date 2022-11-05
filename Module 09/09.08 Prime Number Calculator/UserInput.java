/**
 * This class groups everything I need for user input into a reuseable object / method.
 */

import java.util.Scanner;
public class UserInput {

    // initialize variables
    private Scanner input;
    public UserInput() { this.input = new Scanner(System.in); }

    // method for surveying user for a number
    public int getInt(String prompt, int lowerBound) {
        int result;
        while (true) {
            try {
                System.out.print(prompt + ": ");
                String in = input.nextLine();
                result = Integer.parseInt(in);
                if (result > lowerBound) return result;
                else System.out.printf("Please enter a number greater than %s%n", lowerBound);
            } catch (Exception e) {
                System.out.println(e);
                System.out.println("Please Enter A Valid Number");
            }
        }
    }
}
