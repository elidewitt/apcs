
/**
 * 
 *  Eli R DeWitt
 *  9/12/2021
 *  Description: utilizes variable of type int and double to perform simple calculation and discplay them to the console
 */
public class CalculationsV6
{
    public static void main(String[] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        int iNum3 = 11;

        // Declare double variables
        double dNum1 = 43.21;
        double dNum2 = 3.14;
        double dNum3 = 10.0;

        // Addition
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();

        // Subtraction
        System.out.println("Subtraction");
        System.out.println(iNum3 + " - " + iNum2 + " - " + iNum1 + " = " + (iNum3 - iNum2 - iNum1));
        System.out.println(dNum2 + " - " + dNum3 + " = " + (dNum2 - dNum3));
        System.out.println();

        // Multiplication
        System.out.println("Multiplication");
        System.out.println(iNum1 + " * " + iNum2 + " = " + (iNum1 * iNum2));
        System.out.println(dNum2 + " * " + dNum3 + " * " + dNum3 + " = " + (dNum2 * dNum3 * dNum3));
        System.out.println();

        // Division
        System.out.println("Division");
        System.out.println(iNum2 + " / " + iNum1 + " = " + (iNum2 / iNum1));
        System.out.println(dNum1 + " / " + dNum3 + " = " + (dNum1 / dNum3));
        System.out.println();

        // Modulus operator
        System.out.println("Modulus");
        System.out.println(iNum3 + " % " + iNum2 + " = " + (iNum3 % iNum2));
        System.out.println(dNum3 + " % " + dNum2 + " = " + (dNum3 % dNum2));
        System.out.println();
        
        // 1.08 Additional int Equations
        System.out.println("Additional INT Equations");
        System.out.println(iNum1 + " / " + iNum2 + " % " + iNum3 + " = " + (iNum1 / iNum2 % iNum3));
        System.out.println(iNum2 + " * " + iNum2 + " + " + iNum1 + " = " + (iNum2 * iNum2 + iNum1));
        System.out.println(iNum1 + " - " + iNum3 + " * " + iNum2 + " = " + (iNum1 - iNum3 * iNum2));
        System.out.println();

        // 1.09 Additional double Equations
        System.out.println("Additional DOUBLE Equations");
        System.out.println(dNum1 + " / " + dNum2 + " % " + dNum3 + " = " + (dNum1 / dNum2 % dNum3));
        System.out.println(dNum2 + " * " + dNum2 + " + " + dNum1 + " = " + (dNum2 * dNum2 + dNum1));
        System.out.println(dNum1 + " - " + dNum3 + " * " + dNum2 + " = " + (dNum1 - dNum3 * dNum2));

               
    } // end of main method
} // end of class
