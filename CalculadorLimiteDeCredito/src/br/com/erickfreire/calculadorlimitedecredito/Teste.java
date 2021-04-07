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
		
		System.out.println("Programa que calcula o crédito da conta de um cliente: ");
		
		System.out.print("Informe o número da conta: ");
		numeroConta = entrada.nextLine();
		
		System.out.print("Informe o saldo inicial da conta: ");
		saldoIni = entrada.nextDouble();
		
		System.out.print("Informe o total de débitos da conta: ");
		totalItensDebitadosConta = entrada.nextDouble();
		
		System.out.print("Informe o total de crédito na conta: ");
		totalCreditoNaconta = entrada.nextDouble();
		
		System.out.print("Informe o total de limite de crédito: ");
		limiteDeCredito = entrada.nextDouble();
		
		CalculadorLimiteDeCredito c1 = new CalculadorLimiteDeCredito(numeroConta, saldoIni, totalItensDebitadosConta, totalCreditoNaconta, limiteDeCredito);
	
	    c1.novoSaldo();
	}

}
