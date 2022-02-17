package entities;

public class Conta {
	private Cliente cliente;
	protected int conta;
	protected Double saldo;
	
	
	public Conta(int conta) {
		this.conta = conta;
		saldo = 0.0;
	}
	
	public Conta(int conta, double saldo) {
		this.conta = conta;
		this.saldo = saldo;
	}
	
	public int getConta() {
		return conta;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	
}
