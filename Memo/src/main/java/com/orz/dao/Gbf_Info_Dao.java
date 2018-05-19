package com.orz.dao;

import java.util.List;

import com.orz.po.GBF_Item_Info;

public interface Gbf_Info_Dao {
	public GBF_Item_Info getById(int id);

	public List<GBF_Item_Info> getByPatch(String patch);

}
