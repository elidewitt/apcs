/**
 * @author Eli R Dewitt
 * @version 2/22/2022
 * @purose Use OOP and 2D arrays to display and calculate information
 * 
 * @PMR This was a nice simple project. On the expected output it used feet, but
 * the instructions mentioned I could use whatever units I wanted. So naturally,
 * I chose the metric system because there would be minimal conversions necessary.
 * If you were to use other units, you have have a method in the Catapult class that
 * would conver the values.
 */


public class CatapultTester {
    public static void main(String [] args) {

        int [] speeds = {20, 25, 30, 35, 40, 45, 50};
        int [] angles = {25, 30, 35, 40, 45, 50};
        Catapult [][] catapults = new Catapult[speeds.length][angles.length];

        for (int row = 0; row < speeds.length; row ++) {
            for (int col = 0; col < angles.length; col ++) {
                catapults[row][col] = new Catapult(speeds[row], angles[col]);
            }
        }
        printResults(catapults, speeds, angles);
    }

    public static void printResults(Catapult [][] catapults, int [] speeds, int [] angles) {
        System.out.printf("%50s%n", "Projectile Distance (Meters)");
        System.out.print("\nm/s");
        for (int angle : angles) {
            System.out.printf("%7s deg", angle);
        }
        System.out.println();
        for (int i = 0; i < 70; i++) System.out.print("=");
        System.out.println();
        for (int row = 0; row < speeds.length; row ++) {
            System.out.printf("%3s", speeds[row]);
            for (int col = 0; col < angles.length; col ++) {
                System.out.printf("%9.1f m", catapults[row][col].calcDistance());
            }
            System.out.println();
        }
        
    }
}
