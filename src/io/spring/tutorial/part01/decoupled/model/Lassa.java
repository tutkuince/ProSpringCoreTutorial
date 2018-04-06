package io.spring.tutorial.part01.decoupled.model;

public class Lassa implements Wheel {
	@Override
	public void useTire() {
		System.out.println("Lassa#useTire()");
	}
}
