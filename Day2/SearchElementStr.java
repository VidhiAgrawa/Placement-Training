package Day2;

import java.util.Scanner;

public class SearchElementStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        System.out.println("Enter a String to search : ");
        char search = sc.next().charAt(0);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == search) {
                System.out.println("Found at index: " + i);
                break;
            }
        }
        System.out.println("Not found");
        
        sc.close();
    }
}
