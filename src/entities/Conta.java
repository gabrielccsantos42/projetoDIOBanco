package entities;

public class Conta {
	protected int agencia;
	protected int conta;
	protected Double saldo;
	
	
	public Conta(int agencia, int conta) {
		this.agencia = agencia;
		this.conta = conta;
		saldo = 0.0;
	}
	
	public Conta(int agencia, int conta, double saldo) {
		this.agencia = agencia;
		this.conta = conta;
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
}
