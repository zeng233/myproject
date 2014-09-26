package com.myspring.web.support;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.myspring.web.tag.pagination.Page;

public class MySpecialArgumentResolver implements WebArgumentResolver
{

	@Override
	public Object resolveArgument(MethodParameter methodParameter,
			NativeWebRequest webRequest) throws Exception
	{
		System.out.println(methodParameter.getParameterType());
//		methodParameter.getParameterAnnotation(MyInject.class);
		if (methodParameter.getParameterType().equals(Page.class)) {
			//获取参数并给获取查询后的Page
			System.out.println("myinject");
		}
		return UNRESOLVED;
	}

}
