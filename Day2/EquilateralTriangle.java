package Day2;

import java.util.Scanner;

public class EquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the side of the equilateral triangle : ");
        int side = sc.nextInt();
        
        float area = ( float ) ( ( Math.sqrt(3) / 4 ) * side * side );
        System.out.println("Area of equilateral triangle : " + area);

        sc.close();
    }
}
