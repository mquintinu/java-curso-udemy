package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Julia {
	Ana sogra = new Ana();
	
	void testeAcessos() {
		
		// System.out.println(esposa.segredo); // esse � privado, n�o consigo acessar
		// System.out.println(esposa.facoDentroDeCasa); // outro pacote
		// System.out.println(sogra.formaDeFalar); // N�o consigo
		// System.out.println(sogra.formaDeFalar); // N�o consigo
		System.out.println(sogra.todosSabem); // public
	}
}
