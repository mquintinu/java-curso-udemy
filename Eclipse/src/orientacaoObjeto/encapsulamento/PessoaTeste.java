package orientacaoObjeto.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Mateus Quintino", 27);
		
		p1.setIdade(250);
		System.out.println(p1);
	}

}
