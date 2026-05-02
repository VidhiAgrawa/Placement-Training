package Day4;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(" java");
        sb.append(" Programming");
        sb.insert(4, " core");
        sb.replace(0, 4, " Advanced");
        System.out.println(sb);
    }
}
