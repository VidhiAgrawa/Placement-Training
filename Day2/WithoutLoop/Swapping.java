package Day2.WithoutLoop;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        
        System.out.println("Before swapping: ");
        System.out.println("a = " + a + ", b = " + b);

        SwapWithoutThirdVariable(a, b);
        SwapWithThirdVariable(a, b);
        
        sc.close();
    }
    public static void SwapWithoutThirdVariable(int a, int b) {

        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping without using third variable: ");
        System.out.println("a = " + a + ", b = " + b);
    }
    public static void SwapWithThirdVariable( int a, int b ) {
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After swapping using third variable: ");
        System.out.println("a = " + a + ", b = " + b);
    }
    
}
