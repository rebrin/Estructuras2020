package unidad3.listas.simples;

public class TestListaSimple {
    public static void main(String[] args) {
        ListaSimple lista=new ListaSimple();
        lista.insertaFrente(3);
        lista.insertaFrente(2);
        lista.insertaFrente(1);
        lista.insertarFinal(4);
        lista.insertarFinal(5);
        lista.insertaFrente(1);
        lista.insertaFrente(0);
        lista.insertarFinal(6);
        lista.insertarFinal(5);
       /* System.out.println(lista);

        System.out.println("elemento eliminado:"+lista.eliminaFrente());
        System.out.println("elemento eliminado:"+lista.eliminaFrente());
        System.out.println("elemento eliminado:"+lista.eliminaFrente());
        System.out.println("elemento eliminado:"+lista.eliminaFrente());
        System.out.println("elemento eliminado:"+lista.eliminaFrente());

        System.out.println("elemento eliminado del final "+lista.eliminarFinal());
        System.out.println("elemento eliminado del final "+lista.eliminarFinal());
        */
        System.out.println(lista);
        System.out.println(lista.estaEnLista(7));
        System.out.println(lista.delete(5));
        System.out.println(lista);
    }
}
