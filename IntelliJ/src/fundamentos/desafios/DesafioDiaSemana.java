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
		else if (dia.equalsIgnoreCase("terca") || dia.equalsIgnoreCase("terça")) {
			System.out.println(2);
		}
		else if("quarta".equals(dia.toLowerCase())) {
			System.out.println(4);
		}
		else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		}		
		else if(dia.toLowerCase().equals("sexta")) {
			System.out.println(6);
		}		
		else if(dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
			System.out.println(7);
		}		
		else
			System.out.println("Dia inválido");

		entrada.close();
	}
}