package br.com.fiap.dao;

import java.util.List;

import javax.persistence.EntityManager;

import br.com.fiap.entity.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Integer> {

	public ClienteDAO(EntityManager em) {
		super(em);
	}
	
	public List<Cliente> listarClientes(){
//		return em.createQuery("select c from Cliente c", Cliente.class)
		return em.createQuery("from Cliente", Cliente.class)
					.getResultList();
	}
	
	public List<Cliente> listarPorNome(int inicio, int fim){
		return em.createQuery("from Cliente c order by nome", Cliente.class)
				.setFirstResult(inicio)
				.setMaxResults(fim)
				.getResultList();
	}
	
	public List<Cliente> buscarPorNome(String nome){
		return em.createQuery("from Cliente c where c.nome like :stringNome ", 
				Cliente.class)
				.setParameter("stringNome", "%"+nome+"%")
				.getResultList(); // .getSingleResult()
	}
	
	public long contarClientes() {
		return em.createQuery("select count(c) from Cliente c)", Long.class)
				.getSingleResult();
	}
	
	public int removerCliente(String nome) {
		em.getTransaction().begin();
		int total = em.createQuery("delete Cliente c where c.nome = :d")
		.setParameter("d", nome)
		.executeUpdate();
		em.getTransaction().commit();
		return total;
	}
	
}
