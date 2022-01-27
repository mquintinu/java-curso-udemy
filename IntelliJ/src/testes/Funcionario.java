package testes;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class Funcionario {
    private final String nome;
    private final LocalDate dataAdmissao;
    private BigDecimal salario;

    public Funcionario(String nome, LocalDate dataAdmissao, BigDecimal salario) {
        this.nome = nome;
        this.dataAdmissao = dataAdmissao;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void reajustarSalario(BigDecimal reajuste) {
        if (reajuste.compareTo(BigDecimal.ZERO) == 0)
            throw new IllegalArgumentException("Reajuste chegou zerado.");
        else {
            this.salario = this.salario.add(reajuste);
            arredondarSalario();
        }
    }

    private void arredondarSalario() {
        this.salario = this.salario.setScale(2, RoundingMode.HALF_UP);
    }


}
