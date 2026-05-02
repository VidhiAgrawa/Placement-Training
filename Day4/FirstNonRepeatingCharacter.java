package Day4;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        Map<Character, Integer> map = new HashMap<>();
        String str = "abcabcsabc";

        for( int i = 0 ; i < str.length() ; i++ ){
            char c = str.charAt(i);
            map.put(c, map.getOrDefault(c , 0) + 1);
        }

        for( int i = 0 ; i < str.length() ; i++ ){
            if(map.get(str.charAt(i)) == 1) {
                System.out.println(str.charAt(i)); 
                break;
            }
        }
        
    }
}
