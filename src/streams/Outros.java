package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Mateus Quintino", 8.8);
        Aluno a2 = new Aluno("Suzana Manoel", 8.9);
        Aluno a3 = new Aluno("Guilherme Baldo", 7.2);
        Aluno a4 = new Aluno("Gabriel Rios", 6.4);
        Aluno a5 = new Aluno("Joãozinho", 8.8);
        Aluno a6 = new Aluno("Gabriel Filipe", 9.1);
        Aluno a7 = new Aluno("Dionathan Ribeiro", 9.0);
        Aluno a8 = new Aluno("Mateus Quintino", 8.8);
        Aluno a9 = new Aluno("Suzana Manoel", 8.9);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8, a9);

        System.out.println("Distinct ");
        alunos.stream().distinct().forEach(System.out::println);

        System.out.println("\nSkip / Limit ");
        alunos.stream()
                .distinct()
                .skip(4) // pula 4 elementos
                .limit(2) // limita a 2 elementos
                .forEach(System.out::println);

     System.out.println("\nTake While");
        alunos.stream()
                .distinct()
                // .takeWhile(a -> a.nota >=7) // apenas Java 9+
                .forEach(System.out::println);


    }
}
