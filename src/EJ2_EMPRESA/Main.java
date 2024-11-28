package EJ2_EMPRESA;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("___ EMPRESA ___");
        System.out.print("Ingrese el nombre de la empresa: ");
        String nombreEmpresa = scanner.nextLine();
        System.out.print("Ingrese la direccion de la empresa: ");
        String direccion = scanner.nextLine();
        System.out.print("Ingrese el telefono de la empresa: ");
        int telefono = scanner.nextInt();
        scanner.nextLine();

        System.out.println("___ GERENTE ___");
        System.out.print("Ingrese el ID del gerente: ");
        int idEmpleadoG = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del gerente: ");
        String nombreG = scanner.nextLine();
        System.out.print("Ingrese la edad del gerente: ");
        int edadG = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el salario del gerente: ");
        double salarioG = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el departamento del gerente: ");
        String departamentoG = scanner.nextLine();

        System.out.println("___ OPERARIO ___");
        System.out.print("Ingrese el ID del operario: ");
        int idEmpleadoO = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del operario: ");
        String nombreO = scanner.nextLine();
        System.out.print("Ingrese la edad del operario: ");
        int edadO = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el salario del operario: ");
        double salarioO = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el departamento del operario: ");
        String nivelO = scanner.nextLine();
        System.out.print("Ingrese las horas trabajadas por semana del operario: ");
        int horasTrabajadasO = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingres el pago por hora del operario: ");
        double pagoPorHoraO = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("___ ADMINISTRADOR ___");
        System.out.print("Ingrese el ID del administrador ");
        int idEmpleadoA = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el nombre del administrador: ");
        String nombreA = scanner.nextLine();
        System.out.print("Ingrese la edad del administrador: ");
        int edadA = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese el salario del administrador: ");
        double salarioA = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Ingrese el departamento del administrador: ");
        String nivelA = scanner.nextLine();



        Gerente gerente = new Gerente(nombreEmpresa, telefono, direccion, nombreG, idEmpleadoG, edadG, salarioG, departamentoG);
        Operario operario = new Operario(nombreEmpresa, telefono, direccion, nombreO, idEmpleadoO, edadO, salarioO,horasTrabajadasO,pagoPorHoraO);
        Administrador administrador = new Administrador(nombreEmpresa, telefono, direccion, nombreA, idEmpleadoA, edadA, salarioA, nivelA);

        System.out.println("GERENTE");
        gerente.Informacion();
        System.out.println("\nOPERARIO");
        operario.Informacion();
        System.out.println("\nADMINISTRADOR");
        administrador.Informacion();

    }
}