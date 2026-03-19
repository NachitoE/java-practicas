package ejercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.zip.ZipEntry;

public class SegundoPalabrasInverso {

	public static void main(String[] args) {
		ArrayList<String> palabras = new ArrayList<String>();
		Collections.addAll(palabras, "pepe1", "pepe2", "pepe3");
		
		for (String palabra : palabras.reversed()) {
			System.out.println(palabra);
		}
	}

}
