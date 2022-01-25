package orientacaoObjeto.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}

	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterVlrTotal(){
		double vlrTotal = 0;
		
		for (Compra compra : compras) {
			vlrTotal += compra.obterVlrtotal();
		}
		
		return vlrTotal;
	}
}
