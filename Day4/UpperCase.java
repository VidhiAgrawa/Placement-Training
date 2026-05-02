package Day4;

public class UpperCase {
     public static void main(String[] args) {
        String str = "abcdvhg";
        String newstr = "";
        
        for( int i = 0 ; i < str.length() ; i++ ){
            newstr = newstr.concat(String.valueOf((char)((int) str.charAt(i) - 32)));
        }
        
        System.out.println(newstr);
    }
}
