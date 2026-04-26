package Day2.WithoutLoop;

import java.util.Scanner;

public class SumOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        
        int input = num;
        //with loop
        int sum = 0;
        while(input > 0){
            sum += input % 10;
            input /= 10;
        }
        System.out.println("Sum of digits is: " + sum);

        // without loop
        int add = String.valueOf(num)
                .chars()                     
                .map(Character::getNumericValue)
                .sum();    

        System.out.println("Sum of digits without loop is: " + add);
        sc.close();
    }
}
