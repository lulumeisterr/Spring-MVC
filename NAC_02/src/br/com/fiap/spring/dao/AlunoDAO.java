package br.com.fiap.spring.dao;

import java.util.List;

import br.com.fiap.bean.Aluno;


public interface AlunoDAO extends GenericDAO<Aluno, Integer>{

	// Realizando a pesquisa
	
	List<Aluno> BuscarPorNome(String nome);
	
}
