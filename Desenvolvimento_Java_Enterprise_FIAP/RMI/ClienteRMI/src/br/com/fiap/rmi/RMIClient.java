package br.com.fiap.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.fiap.entity.Cliente;
import br.com.fiap.serivce.ClienteService;

public class RMIClient {
	public static void main(String[] args) throws Exception {
		
		Registry registry = LocateRegistry.getRegistry("192.168.2.46", 8080);
	
		ClienteService service = (ClienteService) registry.lookup("cliente");
		
		Cliente cliente = service.buscar(1);
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		
	}
}
