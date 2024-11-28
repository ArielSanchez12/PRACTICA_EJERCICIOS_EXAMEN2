package EJ2_EMPRESA;

public class Gerente extends Empleado{
    private String departamento;

    public Gerente(String nombreEmpresa,int telefono,String direccion,String nombre, int idEmpleado, int edad, double salario, String departamento) {
        super(nombreEmpresa, telefono, direccion, nombre, idEmpleado, edad, salario);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void Informacion(){
        super.Informacion();
        System.out.println("Departamento: " + departamento);  //mostrando el departamento del gerente
    }





}
