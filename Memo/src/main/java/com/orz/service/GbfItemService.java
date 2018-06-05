package com.orz.service;

import java.util.Date;
import java.util.List;

import com.orz.po.GBF_Item_Info;

public interface GbfItemService {
	public void save(List<GBF_Item_Info> giis, String user_id, Date now);

	public GBF_Item_Info getById(int id);

	public List<GBF_Item_Info> getByPatch(String patch);

	public List<GBF_Item_Info> getByNameAndTime(String name, Date beginTime, Date endTime);
}
