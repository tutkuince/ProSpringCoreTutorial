package io.spring.tutorial.part01.spring.model;

public class GoodYear implements Wheel {
	@Override
	public void useTire() {
		System.out.println("GoodYear#useTire()");
	}
}
