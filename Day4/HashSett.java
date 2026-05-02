package Day4;
import java.util.*;
public class HashSett {
    public static void main(String[] args) {
        // Set<Integer> set = new HashSet<>();

        // System.out.println(set.add(10));
        // System.out.println(set.add(20));
        // System.out.println(set.add(10));

        // System.out.println(set.contains(20));
        // set.remove(10);

        // System.out.println(set);

        // System.out.println("below is set methods");
        // setMethods();

        System.out.println("below is set types");
        TypesOfHash();
    }
    public static void setMethods() {
        Set<Integer> sett1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> sett2 = new HashSet<>(Arrays.asList(3, 4, 5));
        
        Set<Integer> union = new HashSet<>(sett1);
        union.addAll(sett2);
        System.out.println(union);

        Set<Integer> intersection = new HashSet<>(sett1);
        intersection.retainAll(sett2);
        System.out.println(intersection);
        
        Set<Integer> difference = new HashSet<>(sett1);
        difference.removeAll(sett2);
        System.out.println(difference);
    }
    public static void TypesOfHash() {
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(30);
        hashSet.add(10);
        hashSet.add(20);
        //Doubly linked list
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(30);
        linkedHashSet.add(10);
        linkedHashSet.add(20);

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(30);
        treeSet.add(10);
        treeSet.add(20);

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeSet);
        
    }
}
//does not allows duplicacy
//does not allows many things