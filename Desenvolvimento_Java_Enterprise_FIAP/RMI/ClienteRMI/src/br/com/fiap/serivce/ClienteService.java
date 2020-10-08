package br.com.fiap.serivce;

import java.rmi.Remote;
import java.rmi.RemoteException;

import br.com.fiap.entity.Cliente;

public interface ClienteService extends Remote {
	
	Cliente buscar(int id) throws RemoteException;
	
	

}
