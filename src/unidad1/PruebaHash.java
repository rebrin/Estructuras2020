package unidad1;

import java.util.HashMap;
import java.util.Scanner;

public class PruebaHash {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String palabra="";
        HashMap<String,String> diccionario=new HashMap<>();
        diccionario.put("hello", "esta palabra significa hola");
        diccionario.put("bye", "despedida en ingles");
        diccionario.put("good", "palabra para escribir bien");

        while(!palabra.equals("exit")) {
            System.out.println("introduce la palabra a buscar");
            palabra=s.nextLine();
            if(diccionario.get(palabra)!=null)
            System.out.println(diccionario.get(palabra));
            else
                System.out.println("esta palabra no está en el diccionario");
        }
    }
}
