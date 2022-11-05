/**
 * The Currency class converts an amount of money from a specific
 * country into the equivalent currency of another country given 
 * the current exchange rate.
 *
 * @author Eli R DeWitt
 * @version 09/21/21
 */

public class CurrencyV1
{
    public static void main(String [ ] args)
    {
        //Declare and initialize local variables
        double startingUsDollars = 6500.00;		// starting US Dollars
		double currentUsDollars = startingUsDollars;

		String[] locations = { "Mexico", "Japan", "France" };
		String[] currency = { "Pesos", "Yen", "Euros" };
		Double[] spent = { 7210.25, 99939.75, 624.95 };
		Double[] conversion = { 20.10, 109.56, 0.85 };

		// Message to user stating purpose
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("This program converts an amount of money");
        System.out.println("from a specific country into the equivalent");
        System.out.println("currency of another country given the current");
        System.out.println("exchange rate.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

		System.out.println("Starting US dollars:\t\t" + startingUsDollars);
		System.out.println();

		//Loop through data and print to console
		for (int i = 0; i < 3; i++)
		{
			//variable calculations
			double equivalent = spent[i] / conversion[i];
			currentUsDollars -= equivalent;

			//sysout
			System.out.println(locations[i] + ":");
			System.out.println("  " + currency[i] + " spent:\t\t\t" + spent[i]);
			System.out.println("  US dollars equivalent:\t" + equivalent);
			System.out.println("  Us dollars remaining:\t\t" + currentUsDollars);
			System.out.println();
		}
		System.out.println("==================================================");
		System.out.println("Remaining US dollars:\t\t" + currentUsDollars);
		System.out.println();
		System.out.println();

        // Complete the code below for Souvenir Purchases
 		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Souvenir Purchases");
		System.out.println(" (all values in US Dollars) ");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

		double[] cost = {12.0, 29.99};
		int[] budget = {100, 500};

		for (int i = 0; i < 2; i++)
		{
			//variable calculations
			int totalItems = (int)(budget[i] / cost[i]);
			double fundsRemaining = budget[i] % cost[i];

			//sysout
			System.out.println("Item " + (i + 1));
			System.out.println("  Cost per item: $" + cost[i]);
			System.out.println("  Budget: $" + budget[i]);
			System.out.println("  Total items purchased: " + totalItems);
			System.out.println("  Funds remaining: $" + fundsRemaining);
			System.out.println();
		}
    } // end of main method
} // end of class

