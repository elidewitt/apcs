/**
 * Randomly generate passwords and writes and reads a text file containing said passwords.
 * @author Eli DeWitt
 * @version 11/13/21
 */
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Scanner;

public class SecretPasscode
{
    public static void main(String [] args) throws IOException
    {
        Scanner userInput = new Scanner(System.in);
        PrintWriter outFile = new PrintWriter(new File("passwords.txt"));

        System.out.println("**********************************************************");
        System.out.println("Welcome to a simple password generator. \nThe password will include lowercase, uppercase, & numbers.");
	    
        // Password length validation
        int pwLength = 0;
        for (int i = 0; pwLength < 6; i++)
        {
            if (i != 0) System.out.println("  Password length too short. Please try again");
            System.out.print("Enter a password length (6 or more): ");
            pwLength = userInput.nextInt();
        }
        System.out.println("");

        // Generate passwords until stopped by user
        String userChoice = "";
        for (int i = 0; !userChoice.equals("N"); i++)
        {
            // Find password with correct length that is also valid
            String password = "";
            for (int j = 0; !SecretPasscode.isValid(password); j++) password = SecretPasscode.generatePassword(pwLength);
            outFile.println(password);
            System.out.println("A password has been written to the text file");
            System.out.print("Would you like to generate another password? (Y/N) ");
            userChoice = userInput.next().toUpperCase();
        }
        outFile.close();

        System.out.println("Thank you for using the Passcode Generator.\n");
        System.out.println("Here are your randomly generated codes:");

        Scanner inFile = new Scanner(new File("passwords.txt"));
        int index = 1;
        while (inFile.hasNext())
        {
            System.out.println(index + ". " + inFile.next());
            index ++;
        }
        userInput.close();
  }

  public static String generatePassword(int len)
  {
    String result = "";
    for (int i = 0; i < len; i++) 
    {   
        int temp = (int)(Math.random()*62 + 48);
        int decimal = temp;
        if (decimal > 57) decimal += 7;
        if (decimal > 90) decimal += 6;

        result += (char)decimal;
    }
    return result;
  }

  public static boolean isValid(String password)
  {
    boolean hasNum = false;
    boolean hasUpper = false;
    boolean hasLower = false;
    for (int i = 0; i < password.length(); i++)
    {
        if ((int)(password.charAt(i)) - 48 < 10) hasNum = true;
        else if ((int)(password.charAt(i)) - 65 < 26) hasUpper = true;
        else if ((int)(password.charAt(i)) - 97 < 26) hasLower = true;
    }
    return (hasNum && hasUpper && hasLower);
  }
}