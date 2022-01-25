package classe;

public class Produto {

	String nome;
	double preco;
	static double desconto = .25;
	
	// Construtor padr�o
	Produto(){
	}	
	
	// Construtor expl�cito
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	
	// Construtor expl�cito
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	// M�todo
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	// M�todo
	double precoComDesconto(double descGerente) {
		return preco * (1 - desconto + descGerente);
	}
}
