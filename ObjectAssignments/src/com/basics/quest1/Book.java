package com.basics.quest1;

public class Book {
	String title;
	String author;
	float price;
	String category;
	
	public Book(String title, String author, float price, String category) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.category = category;
	}
	
	void getDetails() {
		System.out.println("Book Name: " + title);
		System.out.println("Author Name: " + author);
		System.out.println("Price of Book: " + price);
		System.out.println("Book Category: " + category);
	}
	
	void checkBooktype(float price) {
		if (price > 500) {
			System.out.println("This is a premium book");
		} else {
			System.out.println("This is a standard book");
		}
	}
}
