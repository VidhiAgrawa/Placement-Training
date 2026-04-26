package Day2.WithoutLoop;

import java.util.Scanner;

public class EquationEvaluate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value for a : ");
        int a = sc.nextInt();
        System.out.println("Enter a value for b : ");
        int b = sc.nextInt();
        System.out.println("Enter a value for c : ");
        int c = sc.nextInt();

        NormalEquation();
        QuadraticEquation(a, b, c);
        sc.close();
    }

    public static void NormalEquation(){
        int equation = 10 + 5 * 2;
        System.out.println("Normal Equation Solution : " + equation);
    }

    public static void QuadraticEquation( int a, int b, int c ){
        int equation = a*a + b*b + 2*a*b - c/2;
        System.out.println("Quadratic Equation Solution : " + equation);
    }
}
