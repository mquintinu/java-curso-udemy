package orientacaoObjeto.encapsulamento.casaB;

import orientacaoObjeto.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	Ana mae = new Ana();
	
	void testeAcessos() {
		
		// System.out.println(esposa.segredo); // esse � privado, n�o consigo acessar
		// System.out.println(esposa.facoDentroDeCasa); // outro pacote
		// System.out.println(esposa.formaDeFalar); // por instancia eu n�o consigo acessar
		System.out.println(super.formaDeFalar); // consigo, pois veio pela heran�a
		System.out.println(todosSabem); // public		
	}
	
}
