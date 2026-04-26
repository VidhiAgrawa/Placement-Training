package Day2.WithoutLoop;

import java.util.Scanner;

public class FindASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // with the help of character value we can find ASCII value
        System.out.println("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("The ASCII value of " + c + " is " + (int) c);
        
        // with the help of integer value we can find ASCII value
        int ch = 70;
        System.out.println("Character of ASCII value " + ch + " is : " + (char)ch);
        sc.close();
    }
}
