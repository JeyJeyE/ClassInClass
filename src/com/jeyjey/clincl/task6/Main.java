package com.jeyjey.clincl.task6;

public class Main {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					System.out.println(i);
					try {

						Thread.sleep(1000);
					} catch (InterruptedException e) {

						System.err.println("Thread was interrupted");
					}
				}
			}
		});

		thread.start();
	}
}
