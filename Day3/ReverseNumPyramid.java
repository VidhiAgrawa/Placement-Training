package Day3;

public class ReverseNumPyramid {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            System.out.println();
            for (int j = i; j >= 1 ; j--) {
                System.out.print(j + "");
            }
        }
    }
}
