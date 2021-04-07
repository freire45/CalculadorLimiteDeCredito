package br.com.erickfreire.calculadorlimitedecredito;

import java.util.Scanner;

public class Teste {
	public static void main(String[] args) {
		String numeroConta;
		double saldoIni;
		double totalItensDebitadosConta;
		double totalCreditoNaconta;
		double limiteDeCredito;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula o cr�dito da conta de um cliente: ");
		
		System.out.print("Informe o n�mero da conta: ");
		numeroConta = entrada.nextLine();
		
		System.out.print("Informe o saldo inicial da conta: ");
		saldoIni = entrada.nextDouble();
		
		System.out.print("Informe o total de d�bitos da conta: ");
		totalItensDebitadosConta = entrada.nextDouble();
		
		System.out.print("Informe o total de cr�dito na conta: ");
		totalCreditoNaconta = entrada.nextDouble();
		
		System.out.print("Informe o total de limite de cr�dito: ");
		limiteDeCredito = entrada.nextDouble();
		
		CalculadorLimiteDeCredito c1 = new CalculadorLimiteDeCredito(numeroConta, saldoIni, totalItensDebitadosConta, totalCreditoNaconta, limiteDeCredito);
	
	    c1.novoSaldo();
	}

}
