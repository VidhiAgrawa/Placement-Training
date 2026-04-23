import java.util.Scanner;

public class AdultVerify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age : ");
        int age = sc.nextInt();

        String result = age >= 18 ? "Adult" : "Minor";
        System.out.println(result);
    }

    
}
