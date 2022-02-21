package generics;

public class CaixaIntTeste {
    @SuppressWarnings("unchecked")
	public static void main(String[] args) {

        @SuppressWarnings("rawtypes")
		CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);

        System.out.println(caixaA.abrir());
    }
}
