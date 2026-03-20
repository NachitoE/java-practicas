package ejerciciosSimples;

import java.util.Iterator;

public class PrimeroNumeros {

	public static void main(String[] args){
		for (int i = 1; i<=10; i++) {
			System.out.println(i);
		}
		
		int count = 0;
		int num = 0;
		while(true) {
			
			num++;
			if(num % 2 != 0) {
				System.out.println(num);
				count++;
			}
			if(count >= 10) {
				break;
			}
			
		}
		
		
	}
	
}
