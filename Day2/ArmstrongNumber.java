package Day2;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;

        int sum = 0;
        int len = String.valueOf(num).length();
        int value = num;
        while( value > 0 ){
            int digit = value % 10;
            System.out.println("digit: " + digit);
            sum += Math.pow(digit, len);
            System.out.println("sum: " + sum);
            
            value = value/10;
            System.out.println("value: " + value);

        }
        System.out.println("value : " + sum);

        if( num == sum ){
            System.out.println(num + " is an Armstrong Number");
        }else{
            System.out.println(num + " is not an Armstrong Number");

        }
    }
}
