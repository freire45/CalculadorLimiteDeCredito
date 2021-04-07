package br.com.erickfreire.calculadorlimitedecredito;


/**
 * Programa em Java que calcula o limite de crédito
 * @author Erick Freire
 * @version 1 - Criado em 07-04-2021
 */

public class CalculadorLimiteDeCredito {
	
	private String numeroConta;
	private double saldoIni;
	private double totalItensDebitadosConta;
	private double totalCreditoNaconta;
	private double limiteDeCredito;
	
	
	
	public CalculadorLimiteDeCredito(String numeroConta, double saldoIni, double totalItensDebitadosConta,
			double totalCreditoNaconta, double limiteDeCredito) {
		super();
		this.numeroConta = numeroConta;
		this.saldoIni = saldoIni;
		this.totalItensDebitadosConta = totalItensDebitadosConta;
		this.totalCreditoNaconta = totalCreditoNaconta;
		this.limiteDeCredito = limiteDeCredito;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldoIni() {
		return saldoIni;
	}
	public void setSaldoIni(double saldoIni) {
		this.saldoIni = saldoIni;
	}
	public double getTotalItensDebitadosConta() {
		return totalItensDebitadosConta;
	}
	public void setTotalItensDebitadosConta(double totalItensDebitadosConta) {
		this.totalItensDebitadosConta = totalItensDebitadosConta;
	}
	public double getTotalCreditoNaconta() {
		return totalCreditoNaconta;
	}
	public void setTotalCreditoNaconta(double totalCreditoNaconta) {
		this.totalCreditoNaconta = totalCreditoNaconta;
	}
	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}
	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	
	public void novoSaldo() {
		double ns = saldoIni + totalCreditoNaconta + limiteDeCredito - totalItensDebitadosConta;
		
		System.out.printf("O saldo da conta é de: %.2f%n", ns);
		
		if(ns < 0) {
			System.out.println("O saldo da conta foi excedido!");
		}
	}



}
