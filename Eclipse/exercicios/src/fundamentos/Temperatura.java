package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		
		// F�rmula: (�F - 32) x 5 / 9 = �C
		
		double fareinheit, celsius;
		final double ajuste = 32;
		final double fator = 5.0 / 9;
		
		fareinheit = 93;
		celsius = (fareinheit - ajuste) * fator;
		
		System.out.println("A temperatura " + fareinheit + " F� � " + celsius + " em �C.");
	}
}
