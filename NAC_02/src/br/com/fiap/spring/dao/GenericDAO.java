package br.com.fiap.spring.dao;

import java.util.List;

import br.com.fiap.spring.exception.KeyNotFoundException;

public interface GenericDAO<T,K> {

	void create(T entity);
	T read(K id);
	void update(T entity);
	void delete(K id) throws KeyNotFoundException;
	
	List<T> list();
	
	
}