package unidad1;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayEInd {
    public static void main(String[] args) {
        double arr[]=new double[10];
        for (int i=0;i<arr.length;i++) {
            arr[i]=Math.random();
        }

        //utilizando indices
        for(int i=0;i<arr.length;i++){
            System.out.println("valor:"+arr[i]+" indice:"+i);
        }

        //foreach vamos a mostrar
        for (double el:arr) {
            System.out.println(el);
        }

    }
}
