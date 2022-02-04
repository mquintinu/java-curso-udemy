package testes;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;

// Não há como chamar esse método
import org.junit.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
// import static org.junit.jupiter.api.Assertions.assertEquals; // É DIFERENTE

public class ReajusteServiceTest {

    private ReajusteService service;
    private Funcionario funcionario;

    @Before // Antes de chamar cada teste, chama esse método.
   // @BeforeEach -- NÃO EXISTE NESSA VERSÃO DO JUNIT
    public void inicializar(){
        System.out.println("Iniciando teste...");
        this.service = new ReajusteService();
        this.funcionario = new Funcionario("Mateus", LocalDate.now(), new BigDecimal("1000.00"));
    }

    @After // Após cada teste.
    public void finalizar(){
        System.out.println("Fim do teste!");
    }

    // @BeforeAll // Antes de todos (aparentemente não funciona sem o JUnit5)

    @Test
    public void reajuste3Porcento_DesempADesejar(){
        service.concederReajuste(funcionario, Desempenho.A_DESEJAR);
        // Testa igualdade
        assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());
    }

    @Test
    public void reajuste3Porcento_DesempBOM(){
        service.concederReajuste(funcionario, Desempenho.BOM);
        // Testa igualdade
        assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());
    }

    @Test
    public void reajuste3Porcento_DesempOTIMO(){
        service.concederReajuste(funcionario, Desempenho.OTIMO);
        // Teste igualdade
        assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());
    }

    @Test
    public void reajuste3Porcento_DesempESPETACULAR(){
        service.concederReajuste(funcionario, Desempenho.ESPETACULAR);
        // Testa igualdade
        assertEquals(new BigDecimal("1400.00"), funcionario.getSalario());
    }

    @Test
    public void reajusteZerado() {
        // Testar Exceptions
        assertThrows(IllegalArgumentException.class,
                () -> service.concederReajuste(funcionario, Desempenho.ZERADO));
    }

}
