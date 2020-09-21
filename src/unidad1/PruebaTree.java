package unidad1;

import java.util.TreeMap;
import java.util.TreeSet;

public class PruebaTree {
    public static void main(String[] args) {
        TreeSet<Integer> arbol=new TreeSet<>();
        arbol.add(5);
        arbol.add(6);
        arbol.add(3);
        arbol.add(7);
        arbol.add(1);
        arbol.add(1);

        System.out.println(arbol.toString());
        System.out.println();

        TreeMap<Integer,Double> precios=new TreeMap<>();
        precios.put(1,30.5);
        precios.put(2,40.5);
        precios.put(3,345.5);

        System.out.println(precios.get(1));
    }
}
