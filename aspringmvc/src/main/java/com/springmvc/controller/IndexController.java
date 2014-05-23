package com.springmvc.controller;

import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.model.User;

/**
 * description: TODO
 *
 * createtime: 2012-8-2 下午04:42:41
 *
 * @author zenghua
 * @version 1.0
 */

@Controller
@RequestMapping(value="/test/*")
public class IndexController {
	/**
	 * 默认是HTTP的get方法
	 * 
	 * 在跳转到一个页面的时候，要初始化一个属性对象（用于验证的）
	 * 
	 * @return
	 */
	@RequestMapping(value="/index")
//	RequestAttributes
	public ModelAndView test(Model mod, HttpServletRequest request) {
//		System.out.println(session);
		ModelAndView model = new ModelAndView();
		User user = new User();
		
		model.addObject("user", user);
		model.addObject("test"); //没有key怎么取值的
		model.setViewName("validation");
		
		User user1 = (User) request.getAttribute("user");
//		System.out.println(user.getCreateTime());
		
		return model;
	}
	
	/**
	 * 作用于这个控制器，如果在其他servlet请求调用前进行设置
	 * @param request
	 */
	@ModelAttribute
	public void testUser(HttpServletRequest request) {
		User user = new User();
		user.setCreateTime(new Date());
		request.setAttribute("user", user);
	}
	
	//如果在@RequestMapping注解方法上，再加@ModelAttribute返回的值不再是视图名称而是属性了 TODO(参考哪里)
	@RequestMapping(value="/index", method=RequestMethod.POST)
	public String validation(@ModelAttribute @Valid User user, BindingResult result, Errors errors) {
		System.out.println(user.getPassword());
		System.out.println(user.getRole().getName());
//		Converter c=new DeserializingConverter();
//		ValidationUtils.rejectIfEmpty(errors, "username", "username.not.empty0");
//		if (user.getPassword().length() < 10) {
//			errors.rejectValue(user.getPassword(), "password.length.error0");
//		}
		
		if (result.hasErrors()) {
			return "validation";
		}
//		model.put("user", model);
		return "success";
	}
	
	@RequestMapping(value="/format", method=RequestMethod.GET)
	public ModelAndView format() {
		ModelAndView mv = new ModelAndView("/views/count");
		mv.addObject("count", 11);
		return mv;
	}
	
	public static void main(String[] args) {
		Locale locale = Locale.CHINA;
		System.out.println(locale);
		
		User user = new User();
		System.out.println(user.getPassword());
	}
	
	//默认属性名为user，通过value值可以另取别名
	@ModelAttribute(value="")
	public User getUser(String username) {
		User user = new User();
		return user;
	}
}
