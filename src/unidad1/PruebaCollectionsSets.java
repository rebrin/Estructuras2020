package unidad1;

import java.util.HashSet;
import java.util.Set;

public class PruebaCollectionsSets {
    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        s1.add(1);
        s1.add(1);
        s1.add(1);
        s1.add(2);
        s1.add(3);
        s1.add(2);
        s1.add(4);

        System.out.println(s1.toString());

    }
}
