package conversion;

import java.util.Scanner;

public class BiToDec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number : ");
        String binary = sc.nextLine();
        
        int decimal = Integer.parseInt(binary, 2);
        System.out.println(decimal);
    }
}
