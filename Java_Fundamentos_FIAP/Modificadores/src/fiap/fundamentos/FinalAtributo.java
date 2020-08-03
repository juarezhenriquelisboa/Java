package fiap.fundamentos;

public class FinalAtributo {
	public static void main(String[] args) {
		final double valor_pi = 3.14;
		
		System.out.println(valor_pi);
		
		valor_pi = 19; // não compila
	}
}
