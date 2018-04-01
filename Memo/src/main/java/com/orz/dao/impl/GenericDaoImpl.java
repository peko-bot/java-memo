package com.orz.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.orz.dao.GenericDao;

public class GenericDaoImpl<T> implements GenericDao<T> {
	private Class<T> clazz;

	@Autowired
	private SessionFactory sessionFactory;

	protected Session getSession() {
		System.out.println(this.sessionFactory.getCurrentSession());
		return this.sessionFactory.getCurrentSession();
	}

	public void save(T entity) {
		this.getSession().save(entity);
	}

	public void update(T entity) {
		this.getSession().update(entity);
	}

	public void delete(Serializable id) {
		this.getSession().delete(this.findById(id));
	}

	@SuppressWarnings("unchecked")
	public T findById(Serializable id) {
		return (T) this.getSession().get(this.clazz, id);
	}

	@SuppressWarnings("unchecked")
	public List<T> findByHql(java.lang.String hql, Object... params) {
		Query query = this.getSession().createQuery(hql);
		for (int i = 0; params != null && i < params.length; i++) {
			query.setParameter(i, params);
		}
		return query.list();
	}

}