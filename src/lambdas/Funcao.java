package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";
		Function<String, String> oResultadoE = valor -> "O resultado é: " + valor;
		Function<String, String> empolgado = valor -> valor + " !!!";
		Function<String, String> duvida = valor -> valor + " ???";

		System.out.println(parOuImpar.apply(9));
		
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(duvida)
				.apply(32);		
		System.out.println(resultadoFinal);
		

		for (int i = 0; i < 20; i++) {
			String resultadoFinalFor = parOuImpar
					.andThen(oResultadoE)
					.andThen(empolgado)
					.apply(i);		
			System.out.println("Número: " +i + " - " +resultadoFinalFor);
		}		
	}
}
