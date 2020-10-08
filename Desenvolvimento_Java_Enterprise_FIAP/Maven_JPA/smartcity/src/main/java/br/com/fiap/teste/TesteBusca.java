package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Fornecedor;

public class TesteBusca {

	public static void main(String[] args) {
		
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcity");
		EntityManager em = fabrica.createEntityManager();
		
		Fornecedor fornecedor = em.find(Fornecedor.class, 1);
//		Fornecedor fornecedor = new Fornecedor(1, "Atacadao");
		
		System.out.println(fornecedor.getCodigo() + " " + fornecedor.getNome());
		
//		fornecedor.setNome("Atacadinho");
//		em.merge(fornecedor);
		
		em.getTransaction().begin();
		em.getTransaction().commit();
		
		em.close();
		fabrica.close();
	}
}
