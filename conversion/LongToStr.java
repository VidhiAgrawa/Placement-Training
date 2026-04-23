package conversion;

import java.util.Scanner;

public class LongToStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the long : ");
        long l = sc.nextLong();
        String s = Long.toString(l);
        System.out.println(s);
    }
}
