package orientacaoObjeto.composicao;

public class Carro {

	final Motor motor;
	
	Carro (){
		this.motor = new Motor(this);
	}

	void acelerar() {
		if (motor.fatorInjecao < 2.5) {
			System.out.println("Acelerando...");
			motor.fatorInjecao += .4;
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > .5) {
			System.out.println("Freando...");
			motor.fatorInjecao -= .4;
		}		
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}
