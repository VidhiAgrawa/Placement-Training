package conversion;

public class BoolToStr {
    public static void main(String[] args) {
        boolean b = true;

        String s = Boolean.toString(b);
        System.out.println("Using Boolean.toString() : " + s);
    }
}
