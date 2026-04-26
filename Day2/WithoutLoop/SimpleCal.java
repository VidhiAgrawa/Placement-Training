package Day2.WithoutLoop;

import java.util.Scanner;

public class SimpleCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter a operator: ");
        char op = sc.next().charAt(0);

        switch(op){
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Result: " + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operator");
        }

        sc.close();
    }
}
