package ejercicio5;

public class Administrativo extends Empleado{
	public int HsExtra;
	public int HsMes;
	
	public Administrativo(int hsExtra, int hsMes) {
		HsExtra = hsExtra;
		HsMes = hsMes;
	}
	
	public Administrativo(String dni, String nombre, String apellido, String email, double sueldoBase, int hsExtra, int hsMes) {
		Dni = dni;
		Nombre = nombre;
		Apellido = apellido;
		Email = email;
		SueldoBase = sueldoBase;
		HsExtra = hsExtra;
		HsMes = hsMes;
		
	}
	public double getSueldo() {
		return SueldoBase * ((HsExtra * 1.5)+HsMes) / HsMes;
				
	}
}
