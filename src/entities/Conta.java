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
	
	public double deposito(double deposito) {
		System.out.println("Deposito realizado com sucesso!");
		return saldo + deposito;
	}
	
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
