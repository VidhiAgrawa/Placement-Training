package Day1;
import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        pallindrome();
    }

    public static void pallindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num = sc.nextInt();

        int originalNum = num;
        int reverse = 0;
        
        while (num != 0) {
            int remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num /= 10;
        }
        
        if (originalNum == reverse) {
            System.out.println(originalNum + " is a palindrome.");
        } else {
            System.out.println(originalNum + " is NOT a palindrome.");
        }

        sc.close();
    }
}
