package com.jeyjey.clincl.task4;

public class MathUtils {

	static class Factorial {

		static int calculation(int number) {

			int result = 1;

			for (int i = 1; i > 0; i--) {
				result *= i;
			}
			return result;
		}
	}
}
