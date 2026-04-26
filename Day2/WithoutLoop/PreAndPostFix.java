package Day2.WithoutLoop;

public class PreAndPostFix {
    public static void main(String[] args) {
        int num = 5;

        System.out.println("Before Prefix Number : " + num);
        System.out.println("Prefix : " + (++num));
        System.out.println("After Prefix Number : " + num);

        System.out.println("Before Postfix Number : " + num);
        System.out.println("Postfix : " + (num++));
        System.out.println("After Postfix Number : " + num);
    }
}
