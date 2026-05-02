package Day5.Recurrsion;

public class PrintValue {
    public static int PrintVal(int n){
        if( n == 0 ) return 0;
        System.out.println(n);
        return n - PrintVal(n-1); 
    }
    public static void main(String[] args) {
        PrintVal(20);
    }
}
