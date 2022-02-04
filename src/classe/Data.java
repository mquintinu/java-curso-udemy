package classe;

public class Data {

	int dia, mes, ano;
	String varGlobal;
	
	// Construtor padrão
	Data(){
		//dia = 1;
		//mes = 1;
		//ano = 1970;
		this(1, 1, 1970); // Posso usar o THIS dentro de um Construtor para chamar outro.
	}
	
	Data(int dia, int mes, int anoInicial){
		this.dia = dia; // o This traz os atributos da classe, lá de cima.
		this.mes = mes;
		ano = anoInicial;
	}
	
	
	
	String obterDataFormatada(){
		final String formato = "%d/%d/%d"; // Variável CONSTANTE e LOCAL
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		varGlobal = "Olá variável global!";
		System.out.println(this.obterDataFormatada());
	}
	
	/*static void teste() {
		this.dia = 3; // Aqui eu nao consigo usar o THIS, pq o método é STATIC.
	}*/
}
