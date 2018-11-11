package br.com.fiap.spring.dao.impl;

import org.springframework.stereotype.Repository;

import br.com.fiap.spring.dao.GeneroDAO;
import br.com.fiap.spring.model.Genero;

/**
 *  Controller camda de view
 *  Repository = Camada de persistencia DAO
 *  Service = Camada de persistencia BO
 *  
 *  Controlando o ciclo de vida uns aos outros do projeto
 */


@Repository

public class GeneroDAOImpl extends GenericDAOImpl<Genero, Integer> implements GeneroDAO{

}
