package io.spring.tutorial.part05.aop.service;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class AfterReturningAdviceImpl implements AfterReturningAdvice{
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("Before returning advice method name is: " + method.getName());
		
	}
}
