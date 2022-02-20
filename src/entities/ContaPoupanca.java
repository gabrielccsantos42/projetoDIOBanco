package entities;

public class ContaPoupanca extends Conta{
	//Conta poupança obriga a instanciar o saldo e multiplicar pelo rendimento de 0.005;
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
	public String saque(double saque) {
		if(saldo < saque) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= saque;
			return "Saque realizado!";
		}
		return null;
	}
	
	@Override
	public String transferencia(double transferencia) {
		if(saldo < transferencia) {
			System.out.println("Transferencia insuficiente");
		}
		else {
			saldo -= transferencia;
			return "Transferencia realizada!";
		}
		return null;
	}
}
