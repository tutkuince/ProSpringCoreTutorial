package io.spring.tutorial.part05.aop.service;

import java.lang.reflect.Method;

import org.springframework.aop.ThrowsAdvice;

public class SimpleThrowsAdviceImpl implements ThrowsAdvice {
	public void afterThrowing(Exception ex) throws Throwable {
		System.out.println("******");
		System.out.println("Generic excepition capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("******");
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, ArithmeticException ex) throws Throwable {
		System.out.println("******");
		System.out.println("Arithmatic excepition capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("******");
	}
	
	public void afterThrowing(Method method, Object[] args, Object target, NumberFormatException ex) throws Throwable {
		System.out.println("******");
		System.out.println("NumberFormat excepition capture");
		System.out.println("Caught: " + ex.getClass().getName());
		System.out.println("******");
	}
}
