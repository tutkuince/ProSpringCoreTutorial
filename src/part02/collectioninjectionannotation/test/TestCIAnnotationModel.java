package io.spring.tutorial.part02.collectioninjectionannotation.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import io.spring.tutorial.part02.collectioninjectionannotation.model.CIAnnotationModel;

public class TestCIAnnotationModel {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"02.collection.injection.annotation.xml");

		CIAnnotationModel model = context.getBean("ciaModel", CIAnnotationModel.class);

		System.out.println(model);

		context.close();
	}
}
