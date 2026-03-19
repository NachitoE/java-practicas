package ejercicios;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.Scanner;

public class Cuarto20Enteros {

	static final int cantidadIngreso = 3;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese el primer número:");
		
		
		int primerNum = Integer.parseInt(scanner.nextLine());
		int[] nums = new int[cantidadIngreso];
		int ultPos = 0;
		for (int i = 0; i < cantidadIngreso; i++) {
			System.out.println(String.format("Ingrese el número %d:", i+1));
			int num = Integer.parseInt(scanner.nextLine());
			if(num > primerNum) {
				nums[ultPos] = num;
				ultPos++;
			}
			
		}
		scanner.close();
		
		System.out.println(String.format("Mostrando los mayores a %d:", primerNum));
		for (int i = 0; i < ultPos; i++) {
			System.out.println(Integer.toString(nums[i]));
		}

	}

}
