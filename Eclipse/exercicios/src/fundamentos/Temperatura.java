package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		// Fórmula: (ºF - 32) x 5 / 9 = ºC
		
		double fareinheit, celsius;
		final double ajuste = 32;
		final double fator = 5.0 / 9;
		
		fareinheit = 93;
		celsius = (fareinheit - ajuste) * fator;
		
		System.out.println("A temperatura " + fareinheit + " Fº é " + celsius + " em ºC.");
	}
}
