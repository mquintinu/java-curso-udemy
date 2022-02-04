package fundamentos;

public class Switch {
	
	public static void main(String[] args) {
		
		String faixa = "vermelha";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja":
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
		}
		
		int nota = 10;
		String conceito = "";
		
		switch (nota) {
		case 10: case 9:
			conceito = "A";
			break;
		case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5:
			conceito = "C";
			break;
		case 4: case 3:
			conceito = "D";
			break;	
		case 2: case 1: case 0:
			conceito = "E";
			break;			
		default:
			conceito = "não informado.";
			
		}
		System.out.println("Conceito = " + conceito);
	}

}
