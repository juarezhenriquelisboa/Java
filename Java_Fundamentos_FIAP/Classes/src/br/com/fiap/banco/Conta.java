package br.com.fiap.banco;

public class Conta {
	private int numero;
	private double saldo;
	private int agencia;
	
	public Conta() {
		
	}
	
	public Conta(int numero) {
		this.numero = numero;
	}
	
//	public Conta(int numero, int agencia, double valor) {
//		this.numero = numero;
//		this.agencia = numero;
//		this.saldo = valor;
//		System.out.println("Criando uma instância de Conta...");
//	}
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public void retirar(double valor) {
		this.saldo -= valor;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public double getSaldo() {
		return saldo;
	}
}
