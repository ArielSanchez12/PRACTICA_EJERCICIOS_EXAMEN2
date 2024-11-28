package EJ3_SOBRESCRITURA;

public class Curso {
    private String nombreCurso;
    private int duracion;

    public Curso(String nombreCurso, int duracion) {
        this.nombreCurso = nombreCurso;
        this.duracion = duracion;
    }
    public Curso(){
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    public void mostrarDetalles() {
        System.out.println("Nombre del curso: " + nombreCurso);
        System.out.println("Duracion del curso: " + duracion + " horas");
    }
}
