package ejercicio5;

public class Administrativo extends Empleado{
	public int HsExtra;
	public int HsMes;
	
	public Administrativo(int hsExtra, int hsMes) {
		HsExtra = hsExtra;
		HsMes = hsMes;
	}
	public double getSueldo() {
		return SueldoBase * ((HsExtra * 1.5)+HsMes) / HsMes;
				
	}
}
