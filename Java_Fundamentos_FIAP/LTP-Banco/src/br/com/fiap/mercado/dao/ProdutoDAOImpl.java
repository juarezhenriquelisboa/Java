package br.com.fiap.mercado.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import br.com.fiap.mercado.entity.Produto;
import br.com.fiap.mercado.jdbc.MercadoDbManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProdutoDAOImpl implements ProdutoDAO {

	private Connection conexao;
	PreparedStatement pstmt = null;
	
	public void gravar(Produto produto) {
		try {
			conexao = MercadoDbManager.obterConexao();
			pstmt = conexao.prepareStatement(
			"INSERT INTO T_PRODUTO (CD_PRODUTO, NM_PRODUTO, VL_PRODUTO, DT_VALIDADE)"
			+  "VALUES (SEQ_PRODUTO.NEXTVAL, ?, ?, ?)");
			
			pstmt.setString(1, produto.getNome());
			pstmt.setFloat(2, produto.getValor());
			pstmt.setDate(3, new java.sql.Date(produto.getDataValidade().getTimeInMillis()));
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public List<Produto> buscarTodos(){
		
		List<Produto> produtos = new ArrayList<Produto>();
		ResultSet rs = null;
		
		try {
			conexao = MercadoDbManager.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_PRODUTO");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				java.sql.Date data = rs.getDate("DT_VALIDADE");
				Calendar dtValidade = Calendar.getInstance();
				dtValidade.setTimeInMillis(data.getTime());
				Produto produto = new Produto(rs.getInt("CD_PRODUTO"), rs.getString("NM_PRODUTO"),
											rs.getFloat("VL_PRODUTO"), dtValidade);
				produtos.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return produtos;
	}
	
	public Produto buscarTodosPorCodigo(int codigo) {
		
		List<Produto> produtos = new ArrayList<Produto>();
		ResultSet rs = null;
		
		try {
			conexao = MercadoDbManager.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM T_PRODUTO WHERE CD_PRODUTO = ?");
			pstmt.setInt(1, codigo);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				java.sql.Date data = rs.getDate("DT_VALIDADE");
				Calendar dtValidade = Calendar.getInstance();
				dtValidade.setTimeInMillis(data.getTime());
				Produto produto = new Produto(rs.getInt("CD_PRODUTO"), rs.getString("NM_PRODUTO"),
											rs.getFloat("VL_PRODUTO"), dtValidade);
				produtos.add(produto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return (Produto) produtos;
	}
	

	public void atualizar(Produto produto) {
		
		try {
			conexao = MercadoDbManager.obterConexao();
			pstmt = conexao.prepareStatement("UPDATE T_PRODUTO SET NM_PRODUTO = ?, VL_PRODUTO = ?, DT_VALIDADE = ? WHERE CD_PRODUTO = ?");
			pstmt.setString(1, produto.getNome());
			pstmt.setFloat(2, produto.getValor());
			pstmt.setDate(3, new java.sql.Date(produto.getDataValidade().getTimeInMillis()));
			pstmt.setInt(4, produto.getCodigo());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void remover(int codigo) {
		try {
			conexao = MercadoDbManager.obterConexao();
			pstmt = conexao.prepareStatement("DELETE FROM T_PRODUTO WHERE CD_PRODUTO = ?");
			pstmt.setInt(1, codigo);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}
