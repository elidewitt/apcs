/**
 * Annual Weather object class
 * 
 * @author APCS Team
 * @version Today
 */


public class CityWeatherV2 {
    // private instance variables - three arrays
    private String[] months = new String[12];
    private double[] temperature = new double[12];
    private double[] precipitation = new double[12];
    // constructor with parameters
    CityWeatherV2(String[] _months, double[] _temperature, double[] _precipitation) {
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

    public String[] getMonths() {
        return months;
    }
    public double[] getTemperature() {
        return temperature;
    }
    public double[] getPrecipitation() {
        return precipitation;
    }
    // method to calculate the average of temperature
    public double averageTemp() {
        double sum = 0.0;
        for (double i : temperature) {
            sum += i;
        }
        return Math.round((sum/temperature.length)*10)/10;
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
    public double[] celsius(double[] _temperature) {
        double[] result = new double[_temperature.length];
        for (int i = 0; i < _temperature.length; i++) {
            result[i] = Math.round(((_temperature[i] - 32) * 5.0/9)*10.0)/10.0;
        }
        return result;
    }
    
    // method to calculate precipitation in centimeters (current index of precipitation array passed as a parameter) - to be completed in 6.02
    public double[] centimeters(double[] _precipitation) {
        double[] result = new double[_precipitation.length];
        for (int i = 0; i < _precipitation.length; i ++) {
            result[i] = Math.round((_precipitation[i] * 2.54)*10.0)/10.0;
            System.out.println(result[i]);
        }
        return result;
    }

}
