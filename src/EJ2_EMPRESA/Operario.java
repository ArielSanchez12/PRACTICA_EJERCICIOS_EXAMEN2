package EJ2_EMPRESA;

public class Operario extends Empleado{
    private int horasTrabajadas;
    private double pagoPorHora;

    public Operario(String nombreEmpresa,int telefono,String direccion,String nombre, int idEmpleado, int edad, double salario, int horasTrabajadas, double pagoPorHora) {
        super(nombreEmpresa, telefono, direccion, nombre, idEmpleado, edad, salario);
        this.horasTrabajadas = horasTrabajadas;
        this.pagoPorHora = pagoPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getPagoPorHora() {
        return pagoPorHora;
    }

    public void setPagoPorHora(double pagoPorHora) {
        this.pagoPorHora = pagoPorHora;
    }
    @Override
    public void Informacion(){
        super.Informacion();
        System.out.println("Horas trabajadas: " + horasTrabajadas);

    }
}
