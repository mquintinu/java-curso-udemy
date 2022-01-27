package fundamentos.desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digita o dia da semana: ");
		String dia = entrada.next();
		
		if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(1);
		}
		else if (dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("ter�a")) {
			System.out.println(2);
		}
		else if("quarta".equalsIgnoreCase(dia)) {
			System.out.println(4);
		}
		else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}		
		else if(dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		}		
		else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("s�bado")) {
			System.out.println(7);
		}		
		else
			System.out.println("Dia inv�lido");

		entrada.close();
	}
}