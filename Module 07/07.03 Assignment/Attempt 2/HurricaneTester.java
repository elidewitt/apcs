/**
 * @author Eli R Dewitt
 * @date 1/26/22
 *
 * @PMR
 * This project was very confusing. I was always second guessing if I was doing it correctly based on
 * the instructions and the outline. I would think it would want the summary based on the queried data,
 * but that is calculated before we even get that information from the user. The order makes it very
 * unclear on what to do.
 * 
 */
 
import java.io.IOException;
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
        
        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while(inFile.hasNext() )
        {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();
        
        //convert the windspeed, determine categories, calculate sums
        int [] categories = new int[numValues];
        int [] catSums = new int[5];
        double totalCatSum = 0.0;
        double totalPressureSum = 0.0;
        double totalWindSpeedSum = 0.0;

        int catMin = Integer.MAX_VALUE;
        double pressureMin = Double.MAX_VALUE;
        double windSpeedMin = Double.MAX_VALUE;

        int catMax = Integer.MIN_VALUE;
        double pressureMax = Double.MIN_VALUE;
        double windSpeedMax = Double.MIN_VALUE;
        

        for (int i = 0; i < numValues; i++) {
            windSpeeds[i] *= 1.15077945; // Convert kts to mph

            double v = windSpeeds[i];
            if (v >= 74 && v < 96) {
                categories[i] = 1;
                catSums[0] ++;
            }
            else if (v >= 96 && v < 111) {
                categories[i] = 2;
                catSums[1] ++;
            }
            else if (v >= 111 && v < 130) {
                categories[i] = 3;
                catSums[2] ++;
            }
            else if (v >= 130 && v < 157) {
                categories[i] = 4;
                catSums[3] ++;
            }
            else if (v >= 157) {
                categories[i] = 5;
                catSums[4] ++;
            }
            else {
                System.out.println("Invalid windspeed");
                System.exit(0);
            }

            totalCatSum += categories[i];
            totalPressureSum += pressures[i];
            totalWindSpeedSum += windSpeeds[i];

            if (categories[i] < catMin) catMin = categories[i];
            if (pressures[i] < pressureMin) pressureMin = pressures[i];
            if (windSpeeds[i] < windSpeedMin) windSpeedMin = windSpeeds[i];

            if (categories[i] > catMax) catMax = categories[i];
            if (pressures[i] > pressureMax) pressureMax = pressures[i];
            if (windSpeeds[i] > windSpeedMax) windSpeedMax = windSpeeds[i];
        }
        
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
        System.out.printf("\tAverage: %11.1f %22.1f %12.2f\n", 
            totalCatSum / numValues,
            totalPressureSum / numValues,
            totalWindSpeedSum / numValues
        );
        System.out.printf("\tMinimum: %11.1s %22.1f %12.2f\n", 
            catMin,
            pressureMin,
            windSpeedMin
        );

        System.out.printf("\tMaximum: %11.1s %22.1f %12.2f\n", 
            catMax,
            pressureMax,
            windSpeedMax
        );

        System.out.println();

        System.out.println("Summary of Categories:");
        for (int i = 0; i < 5; i ++) {
            System.out.printf("Cat %s: %s\n", i + 1, catSums[i]);
        }

     }
}