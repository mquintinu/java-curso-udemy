package jdbc;

public class DAOTeste {

	public static void main(String[] args) {
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (codigo, nome) VALUES (?, ?)";
		
		System.out.println(dao.incluir(sql, 1000, "João da Silva"));
		System.out.println(dao.incluir(sql, 1001, "Jesus Cristo"));
		System.out.println(dao.incluir(sql, 1002, "Winston Julia"));
		System.out.println(dao.incluir(sql, 1003, "OBrian Partido"));			
		
		dao.close();
	}
}
