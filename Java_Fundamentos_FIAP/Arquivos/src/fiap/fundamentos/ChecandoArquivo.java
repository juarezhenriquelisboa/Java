package fiap.fundamentos;

import java.io.File;
import java.io.IOException;

public class ChecandoArquivo {
	public static void main(String[] args) {
		File arquivo = new File("arquivo.txt");
		
		if (arquivo.exists()) {
			System.out.println("O arquivo existe!");
			System.out.println("Pode ser lido: " + arquivo.canRead());
			System.out.println("Pode ser escrito: " + arquivo.canWrite());
			System.out.println("Tamanho: " + arquivo.length());
			System.out.println("Caminho: " + arquivo.getPath());
		} else {
			 try {
				 if (arquivo.createNewFile()) {
					 System.out.println("Arquivo criado!");
				 } else {
					 System.out.println("Arquivo não criado");
				 }
			 } catch (IOException e) {
				 e.printStackTrace();
			 }
		}
	}
}
