package com.orz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.orz.po.GBF_Item_Info;
import com.orz.service.GbfItemService;

@Controller
@RequestMapping("/gbf")
public class GbfController {
	// @Autowired
	// private UserService userService;

	@Autowired
	private GbfItemService itemService;

	@RequestMapping(value = "/test")
	@ResponseBody
	public String getPage(Model model, @RequestParam(value = "id") int id) {
		// Base_User user = userService.getUserById(1);
		GBF_Item_Info items = itemService.getById(id);

		return JSON.toJSONString(items);
	}

	// @RequestMapping(value = "/i_item", method = RequestMethod.POST)
	// @ResponseBody
	// @CrossOrigin
	// public String i_item_info(Model model, @RequestParam(value = "data") String
	// items,
	// @RequestParam("user_id") String user_id) {
	// List<GBF_Item_Info> giis = JSONArray.parseArray(items, GBF_Item_Info.class);
	//
	// try {
	// itemService.save(giis, user_id, new Date());
	//
	// return "success";
	// } catch (Exception e) {
	// return e.toString();
	// }
	// }
}
