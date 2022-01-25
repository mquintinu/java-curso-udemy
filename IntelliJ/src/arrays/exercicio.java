package arrays;

import java.util.Arrays;

public class exercicio {

	public static void main(String[] args) {
		
		double[] notasAlunoA = new double[3];
		
		notasAlunoA[0] = 7.5;
		notasAlunoA[1] = 8.2;
		notasAlunoA[2] = 9;		
		
		System.out.println(notasAlunoA[0]);
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for (int i = 0; i < notasAlunoA.length; i++){
			total += notasAlunoA[i];			
		}
		
		System.out.println(total / notasAlunoA.length);
		
		double[] notasAlunoB = {8.6, 2.3, 2, 10};
		
		for (int i = 0; i < notasAlunoB.length; i++) {
			System.out.println("Nota " + i + " é: " +notasAlunoB[i]);
		}
		
		System.out.println(Arrays.toString(notasAlunoB));
		
		// For Each
		for (double nota : notasAlunoB) {
			System.out.println("For Each: " +nota);
		}
	}
}
