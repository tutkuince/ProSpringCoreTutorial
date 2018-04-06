package io.spring.tutorial.part01.decoupled.test;

import io.spring.tutorial.part01.decoupled.model.Car;
import io.spring.tutorial.part01.decoupled.model.Lassa;
import io.spring.tutorial.part01.decoupled.model.Vehicle;
import io.spring.tutorial.part01.decoupled.model.Wheel;

public class DecoupledTest {
	public static void main(String[] args) {
		Vehicle car = new Car();
		
		Wheel lassa = new Lassa();
		
		car.setWheel(lassa);
		car.drive();
	}
}
