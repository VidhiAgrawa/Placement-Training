package Day2;

import java.util.Scanner;

public class TempConvertor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        double celsius = sc.nextDouble();

        System.out.println("Enter the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        CelToFahrenheit(celsius);
        FahrenheitToCelcious(fahrenheit);
        FehToKelvin(fahrenheit);
        
        sc.close();
    }

    public static void CelToFahrenheit(double celsius){
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);
    }

    public static void FahrenheitToCelcious(double fahrenheit){
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Temperature in Celsius: " + celsius);
    }

    public static void FehToKelvin(double fahrenheit){
        double kelvin = (fahrenheit - 32) * 5/9 + 273.15;
        System.out.println("Temperature in Kelvin: " + kelvin);
    }
}
