package unidad2;

import java.util.Arrays;

public class ArregloFind {
    private int[] arr= {1,3,5,7,11,13,17,19,23};
    public ArregloFind(){
        System.out.println(seEncuentra(arr,7));
    }

    private boolean seEncuentra(int[] arr, int n) {
        //caso base n=[n,..]
        if(arr.length==0)
            return false;
        // n  []
        else if(n==arr[0])
            return true;
        else {
            //n = [...]
            int [] arr2=Arrays.copyOfRange(arr,1,arr.length);
            return seEncuentra(arr2,n);
        }
    }

    public static void main(String[] args) {
        new ArregloFind();
    }
}
