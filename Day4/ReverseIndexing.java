package Day4;

public class ReverseIndexing {
    public static void main(String[] args) {
        String str = "123321";
        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            if( str.charAt(i) != str.charAt(str.length()-1-i) ){
                isPalindrome = false;
            }
        }
        
        if (isPalindrome) {
            System.out.println("palindrome.");
        } else {
            System.out.println("not a palindrome.");
        }
    }
}
