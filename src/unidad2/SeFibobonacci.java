package unidad2;

public class SeFibobonacci
{

    long[] sol=new long[100];
    //constructor
    public SeFibobonacci()
    {
        sol[0]=0l;
        sol[1]=1l;
        System.out.println(fib(92));
    }

    public long fib(long n)
    {
        if(n==0 || n==1)
            return sol[((int) n)];
        else{
            if(sol[((int)n)]==0l){
                //calcula
                long nvaSol=fib(n-1)+fib(n-2);
                //almacenas la sol
                sol[(int)n]=nvaSol;
                return nvaSol;
            }else
            return sol[(int)n];
        }
    }

    public static void main(String[] args) {
        new SeFibobonacci();
    }
}
