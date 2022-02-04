package orientacaoObjeto.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> itens = new ArrayList<Item>();
	
	void AddItem(Produto p, int quantidade) {
		this.itens.add(new Item(p, quantidade));
	}
	
	void AddItem(String nome, double preco, int quantidade) {
		var produto = new Produto(nome, preco);
		this.itens.add(new Item(produto, quantidade));
	}
	
	void ExibeItens() {
		for(Item item: itens)
		{
			System.out.println(">> Item: " + item.prod.nome + 
							   " (R$ " + item.prod.preco +
							   " - Qtd: " + item.quantidade + ")");
		}
	}
	
	double obterVlrtotal() {
		double vlrTotal = 0;
		
		for (Item item : itens) {
			vlrTotal += item.quantidade * item.prod.preco;
		}
		
		return vlrTotal;
	}

}
