package fundamentos.desafios;

public class DesafioAritmeticos {
	
	public static void main(String[] args) {
			
		Double resultado;
		Double PrimeiraParte, SegundaParte;
		
		// Primeira parte
		
		PrimeiraParte = (double) (6 * (3 + 2));
		PrimeiraParte = Math.pow(PrimeiraParte, 2);
		PrimeiraParte = PrimeiraParte / (3 * 2);
		
		SegundaParte = (double) ((1 - 5) * (2- 7)) / 2;
		SegundaParte = Math.pow(SegundaParte, 2);
		
		System.out.println(PrimeiraParte);
		System.out.println(SegundaParte);
		
		resultado = PrimeiraParte - SegundaParte;
		resultado = Math.pow(resultado, 3);
		resultado = resultado / Math.pow(10, 3);
		
		System.out.println("O resultado é: " + resultado);
					
	}

}
