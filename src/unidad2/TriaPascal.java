package unidad2;

public class TriaPascal {
    public TriaPascal(){
        for(int i=0;i<10;i++) {
            for (int j = 0; j <= i; j++){
                System.out.print(tPasc(i, j)+" ");
        }
            System.out.println();
        }


    }

    public int tPasc(int f,int c){
        //casos base:
        if(c==0||f==c)
            return 1;
        else
            return tPasc(f-1,c-1)+tPasc(f-1,c);
    }

    public static void main(String[] args) {
        new TriaPascal();
    }

}
