package ejercicio5;

import ejercicio5.Empleado;

import java.util.ArrayList;
import java.util.Scanner;
import ejercicio5.Administrativo;
import ejercicio5.Vendedor;

public class Main {

	static final int MAX_INGRESO = 3;
	
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[MAX_INGRESO];
		int cantCargado = 0;
		
		Scanner scanner = new Scanner(System.in);
		while(cantCargado < MAX_INGRESO) {
			System.out.println("---------------------------");
			System.out.println("Ingreso del empleado n°"+ Integer.toString(cantCargado+1));
			System.out.println("[OPCIONES]\nAdministrativo - A\nVendedor - V\nIngrese:"); 
			Empleado newEmpleado = null;
			String opc = scanner.nextLine();
			System.out.println("Ingrese los datos:");
			switch (opc) {
			case "A": {
				System.out.println("HORAS EXTRA:");
				int hsExtra = Integer.parseInt(scanner.nextLine());
				System.out.println("HORAS POR MES:");
				int hsMes = Integer.parseInt(scanner.nextLine());
				
				newEmpleado = new Administrativo(hsExtra, hsMes);
				break;
			}
			case "V": {
				System.out.println("PORCENTAJE COMISIÓN:");
				double porcentajeComision = Double.parseDouble(scanner.nextLine());
				System.out.println("HORAS POR MES:");
				int totalVentas = Integer.parseInt(scanner.nextLine());
				newEmpleado = new Vendedor(porcentajeComision, totalVentas);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
			
			System.out.println("NOMBRE:");
			String nombre = scanner.nextLine();
			System.out.println("DNI:");
			String dni = scanner.nextLine();
			System.out.println("APELLIDO:");
			String apellido = scanner.nextLine();
			System.out.println("EMAIL:");
			String email = scanner.nextLine();
			System.out.println("SUELDO BASE:");
			double sueldoBase = Double.parseDouble(scanner.nextLine());
			
			newEmpleado.Nombre = nombre;
			newEmpleado.Dni = dni;
			newEmpleado.Apellido = apellido;
			newEmpleado.Email = email;
			newEmpleado.SueldoBase = sueldoBase;
			cantCargado++;
		}
		
		scanner.close();
		
	}

}
