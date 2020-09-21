package unidad1;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PruebaStackQueue {
    public static void main(String[] args) {
        //pilas
        Stack<Integer> pila=new Stack<>();
        //push-> introducir elementos en la pila

        pila.push(1);
        pila.push(2);
        pila.push(3);

        System.out.println(pila.toString());
        pila.pop();
        //peek visualiza la cima de la pila
        System.out.println(pila.peek());

        /*veamos el ejemplo con colas*/
        System.out.println();
        Queue<Integer> cola=new LinkedList<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);

        System.out.println(cola.toString());
        cola.poll();
        System.out.println(cola.toString());

    }
}
