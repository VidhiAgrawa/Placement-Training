package Day4;

public class RemoveSpacesInStr {
    public static void main(String[] args) {
        String str = "Vidhi Agrawal";
        String name = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                name += str.charAt(i);
            }
        }
        
        System.out.println(name);
    }
}
