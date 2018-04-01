package com.orz.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orz.dao.GenericDao;
import com.orz.service.CommonService;

@Service("commonService")
@Transactional
public class CommonServiceImpl<T> implements CommonService<T> {
	private GenericDao<T> dao;

	@Resource
	public void setDao(GenericDao<T> dao) {
		this.dao = dao;
	}

	public void save(T entity) {
		dao.save(entity);
	}

	public void update(T entity) {
		dao.update(entity);
	}

	public void delete(Serializable id) {
		dao.delete(id);
	}

	public T getById(Serializable id) {
		return dao.findById(id);
	}

	public List<T> getByHql(String hql, Object... params) {
		return dao.findByHql(hql, params);
	}

}
