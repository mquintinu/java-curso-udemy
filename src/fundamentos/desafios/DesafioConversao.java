package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro sal�rio: ");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo sal�rio: ");
		String sal2 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite o terceiro sal�rio: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		double media = Double.parseDouble(sal1);
		media = media + Double.parseDouble(sal2);
		media = media + Double.parseDouble(sal3);
		
		System.out.println("A m�dia dos sal�rios �: " + media / 3);
		
		entrada.close();
		
		
	}

}
