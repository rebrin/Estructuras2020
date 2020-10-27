package unidad3.listas.simples;

public class TestListaD {
    public static void main(String[] args) {
        ListaD l=new ListaD();
        l.insertarFinal(1);
        l.insertarFinal(2);
        l.insertarFinal(3);
        l.insertarFinal(4);
        l.insertarFrente(0);
        l.insertarFrente(0);
        l.insertarFrente(-2);
        l.insertarFrente(-3);

        System.out.println(l);
        System.out.println("eliminado "+l.eliminarFrente());
        System.out.println("eliminado "+l.eliminarFrente());
        System.out.println("eliminado "+l.eliminarFrente());
        System.out.println(l);

    }
}
