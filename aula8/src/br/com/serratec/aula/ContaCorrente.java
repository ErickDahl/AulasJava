package br.com.serratec.aula;

public class ContaCorrente implements Conta {
	private String numero;
	private double saldo;

	public ContaCorrente(String numero, double saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "ContaCorrente [numero=" + numero + ", saldo=" + saldo + "]";
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public boolean saqueConta(double valor) {
		if (saldo < valor) {
			throw new SaldoNegativo("Valor Inválido!! ");
		} else {
			saldo -= valor;
			return true;
		}

	}

	@Override
	public void depositaConta(double valor) {
		saldo += valor;
	}

}
