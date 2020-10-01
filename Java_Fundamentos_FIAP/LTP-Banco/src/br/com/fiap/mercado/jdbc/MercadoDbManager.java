package br.com.fiap.mercado.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class MercadoDbManager {

	public static Connection obterConexao() {
		Connection conexao = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.0.2.15:1521:XE",
					"SYSTEM",
					"password");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conexao;
	}
}
