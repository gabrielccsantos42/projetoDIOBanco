package entities;

public class ContaPoupanca extends Conta{
	//Conta poupança obriga a instanciar o saldo e multiplicar pelo rendimento de 0.005;
	private double rendimento = 0.005;
	
	public ContaPoupanca(int agencia, int conta, double saldoRendimento) {
		super(agencia, conta, saldoRendimento);	
	}
}
