package com.orz.dao;

import java.util.Date;
import java.util.List;

import com.orz.po.GBF_Item_Info;

public interface Gbf_Info_Dao {
	public GBF_Item_Info getById(int id);

	public List<GBF_Item_Info> getByPatch(String patch);

	public void save(GBF_Item_Info gii);

	public List<GBF_Item_Info> getChartsByNameAndTime(String name, Date beginTime, Date endTime);
}
