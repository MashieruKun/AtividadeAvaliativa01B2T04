package main.java.fag;

import main.java.fag.ContaBancaria;

public class Principal {
	public static void main(String[] args) {
		contaBancaria();
	}
	
	public static void contaBancaria() {
		ContaBancaria ContaBancaria = new ContaBancaria("Laura");
		ContaBancaria.depositar(100);
		ContaBancaria.sacar(101);
		System.out.println("saldo atual da conta de " + ContaBancaria.getTitular() + " é de: " + ContaBancaria.getSaldo());
	}
}