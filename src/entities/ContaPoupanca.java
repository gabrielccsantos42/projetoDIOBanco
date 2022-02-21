package entities;

public class ContaPoupanca extends Conta{
	//Conta poupan�a obriga a instanciar o saldo e multiplicar pelo rendimento de 0.005;
	private int agencia = 2;
	private double rendimento = 0.005;
	
	public ContaPoupanca(int conta, double saldoRendimento) {
		super(conta, saldoRendimento);	
	}
	
	@Override
	public double deposito(double deposito) {
		return (saldo + deposito) * rendimento;
	}
	
	@Override
	public void saque(double saque) {
		if(saldo < saque) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= saque;
			System.out.println("Saque realizado");
		}
	}
	
	@Override
	public void transferencia(double transferencia) {
		if(saldo < transferencia) {
			System.out.println("Transferencia insuficiente");
		}
		else {
			saldo -= transferencia;
			System.out.println("Transferencia realizada");;
		}
	}
}
