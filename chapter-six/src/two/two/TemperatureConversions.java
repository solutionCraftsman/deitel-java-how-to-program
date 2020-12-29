package two.two;

public class TemperatureConversions {

    public double celsius(double temperatureInFahrenheit) {
        double celsius = 5.0 / 9.0 * (temperatureInFahrenheit - 32);
        return Double.parseDouble(String.format("%.2f", celsius));
    }

    public double fahrenheit(double temperatureInCelsius) {
        double fahrenheit = 9.0 / 5.0 * temperatureInCelsius + 32;
        return Double.parseDouble(String.format("%.2f", fahrenheit));
    }
}
