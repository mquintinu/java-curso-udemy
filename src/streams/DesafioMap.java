package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		Consumer<String> print = System.out::println;
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
		
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);
		
		print.accept(">>> N�meros Originais: ");
		nums.stream().map(n -> n.toString()).forEach(print);
		
		print.accept("");
		print.accept(">>> N�meros convertidos para Bin�rio: ");		
		nums.stream().map(n -> Integer.toBinaryString(n)).forEach(print);
		
		print.accept("");
		print.accept(">>> N�meros Bin�rios invertidos: ");
		nums.stream().map(Integer::toBinaryString).map(inverter).forEach(print);
		
		print.accept("");
		print.accept(">>> N�meros Bin�rios convertidos para Int: ");		
		
		nums.stream()
		.map(Integer::toBinaryString)
		.map(inverter)
		.map(binarioParaInt)
		.forEach(System.out::println);		
		
	}
}
