package unidad1;

import java.util.Arrays;

public class PruebaClone {
    public static void main(String[] args) {
        int arr[]=new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=i+1;
        }
        /*esto es paso por referencia
        int[] arrCopia=arr;*/
        //clone copia en un nuevo objeto
        int[] arrCopia=arr.clone();

        arrCopia[0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrCopia));

    }
}
