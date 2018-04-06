package io.spring.tutorial.part01.decoupled.model;

public class Car implements Vehicle{
	
	private Wheel wheel;
	
	@Override
	public void drive() {
		wheel.useTire();
	}
	
	@Override
	public void setWheel(Wheel wheel) {
		this.wheel = wheel;
	}
}
