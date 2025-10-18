package main.java.fag;

public class Filme {
	private String titulo;
	private double avaliacao;
	
	public Filme(String titulo, double avaliacao) {
		setTitulo(titulo);
		setAvaliacao(avaliacao);
	}
	
	public double getAvaliacao() {
		return avaliacao;
	}
	
	public void setAvaliacao(double avaliacao) {
		if(avaliacao>=0.00 && avaliacao<=5.00) {
			this.avaliacao = avaliacao;
		}
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if(titulo!=null && !titulo.isBlank())
		this.titulo = titulo;
	}
	
	public String exibir() {
		return "Filme: " + titulo + " | Avaliação: " + avaliacao;
	}
	
}
