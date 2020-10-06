package unidad2;
import java.math.BigInteger;
import java.util.*;
public class EjFactorial {
    private Scanner s=new Scanner(System.in);
    private Integer n;
    public EjFactorial(){
        System.out.println("introduce n");
        n=s.nextInt();
        //System.out.println(Long.MAX_VALUE);
         System.out.println(factRec(n));

    }

    public int factIterativo(int n){
        int fact=1;
        for(int i=1;i<=n;i++)
            fact*=i;
        return fact;
    }

    public int factRec(int n){
        //si (n==0 o ==1)
        if(n==0 || n==1)
            return 1;
        else{
            return n*factRec(n-1);
        }
    }

}
