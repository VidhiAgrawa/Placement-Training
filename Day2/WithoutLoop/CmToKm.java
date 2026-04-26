package Day2.WithoutLoop;

import java.util.Scanner;

public class CmToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the Centimeter: ");
        double cmInput = sc.nextDouble();
        cmToKm(cmInput);

        System.out.print("Enter the Kilometer: ");
        double kmInput = sc.nextDouble();
        kmToCm(kmInput);
        
        sc.close(); 
    }
    

    public static void cmToKm(double cm) {
        double km = cm / 100000.0;
        System.out.println(cm + " CM is equal to: " + km + " KM");
    }

    public static void kmToCm(double km) {
        double cm = km * 100000.0;
        System.out.println(km + " KM is equal to: " + cm + " CM");
    }
}