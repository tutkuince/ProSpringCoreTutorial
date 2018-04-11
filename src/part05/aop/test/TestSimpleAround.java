package io.spring.tutorial.part05.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import io.spring.tutorial.part05.aop.service.PrintMessage;
import io.spring.tutorial.part05.aop.service.SimpleAroundAdviceImpl;

public class TestSimpleAround {
	public static void main(String[] args) {
		PrintMessage target = new PrintMessage();

		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleAroundAdviceImpl());
		pf.setTarget(target);

		PrintMessage proxyObj = (PrintMessage) pf.getProxy();
		proxyObj.log();
	}
}
