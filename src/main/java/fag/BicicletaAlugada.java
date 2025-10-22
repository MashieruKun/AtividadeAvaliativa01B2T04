package main.java.fag;

public class BicicletaAlugada {
	private int horas;
	private int valorHr;
	
	public BicicletaAlugada(int horas, int valorHr) {
		setHoras(horas);
		setValorHr(valorHr);
	}
	
	public int getHoras() {
		return horas;
	}
	
	public void setHoras(int horas) {
		if (horas >= 1) {
			this.horas = horas;
		}
	}
	
	public int getValorHr() {
		return valorHr;
	}
	
	public void setValorHr(int valorHr) {
		if (valorHr > 0) {
			this.valorHr = valorHr;
		}
	}
	
	public int calcularValor() {
		return horas * valorHr;
	}
}
