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
	
	
	
	public int getAgencia() {
		return agencia;
	}


	@Override
	public double deposito(double deposito) {
		return saldo + deposito;
	}
	
	@Override
	public void saque(double saque) {
		if(saldo < saque) {
			System.out.println("Saldo insuficiente");
		}
		else {
			saldo -= saque + 2.5;
			System.out.println("Saque realizado");;
		}
	}
	
	@Override
	public void transferencia(double transferencia) {
		if(saldo < transferencia) {
			System.out.println("Transferencia insuficiente");
		}
		else {
			saldo -= transferencia;
			System.out.println("Transferencia concluida");
		}
	}
	
	public String toString() {
		return "Agencia: "
				+ getAgencia() + "\n" +
				"Conta: " 
				+ getConta() + "\n" +
				"Saldo: "
				+ getSaldo();
	}
}
