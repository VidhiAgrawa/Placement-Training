package Day4;

public class StringContainsDigits {
    public static void main(String[] args) {
        try {
            String str = "1203";
            Integer.valueOf(str);
            System.out.println("String contains only digits");
        } catch (NumberFormatException e) {
            System.out.println("String does not contain only digits");
        }
    }
}
