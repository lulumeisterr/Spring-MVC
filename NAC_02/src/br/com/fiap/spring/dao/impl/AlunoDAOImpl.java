package br.com.fiap.spring.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import br.com.fiap.bean.Aluno;
import br.com.fiap.spring.dao.AlunoDAO;

@Repository

/**
 *  Controller camda de view
 *  Repository = Camada de persistencia DAO
 *  Service = Camada de persistencia BO
 *  
 *  Controlando o ciclo de vida uns aos outros do projeto
 */

public class AlunoDAOImpl extends GenericDAOImpl<Aluno, Integer> implements AlunoDAO{

	@Override
	public List<Aluno> BuscarPorNome(String nome) {
		return em.createQuery("from T_TREINO_NAC where upper(nome) like upper(:n)",Aluno.class)
				.setParameter("n", "%"+nome+"%").getResultList();
	}



}
