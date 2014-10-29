package com.myspring.web.support;

import java.lang.annotation.Annotation;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.myspring.web.support.annotation.MyInject;
import com.myspring.web.tag.pagination.Page;
import com.myspring.web.tag.pagination.PageHandler;


/**
 * 解析自定义参数，http://stackoverflow.com/questions/12393937/spring-mvc-implementation-of-webargumentresolver
 */
public class MySpecialArgumentResolver implements WebArgumentResolver
{

	@Override
	public Object resolveArgument(MethodParameter methodParameter,
			NativeWebRequest webRequest) throws Exception
	{
		Page page = null;
//		Pagination pagination = null;
		Annotation[] annotations = methodParameter.getParameterAnnotations();
//		methodParameter.getParameterAnnotation(MyInject.class);
		
		//加上注解给指定的参数赋值
//		for (Annotation a : annotations) {
//			if (MyInject.class.isInstance(a)) {
//				//可以在MyInject里面设置不同的值（type），处理不同的参数类型
//				HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
//				HttpServletResponse response = (HttpServletResponse) webRequest.getNativeResponse();
//				PageHandler pageHandler = new PageHandler(request);
//				page = pageHandler.parse();
//				
////				PaginationParser parser = new PaginationParser(request, response);
////				pagination = parser.parse();
//			}
//		}
		
//		if (methodParameter.getParameterType().equals(Page.class)) {
//		}
		
		HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
		HttpServletResponse response = (HttpServletResponse) webRequest.getNativeResponse();
		PageHandler pageHandler = new PageHandler(request);
		page = pageHandler.parse();
		return page;
	}

}
