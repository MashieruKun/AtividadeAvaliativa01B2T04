package main.java.fag;

public class Musica {
	private String titulo;
	private int duracaoSegundos;
	
	public Musica(String titulo, int duracaoSegundos) {
		setTitulo(titulo);
		setDuracaoSegundos(duracaoSegundos);
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		if(titulo!=null && !titulo.isBlank()) {
			this.titulo = titulo;			
		}
	}
	
	public int getDuracaoSegundos() {
		return duracaoSegundos;
	}
	
	public void setDuracaoSegundos(int duracaoSegundos) {
		if(duracaoSegundos>0) {
			this.duracaoSegundos = duracaoSegundos;
		}
	}
	
	public String formatarDuracao() {
		int min = duracaoSegundos / 60;
		int seg = duracaoSegundos % 60;
		String tempoFormatado = String.format("%02d:%02d", min, seg);
		return tempoFormatado;
	}
}
