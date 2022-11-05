/**
 * @author Eli R DeWitt
 * @version 11/24/21
 * @description This program will calculate the surface gravity of a planet and print the
 * organized results to the terminal.
 */

public class PlanetGravity
{
    public static double G = 6.67108e-11;
    public static String planetName = "Mars";
    public static double diameter = 6794; // kilometers
    public static double mass = 6.421e+23; // kilograms
    public static void main(String[] args)
    {
        displayHeader();
        displayData();
    }

    public static double surfaceGravity(double M, double r)
    {
        return Math.round(((G * M) / (r * r)) * 100.0) / 100.0;
    }

    public static void displayHeader()
    {
        System.out.println("\t\t\t\tPlanetary Data");
        System.out.println("Planet\t\tDiameter (km)\t\tMass (kg)\t\t g(m/s^2)");
        System.out.println("------------------------------------------------------------------------");
    }

    public static void displayData()
    {
        System.out.println(planetName + "\t\t" + diameter + "\t\t\t" + mass + "\t\t" + surfaceGravity(mass, (diameter)*500));
    }
}