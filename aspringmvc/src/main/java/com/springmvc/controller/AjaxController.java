package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @description TODO
 *
 * @author zenghua
 *
 * @createtime 2012-9-16 下午11:43:33
 */

@Controller
@RequestMapping("/ajax/*")
public class AjaxController {
	/**
	 * 返回类型为什么不能有Long,Integer等类型
	 * @param username
	 * @return
	 */
	@RequestMapping(value="username", method=RequestMethod.POST)
	public @ResponseBody String getUsername(@RequestParam("name") String username) {
		System.out.println(username);
		return "test";
	}
}
