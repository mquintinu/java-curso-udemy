package generics;

public class ParesTeste {

    public static void main(String[] args) {
        Pares<Integer, String> resultadoConcurso = new Pares<>();

        resultadoConcurso.adicionar(1, "Maria");
        resultadoConcurso.adicionar(2, "João");
        resultadoConcurso.adicionar(3, "Gal");
        resultadoConcurso.adicionar(4, "Leonardo");
        resultadoConcurso.adicionar(2, "Suzana");

        System.out.println(resultadoConcurso.getValor(1));
        System.out.println(resultadoConcurso.getValor(2));
        System.out.println(resultadoConcurso.getValor(4));
    }
}
