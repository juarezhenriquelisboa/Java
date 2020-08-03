package fiap.fundamentos;

public class Propagando {
	public int dividir(int n1, int n2) throws Exception {
		try {
		  return n1 / n2;
		} catch (ArithmeticException e) {
		  e.printStackTrace();
		}
		return 0;
	}
}
