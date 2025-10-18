package main.java.fag;

import main.java.fag.ContaBancaria;
import main.java.fag.Filme;
import main.java.fag.Funcionario;
import main.java.fag.Retangulo;

public class Principal {
	public static void main(String[] args) {
		//contaBancaria();
		//filmes();
		//funcionario();
		retangulo();
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
	
	public static void funcionario() {
		Funcionario funcionario = new Funcionario("Laura", 2005);
		System.out.println("Funcionario(a): " + funcionario.getNome() + ", antigo Salario: " + funcionario.getSalario());
		funcionario.aumentarSalario(10);
		System.out.println("Funcionario(a): " + funcionario.getNome() + ", novo Salario: " + funcionario.getSalario());
	}
	
	public static void retangulo() {
		Retangulo retangulo = new Retangulo(5, 7);
		System.out.println("area do retangulo: " + retangulo.area());
		System.out.println("perimetro do retangulo: " + retangulo.perimetro());
	}
}