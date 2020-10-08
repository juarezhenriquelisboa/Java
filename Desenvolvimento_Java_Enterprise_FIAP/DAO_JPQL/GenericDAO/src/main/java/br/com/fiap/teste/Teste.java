package br.com.fiap.teste;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.fiap.dao.ClienteDAO;
import br.com.fiap.entity.Cliente;

public class Teste {
	public static void main(String[] args) {
		
		EntityManager em = Persistence.
				createEntityManagerFactory("GenericDAO").createEntityManager();
		
		ClienteDAO clienteDao = new ClienteDAO(em);
		
		Cliente entidade = new Cliente(0, "Poyatos");
		clienteDao.cadastrar(entidade);
		
		try {
			clienteDao.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<Cliente> lista = clienteDao.listar();
		
		for (Cliente cliente : lista) {
			System.out.println(cliente.getId() + " " + cliente.getNome());
		}
		
	}
}
