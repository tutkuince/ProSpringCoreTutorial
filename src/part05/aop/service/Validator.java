package io.spring.tutorial.part05.aop.service;

public class Validator {
	public void validateAge(int age) throws Exception{
		if(age < 0) {
			throw new ArithmeticException("Not valid age!");
		} else {
			System.out.println("Valid age!");
		}
	}
	
	public int parseAge(String age) {
		return Integer.parseInt(age);
	}
	
	public void throwRuntimeException() {
		throw new RuntimeException();
	}
}
