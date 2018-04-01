package com.orz.dao;

import java.io.Serializable;
import java.util.List;

public interface GenericDao<T> {
	public void save(T entity);

	public void update(T entity);

	public void delete(Serializable id);

	public T findById(Serializable id);

	public List<T> findByHql(String hql, Object... params);
}
