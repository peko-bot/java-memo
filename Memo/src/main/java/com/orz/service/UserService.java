package com.orz.service;

import com.orz.po.Base_User;

public interface UserService extends CommonService<Base_User> {
	public String getUser(int id);
}
