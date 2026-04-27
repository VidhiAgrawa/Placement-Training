package Day2;

public class StrongNumber {
    public static void main(String[] args) {
        int num = 145;
        int originalNum = num; // Save the value here!
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }

        System.out.println("Sum of Factorials: " + sum);

        // Compare sum with the saved original value
        if (sum == originalNum) { 
            System.out.println("Strong Number");
        } else {
            System.out.println("Not a Strong Number");
        }
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}