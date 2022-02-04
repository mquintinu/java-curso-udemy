package colecoes;

import java.util.HashSet;

public class Hash {

	public static void main(String[] args) {
		
		HashSet<Usuario> user = new HashSet<Usuario>();
		
		user.add(new Usuario("Carlos"));
		user.add(new Usuario("Guilherme"));
		user.add(new Usuario("Rios"));
		
		boolean resultado = user.contains(new Usuario("Guilherme"));
		System.out.println(resultado);
	}
}
