package ejercicio6;

import java.util.LinkedList;
import java.util.Scanner;

public abstract class App {

	public static void main(String[] args) {
		System.out.println("1-Listado\n2-Filtrar por id");
        Scanner s = new Scanner(System.in);
        String opc = s.nextLine();
        
        switch(opc) {
        	case "1":
        		listProducts();
        		break;
        	case "2":
        		System.out.println("Ingrese ID producto:");
        		int id = Integer.parseInt(s.nextLine());
        		showProductById(id);
        		break;
        	default:
        		System.out.println("opcion incorrecta");
        }
        s.close();
        
	}
	
	public static void listProducts() {
		LinkedList<Product> ps = Database.getAll();
		System.out.println(ps.size());
		for(Product p: ps) {
			showProduct(p);
		}
		
	}
	
	public static void showProductById(int id) {
		Product p = Database.getById(id);
		if(p != null) {
			showProduct(p);
			return;
		}
		System.out.println("ERR: No se encontró el producto");
	}
	
	public static void showProduct(Product p) {
		System.out.println(p.toString());
	}
	
}
