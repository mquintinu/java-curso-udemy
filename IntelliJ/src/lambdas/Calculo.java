package lambdas;

@FunctionalInterface // Isso mostra que a Interface é funcional, ou seja, pode ter somente um método.
public interface Calculo {

	public abstract double executar(double a, double b);
	
	default String metodoDefault() {
		return "Método Default";
	}
	
	static String metodoEstatico() {
		return "Médoto Estático";
	}
}