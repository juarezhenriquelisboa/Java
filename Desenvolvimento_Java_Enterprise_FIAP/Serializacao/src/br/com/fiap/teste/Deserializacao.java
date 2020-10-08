package br.com.fiap.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.fiap.bean.Cliente;

public class Deserializacao {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		FileInputStream input = new FileInputStream("objeto.txt");

		ObjectInputStream stream = new ObjectInputStream(input);
		
		Cliente cliente = (Cliente) stream.readObject();
		
		System.out.println(cliente.getId());
		System.out.println(cliente.getNome());
		
		stream.close();
	}
}
