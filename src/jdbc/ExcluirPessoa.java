package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {

	public static void main(String[] args) throws SQLException {
		
		Scanner entrada = new Scanner(System.in);
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		System.out.print("Informe o código: ");
		int codigo = entrada.nextInt();
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
			
		if (stmt.executeUpdate() > 0) 		
			System.out.println("Pessoa excluída com sucesso!");
		else
			System.out.println("Nenhuma pessoa foi excluída.");
		
		entrada.close();
		conexao.close();
		
	}
}
