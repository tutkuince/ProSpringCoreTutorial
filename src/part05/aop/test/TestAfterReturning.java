package io.spring.tutorial.part05.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import io.spring.tutorial.part05.aop.service.AfterReturningAdviceImpl;
import io.spring.tutorial.part05.aop.service.PrintMessage;

public class TestAfterReturning {
	public static void main(String[] args) {
		PrintMessage target = new PrintMessage();
		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new AfterReturningAdviceImpl());
		pf.setTarget(target);
		PrintMessage proxyObj = (PrintMessage)pf.getProxy();
		proxyObj.log();
	}
}
