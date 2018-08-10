package br.com.fiap.model;

public class Plano {

	private String plano;
	private String valor;
	private String texto;
	
	public Plano() {
		
	}
	
	
	
	
	public Plano(String plano, String valor, String texto) {
		super();
		this.plano = plano;
		this.valor = valor;
		this.texto = texto;
	}



	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	
	
}
