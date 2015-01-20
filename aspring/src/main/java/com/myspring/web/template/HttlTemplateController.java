package com.myspring.web.template;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * httl模板测试
 */

@Controller
@RequestMapping("/httl")
public class HttlTemplateController {
	
	@RequestMapping("/hello")
	public String hello(Map<String, Object> map) {
		return "hello";
	}
}
