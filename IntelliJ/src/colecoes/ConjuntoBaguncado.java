package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		// O Hash aceita somente Objetos e não valores primitivos, então ele já transforma para Obj
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); // STring
		conjunto.add(1); // int -> Integer
		conjunto.add('x'); // char -> Character
		
		System.out.println("Tamanho é: " + conjunto.size());
		
		conjunto.add("Teste");
		System.out.println("Tamanho é: " + conjunto.size()); // continua o mesmo tamanho, pq não aceita repetição
		
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho é: " + conjunto.size()); // continua o mesmo tamanho, pq não aceita repetição

		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(false));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // União entre dois conjuntos
		conjunto.retainAll(nums);
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
	
}
