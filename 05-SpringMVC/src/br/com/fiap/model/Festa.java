package br.com.fiap.model;

public class Festa {

	private int Id;
	private int qtdPessoa;
	private String end;
	private boolean lembra;
	private String cardapio;
	
	public Festa() {
		
	}
	
	
	
	public Festa(int id, int qtdPessoa, String end, boolean lembra, String cardapio) {
		super();
		Id = id;
		this.qtdPessoa = qtdPessoa;
		this.end = end;
		this.lembra = lembra;
		this.cardapio = cardapio;
	}

	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getQtdPessoa() {
		return qtdPessoa;
	}
	public void setQtdPessoa(int qtdPessoa) {
		this.qtdPessoa = qtdPessoa;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public boolean isLembra() {
		return lembra;
	}
	public void setLembra(boolean lembra) {
		this.lembra = lembra;
	}
	public String getCardapio() {
		return cardapio;
	}
	public void setCardapio(String cardapio) {
		this.cardapio = cardapio;
	}
	
	
	
}
