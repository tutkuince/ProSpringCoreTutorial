package io.spring.tutorial.part02.constructorinjection.model;

public class ConstructorConfuse {
	private String name;
	private int age;

	public ConstructorConfuse(String name) {
		super();
		System.out.println("ConstructorConfuse(String name)");
		this.name = name;
	}

	public ConstructorConfuse(int age) {
		super();
		System.out.println("ConstructorConfuse(int age)");
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ConstructorConfuse [name=" + name + ", age=" + age + "]";
	}

}
