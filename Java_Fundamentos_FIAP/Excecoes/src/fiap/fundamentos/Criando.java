package fiap.fundamentos;

public class Criando extends Exception{

	int saldo = 0;

	public void depositar(double valor){		
		if (valor < 0){
		  throw new IllegalArgumentException();
		}
		saldo += valor;
	}
	
	public void sacar(double valor) throws Exception{
		if (valor > saldo){
		  throw new Exception("Saldo insuficiente");
		}
		saldo -= valor;
	}
	
	public static void main(String[] args) {
//		try {
//		  // Saca
//		 c.sacar(100);
//		} catch (Exception e) {
//		  e.printStackTrace();
//		}
//		// Deposita
//		c.depositar(200);
	}
}
