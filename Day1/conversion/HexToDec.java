package Day1.conversion;

import java.util.Scanner;

public class HexToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the Hexadecimal Num : ");
        String hex = sc.nextLine().toUpperCase();

        int decimal = Integer.parseInt( hex, 16 );
        System.out.println("Decimal : " + decimal);
        sc.close();
    }
}
