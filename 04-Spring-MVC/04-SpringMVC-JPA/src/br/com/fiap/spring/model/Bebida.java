package br.com.fiap.spring.model;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "T_FIAP_BEBIDA")
@SequenceGenerator(name="bebida" , sequenceName="SQ_T_BEBIDA" , allocationSize = 1)

public class Bebida implements Serializable{
		
	private static final long serialVersionUID = 7951552977471065119L;

	@Id
	@Column(name="cd_bebida")
	@GeneratedValue(generator = "bebida" , strategy=GenerationType.SEQUENCE)
	private int codigo;
	
	@Column(name = "nm_bebida")
	private String nome;
	
	@Column(name = "st_alcoolico")
	private boolean alcoolico;
	
	// Formatando a data
	@DateTimeFormat(pattern ="dd/mm/yyyy")
	
	@Temporal(TemporalType.DATE)
	@Column(name = "dt_validade")
	private Calendar validade;

	
	public Bebida() {
		
	}
	
	
	public Bebida(int codigo, String nome, boolean alcoolico, Calendar validade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.alcoolico = alcoolico;
		this.validade = validade;
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

	public boolean isAlcoolico() {
		return alcoolico;
	}

	public void setAlcoolico(boolean alcoolico) {
		this.alcoolico = alcoolico;
	}

	public Calendar getValidade() {
		return validade;
	}

	public void setValidade(Calendar validade) {
		this.validade = validade;
	}
	
	

}
