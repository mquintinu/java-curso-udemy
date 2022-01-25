package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {

		Function<Produto, Double> calculaPreco = produto -> produto.preco * (1 - produto.desconto);
		UnaryOperator<Double> impostoMun = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
		Function<Double, String> arredondar = preco -> String.format("%.2f", preco);

		Produto p = new Produto("iPad", 3235.89, 0.13);
		String precoFinal = calculaPreco
				.andThen(impostoMun)
				.andThen(frete)
				.andThen(arredondar)
				.apply(p);

		System.out.printf("\nPreço final: " + precoFinal);
	}
}
