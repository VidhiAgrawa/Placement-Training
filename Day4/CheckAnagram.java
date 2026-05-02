package Day4;

import java.util.Arrays;

public class CheckAnagram {
    public static boolean checkAnagram(String str1, String str2) {
        
        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();
        
        Arrays.sort(str1Array);
        Arrays.sort(str2Array);
        System.out.println(str1Array);
        System.out.println(str2Array);

        return Arrays.equals(str1Array, str2Array);
        
    }
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        if(checkAnagram(str1, str2)==true){
            System.out.println("String1 and String2 is Equal");
        }else{
            System.out.println("String1 and String2 is not Equal");

        }

        
    }
}
