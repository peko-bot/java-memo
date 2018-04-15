package com.orz.dao;

import java.util.List;

public interface GenericDao<T, PK> {
	T get(int id);

	List<T> findAll();

	void persist(T entity);

	void save(T entity);

	void saveOrUpdate(T entity);

	void flush();
}
