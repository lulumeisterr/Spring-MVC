package br.com.fiap.model;

public class Aluno {
	
	private String nome;
	private String plano;
	private boolean matricula;
	private String genero;
	

	public Aluno(String nome, String plano, boolean matricula, String genero) {
		super();
		this.nome = nome;
		this.plano = plano;
		this.matricula = matricula;
		this.genero = genero;
	}


	public Aluno() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPlano() {
		return plano;
	}
	public void setPlano(String plano) {
		this.plano = plano;
	}
	public boolean isMatricula() {
		return matricula;
	}
	public void setMatricula(boolean matricula) {
		this.matricula = matricula;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}

	
	
}
