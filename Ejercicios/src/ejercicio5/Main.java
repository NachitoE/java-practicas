package ejercicio5;

import ejercicio5.Empleado;

import java.util.ArrayList;
import java.util.Iterator;
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
				empleados[cantCargado] = Initializer.GenerateAdministrativo();
				break;
			}
			case "V": {
				empleados[cantCargado] = Initializer.GenerateVendedor();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
			
			cantCargado++;
		}
		
		
		System.out.println("----- LISTADO -----");
		System.out.println("N° EMPLEADO | DNI | NOMBRE | APELLIDO | SUELDO");
		for (int i = 0; i < MAX_INGRESO; i++) {
			Empleado emp = empleados[i];
			System.out.println(i + " - " + emp.Dni + " - " + emp.Nombre + " - " + emp.Apellido + " - " + emp.getSueldo());
			
		}
	}

}
