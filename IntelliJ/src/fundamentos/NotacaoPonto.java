package fundamentos;

public class NotacaoPonto {
	
	public static void main(String[] args) {
		
		String s = "Bom dia, X";
		s = s.replace("X", "Scarlett");
		s = s.toUpperCase();
		s = s.concat(" Johansson");
		
		System.out.println(s);
		
		String y = "Olá senhor X".toUpperCase().replace("X", "Mateus");
		System.out.println(y);
	}

}
