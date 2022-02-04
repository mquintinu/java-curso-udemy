package orientacaoObjeto.heranca.teste;

import orientacaoObjeto.heranca.Direcao;
import orientacaoObjeto.heranca.Heroi;
import orientacaoObjeto.heranca.Monstro;

public class Jogo {

	public static void main(String[] args) {
		
		// Herói e Monstro herdam de Jogador		
		Heroi heroi = new Heroi(10, 11);
		Monstro monstro = new Monstro(10, 10);
		
		/*
		 * jogador1.andar(Direcao.NORTE); jogador1.andar(Direcao.LESTE);
		 * jogador1.andar(Direcao.NORTE); jogador1.andar(Direcao.LESTE);
		 * jogador1.andar(Direcao.SUL);
		*/	

		System.out.println("Herói Life = " + heroi.vida);
		System.out.println("Monstro Life = " + monstro.vida);
		System.out.println();
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Herói Life = " + heroi.vida);
		System.out.println("Monstro Life = " + monstro.vida);
	}
}
