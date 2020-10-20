package unidad2;

public class MCD {
    public MCD()
    {               int a=12;
                 int b=60;
        System.out.println(mcd(a,b));
    }
    public int mcd(int a, int b){
        if(b==0)
        {
            return a;
        }
        else return mcd(b ,a % b);
    }

    public static void main(String[] args) {
       MCD MACD=new MCD();
    }

}
