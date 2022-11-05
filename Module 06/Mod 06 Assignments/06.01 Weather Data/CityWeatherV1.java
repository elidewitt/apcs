/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */

public class CityWeatherV1 {
    // private instance variables - three arrays
    private String[] months = new String[12];
    private double[] temperature = new double[12];
    private double[] precipitation = new double[12];
    // constructor with parameters
    CityWeatherV1(String[] _months, double[] _temperature, double[] _precipitation) {
        months = _months;
        temperature = _temperature;
        precipitation = _precipitation;
    }
    // setters and getters for each private instance variable
    public void setMonths(String[] _months) {
        months = _months;
    }
    public void setTemperature(double[] _temperature) {
        temperature = _temperature;
    }
    public void setPrecipitation(double[] _precipitation) {
        precipitation = _precipitation;
    }
    // method to calculate the average of temperature
    public double averageTemp() {
        double sum = 0.0;
        for (double i : temperature) {
            sum += i;
        }
        return sum/temperature.length;
    }
    // method to calculate total precipitation array
    public double totalPrecipitation() {
        double sum = 0.0;
        for (double i : precipitation) {
            sum += i;
        }
        return sum;
    }
 
        
        

    // method to calculate temperature in Celsius (current index of temperature array passed as a parameter) - to be completed in 6.02
    
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02


}
