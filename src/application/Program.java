package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner read = new Scanner(System.in);
		
		Cliente cliente;
		ContaCorrente acc;
		ContaPoupanca acp;
		
		int conta, numero;
		double deposito, retirada;
		
		System.out.println("*****Bem vindo ao Banco Digital Innovation*****");
		
		System.out.println("Vamos fazer seu cadastro: ");
		System.out.print("Digite seu nome: ");
		String name = read.nextLine();
		System.out.print("Digite sua idade: ");
		int idade = read.nextInt();
		System.out.print("Digite seu CPF: ");
		int cpf = read.nextInt();
		
	    cliente = new Cliente(name, idade, cpf);
		
		System.out.println("****CADASTRO FINALIZADO****");
		System.out.println("Escolha seu tipo de conta: ");
		System.out.println("1 - CONTA CORRENTE \n 2 - CONTA POUPANÇA");
		
		int tipoConta = read.nextInt();
		
		switch(tipoConta) {
			case 1:
				
				System.out.println("Sua agencia vai ser 1.");
				System.out.print("Escolha qual será sua conta: ");
				conta = read.nextInt();
				System.out.println("Dejesa fazer um deposito inicial?");
				numero = read.nextInt();
				
				if(numero == 1) {
					System.out.println("Qual o valor do deposito?");
					double valorDeposito = read.nextDouble();
					
					acc = new ContaCorrente(conta, valorDeposito);
					
					//SUBROTINA OPERAÇÃO
				}
				else {
					acc = new ContaCorrente(conta);
					//SUBROTINA OPERAÇÃO
					
				}
				break;
			case 2:
				System.out.println("OBS: Será obrigado a depositar!");
				System.out.println("Sua agencia vai ser 2.");
				System.out.print("Escolha qual será sua conta: ");
				conta = read.nextInt();
				System.out.println("Qual o valor do deposito?");
				double valorDeposito = read.nextDouble();
					
				acp = new ContaPoupanca(conta, valorDeposito);
				
				//SUBROTINA OPERAÇÃO
				break;
			default:
				System.out.println("Número invalido!.");
		}
		
		//COMEÇO DA SUBROTINA
		System.out.println("Deseja fazer alguma operação?");
		System.out.println("1 - DEPOSITO \n 2 - SAQUE \n 3 - TRANSFERENCIA");
		int operacao = read.nextInt();
		switch(operacao) {
			case 1:
				System.out.println("Qual o valor do deposito?");
				deposito = read.nextDouble();
				
				break;
			case 2: 
				System.out.println("Qual o valor do saque?");
				retirada = read.nextDouble();
				
				break;
			case 3:
				System.out.println("Qual o valor da transferencia?");
				retirada = read.nextDouble();

				break;
			default:
				System.out.println("Valor incorreto!.");
		}
		//FINAL DA SUBROTINA
		
		read.close();
	}

}
