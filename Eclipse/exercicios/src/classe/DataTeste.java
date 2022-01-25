package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		var d2 = new Data(15,12,1994);
		var d3 = new Data();
		
		d1.dia = 6;
		d1.mes = 1;
		d1.ano = 2022;
		
		System.out.println(d1.obterDataFormatada());
		
		d1.imprimirDataFormatada();					
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
		
	}
}
