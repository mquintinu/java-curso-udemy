package orientacaoObjeto.encapsulamento.casaA;

public class Paulo {
	
	void testeAcessos() {
		Ana esposa = new Ana();
		
		// System.out.println(esposa.segredo); esse é privado, não consigo acessar
		System.out.println(esposa.facoDentroDeCasa); // dentro do pacote
		System.out.println(esposa.formaDeFalar); // protected, por estar no mesmo pacote
		System.out.println(esposa.todosSabem); // public
	}
}
