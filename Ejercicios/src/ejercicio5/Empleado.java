package ejercicio5;

public abstract class Empleado {
	public String Dni;
	public String Nombre;
	public String Apellido;
	public String Email;
	public double SueldoBase;
	
	abstract public double getSueldo();
}
