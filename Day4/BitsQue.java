package Day4;

public class BitsQue {
    public static void main(String[] args) {
        int n = 11;
        // String number = Integer.toBinaryString(n);
        int count = Integer.bitCount(n);
        System.out.println(count);
        // int count = 0;
        // for (int i = 0; i < number.length(); i++) {
        //     if (number.charAt(i) == '1') {
        //         count++;
        //     }
        // }
        // System.out.println(count);
    }
}
