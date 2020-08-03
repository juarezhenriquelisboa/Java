package colecoes.fiap;

import java.util.ArrayList;

public class Colecao_ArrayList {
	public static void main(String[] args) {
		ArrayList lista = new ArrayList();
		
		lista.add("LTP");
		lista.add("Web");
		lista.add("Algoritmos");
	
		System.out.println(lista);
	
		lista.set(2, "Estrutura de Dados");
		System.out.println(lista);
		
		lista.remove(1);
		
		System.out.println(lista);
		
		System.out.println(lista.get(0));
		
		for (int i = 0; i < lista.size(); i++) {
		    System.out.println(lista.get(i));
		}
		
		int indice = lista.indexOf("LTP");

		System.out.println("O valor LTP está na posição: " + indice);
	}
}
