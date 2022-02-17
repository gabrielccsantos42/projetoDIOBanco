package entities;

public class ContaPoupanca extends Conta{
	//Conta poupan�a obriga a instanciar o saldo e multiplicar pelo rendimento de 0.005;
	private int agencia = 2;
	private double rendimento = 0.005;
	
	public ContaPoupanca(int conta, double saldoRendimento) {
		super(conta, saldoRendimento);	
	}
}
