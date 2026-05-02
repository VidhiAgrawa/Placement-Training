package Day2;

import java.util.Scanner;

public class LCMandGCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.println("Type 'gcd' for GCD or 'lcm' for LCM: ");
        String choice = sc.next().toLowerCase();

        if (choice.equals("gcd")) {
            System.out.println("The GCD is: " + GCD(num1, num2));
        } else if (choice.equals("lcm")) {
            System.out.println("The LCM is: " + LCM(num1, num2));
        } else {
            System.out.println("Invalid choice! Please type 'gcd' or 'lcm'.");
        }

        sc.close();
    }

    public static int GCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int LCM(int a, int b) {
        return (a / GCD(a, b)) * b;
    }
}