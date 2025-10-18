package main.java.fag;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular) {
		setTitular(titular);
		saldo=0.00;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		if(titular != null && !titular.isBlank()) {
			this.titular = titular;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		if(saldo>=0.00) {
			this.saldo = saldo;

		}
	}
	
	public void depositar(double valor) {
		if(valor>0.00) {
			saldo+=valor;
		}
	}
	
	public void sacar(double valor) {
		if(valor>0.00 && valor<=saldo) {
			saldo-=valor;
		} else {
			System.out.println("o valor de saque não pode ser menor que 0,00 ou maior que o saldo atual da conta, por favor tente novamente!");
		}
	}
	
}
