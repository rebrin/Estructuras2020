package unidad2;

public class MiStackOver {
    public MiStackOver(){
        over(1);
    }

    public long over(long n){
        long suma=0;
            return suma+over(n+1);
    }

    public static void main(String[] args) {
        new MiStackOver();
    }
}
