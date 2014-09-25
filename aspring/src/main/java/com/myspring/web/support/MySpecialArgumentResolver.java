package com.myspring.web.support;

import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;

import com.myspring.web.support.annotation.MyInject;

public class MySpecialArgumentResolver implements WebArgumentResolver
{

	@Override
	public Object resolveArgument(MethodParameter methodParameter,
			NativeWebRequest webRequest) throws Exception
	{
		if (methodParameter.getParameterType().equals(MyInject.class)) {
			//获取参数并给获取查询后的Page
			System.out.println("myinject");
		}
		return UNRESOLVED;
	}

}
