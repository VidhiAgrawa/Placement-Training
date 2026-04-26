package Day1.conversion;

import java.util.Scanner;

public class StrToDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        double d = Double.parseDouble(s);
        System.out.println(d);

        sc.close();
    }
}
