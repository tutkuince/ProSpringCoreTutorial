package io.spring.tutorial.part01.coupled.model;

public class Car {
	private Tire tire;	// Has-a relation 

	public Car() {
		super();
		this.tire = new Tire(); // (tight coupled)
	}
	
	public void drive() {
		tire.useTire();
	}
}
