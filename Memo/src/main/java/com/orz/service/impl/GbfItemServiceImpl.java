package com.orz.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orz.dao.Base_User_Dao;
import com.orz.dao.Gbf_Info_Dao;
import com.orz.po.GBF_Item_Info;
import com.orz.service.GbfItemService;

@Service
@Transactional
public class GbfItemServiceImpl implements GbfItemService {
	@Autowired
	private Gbf_Info_Dao itemService;

	@Autowired
	private Base_User_Dao userService;

	public void save(List<GBF_Item_Info> giis, String gbf_id, Date now) {
		// Base_User user = userService.get(gbf_id);
		// System.out.println(user.getId());

		for (GBF_Item_Info gii : giis) {
			gii.setPatch(gbf_id + new SimpleDateFormat("yyyyMMddHHmmss").format(now));
			gii.setCreate_time(now);
			// gii.setUser_id(user.getId());
			gii.setUser_id(1);

			System.out.println(gii.getName());
			itemService.save(gii);
		}
	}
}
