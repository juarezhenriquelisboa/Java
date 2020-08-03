package colecoes.fiap;

import java.util.HashMap;

public class Colecao_Map {
	public static void main(String[] args) {
		HashMap mapa = new HashMap();
		
		mapa.put("RM1", "João");
		mapa.put("RM2", "Maria");
		
		System.out.println(mapa);
		System.out.println(mapa.get("RM2"));
		mapa.remove("RM2");
		System.out.println(mapa);

	}
}
