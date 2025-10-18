package main.java.fag;

import main.java.fag.ContaBancaria;
import main.java.fag.Filme;

public class Principal {
	public static void main(String[] args) {
		//contaBancaria();
		filmes();
	}
	
	public static void contaBancaria() {
		ContaBancaria ContaBancaria = new ContaBancaria("Laura");
		ContaBancaria.depositar(100);
		ContaBancaria.sacar(101);
		System.out.println("saldo atual da conta de " + ContaBancaria.getTitular() + " é de: " + ContaBancaria.getSaldo());
	}
	
	public static void filmes() {
		Filme filmeUm = new Filme("Interstellar", 4.89);
		
		Filme filmeDois = new Filme("Gente Grande", 3.50);
		
		System.out.println(filmeUm.exibir());
		
		System.out.println(filmeDois.exibir());
	}
}