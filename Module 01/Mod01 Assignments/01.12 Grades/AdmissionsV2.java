/**
 * The purpose of this program is to calculate grade averages
 * 
 * @author Eli R DeWitt
 * @version 09/15/2021
 */

public class AdmissionsV2
{
    public static void main(String[] args)
    {
        //local variables
        int numTests = 0;      //counts number of tests
        int testGrade = 0;     //individual test grade
        int totalPoints = 0;   //total points for all tests
        double average = 0.0;  //average grade
        
        // Test 1
        testGrade = 95;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Test 2
        testGrade = 73;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Test 3
        testGrade = 91;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Test 4
        testGrade = 82;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Extra Test 1
        testGrade = 87;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Extra Test 2
        testGrade = 93;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Extra Test 3
        testGrade = 100;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);
        
        // Extra Test 4
        testGrade = 75;
        totalPoints += testGrade;
        numTests ++;
        average = (double)totalPoints / numTests;
        System.out.print("Test # " + numTests);
        System.out.print("\tNew Test Grade: " + testGrade);
        System.out.print("\tTotal Points: " + totalPoints);
        System.out.println("\tAverage Score: " + average);

    }
}