package fiap.fundamentos;

public class UsandoStatic {
	public static void main(String[] args) {

		  ModificadorStatic a1 = new ModificadorStatic();
		  a1.entrar("Thiago");
		  
		  ModificadorStatic a2 = new ModificadorStatic();
		  a2.entrar("Leandro");
		  
		  int total = ModificadorStatic.recuperarTotal();
		  System.out.println("Total " + total);
		    
		}
}
