package com.orz.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.orz.po.GBF_Item_Info;
import com.orz.service.GbfItemService;

@Controller
@RequestMapping("/gbf")
public class GbfController {
	@Autowired
	private GbfItemService itemService;

	@RequestMapping(value = "/test", produces = { "application/json;charset=UTF-8" })
	@ResponseBody
	public String getPage(Model model, @RequestParam(value = "patch") String patch) {
		List<GBF_Item_Info> items = itemService.getByPatch(patch);

		return JSON.toJSONString(items);
	}

	@RequestMapping(value = "/i_item", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public String i_item_info(Model model, @RequestParam(value = "data") String items,
			@RequestParam("user_id") String user_id) {
		List<GBF_Item_Info> giis = JSONArray.parseArray(items, GBF_Item_Info.class);

		itemService.save(giis, user_id, new Date());

		return "success";
	}

	// 获得指定名称及时段item的数据
	@RequestMapping(value = "/s_charts", method = RequestMethod.GET)
	@ResponseBody
	public String s_charts(Model model, @RequestParam(value = "name") String name,
			@RequestParam(value = "begin_time") Date beginTime, @RequestParam(value = "end_time") Date endTime) {
		List<GBF_Item_Info> lists = itemService.getByNameAndTime(name, beginTime, endTime);

		return null;
	}
}
