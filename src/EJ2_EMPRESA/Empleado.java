package EJ2_EMPRESA;

public class Empleado extends Empresa {
    private int idEmpleado;
    private int edad;
    private String nombre;
    private double salario;


    public Empleado(String nombreEmpresa,int telefono,String direccion, String nombre, int idEmpleado, int edad, double salario) {
        super(nombreEmpresa,direccion,telefono);
        this.idEmpleado = idEmpleado;
        this.edad = edad;
        this.salario = salario;
        this.nombre = nombre;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public void Informacion(){
        super.Informacion();
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}
