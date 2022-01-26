package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Match {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Mateus Quintino", 8.8);
        Aluno a2 = new Aluno("Suzana Manoel", 8.9);
        Aluno a3 = new Aluno("Guilherme Baldo", 7.2);
        Aluno a4 = new Aluno("Gabriel Rios", 6.4);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota > 7;

        System.out.println(alunos.stream().allMatch(aprovado)); // todos?
        System.out.println(alunos.stream().anyMatch(aprovado)); // algum?
        System.out.println(alunos.stream().noneMatch(aprovado)); // nenhum?
        System.out.println(alunos.stream().noneMatch(aprovado.negate())); // negando?

    }
}
