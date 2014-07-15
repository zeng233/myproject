package com.myspring.core.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author zenghua233
 *
 */
@Aspect
@Component
public class MyAspectByAnnotation {

	@Pointcut("execution(* com.myspring.core.aop.*.*(..))")
	public void accountCall() {
	}

	/**
	 * Before 在核心业务执行前执行，不能阻止核心业务的调用。
	 * 
	 * @param joinPoint
	 */
//	@Before("accountCall()")
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("-----beforeAdvice().invoke-----");
		System.out.println(" 此处意在执行核心业务逻辑前，做一些安全性的判断等等");
		System.out.println(" 可通过joinPoint来获取所需要的内容");
		System.out.println("-----End of beforeAdvice()------");
	}

	/**
	 * After 核心业务逻辑退出后（包括正常执行结束和异常退出），执行此Advice
	 * 
	 * @param joinPoint
	 */
//	@After(value = "accountCall()")
	public void afterAdvice(JoinPoint joinPoint) {
		System.out.println("-----afterAdvice().invoke-----");
		System.out.println(" 此处意在执行核心业务逻辑之后，做一些日志记录操作等等");
		System.out.println(" 可通过joinPoint来获取所需要的内容");
		System.out.println("-----End of afterAdvice()------");
	}
}
