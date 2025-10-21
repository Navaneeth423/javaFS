package com.training.basic;

public class Even {
	public static void main(String[] args) {
		System.out.println("Even numbers til 20:");
		for(int i=0;i<=20;i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
	}
}
