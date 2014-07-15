package com.myspring.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @author zenghua233@gmail.com
 *
 * @createtime 2014年7月4日 上午11:16:06
 *
 * @version 1.0
 */

public class MyAspectByXml {
	public void beforCall(JoinPoint joinPoint) {
		System.out.println("==============================");
		System.out.println("beforeCall");
		System.out.println(joinPoint.getTarget().getClass().getName());// 获取目标函数类的对象
		System.out.println(joinPoint.getKind());
		System.out.println(joinPoint.getThis());// 获取目标函数类当前执行对象
		System.out.println(joinPoint.getArgs());// 拦截方法的参数
		System.out.println(joinPoint.getSignature().getDeclaringType());
		System.out.println(joinPoint.getSignature().getName());
		System.out.println(joinPoint.getSignature().getDeclaringTypeName());
		System.out.println(joinPoint.getStaticPart().getClass());
		System.out.println("==============================");
		
		String methodName = joinPoint.getSignature().getName();
		System.out.println(methodName);
	}

	public void afterCall(JoinPoint joinPoint) {
		System.out.println();
		System.out.println("afterCall");
		System.out.println();
	}

	public void afterReturningCall(JoinPoint jp, int rtv) {
		System.out.println();
		System.out.println("afterReturnCall");
		System.out.println("返回值：" + rtv);
		System.out.println();
	}

	public void afterThrowingCall() {
		System.out.println("afterThrowingCall");
	}

	public Object aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("-----aroundAdvice().invoke-----");
		System.out.println(" 此处可以做类似于Before Advice的事情");

		// 调用核心逻辑
		Object retVal = pjp.proceed();
		System.out.println(" 此处可以做类似于After Advice的事情");
		System.out.println("-----End of aroundAdvice()------");
		System.out.println("retVal: " + retVal);
		return retVal;
	}
}
