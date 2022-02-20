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
	
	@Override
	public double deposito(double deposito) {
		return saldo + deposito;
	}
	
	@Override
	public String saque(double saque) {
		if(saldo < saque) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= saque + 2.5;
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
