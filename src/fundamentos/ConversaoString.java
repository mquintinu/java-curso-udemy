package fundamentos;

import javax.swing.JOptionPane;

public class ConversaoString {
	
	public static void main(String[] args) {
		
		String vlr1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String vlr2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		
		System.out.println(vlr1 + vlr2);
		
		double nro1 = Double.parseDouble(vlr1);
		double nro2 = Double.parseDouble(vlr2);
		
		double soma = nro1 + nro2;
		System.out.println("Soma é: " + soma);
		System.out.println("Média é: " + soma / 2);

	}

}
