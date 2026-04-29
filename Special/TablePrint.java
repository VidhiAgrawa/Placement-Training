package Special;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        //For i from 1 to 10
        // For j from 1 to input
        // Syso j x i = product

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = sc.nextInt();
        
        for (int i = 1; i <= input; i += 2) {
            for (int j = 1; j <= 10; j++) {
                for (int k = i; k < i + 2; k++) {
                    if( k <= input ){
                        System.out.print(k + " x " + j + " = " + (k * j) + "\t\t");
                    }
                }
                System.out.println();
            }
            System.out.println();
        }

        sc.close();
    }
}
