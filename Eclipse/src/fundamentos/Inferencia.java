package fundamentos;

public class Inferencia {
	
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		// Aqui acontece a inferência
		var b = 4.5; 
		System.out.println(b);
		
		// A partir do Java 10, o próprio Java reconhece o tipo da variável
		var c = "Texto";
		System.out.println(c);
		
		// A linha abaixo retorna um erro, pois uma vez declarada a variável assume o tipo e não muda mais.
		//c = 4.5;
	}

}
