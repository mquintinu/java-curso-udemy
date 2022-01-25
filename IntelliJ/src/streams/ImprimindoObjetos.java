package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");
		
		// Foreach
		System.out.println(">> Usando foreach: ");
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		// Iterator
		System.out.println("\n>> Usando Iterator: ");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		// Stream
		System.out.println("\n>> Usando Stream: ");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // La�o interno
	}
}
