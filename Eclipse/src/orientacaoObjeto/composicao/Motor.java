package orientacaoObjeto.composicao;

public class Motor {

	final Carro carro;
	boolean ligado = false;
	double fatorInjecao = 1;

	Motor(Carro carro){
		this.carro = carro;
	}
	
	// método
	int giros() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}
