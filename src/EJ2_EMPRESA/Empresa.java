package EJ2_EMPRESA;

public class Empresa {
    private String nombreEmpresa;
    private String direccion;
    private int telefono;

public Empresa(String nombreEmpresa,String direccion,int telefono) {
    this.nombreEmpresa = nombreEmpresa;
    this.direccion = direccion;
    this.telefono = telefono;
}

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public void Informacion() {
        System.out.println("Nombre Empresa: " + getNombreEmpresa());
        System.out.println("Dirección: " + getDireccion());
        System.out.println("Teléfono: " + getTelefono());
    }
}
