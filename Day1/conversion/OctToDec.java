package Day1.conversion;

import java.util.Scanner;

public class OctToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the Octal Num : ");
        String Octal = sc.nextLine();

        int decimal = Integer.parseInt( Octal, 8 );
        System.out.println("Decimal : " + decimal);
    }
}
