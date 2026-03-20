package ejerciciosSimples;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class TercerPalabraEnLista {

	static final int cantidadIngreso = 3;
	
	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < cantidadIngreso; i++) {
			System.out.println("Ingrese su palabra n°" + Integer.toString(i+1));
			palabras.add(scanner.nextLine());
		}
		
		System.out.println("Ingrese su última palabra, para ver si ya habría sido ingresada:");
		String palabra = scanner.nextLine();
		scanner.close();
			
		if(palabras.contains(palabra)) {
			System.out.println("Sí, estaba ingresada!");
		}else {
			System.out.println("Nop, no estaba ingresada!");
		}
	}

}
