package unidad3.listas.simples;

public class NodoD {
    NodoD prev,next;
    int info;

    public NodoD(int el){
        this(el,null,null);
    }

    public NodoD(int el, NodoD next, NodoD prev){
        this.info = el;
        this.next = next;
        this.prev = prev;
    }

}
