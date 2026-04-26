package Day1.conversion;

import java.util.*;

public class BinaryToOctal {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.println("Enter the Binary Num : ");
        String Binary = sc.nextLine();

        int decimal = Integer.parseInt(Binary, 2);
        System.out.println(decimal);

        String octalString = Integer.toOctalString(decimal);
        System.out.println("Octal : " + octalString);
        sc.close();
    }
}
