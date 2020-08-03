package br.com.fiap;

public class Repeticao {
	public static void main(String[] args) {
		int numero = 0;
		
		while (numero < 3) {
			numero += 1;
			System.out.println(numero);
		}
		
		do {
			numero -= 1;
			System.out.println(numero);
		} while (numero > 0);
		
		for (int i=0; i<=3; i++) {
			System.out.println(i);
		}
	}	
}
