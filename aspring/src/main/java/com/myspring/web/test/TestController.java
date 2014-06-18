package com.myspring.web.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.model.User;

/**
 * @description: TODO
 *
 * @createTime: 2013年12月17日 下午10:19:07
 *
 * @author zenghua
 *
 * @version 1.0
 */
@Controller
@RequestMapping("/test")
public class TestController {
	
	@RequestMapping(value="/show")
	public ModelAndView test() {
		System.out.println(111);
		//配置文件配置了page的路径
		ModelAndView mv = new ModelAndView("/show");
		
		return mv;
	}
	
	//@RequestMapping设置headers={"Content-type=application/json"}看是什么效果
	@RequestMapping(value="/json/{id}")
	@ResponseBody
	public User jsonUser(@PathVariable int id) {
		User user = new User();
		user.setId(1);
		user.setUserName("test");
		user.setPassword("123456");
		return user;
	}
	
	@RequestMapping(value="/jsonForm")
	@ResponseBody
	public User jsonForm(User user) {
		System.out.println(user);
		return user;
	}
	
	@RequestMapping(value="/path/{id}", method=RequestMethod.GET)
	@ResponseBody
	public User path(@PathVariable String id) {
		User user = new User();
		user.setId(Integer.parseInt(id));
		System.out.println(user);
		return user;
	}
	
	@RequestMapping(value="/form")
	@ResponseBody
	public User form(UserForm form) {
		User user = new User();
		
		return user;
	}
}
