/**
 * 
 * @author Eli R DeWitt
 * @version 3/22/22
 * @purpose implement recursion to calculate fibonacci numbers
 * 
 * @PMR This was a fun project! Below, I have code below that is commented to show how I
 * found the limit to n. When n was 47, it returned a negative number, which kind of makes
 * sense. The maximum int value is 2147483647, and F(45) = 1134903170, and 
 * F(46) = 1836311903. Which means that F(47) would be greater than the maximum value
 * for an integer in java, so instead of returning an error, it looped and started counting
 * at the minimum.
 * 
 */

public class Main {
    public static void main(String [] args) {

        UserInput userInput = new UserInput();
        boolean rerun = true;

        while (rerun) {
            int n = userInput.getInt("Enter a positive integer n (0 - 46)");
            if (n > 46) {
                System.out.println("n must be between less than 47");
                continue;
            }
            System.out.printf("The %sth Fibonacci number is %s%n", n, getFibonacci(n));
            System.out.println("");
            rerun = userInput.getBoolean("Would you like to continue?");
        }


        // code used to find upper bound for n
        // for (int n = 0; n < 50; n ++) { System.out.printf("The %sth Fibonacci number is %s%n", n, getFibonacci(n)); }
    }

    public static int getFibonacci(int n) {

        if (n < 0) {
            System.out.println("Must use positive integer for n");
            return 0;
        } else if (n <= 1) return n;
        else {
            return getFibonacci(n - 1) + getFibonacci(n - 2);
        }
    }
}
