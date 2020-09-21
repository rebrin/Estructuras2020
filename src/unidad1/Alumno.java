package unidad1;

public class Alumno {
    private String nombre;
    private String NC;
    private String Carrera;
    private Integer edad;

    @Override
    public String toString() {
        return "Alumno{" +
                "nombre='" + nombre + '\'' +
                ", NC='" + NC + '\'' +
                ", Carrera='" + Carrera + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Alumno(String nombre, String NC, String carrera, Integer edad) {
        this.nombre = nombre;
        this.NC = NC;
        Carrera = carrera;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNC() {
        return NC;
    }

    public void setNC(String NC) {
        this.NC = NC;
    }

    public String getCarrera() {
        return Carrera;
    }

    public void setCarrera(String carrera) {
        Carrera = carrera;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }
}
