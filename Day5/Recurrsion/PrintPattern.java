package Day5.Recurrsion;

public class PrintPattern {
    public static int PatternPrint(int n, boolean tag ){
        System.out.println(n);
        if( tag ){
            if(n > 0) return PatternPrint(n-5, true);
            else return PatternPrint(n+5, false);
        }
        else{
            if( n < 16 ) return PatternPrint(n+5, false);
            else return n;
        }
    }
    public static void main(String[] args) {
        PatternPrint(16, true);
    }
}
