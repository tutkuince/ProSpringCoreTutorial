package io.spring.tutorial.part02.collectioninjection.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part02.collectioninjection.model.CIModel;

public class TestCIModel {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("02.collection.injection.xml");
		
		CIModel cimodel1 = context.getBean("cimodel1", CIModel.class);
		System.out.println(cimodel1);
		
		context.close();
	}
}
