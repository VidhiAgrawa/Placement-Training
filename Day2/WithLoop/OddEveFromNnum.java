package Day2.WithLoop;

import java.util.Scanner;

public class OddEveFromNnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        int num = sc.nextInt();
        
        for( int i = 1; i <= num; i++ ){
            if( i % 2 == 0 ){
                System.out.println("Even " + i);
            }
            else{
                System.out.println("Odd " + i);
            }
        }

        sc.close();
    }
}
