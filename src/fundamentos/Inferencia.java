package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		// Aqui acontece a infer�ncia
		var b = 4.5; 
		System.out.println(b);
		
		// A partir do Java 10, o pr�prio Java reconhece o tipo da vari�vel
		var c = "Texto";
		System.out.println(c);
		
		// A linha abaixo retorna um erro, pois uma vez declarada a vari�vel assume o tipo e n�o muda mais.
		//c = 4.5;
	}

}
