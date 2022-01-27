package colecoes;

import java.util.ArrayList;

public class Lista {

	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Mateus");
		
		lista.add(u1);
		lista.add(new Usuario("Suzana"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Scarlett"));
		lista.add(new Usuario("Trinity"));
		
		System.out.println(lista.get(3));
		
		lista.remove(1);
		System.out.println(lista.remove(new Usuario("Trinity")));
		
		System.out.println("Cont�m? " +lista.contains(new Usuario ("Scarlett")));
		
		for (Usuario usuario : lista) {
			System.out.println(usuario.nome);
			System.out.println(usuario);
		}
	}
}
