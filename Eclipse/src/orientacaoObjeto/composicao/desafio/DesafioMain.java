package orientacaoObjeto.composicao.desafio;

public class DesafioMain {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Mateus Quintino");
		
		Compra compra1 = new Compra();
		compra1.AddItem("Monitor", 1000, 1);
		compra1.AddItem(new Produto("Pop Funko Baby Yoda", 114.5), 1);
		
		Compra compra2 = new Compra();
		compra2.AddItem(new Produto("Coleção Funko The Office", 993.45), 3);
		compra2.AddItem("Cerveja Iron Maiden", 14.5, 9);
		
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		
		System.out.println("O Cliente " + cliente.nome + " comprou os seguintes itens: ");
		compra1.ExibeItens();
		compra2.ExibeItens();
		System.out.println();		
		
		System.out.println("E gastou um total de R$ " + cliente.obterVlrTotal());
		
	}

}
