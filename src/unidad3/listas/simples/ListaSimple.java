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

    public int eliminaFrente(){
        if(!vacia()) {
            int val = first.info;
            //primer caso
            if(first==last){
                first=last=null;
            }else{
                first=first.next;
            }
            return val;
        }
        else return Integer.MIN_VALUE;
    }

    public int eliminarFinal(){
        if(!vacia()){
            int val=last.info;
            //si es el único
            if(first==last){
                first=last=null;
            }else{
                NodoSimple tmp;
                for(tmp=first;tmp.next!=last;tmp=tmp.next);
                last=tmp;
                last.next=null;
            }
            return val;
        }else return Integer.MIN_VALUE;
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

    public boolean estaEnLista(int el){
        NodoSimple tmp;
        for(tmp=first; tmp!=null && tmp.info!=el;tmp=tmp.next);
        return tmp!=null;
    }

    public int delete(int el){
        if(!vacia()){
            //primer elemento
            if(first.info==el)
                return eliminaFrente();
            else if(last.info==el)
                return eliminarFinal();
            else{//está en medio el elemento
                NodoSimple tmp,prev;
                for(tmp=first.next,prev=first;
                    tmp!=null && tmp.info!=el;
                    prev=tmp,tmp=tmp.next
                    );
                if(tmp==null){
                    //no en lista
                    return Integer.MIN_VALUE;
                }else{
                    prev.next=tmp.next;
                    return tmp.info;
                }

            }
        }else return Integer.MIN_VALUE;
    }

}
