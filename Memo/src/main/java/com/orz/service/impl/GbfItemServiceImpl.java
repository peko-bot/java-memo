package com.orz.service.impl;

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

	public void save(List<GBF_Item_Info> giis) {
		for (GBF_Item_Info gii : giis) {
			System.out.println(gii.getName());
			itemService.save(gii);
		}
	}

}
