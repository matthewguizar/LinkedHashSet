import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        //linked hash set maintains insertion order
        //doubly linkeed list connects items (how it keeps order)
        //more memory than hash sets(if order doesn't matter use hash set)
        Set<String> set = new LinkedHashSet<>();

        set.add("matte");
        set.add("name");
        set.add("azul");
        set.add("matthew");
        set.add("another");

        for(String s : set){
            System.out.println(s);
        }


    }
}