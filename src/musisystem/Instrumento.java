package musisystem;

import java.util.ArrayList;

public class Instrumento {

	String nome;
	ArrayList<Instrumento> listaInstrumentos = new ArrayList<Instrumento>();

	public Instrumento() {}
	public Instrumento(String nome) {
		this.nome = nome;
		
	}
	public void addInstrumento(Instrumento instrumento) {
		listaInstrumentos.add(instrumento);		
	}
	
	public void getListaInstrumentos() {
		
		for (Instrumento p: listaInstrumentos) {
			System.out.println("Instrumento: " + p.nome);			
		}		
	}	
}
