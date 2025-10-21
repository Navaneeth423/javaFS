package com.basics.quest1;

public class BookMain {
	public static void main(String[] args) {
		Book book1 = new Book("Atomic Habits", "James Clear", 1000, "Non Fiction");
		Book book2 = new Book("The Alchemist", "Paulo Coelho", 300, "Fiction");
		
		book1.getDetails();
		book1.checkBooktype(book1.price);
		
		System.out.println();
		book2.getDetails();
		book2.checkBooktype(book2.price);
	}
}
