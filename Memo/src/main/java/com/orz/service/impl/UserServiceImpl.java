package com.orz.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orz.dao.Base_User_Dao;
import com.orz.po.Base_User;
import com.orz.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private Base_User_Dao userService;

	public Base_User getUserById(int id) {
		return userService.get(id);
	}
}
