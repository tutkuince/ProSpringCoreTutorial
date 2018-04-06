package io.spring.tutorial.part01.spring.model;

public class Continental implements Wheel {
	@Override
	public void useTire() {
		System.out.println("Continental#useTire()");
	}
}
