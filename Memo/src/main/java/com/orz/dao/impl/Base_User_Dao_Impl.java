package com.orz.dao.impl;

import org.springframework.stereotype.Repository;

import com.orz.dao.Base_User_Dao;
import com.orz.po.Base_User;

@Repository
public class Base_User_Dao_Impl<T> extends GenericDaoImpl<Base_User> implements Base_User_Dao<T> {
}
