package Day3;

public class ZeroOnePyramid {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println();
            for (int j = 1; j <= i ; j++) {
                if( (i+j)%2==0 ){
                    System.out.print( 1 + "");
                }else{
                    System.out.print( 0 + "");
                    
                }
            }
            
        }
    }
}
