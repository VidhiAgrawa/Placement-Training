package Day1;
import java.util.Scanner;

public class InteresCalculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principal amount : ");
        int principal = sc.nextInt();

        System.out.println("Enter the rate of interest : ");
        int annualRate = sc.nextInt();

        System.out.println("Enter the time period : ");
        int time = sc.nextInt();

        System.out.println("Enter the number of times interest is compounded : ");
        int n = sc.nextInt();

        simpleInterest(principal, annualRate, time);
        compoundInterest(principal, annualRate, time, n);

        sc.close();
    }
    public static void simpleInterest(int principal, int annualRate, int time){
        int simpleInterest = (principal * annualRate * time) / 100;
        System.out.println("The simple interest is : " + simpleInterest);

    }
    public static void compoundInterest(int principal, int annualRate, int time, int n){
        int compoundInterest = principal * ( 1 + annualRate / n ) ^ n * time;
        System.out.println("The compound interest is : " + compoundInterest);

    }
}
