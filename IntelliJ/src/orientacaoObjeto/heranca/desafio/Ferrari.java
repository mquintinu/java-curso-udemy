package orientacaoObjeto.heranca.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarAr;
	public Ferrari () {
		super(315);
	}
	
	public Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
	}

	@Override
	public void ligarTurbo() {
		System.out.println(">> Ligou o turbo !!");
		setVelocidadeAtual(35); 
	}

	@Override
	public void desligarTurbo() {
		setVelocidadeAtual(15);
	}

	@Override
	public void ligarAr() {
		System.out.println(">> Ligou o ar condicionado.");
		ligarAr = true;		
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	
	public void setVelocidadeAtual(double velo) {
		if (ligarAr)
			super.setVelocidadeAtual(velo - 10);
		else 
			super.setVelocidadeAtual(velo);
	}
}
