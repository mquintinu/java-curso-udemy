package orientacaoObjeto.heranca;

public class Heroi extends Jogador {

	public Heroi(int x, int y) {
		super(x, y);
	}

	@Override
	public boolean atacar(Jogador oponente) {

		// O SUPER serve para chamar um método da SUPER CLASSE (a que herda)
		boolean atk1 = super.atacar(oponente);
		boolean atk2 = super.atacar(oponente);
		boolean atk3 = super.atacar(oponente);

		return atk1 || atk2 || atk3;
	}

}
