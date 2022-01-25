package orientacaoObjeto.heranca.desafio;

public class Carro {

	final int VELOCIDADE_MAXIMA;
	private double velocidadeAtual;	

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual += velocidadeAtual; 
	}

	protected Carro(int velocidadeMax) {
		VELOCIDADE_MAXIMA = velocidadeMax;
	}	

	public void acelerar() {
		System.out.println("** acelerando...");
		if (velocidadeAtual + 5 > VELOCIDADE_MAXIMA)
			velocidadeAtual = VELOCIDADE_MAXIMA;
		else
			velocidadeAtual += 5;
	}

	public void frear() {
		if (velocidadeAtual > 0)
			System.out.println("** freando...");
		velocidadeAtual -= 5;
	}

	public String toString() {
		return "Velocidade atual = " + velocidadeAtual + " Km/h";
	}

}
