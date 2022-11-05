/**
 * Annual Weather client class
 * 
 * @author Eli R DeWitt
 * @version 1/5/2022
 * @purpose This program utilizes arrays to analyze data.
 * 
 * PMR
 * This was mostly an old concept for me, but it took me a while to wrap my head around the printf method.
 * I also used ternary operators where I could and a different structure of a for loop.
 */
import java.util.Scanner;
public class CityWeatherTesterV2
{
    // method to print results (formatting output will be done in 6.02)
    public static void display(String _city, String _state, String _tempLabel, String _precipLabel, String[] _month, double[] _temperature, double[] _precipitation, double _avgTemp, double _totalPrecip) {
        //Output: display table of weather data including average and total
        System.out.println();
        // System.out.println("           Weather Data");
        // System.out.println("      Location: " + _city +", " + _state);
        // System.out.println("Month     Temperature (" +  _tempLabel + ")     Precipitation (" + _precipLabel + ")");
        // System.out.println();

        System.out.printf("%35s\n", "Climate Data");
        System.out.printf("%45s\n", "Location: Daytona Beach, Florida");
        System.out.println();
        System.out.printf("%8s%18s%24s\n", "Month", "Temperature " + _tempLabel, "Precipitation " + _precipLabel); 

        System.out.println("***************************************************");
        for(int i = 0; i < _temperature.length; i ++)
        {
            System.out.printf("%s %18.1f %18.1f \n", _month[i] + ".", _temperature[i], _precipitation[i]);
            // System.out.printf("%8s%13s%20s\n", _month[i], _temperature[i], _precipitation[i]);
        }
        System.out.println("***************************************************");
        System.out.printf("%18s %1.1f %13s %1.1f", "Average:",  _avgTemp , "Annual:",  _totalPrecip); 
    }
   
    
    public static void main (String [ ] args)
    {
        //Declare and initialize variables
        String city = "Orlando";  //choose a city from the table provided
        String state = "FL";  //choose a city from the table provided
  
        String [] month = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };     //complete initialization of months array
        double [] temperature = {60.9, 62.6, 67.4, 71.5, 77.1, 81.2, 82.4, 82.5, 81.1, 75.3, 68.8, 63.0};     //complete initialization of temperatures array
        double [] precipitation = {2.4, 2.4, 3.5, 2.4, 3.7, 7.4, 7.2, 6.3, 5.8, 2.7, 2.3, 2.3};     //complete initialization of precipitation array
    
        String tempLabel = "F";    //initialize to F
        String precipLabel = "in."; //initialize to in
       

        //input to decide F/C and in/cm - to be completed in 6.02
        Scanner input = new Scanner(System.in);   //will be used in 6.02

        System.out.print("Choose the temperature scale (F/C) ");
        tempLabel = input.nextLine().toUpperCase().equals("C") ? "C" : "F";

        System.out.print("Choose the precipitation scale (i = inches, c = centimeters) ");
        precipLabel = input.nextLine().toUpperCase().equals("C") ? "cm." : "in.";

        input.close();

	    //instantiate AnnualWeatherV1 object
        CityWeatherV2 data = new CityWeatherV2(month, temperature, precipitation);

        //conditions & method call to convert temp, if needed - to be completed in 6.02
        if (tempLabel.equals("C")) data.setTemperature(data.celsius(temperature));

        //conditions & method call to convert prec, if needed - to be completed in 6.02
        if (precipLabel.equals("cm.")) data.setPrecipitation(data.centimeters(precipitation));

        //method call to calculate the average temperature
        double avgTemp = data.averageTemp();

        //method call to calculate the total precipitation
        double totalPrecip = data.totalPrecipitation();

        //method call to print results (hint: Need parameters for month, temperature, precipitation arrays, data labels and the average temperature, total precipitation variables)
        display(city, state, tempLabel, precipLabel, data.getMonths(), data.getTemperature(), data.getPrecipitation(), avgTemp, totalPrecip);
    }//end main
}//end class

