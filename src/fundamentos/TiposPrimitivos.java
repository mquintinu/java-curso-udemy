package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		
		// FUNCIONÁRIO
		
		// numéricos
		byte anosDeEmpresa = 23; // vai até 128
		short numeroDeVoos = 327;
		int id = 56789;
		long pontosAcumulados = 3_245_123_124L; // os underlines separam as casas, o L diz que é um Long
		
		// reais
		float salario = 11_445.41F; // o F indica que é Float.
		double vendasAcumuladas = 2_952_542_773.01;
		
		boolean ferias = true;
		
		// texto
		char status = 'A';
		
		// Usando as variáveis
		System.out.println(anosDeEmpresa * 365);
		System.out.println(numeroDeVoos / 2);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + " ganha = " + salario);
		System.out.println("Férias? " + ferias);
		System.out.println("Status: " + status);
		
	}
}
