package com.orz.service.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.orz.dao.Gbf_Info_Dao;
import com.orz.po.GBF_Item_Info;
import com.orz.service.GbfItemService;

@Service
@Transactional
public class GbfItemServiceImpl implements GbfItemService {
	@Autowired
	private Gbf_Info_Dao itemService;

	public void save(List<GBF_Item_Info> giis, String user_id, Date now) {
		for (GBF_Item_Info gii : giis) {
			gii.setPatch(user_id + new SimpleDateFormat("yyyyMMddHHmmss").format(now));
			gii.setCreate_time(now);
			gii.setUser_id(user_id);
			itemService.save(gii);
		}
	}
}
