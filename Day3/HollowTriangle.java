package Day3;

public class HollowTriangle {
    public static void main(String[] args) {
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= 5; j++) {
                if( i == 3 && j == 4 || i == 2 && j == 3 || i == 2 && j== 4 ){
                    System.out.print("  ");
                }else{

                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
