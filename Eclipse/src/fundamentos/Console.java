package fundamentos;

import java.util.Scanner;

public class Console {
	
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("MegaSena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		System.out.printf("Sal�rio: %.1f%n", 1234.56);
		System.out.printf("Nome: %s%n", "Mateus");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade);
		
		entrada.close();
		
	}
	

}
