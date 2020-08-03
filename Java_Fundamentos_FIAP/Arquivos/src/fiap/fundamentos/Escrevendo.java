package fiap.fundamentos;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Escrevendo {
	public static void main(String[] args) {
		try {
			FileWriter stream = new FileWriter("arquivo.txt");
			PrintWriter print = new PrintWriter(stream);
			
			print.println("Teste");
			print.println("Escrevendo no arquivo");
			
			print.close();
			
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
