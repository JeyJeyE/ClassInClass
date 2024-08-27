package com.jeyjey.clincl.task3;

public class University {

	public static class Student {
		int id = 1;
		String name = "Ivan Ivanov";

		@Override
		public String toString() {
			return getClass().getSimpleName() + " id = " + id + ", name = " + name + "";
		}

	}
}