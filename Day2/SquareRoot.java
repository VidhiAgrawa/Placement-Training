package Day2;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the value of a : ");
        int num = sc.nextInt();
        
        double result = Math.sqrt(num);
        System.out.println("Square Root : " + result);

        sc.close();
    }
}
