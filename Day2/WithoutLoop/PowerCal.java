package Day2.WithoutLoop;

import java.util.*;

public class PowerCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Enter a power: ");
        int power = sc.nextInt();

        //without loop
        double result = Math.pow(num, power);
        System.out.println("Result: " + result);

        //with loop
        double ans = 1;
        for( int i = 0; i < power; i++  ){
            ans *= num;
        }
        System.out.println("Result with loop: " + ans);

        sc.close();
    }
}
