package unidad1;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEj01 {
    public static void main(String[] args) {
        ArrayList<Double> arr=new ArrayList<>();
        for(int i=0;i<5;i++)
            arr.add(Math.random());

        arr.add(3.1416);
        arr.add(0,123.654);
        System.out.println(arr.toString());

        Iterator<Double>it=arr.iterator();
             while (it.hasNext()) {
                Double d=it.next();
                 if(d==3.1416)
                    it.remove();
        }

        System.out.println(arr.toString());
    }
}
