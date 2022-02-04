package orientacaoObjeto.heranca.teste;

import orientacaoObjeto.heranca.desafio.Civic;
import orientacaoObjeto.heranca.desafio.Ferrari;

public class CarroMain {

	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari(400);
		Civic civic = new Civic();
		
		System.out.println("CIVIC = " + civic);
		System.out.println("FERRARI = " + ferrari);		
		
		ferrari.acelerar();
		ferrari.acelerar();
		civic.acelerar();
		civic.acelerar();
		
		System.out.println("CIVIC = " + civic);
		System.out.println("FERRARI = " + ferrari);
		
		ferrari.frear();
		civic.frear();
		
		ferrari.ligarAr();
		ferrari.ligarTurbo();
		
		System.out.println("CIVIC = " + civic);
		System.out.println("FERRARI = " + ferrari);
		System.out.println(ferrari.velocidadeDoAr());
	}
}
