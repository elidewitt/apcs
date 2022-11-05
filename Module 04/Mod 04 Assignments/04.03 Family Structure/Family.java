/**
 * @author Eli R DeWitt
 * @version 11/10/21
 * @description This utilizes loops to evaluate data from a txt file
 */

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String[] args) throws IOException
    {
        String token;
        File data = new File("familyMembers.txt");
        Scanner inFile = new Scanner(data);

        int boys = 0;
        int girls = 0;
        int both = 0;
        int error = 0;
        int families = 0;

        while ( inFile.hasNext() )
        {
            token = inFile.next();
            token.toUpperCase();

            if (token.equals("BB")) boys ++;
            else if (token.equals("GG")) girls ++;
            else if (token.equals("BG") || token.equals("GB")) both ++;
            else error ++;

            families ++;
        }
        inFile.close();

        System.out.println("Composition statistics for families with two children.");
        System.out.println("\nTotal number of families: " + families);
        System.out.println("\n          2 boys: " + boys + " represents " + round(100 * boys/(float)families, 2) + "%");
        System.out.println("         2 girls: " + girls + " represents " + round(100 * girls/(float)families, 2) + "%");
        System.out.println("1 boy and 1 girl: " + both + " represents " + round(100 * both/(float)families, 2) + "%");
        System.out.println("          Errors: " + error + " represents " + round(100 * error/(float)families, 2) + "%");
    }

    public static double round(double num, int places)
    {
        return Math.round(num * Math.pow(10, places)) / Math.pow(10, places);
    }
}


