package entities;

public class ContaCorrente extends Conta{
	//Conta não precisa de um valor inicial como deposito!
	private int agencia = 1;

	public ContaCorrente(int conta) {
		super(conta);
	}
	
	public ContaCorrente(int conta, double saldo) {
		super(conta, saldo);
	}
	
	
	
}
