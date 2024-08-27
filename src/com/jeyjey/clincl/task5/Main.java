package com.jeyjey.clincl.task5;

public class Main {

	public static void main(String[] args) {

		Greeting greeting = new Greeting() {

			@Override
			public void sayhello() {
				System.out.println("Hello, Java!");
			}
		};

		greeting.sayhello();

	}
}
