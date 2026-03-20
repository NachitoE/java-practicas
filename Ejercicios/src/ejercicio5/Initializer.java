package ejercicio5;

import java.util.Random;

public class Initializer {
	static final Random random = new Random();
	static Administrativo GenerateAdministrativo() {
		return new Administrativo(GetRandomDni(), GetRandomName() , GetRandomApellido(), GetRandomEmail(), GetRandomSueldoBase(), GetRandomHsExtra(), GetRandomHsMes());
	}
	
	static Vendedor GenerateVendedor() {
		return new Vendedor(GetRandomDni(), GetRandomName() , GetRandomApellido(), GetRandomEmail(), GetRandomSueldoBase(), GetRandomPorcentajeComision(), GetRandomTotalVentas());
	}
	
	static String GetRandomDni() {
		return Integer.toString(random.nextInt((99999999 - 10000000 +1) + 10000000));
	}
	static String GetRandomName() {
		return "pepe" + random.nextInt(11);
	}
	static String GetRandomApellido() {
		return "pepeApellido" + random.nextInt(11);
	}
	static String GetRandomEmail() {
		return "pepe@" + random.nextInt(11) + ".com";
	}
	static double GetRandomSueldoBase() {
		return random.nextDouble(500000);
	}
	static int GetRandomHsExtra() {
		return random.nextInt(12);
	}
	static int GetRandomHsMes() {
		return random.nextInt(12);
	}
	static double GetRandomPorcentajeComision() {
		return random.nextDouble(15);
	}
	static int GetRandomTotalVentas() {
		return random.nextInt(50);
	}
}
