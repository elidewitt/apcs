/**
 * Starter code for the Hurricane Tester
 * APCS Team 2020
 *
 * @author Eli R DeWitt
 * @date 1/27/2022
 * @purpose covert data from hurricanedata.txt and display it
 * 
 */
 
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
public class HurricaneTester
{

    public static void main(String[] args) throws IOException
    {
        //read data from text file & put in an array
        File fileName = new File("hurricanedata.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;
        
        //count number of lines in text file
        while (inFile.hasNextLine() )
        {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();
        
        
        //initialize arrays based on lines counted in text file
        int [] years = new int[numValues];
        String [] months = new String[numValues];
        int [] pressures = new int[numValues];
        double [] windSpeeds = new double[numValues];
        String [] names = new String[numValues];
        int [] categories = new int[numValues];
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        double pressureSum = 0.0;
        double windSum = 0.0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            pressureSum += pressures[index];
            windSpeeds[index] = inFile.nextDouble();
            windSum += windSpeeds[index];
            names[index] = inFile.next();
            index++;
        }
        double pressureAverage = pressureSum / numValues;
        double windAverage = windSum / numValues;
        inFile.close();
        
        //convert the windspeed, determine categories, calculate sums
        int [] sums = new int[6];
        double catSum = 0.0;
        for (int i = 0; i < numValues; i++) 
        {
            windSpeeds[i] *= 1.15077945; // Convert kts to mph
            double v = windSpeeds[i];
            if (v >= 74 && v < 96) {
                categories[i] = 1;
                sums[1] ++;
            }
            else if (v >= 96 && v < 111) {
                categories[i] = 2;
                sums[2] ++;
            }
            else if (v >= 111 && v < 130) {
                categories[i] = 3;
                sums[3] ++;
            }
            else if (v >= 130 && v < 157) {
                categories[i] = 4;
                sums[4] ++;
            }
            else if (v >= 157) {
                categories[i] = 5;
                sums[5] ++;
            }
            else {
                categories[i] = 0;
                sums[0] ++;
            }
            catSum += categories[i];
        }
        double catAverage = catSum/numValues;
        
        //create a Hurricane ArrayList using the data above
        ArrayList<Hurricane> hurricanes = new ArrayList<Hurricane>();
        for (int i = 0; i < numValues; i++) {
            hurricanes.add (new Hurricane(
                years[i], 
                names[i], 
                months[i], 
                categories[i], 
                pressures[i], 
                windSpeeds[i]
            ));
        }
        
        //user prompted for range of years
        Scanner input = new Scanner(System.in);
        
        int startYear = Integer.MIN_VALUE;
        while (startYear < 1995 || startYear > 2019) {
            System.out.print("Please enter a valid start year ( between 1995 and 2019 ) : ");
            startYear = input.nextInt();
        }

        int endYear = Integer.MAX_VALUE;
        while (endYear > 2019 || endYear < startYear) {
            System.out.print("Please enter a valid end year ( between " + startYear + " and 2019) : ");
            endYear = input.nextInt();
        }

        input.close();
        
        //print the data
        System.out.println("\\tt\tHurricanes " + startYear + " - " + endYear);
        System.out.println("Year\tHurricane\tCategory\tPressure (mb)\tWind Speed (mph)");
        System.out.println("=============================================================================\n");
        for (Hurricane hurricane : hurricanes) {
            if (hurricane.getYear() >= startYear && hurricane.getYear() <= endYear) {
                System.out.println(hurricane);
            }
        }

        System.out.println("=============================================================================");
        System.out.printf("\tAverage: %3.1f %4.1 %6.2f" + catAverage, pressureAverage, windAverage);

        System.out.println("Summary of Categories:");
        for (int i = 1; i < 6; i ++) {
            System.out.printf("Cat %s: %s\n", i, sums[i]);
        }
     }
}