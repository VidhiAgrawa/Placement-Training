package Day2;

import java.util.Scanner;

public class NumberDivisibility {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        if (num % 11 == 0 && num % 5 == 0) {
            System.out.println("The number " + num + " is divisible by 11 and 5");
        }
        else{
            System.out.println("The number " + num + " is not divisible by 11 and 5");
        }
        sc.close();
    }
}
