package EJ2_EMPRESA;

public class Administrador extends Empleado{
    private String nivel;

    public Administrador(String nombreEmpresa,int telefono,String direccion,String nombre, int idEmpleado, int edad, double salario, String nivel) {
        super(nombreEmpresa, telefono, direccion, nombre, idEmpleado, edad, salario);
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public void Informacion(){
        super.Informacion();
        System.out.println("Nivel: " + nivel);  //Se muestra el nivel del administrador

    }
}
