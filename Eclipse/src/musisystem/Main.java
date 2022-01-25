package musisystem;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("*** MusiSystem ***\n");
		System.out.println("----------------------------------------------------------------");
		
		System.out.println(">> MÚSICOS: \n");
		
		Pessoa pessoa = new Pessoa();		
		Instrumento i1 = new Instrumento("Teclado");
		Instrumento i2 = new Instrumento("Piano");
				
		pessoa.cadastrarPessoa("Mateus Quintino", "mateusq1@hotmail.com", "16982216853", i1);
		pessoa.cadastrarPessoa("Suzana Manoel", "suzana_manoel@ubs.com", "16982456453", i2);
		pessoa.cadastrarPessoa("Joice Cunhada", "joca@matematica.com", "1699915467");
		
		pessoa.getListaPessoas();
		
		System.out.println("----------------------------------------------------------------");
		System.out.println(">> INSTRUMENTOS: \n");
		pessoa.instrumento.getListaInstrumentos();
		System.out.println();		
		
		System.out.println("----------------------------------------------------------------");
		System.out.println(">> REPERTÓRIO: \n");
		
		//Repertorio rep = new Repertorio();
		Musica musica1 = new Musica("Stay With Me", "Sam Smith");
		Musica musica2 = new Musica("Aquarela", "Toquinho");
		
		musica1.addMusica(musica1);
		musica1.addMusica(musica2);
		
		musica1.getListaMusicas();
		musica2.getListaMusicas();
		System.out.println();
	}
}
