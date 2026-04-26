package Day1.conversion;

import java.util.Scanner;

public class DecToOct {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the Decimal Num : ");
        int Decimal = sc.nextInt();

        String octalString = Integer.toOctalString(Decimal);
        System.out.println("Octal : " + octalString);

        sc.close();
    }
}
