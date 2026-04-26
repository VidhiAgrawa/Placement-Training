package Day2.WithoutLoop;

import java.util.Scanner;

public class MaxOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
       
        if( a > b ){
            System.out.println("a is greater than b");;
        }else if( b > a ){
            System.out.println("b is greater than a");
        }else{
            System.out.println("a and b are equal");
        }
        
        sc.close();
    }
}
