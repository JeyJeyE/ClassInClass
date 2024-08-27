package com.jeyjey.clincl.task2;

public class Car {

	String model = "VW Polo";
	int age = 2016;

	class Engine {

		String type = "Gasoline engine";
		int power = 95;

	}

	Engine engine = new Engine();

	void printCar() {
		System.out.println("Model - " + model + " , age - " + age + " , type '" + engine.type + "', power (h.p) = "
				+ engine.power + " h.p.");
	}

}
