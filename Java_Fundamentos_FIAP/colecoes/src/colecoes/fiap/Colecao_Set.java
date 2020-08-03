package colecoes.fiap;

import java.util.HashSet;

public class Colecao_Set {
	public static void main(String[] args) {
		HashSet cursos = new HashSet<>();
		
		cursos.add("Java");
		cursos.add("C");
		cursos.add("Python");
		
		cursos.add("Java");
		
		System.out.println(cursos);
	}
}
