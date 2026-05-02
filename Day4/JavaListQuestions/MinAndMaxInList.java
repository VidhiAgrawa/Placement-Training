package Day4.JavaListQuestions;
import java.util.ArrayList;
public class MinAndMaxInList {
    public static void main(String[] args) {
        ArrayList<Integer> set = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            set.add(i);
            if( set.get(i+1) < set.get(i) ){
                int min = set.get(i+1);
                int max = set.get(i);
                System.out.println("min"+min);
                System.out.println("max"+max);
                System.out.println(set);
            }
        }
    }
}
