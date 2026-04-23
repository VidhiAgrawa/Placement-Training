import java.util.Scanner;

public class WelcomeNote {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String userName = sc.nextLine();
        System.out.println("Hello " + userName);
        System.out.println("Welcome to Java Programming");
    }
}
