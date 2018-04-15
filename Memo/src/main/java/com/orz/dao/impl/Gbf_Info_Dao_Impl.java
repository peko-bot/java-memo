package com.orz.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orz.dao.Gbf_Info_Dao;
import com.orz.po.GBF_Item_Info;

@Repository
public class Gbf_Info_Dao_Impl implements Gbf_Info_Dao {
	@Autowired
	private SessionFactory sessionFactory;

	private Session getCurrentSession() {
		return this.sessionFactory.openSession();
	}

	public GBF_Item_Info load(int id) {
		return (GBF_Item_Info) getCurrentSession().load(GBF_Item_Info.class, id);
	}

	public GBF_Item_Info get(int id) {
		return (GBF_Item_Info) getCurrentSession().get(GBF_Item_Info.class, id);
	}

	public List<GBF_Item_Info> findAll() {
		return null;
	}

	public void persist(GBF_Item_Info entity) {
		getCurrentSession().persist(entity);
	}

	public void save(GBF_Item_Info entity) {
		getCurrentSession().save(entity);
	}

	public void saveOrUpdate(GBF_Item_Info entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	public void delete(int id) {
		GBF_Item_Info GBF_Item_Info = load(id);
		getCurrentSession().delete(GBF_Item_Info);
	}

	public void flush() {
		getCurrentSession().flush();
	}
}
