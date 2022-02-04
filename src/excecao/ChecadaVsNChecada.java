package excecao;

public class ChecadaVsNChecada {
    public static void main(String[] args) {

        try {
            geraErro1();
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Fim.");
    }

    static void geraErro1(){
        throw new RuntimeException("#01 - Ocorreu um erro");
    }

    static void geraErro2() throws Exception{
        throw new Exception("#02 - Ocorreu um erro");
    }
}
