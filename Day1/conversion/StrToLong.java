package Day1.conversion;

import java.util.Scanner;

public class StrToLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        long l = Long.parseLong(s);
        System.out.println(l);

        sc.close();
    }
}
