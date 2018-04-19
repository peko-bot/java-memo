package com.orz.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orz.dao.Base_User_Dao;
import com.orz.po.Base_User;

@Repository
public class Base_User_Dao_Impl implements Base_User_Dao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.openSession();
	}

	public Base_User load(Long id) {
		return (Base_User) getCurrentSession().load(Base_User.class, id);
	}

	public Base_User get(int id) {
		return (Base_User) getCurrentSession().get(Base_User.class, id);
	}

	public Base_User get(String gbf_id) {
		return (Base_User) getCurrentSession().get(Base_User.class, gbf_id);
	}

	public List<Base_User> findAll() {
		return null;
	}

	public void persist(Base_User entity) {
		getCurrentSession().persist(entity);
	}

	public void save(Base_User entity) {
		getCurrentSession().save(entity);
	}

	public void saveOrUpdate(Base_User entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(Long id) {
		Base_User Base_User = load(id);
		getCurrentSession().delete(Base_User);
	}

	public void flush() {
		getCurrentSession().flush();
	}
}
