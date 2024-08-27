package com.jeyjey.clincl.task1;

public class Book {

	String title = "Stalker";

	class Author {
		
		String name = "Tarkovskiy";
		int age = 54;

		void printBook() {
			System.out.println("Title: " + title + "\nAuthor: " + name);
		}
	}

}
