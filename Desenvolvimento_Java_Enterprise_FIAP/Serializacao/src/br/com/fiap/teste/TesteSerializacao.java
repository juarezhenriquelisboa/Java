package br.com.fiap.teste;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import br.com.fiap.bean.Cliente;

public class TesteSerializacao {
	
	public static void main(String[] args) throws IOException {
	
		Cliente cliente = new Cliente("Poyatos", 1);
		
		FileOutputStream output = new FileOutputStream("objeto.txt"); 
		
		ObjectOutputStream out = new ObjectOutputStream(output);
		
		out.writeObject(cliente);
		
		out.close();
	}
}
