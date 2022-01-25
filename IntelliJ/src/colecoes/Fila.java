package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		fila.add("Cl�udio"); // se a fila estiver cheia, retorna false
		fila.offer("Jos�"); // se a fila estiver cheia, lan�a uma exce��o
		fila.add("Pedro");
		fila.offer("Carlos");
		fila.add("Jo�o");
		fila.offer("Maria");
		
		System.out.println(fila.peek());
		System.out.println(fila.peek()); // se a fila estiver vazia, retorna nulo
		System.out.println(fila.element()); // se a fila estiver vazia, lan�a uma exce��o
		System.out.println(fila.element());
		
		// fila.size();
		// fila.clear();
		// fila.isEmpty();
		// fila.contains()
		
		System.out.println(fila.poll()); // Quando a fila est� vazia, retorna NULL
		System.out.println(fila.remove()); // Quando a fila est� vazia, lan�a exce��o
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
	}

}
