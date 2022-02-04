package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
    public static void main(String[] args) {
        List<String> langs = Arrays.asList("JS", "PHP", "Java", "C#");
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);

        String ultimaLinguagem = (String) ListaUtil.getUltimo1(langs);
        System.out.println(ultimaLinguagem);

        Integer ultimoNro = (Integer) ListaUtil.getUltimo1(nums);
        System.out.println(ultimoNro);

        String ultimaLinguagem2 = ListaUtil.getUltimo2(langs);
        System.out.println(ultimaLinguagem2);

        Integer ultimoNro2 = ListaUtil.<Integer>getUltimo2(nums);
        System.out.println(ultimoNro2);
    }
}
