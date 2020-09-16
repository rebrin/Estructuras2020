package unidad1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PruebaCollections {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            al.add(i);
        }
        al.add(3);
        al.add(3);
        System.out.println(al.toString());
        al.remove(5);
        System.out.println(al.contains(3));
        System.out.println(al.size());
        System.out.println(al.isEmpty());
        System.out.println(al.toString());

        ArrayList<Integer> arr2=new ArrayList<>();
        arr2.add(13);
        arr2.add(12);
        arr2.addAll(al);
        /*ArrayList<Integer> elim=new ArrayList<>();
        elim.add(13);
        elim.add(12);
        arr2.removeAll(elim);
        */

        System.out.println(arr2.toString());
        //pasar los elementos
        Set<Integer> s1=new HashSet<>(arr2);
        System.out.println(s1.toString());

    }
}
