package conversion;

import java.util.Scanner;

public class DecToBi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the decimal number : ");
        int n = sc.nextInt();
        
        String binary = Integer.toBinaryString(n);
        System.out.println(binary);
    }
}
