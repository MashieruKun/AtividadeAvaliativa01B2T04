package main.java.fag;

public class ProdutoEstoque {
	private String nome;
	private int qtd;
	
	public ProdutoEstoque(String nome, int qtd) {
		setNome(nome);
		setQtd(qtd);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome!=null && !nome.isBlank()) {
			this.nome = nome;
		}
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd(int qtd) {
		if(qtd>=0) {
			this.qtd = qtd;
		}
	}
	
	public void adicionarEstoque(int qutd) {
		qtd += qutd;
	}
	
	public void removerEstoque(int qutd) {
		if(qtd>=qutd) {
			qtd -= qutd;
		} else {
			System.out.println("saldo de retirada maior que saldo atual, por favor tente novamente");
		}
	}
}
