package unidad1;

import java.util.ArrayList;
import java.util.Comparator;

public class EjeOrdColl {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos.add(new Alumno("Profesor","01234"
                ,"sistemas",40));
        alumnos.add(new Alumno("Tokio","01235"
                ,"sistemas",28));
        alumnos.add(new Alumno("Berlin","01236"
                ,"sistemas",45));

        System.out.println(alumnos.toString());
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println();
        System.out.println(alumnos.toString());
    }
}
