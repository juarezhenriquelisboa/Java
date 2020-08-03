package br.com.fiap;

public class Arrays {
	public class Carro{
		public void setModelo() {
		}
	}
	
	public static void main(String[] args) {
		Carro[] carros = new Carro[5];
		
		Carro carro = new Carro();
		
		carros[0] = carro;
		
		for (Carro carro : carros) {
			System.out.println(carro);
		}
	}
}
