package classe;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto();
				
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		Produto.desconto = 0.25; // Aqui eu acesso direto, pois � um atributo STATIC.
		
		// Infer�ncia
		var p2 = new Produto("Caneta Preta");
		p2.nome = "Outra caneta";	
		p2.preco = 12.56;
		Produto.desconto = 0.29; // Aqui eu acesso direto, pois � um atributo STATIC.
		
		var p3 = new Produto("Caderno", 19.9);
		
		System.out.println(p1.nome + " " + p1.precoComDesconto());
		System.out.println(p2.nome + " " + p2.precoComDesconto());
		System.out.println(p3.nome);
		
		// Chama o m�todo da Classe
		double PrecoFinal1 = p1.precoComDesconto();
		double PrecoFinal2 = p2.precoComDesconto(0.3); // Aqui ir� chamar o m�todo do Desconto do Gerente		
		
		
		double mediaCarrinho = (PrecoFinal1 + PrecoFinal2) / 2;
		
		System.out.printf("M�dia do carrinho: R$ %.2f", mediaCarrinho);		
	}
}
