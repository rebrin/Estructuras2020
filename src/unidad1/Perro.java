package unidad1;

public class Perro {
    private String nombre;
    private int  edad;

    public Perro(String n, int e){
        nombre=n;
        edad=e;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "unidad1.TestPerro.Perro{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}