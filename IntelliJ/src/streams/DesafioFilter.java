package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Scarlett Johansson", 37);
		Pessoa p2 = new Pessoa("Jennifer Lawrence", 31);
		Pessoa p3 = new Pessoa("Ana de Armas", 33);
		Pessoa p4 = new Pessoa("Gal Gadot", 36);
		Pessoa p5 = new Pessoa("Emma Stone", 33);
		
		List<Pessoa> atrizes = Arrays.asList(p1, p2, p3, p4, p5);
			
		Predicate<Pessoa> nomeGrande = n -> n.nome.length() > 10;
		Predicate<Pessoa> idadeMenor35 = p -> p.idade < 35;
		
		Function<Pessoa, String> mostraMsg = p -> "A " + p.nome + " tem " + p.idade +" anos.";
				
		atrizes.stream()
		.filter(nomeGrande)
		.filter(idadeMenor35)	
		.map(mostraMsg)
		.forEach(System.out::println);
    }
}
