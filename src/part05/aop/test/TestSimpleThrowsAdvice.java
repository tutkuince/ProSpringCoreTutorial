package io.spring.tutorial.part05.aop.test;

import org.springframework.aop.framework.ProxyFactory;

import io.spring.tutorial.part05.aop.service.SimpleThrowsAdviceImpl;
import io.spring.tutorial.part05.aop.service.Validator;

public class TestSimpleThrowsAdvice {
	public static void main(String[] args) {
		Validator errorBean = new Validator();

		ProxyFactory pf = new ProxyFactory();
		pf.addAdvice(new SimpleThrowsAdviceImpl());
		pf.setTarget(errorBean);
		Validator validator = (Validator) pf.getProxy();
		
		try {
			validator.validateAge(-10);
			validator.parseAge("Exception");
			validator.throwRuntimeException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
