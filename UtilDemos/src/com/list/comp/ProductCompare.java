package com.list.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class ProductCompare {
	public static void main(String[] args) {
		Product product1 = new Product("Mobile", 10000, "Samsung", 101);
		Product product2 = new Product("Earphones", 5000, "Samsung", 103);
		Product product3 = new Product("Notebook", 500, "Classmate", 104);
		Product product4 = new Product("Glasses", 2000, "Ray Bon", 901);
		Product product5 = new Product("Laptop", 500000, "Google", 786);
		Product product6 = new Product("Laptop", 500000, "Google", 786);

		// Adding to a list
		System.out.println("ArrayList:");
		ArrayList<Product> myList = new ArrayList<>();

		myList.add(product1);
		myList.add(product2);
		myList.add(product3);
		myList.add(product4);
		myList.add(product5);
		myList.add(product6);

		Collections.sort(myList);
		myList.forEach(System.out::println);
		System.out.println();

		System.out.println("LinkedList:");
		LinkedList<Product> linkList = new LinkedList<>();

		linkList.add(product1);
		linkList.add(product2);
		linkList.add(product3);
		linkList.add(product4);
		linkList.add(product5);
		linkList.add(product6);

		linkList.forEach(System.out::println);
		System.out.println();
		
		System.out.println("HashSet:");
		HashSet<Product> hashSet = new HashSet<>();

		hashSet.add(product1);
		hashSet.add(product2);
		hashSet.add(product3);
		hashSet.add(product4);
		hashSet.add(product5);
		hashSet.add(product6);

		hashSet.forEach(System.out::println);
		System.out.println();

		System.out.println("TreeSet:");
		TreeSet<Product> treeSet = new TreeSet<>();
		
		treeSet.add(product1);
		treeSet.add(product2);
		treeSet.add(product3);
		treeSet.add(product4);
		treeSet.add(product5);
		treeSet.add(product6);
		
		treeSet.forEach(System.out::println);
		System.out.println();
		
		
	}
}
