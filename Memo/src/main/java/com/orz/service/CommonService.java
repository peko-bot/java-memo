package com.orz.service;

import java.io.Serializable;
import java.util.List;

public interface CommonService<T> {
	public void save(T entity);

	public void update(T entity);

	public void delete(Serializable id);

	public T getById(Serializable id);

	public List<T> getByHql(String hql, Object... params);
}
