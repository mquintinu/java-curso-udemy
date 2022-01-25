package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	public static void main(String[] args) {
		
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + " !!");
		
		Produto p1 = new Produto("Sardinha enlatada", 4.99, 0.1);
		Produto p2 = new Produto("Chá de Limão", 1.99, 0.5);
		Produto p3 = new Produto("Prato florido", 33, 0.0);
		Produto p4 = new Produto("Mouse", 42.99, 0.1);
		Produto p5 = new Produto("Pop Funko Super-man", 110.99, 0.2);
		
		imprimirNome.accept(p1);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
		
		
		
	}
}
