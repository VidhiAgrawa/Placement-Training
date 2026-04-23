import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number : ");
        int num2 = sc.nextInt();
    
        System.out.println("Sum of " + num1 + " and " + num2 + " is : " + (num1 + num2));
        System.out.println("Difference of " + num1 + " and " + num2 + " is : " + (num1 - num2));
        System.out.println("Product of " + num1 + " and " + num2 + " is : " + (num1 * num2));
        System.out.println("Division of " + num1 + " and " + num2 + " is : " + (num1 / num2));
        System.out.println("Modulo of " + num1 + " and " + num2 + " is : " + (num1 % num2));
        
    }
}
