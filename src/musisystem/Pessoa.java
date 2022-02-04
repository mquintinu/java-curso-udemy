package musisystem;

import java.util.ArrayList;

public class Pessoa {
	
	String nome, email, telefone;	
	ArrayList<Pessoa> listaPessoas = new ArrayList<Pessoa>();
	Instrumento instrumento = new Instrumento();
	
	Pessoa(){}
	
	public void cadastrarPessoa(Pessoa p) {
		listaPessoas.add(p);
	}
	
	public void cadastrarPessoa(Pessoa p, Instrumento i) {
		listaPessoas.add(p);
		instrumento.addInstrumento(i);
	}
	
	public void cadastrarPessoa(String nome, String email, String telefone, Instrumento i) {
		listaPessoas.add(new Pessoa(nome, email, telefone));
		instrumento.listaInstrumentos.add(i);
	}
	
	public void cadastrarPessoa(String nome, String email, String telefone) {
		listaPessoas.add(new Pessoa(nome, email, telefone));
	}
	
	public void getListaPessoas() {
		
		for (Pessoa p: listaPessoas) {
			System.out.println("Nome: " + p.nome);
			System.out.println("E-mail: " + p.email);
			System.out.println("Telefone: " + p.telefone);
			System.out.println();
		}		
	}	

	
	Pessoa (String nome, String email, String telefone){
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
