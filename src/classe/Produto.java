package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = .25;
	
	// Construtor padrão
	Produto(){
	}	
	
	// Construtor explícito
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	// Construtor explícito
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	// Método
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	// Método
	double precoComDesconto(double descGerente) {
		return preco * (1 - desconto + descGerente);
	}
}
