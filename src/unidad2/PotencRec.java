package unidad2;

public class PotencRec {

    public PotencRec(){
        System.out.println(potencia(10,8));
    }

    public long potencia(long n,long pot){
        if (pot==0) return 1;
        if(pot==1) return n;
        else return n*potencia(n, pot-1);
    }

    public static void main(String[] args) {
        new PotencRec();
    }
}
