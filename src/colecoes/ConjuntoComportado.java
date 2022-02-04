package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		//Set<String> lista = new HashSet<>();
		SortedSet<String> lista = new TreeSet<>(); // O Tree aceita ordenação o HashSet não.
		
		lista.add("Suzana");
		lista.add("Tiago");
		lista.add("Raquel");
		lista.add("Beatriz");
		
		for(String nome : lista) {
			System.out.println(nome); // mostra em ordem alfabetica.
		}
		
		Set<Integer> nums = new HashSet<>();
		
		nums.add(1);
		nums.add(123);
		nums.add(4);
		nums.add(98);
		
		for (int n : nums) {
			System.out.println(n);
		}
	}

}
