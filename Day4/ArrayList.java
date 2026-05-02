package Day4;

import java.util.*;

public class ArrayList {
    public static void main(String[] args) {
        List<String> list = new java.util.ArrayList<>();
        
        list.add(0, "Vidhi");
        list.add("anshul");
        list.add("anjali");
        list.add("mukku");
        list.add("pari");
        list.add("vidhu");

        System.out.println(list);
        System.out.println(list.get(1));

        list.remove(1);
        list.remove("mukku");
        System.out.println();

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
        
        for (String string : list) {
            System.out.println(string);
        }
        System.out.println();

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        };
    }
}
//Mutable
//Can make multiple datatypes