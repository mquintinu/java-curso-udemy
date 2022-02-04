package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro salário: ");
		String sal1 = entrada.nextLine().replace(",", ".");
		
		System.out.print("Digite o segundo salário: ");
		String sal2 = entrada.nextLine().replace(",", ".");

		System.out.print("Digite o terceiro salário: ");
		String sal3 = entrada.nextLine().replace(",", ".");
		
		double media = Double.parseDouble(sal1);
		media = media + Double.parseDouble(sal2);
		media = media + Double.parseDouble(sal3);
		
		System.out.println("A média dos salários é: " + media / 3);
		
		entrada.close();
		
		
	}

}
