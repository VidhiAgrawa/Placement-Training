package Day5.Overloading;
import java.util.HashSet;
import java.util.ArrayList;
//when function are same but datatypes are different and the no. of parameters are different and return type are different
public class Example {
    // public static int sum(int a, int b){
    //     return a+b;
    // }
    // public static double sum(double a, double b){
    //     return a+b;
    // }

    public static void print(String str){
        System.out.println(str);
    }
    public HashSet<String> hashSet(String str){
        HashSet<String> set = new HashSet<>();
        set.add(str);
        System.out.println(set);
        return set;
    }
    public ArrayList<String> arrayList(String str){
        ArrayList<String> set = new ArrayList<>();
        set.add(str);
        System.out.println(set);
        return set;
    }
    public static void main(String[] args) {
        // System.out.println(sum(10, 20));
        // System.out.println(sum(255, 600));
        Example ex = new Example();
        ex.hashSet("Vikas");
        ex.arrayList("Vikas");
        print("hello");
        // sum(255, 600);
    }
    

}
//String, List, HashSet