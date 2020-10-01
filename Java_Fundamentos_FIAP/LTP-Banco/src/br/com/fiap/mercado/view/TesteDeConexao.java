package br.com.fiap.mercado.view;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteDeConexao {

	public static void main(String[] args) {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection conexao = DriverManager.getConnection(
					"jdbc:oracle:thin:@10.0.2.15:1521:XE",
					"SYSTEM",
					"password");
			
			System.out.println("Conectou!");
			
//			PreparedStatement pstmt = conexao.prepareStatement(
//					"INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE)"
//					+  "VALUES (SEQ_PRODUTO.NEXTVAL, ?, ?, ?)");
					
//			pstmt.setString(1,  "Maça");
//			pstmt.setFloat(2,  8);
//			java.sql.Date data = new java.sql.Date(new java.util.Date().getTime());
//			pstmt.setDate(3, data);
//			pstmt.executeUpdate();
			
//			pstmt = conexao.prepareStatement("UPDATE T_PRODUTO SET VL_PRODUTO = ? WHERE CD_PRODUTO = ?");
//			pstmt.setFloat(1,  11);
//			pstmt.setInt(2, 81);
//			pstmt.executeUpdate();
//			
//			pstmt = conexao.prepareStatement("DELETE FROM T_PRODUTO WHERE CD_PRODUTO = ?");
//			pstmt.setInt(1, 23);
//			pstmt.executeUpdate();
			
//			Statement stmt = conexao.createStatement();
//			stmt.executeUpdate(
//					"INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE)"
//					+  "VALUES (SEQ_PRODUTO.NEXTVAL, 'Uva', 18, to_date('17/08/2020', 'dd/mm/yyyy'))");
//			
//			String sqlUpdate = "UPDATE T_PRODUTO SET VL_PRODUTO = 13 WHERE CD_PRODUTO = 2";
//			stmt.executeUpdate(sqlUpdate);
//					
//			pstmt = conexao.prepareStatement("SELECT * FROM T_PRODUTO WHERE CD_PRODUTO = ? ");
//			pstmt.setInt(1,  23);
//			ResultSet result = pstmt.executeQuery();
			
			
//			pstmt = conexao.prepareStatement("SELECT * FROM T_PRODUTO");
//			ResultSet result = pstmt.executeQuery();
			
			PreparedStatement pstmt = conexao.prepareStatement("SELECT * FROM T_PRODUTO");
			ResultSet result = pstmt.executeQuery();
			
			while (result.next()) {
				
				System.out.println( result.getInt("cd_produto") + " " + 
									result.getString("nm_produto") + " " +
									result.getDouble("vl_produto") + " " +
									result.getDate("dt_validade"));
			
			}
//			
//			String sqlDelete = "DELETE FROM T_PRODUTO WHERE CD_PRODUTO = 1";
//			stmt.executeUpdate(sqlDelete);
			
						
			conexao.close();
			
		} catch (SQLException e) {
			System.err.println("Não foi possível conectar!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("O Driver não foi encontrado!");
			e.printStackTrace();
		}
		
	}
}
