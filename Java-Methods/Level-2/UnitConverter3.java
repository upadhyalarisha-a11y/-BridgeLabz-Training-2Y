import java.util.Scanner;

public class UnitConverter3 {

    // Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    // Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Celsius to Kelvin
    public static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    // Kelvin to Celsius
    public static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + " °C = " + celsiusToFahrenheit(celsius) + " °F");
        System.out.println(celsius + " °C = " + celsiusToKelvin(celsius) + " K");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + " °F = " + fahrenheitToCelsius(fahrenheit) + " °C");

        System.out.print("Enter temperature in Kelvin: ");
        double kelvin = sc.nextDouble();
        System.out.println(kelvin + " K = " + kelvinToCelsius(kelvin) + " °C");

        sc.close();
    }
}
