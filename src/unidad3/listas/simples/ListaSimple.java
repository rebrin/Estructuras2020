package unidad3.listas.simples;

public class ListaSimple {
    NodoSimple first,last;

    public ListaSimple(){
        first=last=null;
    }

    public boolean vacia(){
        return first==null;
    }
    //métodos de insercion

    public void insertaFrente(int el){
        if(vacia()){
            first=last=new NodoSimple(el);
        }else {
            NodoSimple nvo=new NodoSimple(el,first);
            first=nvo;
        }
    }

    public void insertarFinal(int el){
        if(vacia()){
            first=last=new NodoSimple(el);
        }else {
            NodoSimple nvo=new NodoSimple(el);
            last.next =nvo;
            last=nvo;
        }
    }

    @Override
    public String toString() {
        String ls="[";
        for(NodoSimple tmp=first;tmp!=null;tmp=tmp.next){
            ls+=" "+tmp.info;
        }
        ls+="]";
        return ls;
    }
}
