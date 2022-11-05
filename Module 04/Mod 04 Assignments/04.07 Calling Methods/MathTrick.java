/**
 * @author Eli R DeWitt
 * @version 11/15/21
 * This program uses a math trick to reveal a message.
 */

public class MathTrick 
{
	public static int getRandomNum() 
	{	int num = 0;
		int firstDigit = 0;
		int lastDigit = 0;

        while (Math.abs(firstDigit - lastDigit) < 2)
        {
            num = (int)(Math.random()*900) + 100;
            firstDigit = num % 10;
            lastDigit = num / 100;
        }

		// complete the method		

		return num;
	}

	public static int reverseDigits (int num) {
	
		// complete the method
        int copy = num;
        int result = 0;
        for (int i = 0; i <= Math.log10(num); i++)
        {
            result = result*10 + copy % 10;
            copy /= 10;
        }
        return result;
	}
	public static String replaceLtr(String str)
	{
		// complete the method
        String result = "";
        String[] dictionary = {"Y", "M", "P", "L", "R", "O", "F", "A", "I", "B"};
        for (int i = 0; i < str.length(); i++)
        {
            result += dictionary[Integer.parseInt(String.valueOf(str.charAt(i)))];
        }	
        return result;
	}
	
	public static String reverseString(String str)
    {
		// complete the method
        String result = "";
        for (int i = 0; i < str.length(); i++)
        {
            int j = -i + str.length() - 1;
            result += str.substring(j, j + 1);
        }
        return result;
	}

	public static void main(String[] args) 
	{
//		1.	Generate a random 3-digit number so that the first and third digits differ by more than one.
        int num1 = getRandomNum();
        System.out.println("1. The starting number: " + num1);
//		2.	Now reverse the digits to form a second number.
        int num2 = reverseDigits(num1);
        System.out.println("20 The reversed number: " + num2);
//		3.	Subtract the smaller number from the larger one.
        int num3 = Math.abs(num1 - num2);
        System.out.println("The difference is: " + num3);
//		4.	Now reverse the digits in the answer you got in step 3 and add it to that number.
        int num4 = reverseDigits(num3) + num3;
        System.out.println("The reversed number added to differnce: " + num4);
//		5.	Multiply by one million.
        int num5 = num4 * 1000000;
        System.out.println("Number times a million: " + num5);
//		6.	Subtract 733,361,573.
        int num6 = num5 - 733361573;
        System.out.println("Number subtracted and converted to String: " + num6);

//		7.	Convert the number to a string in order to replace the numbers with letters.
        String string7 = replaceLtr(Integer.toString(num6));
        System.out.println("Replaced String: " + string7);
//		8.	Now reverse the letters in the string to read your message backward.
        String string8 = reverseString(string7);
        System.out.println("Reversed string: " + string8);

	} // end main
} // end class