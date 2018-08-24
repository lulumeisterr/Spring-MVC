package br.com.fiap.jpa.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.fiap.jpa.dao.BebidaDAO;
import br.com.fiap.spring.model.Bebida;

@Repository
public class BebidaDAOimpl extends GenericDAOImpl<Bebida, Integer> implements BebidaDAO{
	
	/**
	 *  Controller camda de view
	 *  Repository = Camada de persistencia DAO
	 *  Service = Camada de persistencia BO
	 *  
	 *  Controlando o ciclo de vida uns aos outros do projeto
	 */
	
	

}
