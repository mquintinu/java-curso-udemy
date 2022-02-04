package orientacaoObjeto.composicao;

public class CarroTeste {

	public static void main(String[] args) {
		
		Carro c1 = new Carro();
		
		c1.ligar();
		
		if (c1.estaLigado())
			System.out.println("Está ligado e com o RPM de " +c1.motor.giros());
		else
			System.out.println("Está desligado.");	
		
		
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("RPM: " + c1.motor.giros());		
		
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		
		// Relação Bi-direcional (1 pra 1)
		System.out.println(c1.motor.carro.motor.carro.motor.giros());
		
		// Faltou o Encapsulamento
		// c1.motor.fatorInjecao = -30;
		
		System.out.println("RPM: " + c1.motor.giros());		
	}
}
