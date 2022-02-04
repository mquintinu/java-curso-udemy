package lambdas;

@FunctionalInterface // Isso mostra que a Interface � funcional, ou seja, pode ter somente um m�todo.
public interface Calculo {

	double executar(double a, double b);
	
	default String metodoDefault() {
		return "M�todo Default";
	}
	
	static String metodoEstatico() {
		return "M�doto Est�tico";
	}
}