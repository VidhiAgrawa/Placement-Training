package Day2;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        String num = sc.nextLine();

        int count = 0;
        for (int i = 0; i < num.length(); i++) {
            count++;
        }
        System.out.println("Number of digits : " + count);
        
        sc.close();
    }
}
