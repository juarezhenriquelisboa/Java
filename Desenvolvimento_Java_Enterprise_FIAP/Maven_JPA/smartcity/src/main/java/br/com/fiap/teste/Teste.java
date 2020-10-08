package br.com.fiap.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.entity.Fornecedor;
import br.com.fiap.entity.Produto;

public class Teste {

	public static void main(String[] args) {
		
//		Persistence.createEntityManagerFactory("smartcity").createEntityManager();
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("smartcity");
		EntityManager em = fabrica.createEntityManager();
		
		Fornecedor fornecedor = new Fornecedor();
		fornecedor.setNome("Atacadao");
		
		try {
			em.persist(fornecedor);
			em.getTransaction().begin();
			em.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}
		}

		em.close();
		fabrica.close();

	}

}
