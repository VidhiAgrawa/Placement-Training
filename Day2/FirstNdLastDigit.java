package Day2;

import java.util.Scanner;

public class FirstNdLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number : ");
        int num = sc.nextInt();
        
        int a = getFirstDigit(num);
        int b = getLastDigit(num);

        System.out.println("First Digit : " + a);
        System.out.println("Last Digit : " + b);
        
        System.out.println("Sum of First and Last Digit : " + (a + b));
        
        a = a^b;
        b = a^b;
        a = a^b;
        System.out.println("Swap of First and Last Digit : " + a + " & " + b);
        
        
        System.out.println("After Swap Number is : " + swappedNum(num));

        sc.close();
    }
    
    public static int getLastDigit(int num){
        return Math.abs(num) % 10;
    }

    public static int getFirstDigit(int num){
        num = Math.abs(num); 
        while(num >= 10){
            num /= 10;
        }
        return num;
    }
    public static int swappedNum(int num) {
        int lastDigit = num % 10;
        int firstDigit = getFirstDigit(num);
        
        int digitsCount = (int) Math.log10(num);
        
        int powerOf10 = (int) Math.pow(10, digitsCount);
        int intermediate = num % powerOf10;
        
        intermediate = intermediate / 10;
        
        int swappedNum = (lastDigit * powerOf10) + (intermediate * 10) + firstDigit;
        return swappedNum;
    }
}
