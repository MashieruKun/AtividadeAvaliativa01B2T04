package main.java.fag;

public class Pessoa {
	private String nome;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, double peso, double altura) {
		setNome(nome);
		setPeso(peso);
		setAltura(altura);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome!=null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso>0) {
			this.peso = peso;
		}
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if(altura>0) {
			this.altura = altura;
		}
	}
	
	public double calcularIMC() {
		return peso / (altura * altura);
	}
		
	public String classificacaoIMC() {
		String classificacao = "";
		if (peso/(altura*altura) < 18.5) {
			classificacao = "Abaixo do Peso";
		}
		if (peso/(altura*altura) > 18.5 && peso/(altura*altura) < 24.9) {
			classificacao = "Peso Normal";
		}
		if (peso/(altura*altura) > 25 && peso/(altura*altura) < 29.9) {
			classificacao = "Sobrepeso";
		}
		if (peso/(altura*altura) > 30 && peso/(altura*altura) < 34.9) {
			classificacao = "Obesidade grau I";
		}
		if (peso/(altura*altura) > 35 && peso/(altura*altura) < 39.9) {
			classificacao = "Obesidade grau II";
		}
		if (peso/(altura*altura) > 40) {
			classificacao = "Obesidade grau III";
		}
		return classificacao;
	}
}
