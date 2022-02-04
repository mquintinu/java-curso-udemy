package orientacaoObjeto.encapsulamento;

public class Pessoa {

	private String nome;
	private int idade;

	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if (idade >= 0 && idade < 130) {
			this.idade = idade;
		}
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + getNome() + ", idade=" + getIdade() + "]";
	}	
}
