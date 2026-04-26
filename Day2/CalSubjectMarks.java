package Day2;

import java.util.Scanner;

public class CalSubjectMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of 5 subjects : ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int s4 = sc.nextInt();
        int s5 = sc.nextInt();
        
        int actualTotal = 500;

        int total = s1 + s2 + s3 + s4 + s5;
        float avg = total / 5.0f;
        float percentage = ( (float) total / actualTotal ) * 100;

        System.out.println("Total marks : " + total);
        System.out.println("Average marks : " + avg);
        System.out.println("Percentage : " + percentage);
        
        sc.close();
    }
}
