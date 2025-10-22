package main.java.fag;

import main.java.fag.ContaBancaria;
import main.java.fag.Filme;
import main.java.fag.Funcionario;
import main.java.fag.Retangulo;
import main.java.fag.Musica;
import main.java.fag.Pessoa;
import main.java.fag.ContaLuz;
import main.java.fag.BicicletaAlugada;
import main.java.fag.ProdutoEstoque;
import main.java.fag.Temperatura;

public class Principal {
	public static void main(String[] args) {
		//contaBancaria();
		//filmes();
		//funcionario();
		//retangulo();
		//musica();
		//pessoa();
		//contaLuz();
		//bicicletaAlugada();
		//produtoEstoque();
		temperatura();
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
	
	public static void musica() {
		Musica musicaUm = new Musica("Are You Ready to Swim?", 189);
		Musica musicaDois = new Musica("Maquina do Tempo", 196);
		System.out.println("Titulo: " + musicaUm.getTitulo() + " Duracao: " + musicaUm.formatarDuracao());
		System.out.println("Titulo: " + musicaDois.getTitulo() + " Duracao: " + musicaDois.formatarDuracao());
	}
	
	public static void pessoa() {
		Pessoa pessoa = new Pessoa("Laura", 65.0, 1.66);
		System.out.println("Nome: " + pessoa.getNome() + " IMC: " + pessoa.calcularIMC() + " Classificação: " + pessoa.classificacaoIMC());
	}
	
	public static void contaLuz() {
		ContaLuz contaLuz = new ContaLuz(50.7, 90.8);
		System.out.println("Consumo de KW: " + contaLuz.getConsumoKwh() + " Valor por Hora: " + contaLuz.getValorKwh() + " Valor a pagar: " + contaLuz.calcularValorTotal());
	}
	
	public static void bicicletaAlugada() {
		BicicletaAlugada bicicletaAlugada = new BicicletaAlugada(2, 15);
		System.out.println("Tempo de Uso: " + bicicletaAlugada.getHoras() + " Valor a Hora: " + bicicletaAlugada.getValorHr() + " Valor a pagar: " + bicicletaAlugada.calcularValor());
	}
	
	public static void produtoEstoque() {
		ProdutoEstoque produto = new ProdutoEstoque("bolacha", 0);
		produto.adicionarEstoque(30);
		produto.removerEstoque(40);
		produto.removerEstoque(15);
		System.out.println("Nome: " + produto.getNome() + " Estoque: " + produto.getQtd());
	}
	
	public static void temperatura() {
		Temperatura temperatura = new Temperatura(20.0);
		System.out.println("Temperatura em Celsius: " + temperatura.getCelsius() + " Temperatura em Fahrenheit: " + temperatura.paraFahrenheit() + " Temperatura em Kelvin: " + temperatura.paraKelvin());
	}
}