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
import com.orz.po.Base_User;
import com.orz.po.GBF_Item_Info;
import com.orz.service.GbfItemService;
import com.orz.service.UserService;

@Controller
@RequestMapping("/gbf")
public class GbfController {
	@Autowired
	private UserService userService;

	@Autowired
	private GbfItemService itemService;

	@RequestMapping("/test")
	@ResponseBody
	public String getPage(Model model) {
		Base_User user = userService.getUserById(1);

		return JSON.toJSONString(user);
	}

	@RequestMapping(value = "/i_item", method = RequestMethod.POST)
	@ResponseBody
	@CrossOrigin
	public String i_item_info(Model model, @RequestParam(value = "data") String items,
			@RequestParam("user_id") String user_id) {
		List<GBF_Item_Info> giis = JSONArray.parseArray(items, GBF_Item_Info.class);

		try {
			itemService.save(giis, user_id, new Date());

			return "success";
		} catch (Exception e) {
			return e.toString();
		}
	}
}
