package entities;

public class ContaCorrente extends Conta{
	//Conta n�o precisa de um valor inicial como deposito!

	public ContaCorrente(int agencia, int conta) {
		super(agencia, conta);
	}
	
	public ContaCorrente(int agencia, int conta, double saldo) {
		super(agencia, conta, saldo);
	}
	
	
	
}
