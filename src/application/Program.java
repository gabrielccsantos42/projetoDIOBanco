package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {
	public static Scanner read = new Scanner(System.in);
	public static int conta, numero, operacao;
	public static double deposito, retirada;
	

	public static Cliente cliente;
	public static ContaCorrente acc;
	public static ContaPoupanca acp;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		
		
		System.out.println("*****Bem vindo ao Banco Digital Innovation*****");
		
		System.out.println("Vamos fazer seu cadastro: ");
		System.out.print("Digite seu nome: ");
		String name = read.nextLine();
		System.out.print("Digite seu CPF: ");
		String cpf = read.nextLine();
		
	    cliente = new Cliente(name, cpf);
		
		System.out.println("****CADASTRO FINALIZADO****");
		System.out.println("Escolha seu tipo de conta: ");
		System.out.println("1 - CONTA CORRENTE");
		System.out.println("2 - CONTA POUPANÇA");
		
		int tipoConta = read.nextInt();
		
		switch(tipoConta) {
			case 1:
				
				System.out.println("Sua agencia vai ser 1.");
				System.out.print("Escolha qual será sua conta: ");
				conta = read.nextInt();
				System.out.println("Dejesa fazer um deposito inicial?");
				System.out.println("1 - SIM");
				System.out.println("2 - NÃO");
				numero = read.nextInt();
				
				if(numero == 1) {
					System.out.println("Qual o valor do deposito?");
					double valorDeposito = read.nextDouble();
					
					acc = new ContaCorrente(conta, valorDeposito);
					
					imprimirOperacao();
					operacao = read.nextInt();
					operacaoContaCorrente(operacao);
				}
				else {
					acc = new ContaCorrente(conta);
					imprimirOperacao();
					operacao = read.nextInt();
					operacaoContaCorrente(operacao);
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
				
				imprimirOperacao(); 
				operacao = read.nextInt();
				operacaoContaPoupanca(operacao);
				break;
			default:
				System.out.println("Número invalido!.");
		}
		read.close();
	}
	
	public static void imprimirOperacao() {
		System.out.println("Deseja fazer alguma operação?");
		System.out.println("1 - DEPOSITO");
		System.out.println("2 - SAQUE");
		System.out.println("3 - TRANSFERENCIA");
	}
	public static void operacaoContaCorrente(int operacao) {
		switch(operacao) {
		case 1:
			System.out.println("Qual o valor do deposito?");
			deposito = read.nextDouble();
			acc.deposito(deposito);
			break;
		case 2: 
			System.out.println("Qual o valor do saque?");
			retirada = read.nextDouble();
			acc.saque(retirada);
			break;
		case 3:
			System.out.println("Qual o valor da transferencia?");
			retirada = read.nextDouble();
			acc.transferencia(retirada);
			break;
		default:
			System.out.println("Valor incorreto!.");
		}
		System.out.println("----EXTRATO----");
		System.out.println(cliente);
		System.out.println(acc);
	}
	public static void operacaoContaPoupanca(int operacao) {
			switch(operacao) {
			case 1:
				System.out.println("Qual o valor do deposito?");
				deposito = read.nextDouble();
				acp.deposito(deposito);
				break;
			case 2: 
				System.out.println("Qual o valor do saque?");
				retirada = read.nextDouble();
				acp.saque(retirada);
				break;
			case 3:
				System.out.println("Qual o valor da transferencia?");
				retirada = read.nextDouble();
				acp.transferencia(retirada);
				break;
			default:
				System.out.println("Valor incorreto!.");
		}
		System.out.println("----EXTRATO----");
		System.out.println(cliente);
		System.out.println(acp);
	}
}
