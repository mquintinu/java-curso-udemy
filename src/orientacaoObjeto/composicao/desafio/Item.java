package orientacaoObjeto.composicao.desafio;

public class Item {

	final int quantidade;
	final Produto prod;
	
	Item(Produto prod, int quantidade){
		this.prod = prod;
		this.quantidade = quantidade;
	}
}
