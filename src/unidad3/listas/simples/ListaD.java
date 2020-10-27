package unidad3.listas.simples;

public class ListaD {
    public NodoD first,last;

    public ListaD (){
        first=last=null;
    }

    public boolean vacia(){
        return first==null;
    }

    public void insertarFinal(int el){
        if(!vacia()){
            last=new NodoD(el,null,last);
            last.prev.next =last;
        }else{
            first=last=new NodoD(el);
        }
    }

    public void insertarFrente(int el){
        if(!vacia()){
            first=new NodoD(el,first,null);
            first.next.prev =first;
        }else
            first=last=new NodoD(el);
    }

    @Override
    public String toString() {
        String lista="[";
        for(NodoD tmp=first;tmp!=null;tmp=tmp.next){
            lista+=" "+tmp.info;
        }
        lista+="]";
        return lista;
    }

    public int eliminarFrente(){
        if(!vacia()){
            NodoD tmp=first;
            if(first==last){
                first=last=null;
            }else{//mas de un el
                first=first.next;
                first.prev=null;
            }
            return tmp.info;
        }else
            return Integer.MIN_VALUE;
    }
}
