package unidad3.listas.simples;

public class NodoSimple {
    //atributos de clase
    int info;
    NodoSimple next;
    //constructor de mi clase
    public NodoSimple(int info){
        this(info,null);
    }

    public NodoSimple(int info,NodoSimple next){
        this.info=info;
        this.next=next;
    }


}
