package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Mateus Quintino", 8.8);
        Aluno a2 = new Aluno("Suzana Manoel", 8.9);
        Aluno a3 = new Aluno("Guilherme Baldo", 7.2);
        Aluno a4 = new Aluno("Gabriel Rios", 6.4, false);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) ->{
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        System.out.println("O melhor aluno é: "+ alunos.stream().max(melhorNota).get());
        System.out.println("O pior aluno é: "+ alunos.stream().min(melhorNota).get());

    }
}
