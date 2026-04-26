package Day1.conversion;

import java.util.Scanner;

public class DecToHexa {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the Decimal Num : ");
        int decimal = sc.nextInt();
        
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal : " + hex);
        sc.close();
    }
}
