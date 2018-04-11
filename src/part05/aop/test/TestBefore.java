package io.spring.tutorial.part05.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import io.spring.tutorial.part05.aop.service.MethodBeforeAdviceImp;
import io.spring.tutorial.part05.aop.service.PrintMessage;

public class TestBefore {
	public static void main(String[] args) {
		PrintMessage target = new PrintMessage();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new MethodBeforeAdviceImp());	// add advice
		pf.setTarget(target);	// set target

		PrintMessage proxyObj = (PrintMessage) pf.getProxy(); // take back object from ProxyFactory
		proxyObj.log();
	}
}
