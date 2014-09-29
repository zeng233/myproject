package com.myspring.web.tag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.dao.user.UserDao;
import com.myspring.model.User;
import com.myspring.web.support.annotation.MyInject;
import com.myspring.web.tag.pagination.Page;
import com.winxuan.framework.pagination.Pagination;

@Controller
@RequestMapping(value = "/tag")
public class TagController
{
	@Autowired
	private UserDao userDao;
	
	@RequestMapping(value = "/page")
	public ModelAndView page(@MyInject Page page) {
		ModelAndView mv = new ModelAndView("/tag/pageTag");
//		System.out.println(page);
		User user = new User();
		List<User> users = userDao.findUserByPage(user, page);
		mv.addObject("page", page);
		mv.addObject("users", users);
		return mv;
	}
	
	@RequestMapping(value = "/test")
	public ModelAndView test(User user, @MyInject Pagination pagination) {
		ModelAndView mv = new ModelAndView("/tag/pageTag");
		mv.addObject("pagination", pagination);
		return mv;
	}
}
