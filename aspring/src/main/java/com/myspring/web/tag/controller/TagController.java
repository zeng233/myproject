package com.myspring.web.tag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/tag")
public class TagController
{
	@RequestMapping(value = "/page")
	public ModelAndView page() {
		ModelAndView mv = new ModelAndView("/tag/pageTag.jsp");
		return mv;
	}
}
