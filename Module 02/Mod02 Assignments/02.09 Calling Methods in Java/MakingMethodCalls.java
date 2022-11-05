/**
 * Without modifying any of the method signatures, correct add method calls to the already created methods in the main() below 
 *
 * APCS Team 2020 (Edited by: Eli R DeWitt)
 * @version 10/06/2021
 * @description Demonstrate the use of methods
 */ 
 public class MakingMethodCalls

{
    public static void addTheseTwo()
    {
        System.out.println("Ten plus five equals " + (10 + 5));
    }   
    
    public static void multiplyTheseTwo(int a, int b)
    {
        System.out.println("Ten times five equals " + (a * b));
    }  
    
    public static int divideTheseTwo(int a, int b)
    {
        return (a / b);
    }    
    
    public static void main(String[] args)
    {
        int x = 10;
        int y = 5;
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten plus five equals 15"
         */

        addTheseTwo();

        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten times five equals 50"
         */
        
        multiplyTheseTwo(10, 5);
        
        
        /**
         * Insert code here that calls one of the above methods that results in.
         * computer printing out "Ten divided by five equals 2"
         */
        System.out.println("Ten divided by five equals " + divideTheseTwo(10, 5));

    }//end of main method
}//end of class
