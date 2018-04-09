package com.orz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.orz.po.Base_User;
import com.orz.service.UserService;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("/gbf")
public class GbfController {
	@Autowired
	private UserService userService;

	@RequestMapping("/test")
	@ResponseBody
	public String getPage(Model model) {
		Base_User user = userService.getUserById(1);
		JSONObject json = JSONObject.fromObject(user);

		return json.toString();
	}
}
