package Day5.BackTracking;

public class PrintPattern {
    public static int Printing( int n ){
        if( n == 0 ) System.out.print(n);
        if( n > 0 ){
            System.out.print(n + ", ");
            Printing(n-5);
            System.out.print(", " + n);
        }
        return n;
    }
    public static void main(String[] args) {
        Printing(10);
    }
}
