package br.com.fiap.bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity(name = "T_TREINO_NAC")
@SequenceGenerator(name="orc",allocationSize=1)
public class Aluno implements Serializable{

	private static final long serialVersionUID = -3642541214790045743L;
	
	@Id
	@GeneratedValue(generator="orc",strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_aluno")
	private String nome;
	
	@Column(name="ds_senha")
	private String senha;
	
	// Formatando a data
	@DateTimeFormat(pattern ="dd/mm/yyyy")
	@Temporal(TemporalType.DATE)
	@Column(name="dt_inscricao")
	private Calendar data;
	
	@Column(name="ds_aluno")
	private String descricao;
	
	@Column(name="ds_status")
	private boolean aprovado;
	
	public Aluno() {
		
	}

	public Aluno(int codigo, String nome, String senha, Calendar data, String descricao, boolean aprovado) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.senha = senha;
		this.data = data;
		this.descricao = descricao;
		this.aprovado = aprovado;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public boolean isAprovado() {
		return aprovado;
	}

	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}

	
	
	
}
