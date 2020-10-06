package unidad1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EjeOrdColl {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos=new ArrayList<>();
        alumnos.add(new Alumno("Profesor","01234"
                ,"sistemas",40));
        alumnos.add(new Alumno("Tokio","01235"
                ,"Informatica",28));
        alumnos.add(new Alumno("Berlin","01236"
                ,"Informatica",45));
        alumnos.add(new Alumno("Rio","01237"
                ,"sistemas",23));

      /*  System.out.println(alumnos.toString());
        alumnos.sort(new Comparator<Alumno>() {
            @Override
            public int compare(Alumno o1, Alumno o2) {
                return o1.getNombre().compareTo(o2.getNombre());
            }
        });
        System.out.println();
        System.out.println(alumnos.toString());*/

        List<Alumno> filtrados=alumnos.stream()
                .filter(a->a.getEdad()<30)
                .collect(Collectors.toList());

        List<Alumno> Sistemas =alumnos.stream()
                .filter(cuenta->cuenta.getCarrera()
                        .equals("sistemas")).collect(Collectors.toList());

        System.out.println(Sistemas.toString());
    }
}
