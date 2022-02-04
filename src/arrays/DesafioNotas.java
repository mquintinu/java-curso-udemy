package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioNotas {

	public static void main(String[] args) {
		
		System.out.print("Digite quantas notas ser�o informadas: ");
		
		Scanner entrada = new Scanner(System.in);

		int qtdNotas = entrada.nextInt();
		
		double[] notas = new double[qtdNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.print("Digite a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();
		}
		
		System.out.println(Arrays.toString(notas));
		
		double total = 0;
		for(double nota : notas) {
			total += nota;
		}
		
		System.out.println("A m�dia �: " + total / notas.length);

		entrada.close();
	}
}
