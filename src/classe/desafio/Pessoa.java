package classe.desafio;

public class Pessoa {

	String nome;
	double peso;
	
	Pessoa(){}
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida){
		if (comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String exibe() {
		return "Ol�, eu sou o " + this.nome + " e peso " + this.peso + "kg.";
	}
	
}
