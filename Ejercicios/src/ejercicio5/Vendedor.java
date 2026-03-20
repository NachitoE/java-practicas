package ejercicio5;

public class Vendedor extends Empleado {
	public double PorcentajeComision;
	public int TotalVentas;
	
	public Vendedor(double porcentajeComision, int totalVentas) {
		PorcentajeComision = porcentajeComision;
		TotalVentas = totalVentas;
	}
	
	public double getSueldo() {
		return SueldoBase + (PorcentajeComision*TotalVentas/100);	
	}
}
