package localhost.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class EmployeeDbManager {
	
	public static Connection obterConexao() {
		
		Connection conexao = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conexao = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/udemy",
					"java",
					"password");
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
		
	}
}
