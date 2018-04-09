package com.orz.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T, PK extends Serializable> {
	T load(PK id);

	T get(int id);

	List<T> findAll();

	void persist(T entity);

	PK save(T entity);

	void saveOrUpdate(T entity);

	void delete(PK id);

	void flush();
}
