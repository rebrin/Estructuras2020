package unidad2;

import java.util.Arrays;

public class SudokuMio {

    /*funcion:
    *   valida si llega a un estado terminal
    * sino
    *   probar todas las operaciones validas posibles
    *       llamar recursivamente a la funcion
    *       quitar la ultima operacion
    * */

    int tablero[][]={{0,0,3,2},
                    {3,2,0,4},
                    {2,0,0,0},
                    {4,3,0,0}};
    int vacios=8;

    public SudokuMio(){
        solve();
    }

    private boolean solve() {
        boolean haySol=false;
        if(vacios==0){
            System.out.println(Arrays.deepToString(tablero));
            haySol=true;
            return true;
        }
        //tengo que calcular todas las posibles operaciones
        {
            for(int i=0;i<tablero.length;i++){
                for(int j=0;j<tablero.length;j++){
                    if(tablero[i][j]==0){ //puedo
                       if(esValido(1,i,j)){
                           vacios--;
                           tablero[i][j]=1;
                           solve();
                           //backtrack
                           if(!haySol){
                           tablero[i][j]=0;
                           vacios++;}
                       }
                       if(esValido(2,i,j)){
                           vacios--;
                           tablero[i][j]=2;
                           solve();
                           //backtrack
                           if(!haySol){
                           tablero[i][j]=0;
                           vacios++;}
                       }
                       if(esValido(3,i,j)){
                           vacios--;
                           tablero[i][j]=3;
                           solve();
                           //backtrack
                           if(!haySol){
                               tablero[i][j]=0;
                               vacios++;
                           }
                       }
                       if(esValido(4,i,j)){
                           vacios--;
                           tablero[i][j]=4;
                           solve();
                           //backtrack
                           if(!haySol){
                           tablero[i][j]=0;
                           vacios++;}
                       }else
                           return false;

                    }
                }
            }
        }
        return false;
    }

    public boolean esValido(int el,int f,int c){
        boolean valido=true;
        for (int x=0;x<tablero.length;x++){
            if(tablero[f][x]==el)
                return false;
        }
        for (int x=0;x<tablero.length;x++){
            if(tablero[x][c]==el)
                return false;
        }
        return valido;
    }

    public static void main(String[] args) {
        new SudokuMio();
    }
}
