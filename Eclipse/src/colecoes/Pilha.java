package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("1984");
		livros.push("Tom Sawyer");
		livros.push("Harry Potter");
		
		for (String l : livros) {
			System.out.println(l);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll()); // false
		System.out.println(livros.pop()); // exceção
		System.out.println(livros.remove()); // exceção
		
		// livros.size();
		// livros.clear();
		// livros.contains("");
		// livros.isEmpty();
			
	}
}
