package fiap.fundamentos;

public class ContaCorrente extends Conta{
	
	private double limite;
	
	@Override
	public void sacar(double valor) throws SaldoInsuficienteException{
		if (valor > saldo + limite) {
			throw new SaldoInsuficienteException();
		}
		saldo = saldo - valor;
	}
	
	@Override
	public double verificarSaldo() {
		return saldo + limite;
	}
}
