package orientacaoObjeto.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		Arroz ingr1 = new Arroz(.200);
		Feijao ingr2 = new Feijao(.100);
		
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingr1);
		convidado.comer(ingr2);
		
		System.out.println(convidado.getPeso());
		
		Sorvete sobremesa = new Sorvete(0.4);
		
		convidado.comer(sobremesa);
		
		System.out.println(convidado.getPeso());
	}
}
