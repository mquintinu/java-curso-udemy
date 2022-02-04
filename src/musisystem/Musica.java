package musisystem;

import java.util.ArrayList;

public class Musica {

	String nome, artista;
	ArrayList<Musica> listaMusicas = new ArrayList<Musica>();
	
	public Musica(String nome, String artista) {
		this.nome = nome;
		this.artista = artista;
	}
	
	public void addMusica(Musica musica) {
		listaMusicas.add(musica);		
	}	
	
	public void getListaMusicas() {
		
		for (Musica m: listaMusicas) {
			System.out.println("Artista: " + m.artista + " - Música: " + m.nome );
		}		
	}	
}
