package Day2;

import java.util.Scanner;

public class FibonnaciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print Series till there : ");
        int num = sc.nextInt();

        int a = 0;
        int b = 1;

        for (int i = 0; i < num; i++) {
            System.out.println(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }

        sc.close();
    }
}
