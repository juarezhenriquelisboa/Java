package br.com.fiap.banco;

public class Banco {

	public static void main(String[] args) {
		Conta conta = new Conta();
		Conta cc = new ContaCorrente(11, "tipo");

//		cc.saldo = 1000;
//		cc.agencia = 123;
//		cc.numero = 321;
		
		conta.retirar(10);
		System.out.println(conta.getSaldo());
		
		cc.retirar(10);
		System.out.println(cc.getSaldo());
		
		Conta poupanca = new Conta(111);
		poupanca.depositar(50);
		System.out.println(poupanca.getSaldo());
		
	}
}
