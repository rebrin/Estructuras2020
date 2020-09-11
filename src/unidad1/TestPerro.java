package unidad1;

public class TestPerro {
    public static void main(String[] args) {
        Perro p1=new Perro("ody",4);
        Perro p2=new Perro("Pucca",2);

        //primer estructura
        Perro[] arr=new Perro[2];
        arr[0]=p1;
        arr[1]=p2;


        System.out.println(p1);
        System.out.println(p2);
    }


}
