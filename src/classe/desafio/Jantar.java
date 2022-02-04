package classe.desafio;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Mateus", 79.3);
		
		Comida c1 = new Comida("Arroz", .223);
		Comida c2 = new Comida("Feijão", .300);			
		
		System.out.println(pessoa.exibe());
					
		pessoa.comer(c1);
		pessoa.comer(c2);
		
		System.out.println(pessoa.exibe());
	}
}
