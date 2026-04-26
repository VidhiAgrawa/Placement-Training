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

        int pallindrome = num;
        
        int first = num / 100;          
        int last = num % 10;            
        
        if (first == last) {
            System.out.println(num + " is a palindrome.");
        } else {
            System.out.println(num + " is NOT a palindrome.");
        }

        sc.close();
    }
}
