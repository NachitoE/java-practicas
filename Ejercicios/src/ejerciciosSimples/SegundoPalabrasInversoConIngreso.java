package ejerciciosSimples;

import java.util.ArrayList;
import java.util.Scanner;

public class SegundoPalabrasInversoConIngreso {

	static final int cantidadIngreso = 3;
	
	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cantidadIngreso; i++) {
			System.out.println("Ingrese su palabra n°" + Integer.toString(i+1));
			
			palabras.add(scanner.nextLine());
			
		}
		scanner.close();
			
		for (String palabra : palabras.reversed()) {
			System.out.println(palabra);
		}
	}

}
