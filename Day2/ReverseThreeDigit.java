package Day2;

import java.util.Scanner;

public class ReverseThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //without loop
        String reverse = new StringBuilder(String.valueOf(num)).reverse().toString();
        System.out.println("Reversed number: " + reverse);

        //with loop
        int reverse1 = 0;
        while( num > 0 ){
            int digit = num % 10;
            reverse1 = reverse1 * 10 + digit;
            num = num/10;
        }
        System.out.println("Reversed number with loop: " + reverse1);
        sc.close();
    }
}
