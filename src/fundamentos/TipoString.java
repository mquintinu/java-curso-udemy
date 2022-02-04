package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat(" !!!"));
		System.out.println(s + " !!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Mateus";
		var sobrenome = "Quintino";
		var idade = 27;
		var salario = 5584.35;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + " Idade: " + idade + " Salário: " + salario);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		
		String frase = String.format("O senhor %s %s tem %d anos e ganha R$ %.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		String f = "Frase qualquer";
		System.out.println(f.contains("qual"));
		System.out.println(f.indexOf("qual"));
		System.out.println(f.substring(6));
		System.out.println(f.substring(6, 10));
	}
}
