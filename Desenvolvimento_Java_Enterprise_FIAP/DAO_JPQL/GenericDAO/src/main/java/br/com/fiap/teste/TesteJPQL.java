package br.com.fiap.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class TesteJPQL {
	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.
				createEntityManagerFactory("GenericDAO");
		
		EntityManager em = fabrica.createEntityManager();
		
		ClienteDAO dao = new ClienteDAO(em);
		
		int total = dao.removerCliente("Juarez");
		System.out.println("Qtd removido: " + total);
		
		List<Cliente> lista = dao.listarPorNome(1, 1);
		
		for (Cliente cliente : lista) {
			System.out.println(cliente.getId() + " " + cliente.getNome());
		}
		
		System.out.println("Busca por nome: ");
		
		List<Cliente> lista_nomes = dao.buscarPorNome("Thiago");
		
		for (Cliente cliente : lista_nomes) {
			System.out.println(cliente.getNome());
		}
		
		System.out.println("Quantidade de clientes: " + dao.contarClientes());
		
		em.close();
		fabrica.close();
	}
}
