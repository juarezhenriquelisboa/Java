package br.com.fiap.mercado.view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import java.sql.Connection;

import br.com.fiap.mercado.dao.ProdutoDAO;
import br.com.fiap.mercado.dao.ProdutoDAOImpl;
import br.com.fiap.mercado.entity.Produto;
import br.com.fiap.mercado.jdbc.MercadoDbManager;

public class TesteCrudDinamico {

	public static void main(String[] args) {

		try {
			
			ProdutoDAO dao = new ProdutoDAOImpl();
			
			Produto produto = new Produto();
			produto.setNome("Banana");
			produto.setValor(6);
			Calendar calendar = new GregorianCalendar(2021, 8, 20);
			produto.setDataValidade(calendar);
			
//			dao.gravar(produto);
			
//			produto.setCodigo(101);
//			produto.setValor(15);
			
//			dao.atualizar(produto);
			
//			System.out.println("O Produto foi gravado!");
			
			List<Produto> produtos = dao.buscarTodos();
			
			for(Produto prod: produtos) {
				System.out.println(prod.toString());
			}
			
		} catch (Exception e) {
			System.err.println("Erro!");
			e.printStackTrace();
		}

	}

}
