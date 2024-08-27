package com.jeyjey.clincl.task7;

public class Main {

	public static void main(String[] args) {
		
		double r = 10;
		
		Shape circle = new Shape() {

			@Override
			double area() {
				return Math.PI * Math.pow(r, 2);
			}

		};

		System.out.println("S = " + circle.area());

	}

}
