package unidad1;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Arrays;

public class desvArrays {
    public static void main(String[] args) {
        int arr[]=new int[10];
        Arrays.fill(arr,0);
        System.out.println(Arrays.toString(arr));
        //desventaja, no puedo asignar más memoria, lanza exception
        //arr[10]=13; falla por la referencia
        arr[9]=13;
        System.out.println(Arrays.toString(arr));

    }
}
