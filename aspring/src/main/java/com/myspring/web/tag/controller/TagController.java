package com.myspring.web.tag.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.web.tag.pagination.Page;

@Controller
@RequestMapping(value = "/tag")
public class TagController
{
	@RequestMapping(value = "/page")
	public ModelAndView page(Page page) {
		ModelAndView mv = new ModelAndView("tag/pageTag");
		return mv;
	}
}
