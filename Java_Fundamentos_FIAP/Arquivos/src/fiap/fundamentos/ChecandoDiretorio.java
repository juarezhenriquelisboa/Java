package fiap.fundamentos;import java.io.File;
import java.io.IOException;

public class ChecandoDiretorio {
	public static void main(String[] args) {
		File diretorio = new File("fiap");
		
		if (diretorio.exists()) {
			System.out.println("Diretório existe!");
		} else {
			if (diretorio.mkdir()) {
				System.out.println("Diretório criado");
			} else {
				System.out.println("Dretório não criado");
			}
		}
		
		File arquivo = new File(diretorio, "file.txt");
		
		try {
			if (arquivo.createNewFile()) {
				System.out.println("Arquivo criado!");
			} else {
				System.out.println("Arquivo não criado!");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
