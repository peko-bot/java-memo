package com.orz.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/view")
	@ResponseBody
	public String view(Model model) {
		JSONArray arr = new JSONArray();
		for (int i = 0; i < 5; i++) {
			JSONObject obj = new JSONObject();
			obj.put("test" + i, "success" + i);
			arr.add(obj);
		}
		try {
			// shzh-hzworkstation
			// System.out.println(encryptDES("guest1", "shzh-hzw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return arr.toString();
	}

	// public static String encryptDES(String paramString1, String paramString2)
	// throws Exception {
	//
	// SecretKeySpec localSecretKeySpec = new SecretKeySpec(paramString2.getBytes(),
	// "DES");
	// Cipher localCipher = Cipher.getInstance("DES/ECB/PKCS5Padding");
	// localCipher.init(1, localSecretKeySpec);
	// return Base64.encode(localCipher.doFinal(paramString1.getBytes()));
	// }

	@RequestMapping("/getPage")
	@ResponseBody
	public JSONObject getPage(@RequestParam(value = "pageNum", required = false) String pageNum, Model model) {
		StringBuilder datas = new StringBuilder();
		String url = "http://www.biquge.tw/1_1287/" + pageNum + ".html";
		URL webAddress;
		JSONObject obj = new JSONObject();
		try {
			webAddress = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection) webAddress.openConnection();
			InputStreamReader input = new InputStreamReader(httpConn.getInputStream(), "utf-8");
			BufferedReader bufReader = new BufferedReader(input);
			String line = "";
			while ((line = bufReader.readLine()) != null) {
				datas.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}
}
