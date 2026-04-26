package Day2.WithLoop;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String input = sc.nextLine();
        
        String Reverse = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            Reverse += input.charAt(i);    
        }

        System.out.println("Reverse String : " + Reverse);
        sc.close();
    }
}
