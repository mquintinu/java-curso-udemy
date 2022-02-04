package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Cláudio"); // se a fila estiver cheia, retorna false
		fila.offer("José"); // se a fila estiver cheia, lança uma exceção
		fila.add("Pedro");
		fila.offer("Carlos");
		fila.add("João");
		fila.offer("Maria");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek()); // se a fila estiver vazia, retorna nulo
		System.out.println(fila.element()); // se a fila estiver vazia, lança uma exceção
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains()
		
		System.out.println(fila.poll()); // Quando a fila está vazia, retorna NULL
		System.out.println(fila.remove()); // Quando a fila está vazia, lança exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}
