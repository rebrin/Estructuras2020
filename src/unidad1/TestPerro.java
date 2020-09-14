package unidad1;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPerro {
    public static void main(String[] args) {
        Perro p1=new Perro("ody",4);
        Perro p2=new Perro("Pucca",2);

        //primer estructura
        Perro arr[]=new Perro[5];
        arr[0]=p1;
        arr[1]=p2;
        //referncia del arreglo
        arr[0].setNombre("odiseo");

        /*arrglos bidimensionales*/
        int  matrix[][]={{1,2,3} //0
                        ,{4,5,6}, //1
                        {7,8,9,10}}; //2
        /*desde abajo*/
       /* matrix[2][0]=matrix[2][0]*2;
        matrix[2][1]=matrix[2][1]*2;
        matrix[2][2]=matrix[2][2]*2;*/

       for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                matrix[i][j]=matrix[i][j]*2;
            }
       }

        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println();

        /*Arrays.toString(arr)*/
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(matrix[1][2]);
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println("tamaño:"+matrix[2].length);
    }


}
