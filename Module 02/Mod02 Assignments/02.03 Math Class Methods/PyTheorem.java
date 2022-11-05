/**
 * @author Eli R DeWitt
 * @date 9/29/21
 * @description This program calculates and displays the hypotenuse
            of randomly generated triangles. 
 */

public class PyTheorem
{
    public static void main(String[ ] args)
    {
        int triangles = 2;

        for (int i = 0; i < triangles; i++)
        {
            calcAndDisplay(i, Math.random() * 17 + 5, Math.random() * 17 + 5);
        }
    }

    public static void calcAndDisplay(int num, double a, double b)
    {
        double c = Math.sqrt(a*a + b*b);
        System.out.println("Triangle " + (num + 1) + "\tSide 1: " + a + "\tSide 2: " + b + "\t Hypotenuse: " + c);
    }

}