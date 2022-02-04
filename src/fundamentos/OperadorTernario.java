package fundamentos;

public class OperadorTernario {

	public static void main(String[] args) {
		
		double media = 5.6;
		
		String resultado = media >= 7.0 ? "aprovado." : "reprovado";
		
		System.out.println("O aluno está " + resultado);
		
		//
		double nota = 9.9;
		
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String r = temDesconto ? "Sim" : "Não";
		
		System.out.printf("Tem desconto? %s", r);
		
	}
}
