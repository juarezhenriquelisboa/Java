package colecoes.fiap;

import java.util.ArrayList;

public class Generics_Types {
	public static void main(String[] args) {
		// definindo tipo de objetos (não serve para tipos primitivos)
		ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

		Cliente cliente1 = new Cliente();
		cliente1.setNome("Thiago");
		Cliente cliente2 = new Cliente();
		cliente2.setNome("João");

		listaCliente.add(cliente1);
		listaCliente.add(cliente2);

		for (int i = 0; i < listaCliente.size(); i++) {
		    Cliente cli = listaCliente.get(i); //Não é necessário o cast
		    System.out.println(cli.getNome());
		}
		
		for (Cliente cliente : listaCliente) {
			  System.out.println(cliente.getNome());
		}
	}
}
